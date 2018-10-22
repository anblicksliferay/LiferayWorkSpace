<%@page import="com.astra.anblicks.pdca.service.addkpi_ciLocalServiceUtil"%>
<%@page import="com.astra.anblicks.pdca.model.addkpi_ci"%>
<%@page import="com.astra.anblicks.pdca.model.ci_kpi"%>
<%@page import="com.astra.anblicks.pdca.service.ci_kpiLocalServiceUtil"%>
<%@ include file="/init.jsp" %>
<%@page import="com.liferay.portal.kernel.util.StringPool"%>
<%@page import="com.astra.anblicks.pdca.service.kpiLocalServiceUtil"%>
<%@page import="com.astra.anblicks.pdca.model.kpi"%>
<%@page import="com.liferay.portal.kernel.util.PortalUtil"%>
<%@page import="com.astra.anblicks.pdca.service.itemDescriptionLocalServiceUtil"%>
<%@page import="com.astra.anblicks.pdca.model.itemDescription"%>
<%@page import="com.astra.anblicks.pdca.service.typeLocalServiceUtil"%>
<%@page import="com.astra.anblicks.pdca.model.type"%>
<%@page import="com.astra.anblicks.pdca.service.companyLocalServiceUtil"%>
<%@page import="com.astra.anblicks.pdca.model.company"%>
<%@page import="java.util.List"%>
<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<%
addkpi_ci kpi_ =null;
String kpiid="";
String periodId="";
if( PortalUtil.getOriginalServletRequest(request).getParameter("kpiId") != null){
 kpi_=addkpi_ciLocalServiceUtil.getaddkpi_ci(Long.parseLong( PortalUtil.getOriginalServletRequest(request).getParameter("kpiId")));
 kpiid=PortalUtil.getOriginalServletRequest(request).getParameter("kpiId");
 periodId=PortalUtil.getOriginalServletRequest(request).getParameter("Period");
}


%>


<div class="row" style="background-color:#f7f9f9;"> 

<div class="col-md-6">
<div class="col-md-12"> 
<div  class="col-md-4" > <label>Company:</label></div>

<div  >
<select id="company" name="company" required="required" class="allinputs">
         <option value="">Select Company</option>
        <% List<company> companyList=companyLocalServiceUtil.getcompanies(0, companyLocalServiceUtil.getcompaniesCount()); if(companyList.size()>0){
        for(company val:companyList){
        %>
             <option value="<%=val.getCompanyId()%>"><%=val.getCompanyName()%></option>
        <%}}%>
 </select>
</div>
</div>

<div class="col-md-12" style="padding-top: 10px;"> 
<div  class="col-md-4" > <label>Strategy Type:   </label></div>
<div><select id="strategytype" name="strategytype" required="required" class="allinputs">
       <option value="">Select Type</option>
        <%List<type> typeList=typeLocalServiceUtil.gettypes(0, typeLocalServiceUtil.gettypesCount()); if(typeList.size()>0){
        	for(type val:typeList){ 
 %>
         	  <option value="<%=val.getTypeId()%>"><%=val.getTypeName() %></option>
        <%}} %>
 </select> </div>
 </div>
 <div class="col-md-12" style="padding-top:10px">
 <div class="col-md-4">
<label>Strategy:</label> </div> 
<div class="col-md-8" >
<input class="allinputs" style="margin-left: -14px;" type="text" id="strategy" name="strategy" required="required"/>
</div>
</div>

 <div class="col-md-12" style="padding-top:10px">
 <div class="col-md-4">

<label>Target:</label>
</div>
<div class="col-md-8" >
<input  class="allinputs" style="margin-left: -14px;"  type="text" id="target" name="target" required="required"/></div>
</div>
</div>


<div class="col-md-6"> 
<div  class="col-md-12">
<div class="col-md-4"> 
<label>Year: </label></div>
<div class="col-md-8">
<select  class="allinputs" id="year" name="year" required="required">
         <option value="">Select Year</option>
         <option value="2018">2018</option>
         <option value="2017">2017</option>
          <option value="2016">2016</option>
           <option value="2015">2015</option>
            <option value="2014">2014</option>
            
 </select>
</div></div>

<div   style="padding-top:10px;" class="col-md-12"  > 
<div  class="col-md-4">
<label>KPI: </label>
</div>
<div class="col-md-8"> <input  class="allinputs" type="text" id="kpi" name="kpi" required="required"/></div>

                                 </div>                
</div>
</div>


<div class="row"  id="ytdoladiv_" style=" display:none;  margin-top: 13px;background-color: #dfe5df;">
<div class="col-md-6">
<div class="col-md-12" style="padding-top:10px;" >
 <div class="col-md-4"> Target YTD:</div>
 <div > <input  class="allinputs" type="text" id="_TargetYTD" name="_TargetYTD" required="required"/></div>
 
</div>

<div class="col-md-12" style="padding-top:10px;" >
 <div class="col-md-4"> Achivement:</div>
 <div> <input class="allinputs" type="text" id="_Achivement" name="_Achivement" required="required"/></div>  
</div>


<div class="col-md-12" style="padding-top:10px;" >
 <div class="col-md-4"> Status:</div>
 <div>
     <label class="radio-inline">
      <input type="radio" id="_Status" name="_Status" value="Good" checked>Good
    </label>
    <label class="radio-inline">
      <input type="radio" id="_Status" name="_Status" value="Average">Average
    </label>
    <label class="radio-inline">
      <input type="radio" id="_Status" name="_Status" value="Poor">Poor
    </label>
 </div>
 
</div>
</div>

<div class="col-md-6">
<div class="col-md-12" style="padding-top:10px;"  style="padding-top:10px;" >
 <div class="col-md-4"> Problem Identification:</div>
 <div class="col-md-8" > <input  class="allinputs"  type="text" id="_PI" name="_PI" required="required"/></div>
 
</div>

<div class="col-md-12" style="padding-top:10px;" >
 <div class="col-md-4"> Proposed Action:</div>
 <div class="col-md-8" > <input class="allinputs"  type="text" id="_PA" name="_PA" required="required"/></div>  
 
</div>

</div>
</div>

<div class="row" style="margin-top: 15px; ">
<div class="col-md-6">
<div class="col-md-3">

<%if(kpiid==""){ %>
<button type="button"   class="btn btn-info" onclick="addkpi('add');">Save</button>
<%}else{ %> <button type="button"   class="btn btn-info" onclick="updatekpi('update');">Save</button> <%} %>
</div>
<div class="col-md-3"> <a  href="/group/astrapdca" class="btn btn-warning" >Cancel </a></div>
</div>
</div>


<script>

function addkpi(val) { 
	$.ajax({  
		url : '<%=listURL.toString()%>',
		data : {
				<portlet:namespace />cmd: val,
				<portlet:namespace />company: $("#company").val(),		
				<portlet:namespace />strategytype: $("#strategytype").val(),		
				<portlet:namespace />strategy: $("#strategy").val(),		
				<portlet:namespace />target: $("#target").val(),		
				<portlet:namespace />year: $("#year").val(),				
				<portlet:namespace />kpi: $("#kpi").val(),	
					},
		type : "POST",
		dataType : "json",
		success : function(data) { 
				console.log(data);
			if(data.sucess=="added"){
				 window.location.href = 'company-initiatives';	
			}
		},	
		error : function(response) {
			console.log("Error seen for updateValues");
			$("#<portlet:namespace />warning").show();
		}
	});
} ;

var kpiids ="<%=kpiid%>";

var periodIdHide ="<%=periodId%>";
function updatekpi(val) { 
	$.ajax({  
		url : '<%=listURL.toString()%>',
		data : {
				<portlet:namespace />cmd: val,
				<portlet:namespace />kpiid: kpiids,	
				<portlet:namespace />peridId: periodIdHide,
				<portlet:namespace />TargetYTD: $("#_TargetYTD").val(),		
				<portlet:namespace />Achivement: $("#_Achivement").val(),		
				<portlet:namespace />Status: $("#_Status").val(),		
				<portlet:namespace />PI: $("#_PI").val(),		
				<portlet:namespace />PA: $("#_PA").val(),				
					},
		type : "POST",
		dataType : "json",
		success : function(data) { 
				console.log(data);
			if(data.sucess=="updated"){
				 window.location.href = 'company-initiatives';	
			}
		},	
		error : function(response) {
			console.log("Error seen for updateValues");
			$("#<portlet:namespace />warning").show();
		}
	});
} ;

if(kpiids!=""){
initializeMyNotifications();
}
function initializeMyNotifications(){
	var kpiid ="<%=kpiid%>";
	
	var val="loadData"
	if(kpiid!=null){
		$.ajax({  
			url : '<%=listURL.toString()%>',
			data : {
					<portlet:namespace />cmd: val,
					<portlet:namespace />kpiid: kpiid,		
						},
			type : "POST",
			dataType : "json",
			success : function(data) { 
					console.log(data);
					$("#company").val(data.company);
					$("#strategytype").val(data.strategytype);
					$("#strategy").val(data.strategy);
					$("#target").val(data.target);
					$("#year").val(data.year);
					$("#kpi").val(data.kpi);
			},	
			error : function(response) {
				console.log("Error seen for updateValues");
				$("#<portlet:namespace />warning").show();
			}
		});
	}
}


var periodIdHide ="<%=periodId%>";
console.log(periodIdHide);
if(periodIdHide!=0){

$("#company").prop('disabled', true);
$("#strategytype").prop('disabled', true);
$("#strategy").prop('disabled', true);
$("#target").prop('disabled', true);
$("#kpi").prop('disabled', true);
$("#year").prop('disabled', true);
$( "#company" ).addClass("disabledDropdown");
$( "#strategytype" ).addClass("disabledDropdown");
$( "#year" ).addClass("disabledDropdown");
$("#ytdoladiv_").show();

}
if(periodIdHide==0){
	$("#ytdoladiv_").hide();
}


</script>

<style>
.olainputcss{
style="width:100px;" }
.allinputs{
    width: 250px;
}

.edittradingprofit_position{
    padding-top: 70px;
    margin-left: 270px;}
    .disabledDropdown{
        background-color: #ebebe4;
    }
    .edittradingInput{
width: 250px;    }
    .modal-body {
    max-height: calc(100vh - 250px);
    overflow-y: auto;
}
</style>