package com.astra.anblicks.pdca.AddUpdateCompany;

import com.astra.anblicks.pdca.model.AstraPdca_CompanyData;
import com.astra.anblicks.pdca.model.company_user;
import com.astra.anblicks.pdca.service.AstraPdca_CompanyDataLocalServiceUtil;
import com.astra.anblicks.pdca.service.company_userLocalServiceUtil;
import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.PropertyFactoryUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.json.JSONArray;
import com.liferay.portal.kernel.json.JSONException;
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
		"javax.portlet.display-name=PDCA-AddUpdateCompany Portlet",
		"javax.portlet.init-param.template-path=/",
		"javax.portlet.init-param.view-template=/view.jsp",
		"javax.portlet.resource-bundle=content.Language",
		"javax.portlet.security-role-ref=power-user,user"
	},
	service = Portlet.class
)
public class AddUpdateCompany extends MVCPortlet {
	
	@Override
	public void doView(RenderRequest renderRequest, RenderResponse renderResponse)
			throws IOException, PortletException {
		// TODO Auto-generated method stub
		super.doView(renderRequest, renderResponse);
	}
	
	
	
	public void serveResource(ResourceRequest resourceRequest, ResourceResponse resourceResponse)
		    throws IOException, PortletException
		  {
		    String cmd = ParamUtil.getString(resourceRequest, "cmd");
		    if (cmd.equalsIgnoreCase("add")) {
		    	
		    	try {
		    		 Long companyId=CounterLocalServiceUtil.increment();
		    		 ThemeDisplay themeDisplay = (ThemeDisplay) resourceRequest.getAttribute(WebKeys.THEME_DISPLAY);
			    		AstraPdca_CompanyData astraPdca_CompanyData=AstraPdca_CompanyDataLocalServiceUtil.createAstraPdca_CompanyData(CounterLocalServiceUtil.increment());
			    		astraPdca_CompanyData.setCompanyId(companyId);
			    		astraPdca_CompanyData.setCompanyCode(resourceRequest.getParameter("companyCode"));
			    		astraPdca_CompanyData.setGroupName(resourceRequest.getParameter("GroupName"));
			    		astraPdca_CompanyData.setCompanyName(resourceRequest.getParameter("companyName"));
			    		astraPdca_CompanyData.setDIC(resourceRequest.getParameter("DIC"));
			    		astraPdca_CompanyData.setDICINITIAL(resourceRequest.getParameter("DICIntial"));
			    		
			    		
			    		//left up Thease are should we are mapping to ui to excel sheet cell data
						/*<portlet:namespace />leftUpName: $("#leftUpName").val(),
						<portlet:namespace />leftDownPosition: $("#leftDownPosition").val(),
						<portlet:namespace />leftUpGroupName: $("#leftUpGroupName").val(),*/
			    		
			    		
			    		//left up
//						astraPdca_CompanyData.setLEFTUP(resourceRequest.getParameter(""));
//						astraPdca_CompanyData.setleft
			    		
						/*//left Down
						<portlet:namespace />leftDownName: $("#leftDownName").val(),
						<portlet:namespace />leftUpPosition: $("#leftUpPosition").val(),
						<portlet:namespace />leftDownGroupName: $("#leftDownGroupName").val(),
						
						//Right Up
						<portlet:namespace />rightUpName: $("#rightUpName").val(),
						<portlet:namespace />rightUpPosition: $("#rightUpPosition").val(),
						<portlet:namespace />rightUpGroupName: $("#rightUpGroupName").val(),
					
						//Right Down
						<portlet:namespace />rightDownName: $("#rightDownName").val(),
						<portlet:namespace />rightDownPosition: $("#rightDownPosition").val(),
						<portlet:namespace />rightDownGroupName: $("#rightDownGroupName").val(),
						
						
						//Middle Up
						<portlet:namespace />middleUpName: $("#middleUpName").val(),
						<portlet:namespace />middleUpPosition: $("#middleUpPosition").val(),
						<portlet:namespace />middleUpGroupName: $("#middleUpGroupName").val(),
						
						//Middle Down
						<portlet:namespace />middleDownName: $("#middleDownName").val(),
						<portlet:namespace />middleDownPosition: $("#middleDownPosition").val(),
						<portlet:namespace />middleDownGroupName: $("#middleDownGroupName").val(),*/
			    		
			    		 //audit 
			    		
			    		astraPdca_CompanyData.setSiteId(themeDisplay.getCompanyId());
			    		astraPdca_CompanyData.setCreateDate(new Date());
			    		astraPdca_CompanyData.setCreatedBy(themeDisplay.getUser().getFullName());
			    		astraPdca_CompanyData.setModifiedDate(new Date());
			    		astraPdca_CompanyData.setModifiedBy(themeDisplay.getUser().getFullName());
			    		AstraPdca_CompanyDataLocalServiceUtil.updateAstraPdca_CompanyData(astraPdca_CompanyData);
			    		try {
						 JSONObject json = JSONFactoryUtil.createJSONObject(resourceRequest.getParameter("pic"));
					     JSONArray configValues = JSONFactoryUtil.createJSONArray( json.getString("userArray") );
					     if(null!=configValues){
								for (int i = 0; i < configValues.length(); i++) {
									company_user company_user=company_userLocalServiceUtil.createcompany_user(CounterLocalServiceUtil.increment());
									company_user.setCompany_user_Id(CounterLocalServiceUtil.increment());
									company_user.setCompanyId(companyId);
									company_user.setPdca_userId(configValues.getLong(i));
									company_userLocalServiceUtil.updatecompany_user(company_user);
								}
							}
					     
						  json.put("sucess", "added");
		        		 writeJSON(resourceRequest, resourceResponse,json);
						} catch (JSONException e) {
							e.printStackTrace();
							logger.error(e);
							    JSONObject json = JSONFactoryUtil.createJSONObject();
						        json.put("error", "error");
						        writeJSON(resourceRequest, resourceResponse, json);	
						}
				} catch (Exception e) {
					e.printStackTrace();
					logger.error(e);
				}
		    	
		    
		    }
		    else if(cmd.equalsIgnoreCase("loadData")){
		    	
	try {
		AstraPdca_CompanyData astraPdca_CompanyData=AstraPdca_CompanyDataLocalServiceUtil.getAstraPdca_CompanyData(ParamUtil.getLong(resourceRequest, "companyId"));
		
	  	JSONObject json   = JSONFactoryUtil.createJSONObject();          
 	        json.put("companyId", ParamUtil.getLong(resourceRequest, "companyId"));
		    json.put("company", astraPdca_CompanyData.getCompanyName());
		    json.put("copmanycode",astraPdca_CompanyData.getCompanyCode());
		    json.put("group", astraPdca_CompanyData.getGroupName());
		    json.put("dic", astraPdca_CompanyData.getDIC());
		    json.put("dicintial",  astraPdca_CompanyData.getDICINITIAL());
		    json.put("pic", onloadgetUserJsonarray( ParamUtil.getLong(resourceRequest, "companyId")));
		    writeJSON(resourceRequest, resourceResponse, json);
	} catch (PortalException e) {
		 JSONObject json = JSONFactoryUtil.createJSONObject();
	     json.put("error", "error");
	     writeJSON(resourceRequest, resourceResponse, json);				
	     logger.error(e);
	}
		    	
		    }
		    
		    else if(cmd.equalsIgnoreCase("update")){
		    	
	try {
		   ThemeDisplay themeDisplay = (ThemeDisplay) resourceRequest.getAttribute(WebKeys.THEME_DISPLAY);
   		AstraPdca_CompanyData astraPdca_CompanyData=AstraPdca_CompanyDataLocalServiceUtil.getAstraPdca_CompanyData(ParamUtil.getLong(resourceRequest, "copmanyId"));
   		astraPdca_CompanyData.setCompanyCode(resourceRequest.getParameter("companyCode"));
   		astraPdca_CompanyData.setGroupName(resourceRequest.getParameter("GroupName"));
   		astraPdca_CompanyData.setCompanyName(resourceRequest.getParameter("companyName"));
   		astraPdca_CompanyData.setDIC(resourceRequest.getParameter("DIC"));
   		astraPdca_CompanyData.setDICINITIAL(resourceRequest.getParameter("DICIntial"));
   		
   		
   		//left up Thease are should we are mapping to ui to excel sheet cell data
			/*<portlet:namespace />leftUpName: $("#leftUpName").val(),
			<portlet:namespace />leftDownPosition: $("#leftDownPosition").val(),
			<portlet:namespace />leftUpGroupName: $("#leftUpGroupName").val(),*/
   		
   		
   		//left up
//			astraPdca_CompanyData.setLEFTUP(resourceRequest.getParameter(""));
//			astraPdca_CompanyData.setleft
   		
			/*//left Down
			<portlet:namespace />leftDownName: $("#leftDownName").val(),
			<portlet:namespace />leftUpPosition: $("#leftUpPosition").val(),
			<portlet:namespace />leftDownGroupName: $("#leftDownGroupName").val(),
			
			//Right Up
			<portlet:namespace />rightUpName: $("#rightUpName").val(),
			<portlet:namespace />rightUpPosition: $("#rightUpPosition").val(),
			<portlet:namespace />rightUpGroupName: $("#rightUpGroupName").val(),
		
			//Right Down
			<portlet:namespace />rightDownName: $("#rightDownName").val(),
			<portlet:namespace />rightDownPosition: $("#rightDownPosition").val(),
			<portlet:namespace />rightDownGroupName: $("#rightDownGroupName").val(),
			
			
			//Middle Up
			<portlet:namespace />middleUpName: $("#middleUpName").val(),
			<portlet:namespace />middleUpPosition: $("#middleUpPosition").val(),
			<portlet:namespace />middleUpGroupName: $("#middleUpGroupName").val(),
			
			//Middle Down
			<portlet:namespace />middleDownName: $("#middleDownName").val(),
			<portlet:namespace />middleDownPosition: $("#middleDownPosition").val(),
			<portlet:namespace />middleDownGroupName: $("#middleDownGroupName").val(),*/
   		
   		 //audit 
   		
   		astraPdca_CompanyData.setSiteId(themeDisplay.getCompanyId());
   		astraPdca_CompanyData.setModifiedDate(new Date());
   		astraPdca_CompanyData.setModifiedBy(themeDisplay.getUser().getFullName());
   		AstraPdca_CompanyDataLocalServiceUtil.updateAstraPdca_CompanyData(astraPdca_CompanyData);
   		try {
   			
   			
			  DynamicQuery dq_user =company_userLocalServiceUtil.dynamicQuery();
			  dq_user.add(PropertyFactoryUtil.forName("companyId").eq(ParamUtil.getLong(resourceRequest, "copmanyId")));
		      List<company_user> userlist= company_userLocalServiceUtil.dynamicQuery(dq_user);
			for(company_user val:userlist){
				company_userLocalServiceUtil.deletecompany_user(val.getCompany_user_Id());
			
			}
			
			
			 JSONObject json = JSONFactoryUtil.createJSONObject(resourceRequest.getParameter("pic"));
		     JSONArray configValues = JSONFactoryUtil.createJSONArray( json.getString("userArray") );
		     if(null!=configValues){
					for (int i = 0; i < configValues.length(); i++) {
						company_user company_user=company_userLocalServiceUtil.createcompany_user(CounterLocalServiceUtil.increment());
						company_user.setCompany_user_Id(CounterLocalServiceUtil.increment());
						company_user.setCompanyId(ParamUtil.getLong(resourceRequest, "copmanyId"));
						company_user.setPdca_userId(configValues.getLong(i));
						company_userLocalServiceUtil.updatecompany_user(company_user);
					}
				}
		     
			  json.put("sucess", "added");
   		 writeJSON(resourceRequest, resourceResponse,json);
			} catch (JSONException e) {
				e.printStackTrace();
				logger.error(e);
				    JSONObject json = JSONFactoryUtil.createJSONObject();
			        json.put("error", "error");
			        writeJSON(resourceRequest, resourceResponse, json);	
			
					} 
					} 
				 catch (Exception e) {
					e.printStackTrace();
					logger.error(e);
				}
		    	} 
		    }
		    
		public static JSONArray onloadgetUserJsonarray(long companyId){
		    	JSONArray jsonArray = JSONFactoryUtil.createJSONArray();
			  DynamicQuery dq_user =company_userLocalServiceUtil.dynamicQuery();
			  dq_user.add(PropertyFactoryUtil.forName("companyId").eq(companyId));
		      List<company_user> userlist= company_userLocalServiceUtil.dynamicQuery(dq_user);
			for(company_user val:userlist){
				jsonArray.put(val.getPdca_userId());
			}
		 	 return jsonArray;
		}
		    
	private static Log logger = LogFactoryUtil.getLog(AddUpdateCompany.class.getName());
	
}
