package com.astra.anblicks.pdca.ci.portlet;


import com.astra.anblicks.pdca.model.addkpi_ci;
import com.astra.anblicks.pdca.model.ci_kpi;
import com.astra.anblicks.pdca.model.cla_kpi;
import com.astra.anblicks.pdca.model.kpi;
import com.astra.anblicks.pdca.service.achivementFormulaLocalServiceUtil;
import com.astra.anblicks.pdca.service.addkpi_ciLocalServiceUtil;
import com.astra.anblicks.pdca.service.ci_kpiLocalServiceUtil;
import com.astra.anblicks.pdca.service.cla_kpiLocalServiceUtil;
import com.astra.anblicks.pdca.service.companyLocalServiceUtil;
import com.astra.anblicks.pdca.service.itemDescriptionLocalServiceUtil;
import com.astra.anblicks.pdca.service.kpiLocalServiceUtil;
import com.astra.anblicks.pdca.service.typeLocalServiceUtil;
import com.liferay.portal.kernel.dao.orm.Criterion;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.PropertyFactoryUtil;
import com.liferay.portal.kernel.dao.orm.RestrictionsFactoryUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.json.JSONArray;
import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;
import com.liferay.portal.kernel.util.ParamUtil;

import java.io.IOException;
import java.util.List;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.Portlet;
import javax.portlet.PortletException;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

import org.osgi.service.component.annotations.Component;

/**
 * @author kranthi.kumar
 */
@Component(
	immediate = true,
	property = {
		"com.liferay.portlet.display-category=AstraPDCA",
		"com.liferay.portlet.instanceable=true",
		"javax.portlet.display-name=PDCA-CI Portlet",
		"javax.portlet.init-param.template-path=/",
		"javax.portlet.init-param.view-template=/view.jsp",
		"javax.portlet.resource-bundle=content.Language",
		"javax.portlet.security-role-ref=power-user,user"
	},
	service = Portlet.class
)
public class PDCACIPortlet extends MVCPortlet {

	
	@Override
	public void doView(RenderRequest renderRequest, RenderResponse renderResponse)
			throws IOException, PortletException {
		//System.out.println(get_update_kpi_json_Json("dev"));
	    try {
			renderRequest.setAttribute("update_kpi_json", get_update_kpi_json_Json(0l));
		} catch (PortalException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		super.doView(renderRequest, renderResponse);
	}

	
	public void serveResource(ResourceRequest resourceRequest, ResourceResponse resourceResponse)
		    throws IOException, PortletException
		  {
		    String cmd = ParamUtil.getString(resourceRequest, "cmd");
		    if (cmd.equalsIgnoreCase("list")) {
		    	
		    	 try {
	        		 writeJSON(resourceRequest, resourceResponse,get_update_kpi_json_Json(Long.parseLong(ParamUtil.getString(resourceRequest, "cmdType"))) );
				} catch (Exception e) {
					logger.error("list"+e);
					  JSONObject json = JSONFactoryUtil.createJSONObject();
				        json.put("error", "storeDefault Unsuccessful");
				        writeJSON(resourceRequest, resourceResponse, json);										}
	     
		    }
		    
		    else if(cmd.equalsIgnoreCase("getTableDataOnchage")){
		    	
		    	 try {
		    		    logger.info(ParamUtil.getLong(resourceRequest, "company"));
		    		    logger.info(ParamUtil.getLong(resourceRequest, "year"));
		    		    long companyId = ParamUtil.getLong(resourceRequest, "company");
		    		    long year = ParamUtil.getLong(resourceRequest, "year");
		    		    if(companyId > 0 && year > 0) {
		    		    DynamicQuery dynamicQuery_kpi = kpiLocalServiceUtil.dynamicQuery();
						Criterion criterion = null;
						criterion = RestrictionsFactoryUtil.eq("companyId", ParamUtil.getLong(resourceRequest, "company"));
						criterion = RestrictionsFactoryUtil.or(criterion, RestrictionsFactoryUtil.eq("year", ParamUtil.getLong(resourceRequest, "year")));
						dynamicQuery_kpi.add(criterion);
		    	        List <kpi> list_kpis = kpiLocalServiceUtil.dynamicQuery(dynamicQuery_kpi);
		    	
		    		    logger.info(">>>>>>>>>>"+list_kpis);
		    		}
		    		    	
				} catch (Exception e) {
					logger.error(e);
					   JSONObject json = JSONFactoryUtil.createJSONObject();
				        json.put("error", "storeDefault Unsuccessful");
				        writeJSON(resourceRequest, resourceResponse, json);										
				       }
	     
		    }
		    
		    
		    }


  public void deleteProfile(ActionRequest actionRequest, ActionResponse actionResponse) {
	    long userId = Long.parseLong(actionRequest.getParameter("userid"));
	    try {
	    	 actionRequest.setAttribute("deleteId", userId);
	    	 actionResponse.setRenderParameter("jspPage", "/cla/updatekpi.jsp");
	    } catch (Exception e) {
	      e.printStackTrace();
	    }
	  }
	  
	  public void editProfile(ActionRequest actionRequest, ActionResponse actionResponse) { 
	  String userId = actionRequest.getParameter("editid");
	    try {
	      actionRequest.setAttribute("editid", userId);
	      actionResponse.setRenderParameter("jspPage", "/cla/updatekpi.jsp");
	    } catch (Exception e) {
	      e.printStackTrace();
	    }
	  }
	  
public static String get_update_kpi_json_Json(Long period) throws PortalException{
	JSONObject json = JSONFactoryUtil.createJSONObject();
    JSONArray jsonData = JSONFactoryUtil.createJSONArray();
    List<addkpi_ci> ci_kpis = addkpi_ciLocalServiceUtil.getaddkpi_cis(0,addkpi_ciLocalServiceUtil.getaddkpi_cisCount());
    for (addkpi_ci kpiMode_ : ci_kpis)
		try {
			{
			  jsonData.put(TOJson(kpiMode_ ,period));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
    json.put("kpi_Data", jsonData);
    return json.toString();
}
public static JSONObject TOJson(addkpi_ci kpiMode_, Long period) throws PortalException {
	
	    DynamicQuery dynamicQueryForCi_kpi = ci_kpiLocalServiceUtil.dynamicQuery();
	    dynamicQueryForCi_kpi.add(PropertyFactoryUtil.forName("addKpiId").eq(kpiMode_.getAddKpiId()) );
        Criterion reqcriterion = null;
        reqcriterion = RestrictionsFactoryUtil.eq("ciPeriodId",period);
        dynamicQueryForCi_kpi.add(reqcriterion);
        List <ci_kpi> ci_kpi = cla_kpiLocalServiceUtil.dynamicQuery(dynamicQueryForCi_kpi);
	  
       JSONObject json   = JSONFactoryUtil.createJSONObject();          
    	   json.put("kpiId", kpiMode_.getAddKpiId());
		    json.put("company", companyLocalServiceUtil.getcompany(kpiMode_.getCompanyId()).getCompanyName());
		    json.put("Strategytype", kpiMode_.getStrategyType());
		    json.put("Strategy", kpiMode_.getStrategy());
		    json.put("target", kpiMode_.getTarget());
		    json.put("year",  kpiMode_.getYear());
		    json.put("kpi", kpiMode_.getKpi());
		    json.put("period",  period);
		    if(!ci_kpi.isEmpty()){
		    json.put("Achivement",  ci_kpi.get(0).getAchivement());
		    json.put("Status",  ci_kpi.get(0).getStatus());
		    json.put("ProblemIdentification", ci_kpi.get(0).getProblemIdentification());
		    json.put("ProposedAction", ci_kpi.get(0).getProposedAction());
		    }
		    else {
				    json.put("Achivement", " " );
				    json.put("Status",  " ");
				    json.put("ProblemIdentification",  " ");
				    json.put("ProposedAction", " ");
		    }
		    
       		    return json;	
  }
	
	private static Log logger = LogFactoryUtil.getLog(PDCACIPortlet.class.getName());

	
	
}