package com.astra.anblicks.pdca.adminsettings;

import com.astra.anblicks.pdca.model.AstraPdca_CompanyData;
import com.astra.anblicks.pdca.model.AstraPdca_Module;
import com.astra.anblicks.pdca.model.pdca_AdminSettings;
import com.astra.anblicks.pdca.service.AstraPdca_CompanyDataLocalServiceUtil;
import com.astra.anblicks.pdca.service.AstraPdca_ModuleLocalServiceUtil;
import com.astra.anblicks.pdca.service.pdca_AdminSettingsLocalServiceUtil;
import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.PropertyFactoryUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.json.JSONArray;
import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;
import com.liferay.portal.kernel.theme.ThemeDisplay;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.WebKeys;

import java.io.IOException;
import java.util.Date;
import java.util.List;

import javax.portlet.Portlet;
import javax.portlet.PortletException;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

import org.osgi.service.component.annotations.Component;

@Component(
	immediate = true,
	property = {
		"com.liferay.portlet.display-category=AstraPDCA",
		"com.liferay.portlet.instanceable=true",
		"javax.portlet.display-name=PDCA-AdminSettings Portlet",
		"javax.portlet.init-param.template-path=/",
		"javax.portlet.init-param.view-template=/view.jsp",
		"javax.portlet.resource-bundle=content.Language",
		"javax.portlet.security-role-ref=power-user,user"
	},
	service = Portlet.class
)
public class AdminSettings extends MVCPortlet {
	
	@Override
	public void doView(RenderRequest renderRequest, RenderResponse renderResponse)
			throws IOException, PortletException {
		
			
		super.doView(renderRequest, renderResponse);
	}

	public void serveResource(ResourceRequest resourceRequest, ResourceResponse resourceResponse)
		    throws IOException, PortletException
		  {
		   ThemeDisplay themeDisplay = (ThemeDisplay) resourceRequest.getAttribute(WebKeys.THEME_DISPLAY);

		    String cmd = ParamUtil.getString(resourceRequest, "cmd");
		    if (cmd.equalsIgnoreCase("adminSettings")) {
		    	try {
		    		JSONObject json = JSONFactoryUtil.createJSONObject(resourceRequest.getParameter("companysId"));
				     JSONArray configValues = JSONFactoryUtil.createJSONArray( json.getString("companyArray") );
				     DynamicQuery DQ_adminSettings=pdca_AdminSettingsLocalServiceUtil.dynamicQuery();
				       DQ_adminSettings.add(PropertyFactoryUtil.forName("moduleId").eq(ParamUtil.getLong(resourceRequest, "moduleId")));
				       List<pdca_AdminSettings> companyList= pdca_AdminSettingsLocalServiceUtil.dynamicQuery(DQ_adminSettings);
				       if(companyList.size()>0){
				    	   for(pdca_AdminSettings val:companyList){
				    	   pdca_AdminSettingsLocalServiceUtil.deletepdca_AdminSettings(val.getSettings_Id());
				       }}
				     if(null!=configValues){
				    	 AstraPdca_Module astraPdca_Module=AstraPdca_ModuleLocalServiceUtil.getAstraPdca_Module(ParamUtil.getLong(resourceRequest, "moduleId"));
				    	 astraPdca_Module.setCheckUncheckFlag(ParamUtil.getString(resourceRequest, "checkFlag"));
				    	 astraPdca_Module.setCreateDate(new Date());
				    	 astraPdca_Module.setCreatedBy(themeDisplay.getUser().getFullName());
				    	 astraPdca_Module.setModifiedDate(new Date());
				    	 astraPdca_Module.setModifiedBy(themeDisplay.getUser().getFullName());
				    	 AstraPdca_ModuleLocalServiceUtil.updateAstraPdca_Module(astraPdca_Module);
				     for (int i = 0; i < configValues.length(); i++) {
				    	 pdca_AdminSettings adminSettings=pdca_AdminSettingsLocalServiceUtil.createpdca_AdminSettings(CounterLocalServiceUtil.increment());					
				    	 adminSettings.setModuleId(ParamUtil.getLong(resourceRequest, "moduleId"));
				    	 adminSettings.setYear(ParamUtil.getLong(resourceRequest, "yearvalue"));
				    	 adminSettings.setPeriodId(ParamUtil.getLong(resourceRequest, "periodvalue"));
				    	 adminSettings.setCompanyId(configValues.getLong(i));
				    	 pdca_AdminSettingsLocalServiceUtil.updatepdca_AdminSettings(adminSettings);				    	 
				    	}}
					  json.put("sucess", "added");
		   		      writeJSON(resourceRequest, resourceResponse,json);
				} catch (Exception e) {
				     	logger.error(e);
					    JSONObject json = JSONFactoryUtil.createJSONObject();
				        json.put("error", "error");
				        writeJSON(resourceRequest, resourceResponse, json);	
						}
		    }
		    else if (cmd.equalsIgnoreCase("getAdminSettings")) {
		    	try {
		    		
    	JSONObject json   = JSONFactoryUtil.createJSONObject();    
       DynamicQuery DQ_adminSettings=pdca_AdminSettingsLocalServiceUtil.dynamicQuery();
       DQ_adminSettings.add(PropertyFactoryUtil.forName("moduleId").eq(ParamUtil.getLong(resourceRequest, "moduleId")));
       List<pdca_AdminSettings> companyList= pdca_AdminSettingsLocalServiceUtil.dynamicQuery(DQ_adminSettings);
       AstraPdca_Module astraPdca_Module=AstraPdca_ModuleLocalServiceUtil.getAstraPdca_Module(ParamUtil.getLong(resourceRequest, "moduleId"));
				if(companyList.size()>0){
					    json.put("year", companyList.get(0).getYear());
					    json.put("period", companyList.get(0).getPeriodId());
					    json.put("checkFlag", astraPdca_Module.getCheckUncheckFlag());
					    json.put("companyIds", onloadgetUserJsonarray(companyList));
				}
		     	      
		    		    writeJSON(resourceRequest, resourceResponse, json);
		   		 writeJSON(resourceRequest, resourceResponse,json);
				} catch (Exception e) {
					    logger.error(e);
					    JSONObject json = JSONFactoryUtil.createJSONObject();
				        json.put("error", "error");
				        writeJSON(resourceRequest, resourceResponse, json);					}
		    }
		    
		    else if (cmd.equalsIgnoreCase("checkUncheck")) {
		    	try {

		    	  	JSONObject json   = JSONFactoryUtil.createJSONObject();          
		     	        json.put("year", "");
		    		    json.put("period", "");
		    		     json.put("companyIds", checkUncheckCompanyJsonarray( resourceRequest));
		    		    writeJSON(resourceRequest, resourceResponse, json);
		   		 writeJSON(resourceRequest, resourceResponse,json);
				} catch (Exception e) {
					    logger.error(e);
					    JSONObject json = JSONFactoryUtil.createJSONObject();
				        json.put("error", "error");
				        writeJSON(resourceRequest, resourceResponse, json);					}
		    }
		    }
	
			public static JSONArray onloadgetUserJsonarray(List<pdca_AdminSettings> list_admin){
		    	JSONArray jsonArray = JSONFactoryUtil.createJSONArray();
				for(pdca_AdminSettings val:list_admin){
				jsonArray.put(val.getCompanyId());
			}
 	 return jsonArray;
}
	public static JSONArray checkUncheckCompanyJsonarray(ResourceRequest resourceRequest){
    	JSONArray jsonArray = JSONFactoryUtil.createJSONArray();
	     
      List<AstraPdca_CompanyData> companyList_= AstraPdca_CompanyDataLocalServiceUtil.getAstraPdca_CompanyDatas(0, AstraPdca_CompanyDataLocalServiceUtil.getAstraPdca_CompanyDatasCount());
      
      if(ParamUtil.getBoolean(resourceRequest, "checkFlag")){
	for(AstraPdca_CompanyData val:companyList_){
		try {
			jsonArray.put(val.getCompanyId());
			AstraPdca_CompanyData astraPdca_CompanyData=AstraPdca_CompanyDataLocalServiceUtil.getAstraPdca_CompanyData(val.getCompanyId());
			astraPdca_CompanyData.setCheckFlag("true");
			AstraPdca_CompanyDataLocalServiceUtil.updateAstraPdca_CompanyData(astraPdca_CompanyData);
		} catch (PortalException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}}}
      else{
    		for(AstraPdca_CompanyData val:companyList_){
    			try {
    				AstraPdca_CompanyData astraPdca_CompanyData=AstraPdca_CompanyDataLocalServiceUtil.getAstraPdca_CompanyData(val.getCompanyId());
    				astraPdca_CompanyData.setCheckFlag("false");
    				AstraPdca_CompanyDataLocalServiceUtil.updateAstraPdca_CompanyData(astraPdca_CompanyData);
    			} catch (PortalException e) {
    				// TODO Auto-generated catch block
    				e.printStackTrace();
    			}}}
 	 return jsonArray;
}
	
	
private static Log logger = LogFactoryUtil.getLog(AdminSettings.class.getName());

}