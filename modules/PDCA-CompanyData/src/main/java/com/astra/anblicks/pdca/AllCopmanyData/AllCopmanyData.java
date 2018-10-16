package com.astra.anblicks.pdca.AllCopmanyData;

import com.astra.anblicks.pdca.model.AstraPdca_CompanyData;
import com.astra.anblicks.pdca.service.AstraPdca_CompanyDataLocalServiceUtil;
import com.liferay.portal.kernel.json.JSONArray;
import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;

import java.io.IOException;
import java.util.List;

import javax.portlet.Portlet;
import javax.portlet.PortletException;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import org.osgi.service.component.annotations.Component;

@Component(
	immediate = true,
	property = {
		"com.liferay.portlet.display-category=AstraPDCA",
		"com.liferay.portlet.instanceable=true",
		"javax.portlet.display-name=PDCA-CompanyData Portlet",
		"javax.portlet.init-param.template-path=/",
		"javax.portlet.init-param.view-template=/view.jsp",
		"javax.portlet.resource-bundle=content.Language",
		"javax.portlet.security-role-ref=power-user,user"
	},
	service = Portlet.class
)
public class AllCopmanyData extends MVCPortlet {
	
	@Override
	public void doView(RenderRequest renderRequest, RenderResponse renderResponse)
			throws IOException, PortletException {
		// TODO Auto-generated method stub
		renderRequest.setAttribute("getALLCompanyData_json", doviewAllCompanyData());

		super.doView(renderRequest, renderResponse);
	}
	
	public static String doviewAllCompanyData(){
		JSONObject json = JSONFactoryUtil.createJSONObject();
	    JSONArray jsonData = JSONFactoryUtil.createJSONArray();
	   
		List<AstraPdca_CompanyData> astraPdca_CompanyList=AstraPdca_CompanyDataLocalServiceUtil.getAstraPdca_CompanyDatas(0, AstraPdca_CompanyDataLocalServiceUtil.getAstraPdca_CompanyDatasCount());
 		
		for(AstraPdca_CompanyData val:astraPdca_CompanyList){
			jsonData.put(getJsonallCompnayData(val));
		}
		
		 json.put("company_Data", jsonData);
		    return json.toString();
	}
	
	public static JSONObject getJsonallCompnayData(AstraPdca_CompanyData astraPdca_CompanyDataMOdel){
			
		
		 JSONObject json   = JSONFactoryUtil.createJSONObject();          
  	       json.put("companyId", astraPdca_CompanyDataMOdel.getCompanyId());
		    json.put("companyName", astraPdca_CompanyDataMOdel.getCompanyName());
		    json.put("group", astraPdca_CompanyDataMOdel.getGroupName());
		    json.put("dic", astraPdca_CompanyDataMOdel.getDIC());
		    json.put("dicintial", astraPdca_CompanyDataMOdel.getDICINITIAL());
			
		    
     		    return json;	
	}
	
	
}