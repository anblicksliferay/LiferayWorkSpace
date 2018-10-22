package com.astra.anblicks.pdca.cikpi.portlet;



import java.io.IOException;
import java.util.Date;
import java.util.List;

import javax.portlet.Portlet;
import javax.portlet.PortletException;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

import org.osgi.service.component.annotations.Component;

import com.astra.anblicks.pdca.model.addkpi_ci;
import com.astra.anblicks.pdca.model.ci_kpi;
import com.astra.anblicks.pdca.model.kpi;
import com.astra.anblicks.pdca.model.period;
import com.astra.anblicks.pdca.service.addkpi_ciLocalServiceUtil;
import com.astra.anblicks.pdca.service.ci_kpiLocalServiceUtil;
import com.astra.anblicks.pdca.service.kpiLocalServiceUtil;
import com.astra.anblicks.pdca.service.periodLocalServiceUtil;
import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.dao.orm.Criterion;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.PropertyFactoryUtil;
import com.liferay.portal.kernel.dao.orm.RestrictionsFactoryUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;
import com.liferay.portal.kernel.theme.ThemeDisplay;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.WebKeys;

/**
 * @author kranthi.kumar
 */
@Component(
	immediate = true,
	property = {
		"com.liferay.portlet.display-category=AstraPDCA",
		"com.liferay.portlet.instanceable=true",
		"javax.portlet.display-name=PDCA-CIAddKpi Portlet",
		"javax.portlet.init-param.template-path=/",
		"javax.portlet.init-param.view-template=/view.jsp",
		"javax.portlet.resource-bundle=content.Language",
		"javax.portlet.security-role-ref=power-user,user"
	},
	service = Portlet.class
)
public class PDCACIAddKpiPortlet extends MVCPortlet {

	
	 public void serveResource(ResourceRequest resourceRequest, ResourceResponse resourceResponse) throws IOException, PortletException {
				    String cmd = ParamUtil.getString(resourceRequest, "cmd");
				    if (cmd.equalsIgnoreCase("add")) {
					 try {
						 logger.info(resourceRequest.getParameter("company")+"resourceRequest.getParameter");
						 ThemeDisplay themeDisplay = (ThemeDisplay) resourceRequest.getAttribute(WebKeys.THEME_DISPLAY);
						  addkpi_ci _kpici = addkpi_ciLocalServiceUtil.createaddkpi_ci(CounterLocalServiceUtil.increment());
						 _kpici.setCompanyId(Long.parseLong(resourceRequest.getParameter("company")));
						 _kpici.setStrategyType(resourceRequest.getParameter("strategytype"));
						 _kpici.setStrategy(resourceRequest.getParameter("strategy"));
						 _kpici.setTarget(resourceRequest.getParameter("target"));
						 _kpici.setYear(Long.parseLong(resourceRequest.getParameter("year")));
						 _kpici.setKpi(resourceRequest.getParameter("kpi"));
						 _kpici.setUserId(themeDisplay.getUserId());
						 _kpici.setUserName(themeDisplay.getUser().getFullName());
						 _kpici.setCreateDate(new Date());
						 _kpici.setModifiedDate(new Date());
						 _kpici = addkpi_ciLocalServiceUtil.addaddkpi_ci(_kpici);
						 createCi_kpiObjectsBasedOnPeriod(_kpici);
						  JSONObject json = JSONFactoryUtil.createJSONObject();
						  json.put("sucess", "added");
		        		 writeJSON(resourceRequest, resourceResponse,json);
					} catch (Exception e) {
						e.printStackTrace();
						logger.error(e);
						    JSONObject json = JSONFactoryUtil.createJSONObject();
					        json.put("error", "error");
					        writeJSON(resourceRequest, resourceResponse, json);			
					}
				    }
				    else if(cmd.equalsIgnoreCase("update")){
				    	try {
							addkpi_ci kpi_=addkpi_ciLocalServiceUtil.getaddkpi_ci(Long.parseLong(resourceRequest.getParameter("kpiid")));
							period period_ = periodLocalServiceUtil.getperiod(Long.parseLong(resourceRequest.getParameter("peridId")));
							ci_kpi ci_kpi = getCi_kpi(kpi_,period_);
							ci_kpi.setTargetYTD(resourceRequest.getParameter("TargetYTD"));
							ci_kpi.setAchivement(resourceRequest.getParameter("Achivement"));
							ci_kpi.setStatus(resourceRequest.getParameter("Status"));
							ci_kpi.setProblemIdentification(resourceRequest.getParameter("PI"));
							ci_kpi.setProposedAction(resourceRequest.getParameter("PA"));
							ci_kpiLocalServiceUtil.updateci_kpi(ci_kpi);				
							 JSONObject json = JSONFactoryUtil.createJSONObject();
							  json.put("sucess", "updated");
			        		 writeJSON(resourceRequest, resourceResponse,json);
						} catch (NumberFormatException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						} catch (PortalException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
				    	
				    } 
		else if(cmd.equalsIgnoreCase("loadData")){
			logger.info(resourceRequest.getParameter("kpiid"));
			try {
				addkpi_ci kpiMode_ = addkpi_ciLocalServiceUtil.getaddkpi_ci(Long.parseLong(resourceRequest.getParameter("kpiid")));
				JSONObject json   = JSONFactoryUtil.createJSONObject();          
		    	    json.put("kpiId", kpiMode_.getAddKpiId());
				    json.put("company", kpiMode_.getCompanyId());
				    json.put("strategytype",kpiMode_.getStrategyType());
				    json.put("strategy", kpiMode_.getStrategy());
				    json.put("target", kpiMode_.getTarget());
				    json.put("year",  kpiMode_.getYear());
				    json.put("kpi",  kpiMode_.getKpi());				    			    
				       writeJSON(resourceRequest, resourceResponse, json); 
			} catch (Exception e) {
			}
		}
 }
	



	
	private ci_kpi getCi_kpi(addkpi_ci kpi_, period period_) {
		    DynamicQuery dynamicQueryForCi_Kpi = ci_kpiLocalServiceUtil.dynamicQuery();
		    dynamicQueryForCi_Kpi.add(PropertyFactoryUtil.forName("addKpiId").eq(kpi_.getAddKpiId()) );
			Criterion reqcriterion = RestrictionsFactoryUtil.eq("ciPeriodId",period_.getPeriodId());
			dynamicQueryForCi_Kpi.add(reqcriterion);
			List<ci_kpi> ci_kpi = ci_kpiLocalServiceUtil.dynamicQuery(dynamicQueryForCi_Kpi);
			return ci_kpi.get(0);
	}
	
	 private void createCi_kpiObjectsBasedOnPeriod(addkpi_ci _kpici) {
		 List<period> getperiods = periodLocalServiceUtil.getperiods(5, periodLocalServiceUtil.getperiodsCount());
			for(period p : getperiods) {
				ci_kpi ci_kpi = ci_kpiLocalServiceUtil.createci_kpi(CounterLocalServiceUtil.increment());
				ci_kpi.setAddKpiId(_kpici.getAddKpiId());
				ci_kpi.setCiPeriodId(p.getPeriodId());
				ci_kpi.setTargetYTD(StringPool.BLANK);
				ci_kpi.setAchivement(StringPool.BLANK);
				ci_kpi.setProblemIdentification(StringPool.BLANK);
				ci_kpi.setProposedAction(StringPool.BLANK);
				ci_kpi.setStatus("Good");
				ci_kpiLocalServiceUtil.addci_kpi(ci_kpi);
			}
			
	} 
	 
	private static Log logger = LogFactoryUtil.getLog(PDCACIAddKpiPortlet.class.getName());

}