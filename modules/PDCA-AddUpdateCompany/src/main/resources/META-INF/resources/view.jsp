<%@page import="com.astra.anblicks.pdca.model.AstraPdca_CompanyData"%>
<%@page import="com.astra.anblicks.pdca.service.AstraPdca_CompanyDataLocalServiceUtil"%>
<%@page import="com.liferay.portal.kernel.util.PortalUtil"%>
<%@page import="com.liferay.portal.kernel.service.UserLocalServiceUtil"%>
<%@page import="java.util.List"%>
<%@page import="com.liferay.portal.kernel.model.User"%>
<%@ include file="/init.jsp" %>

<%

String companyId="";

if( PortalUtil.getOriginalServletRequest(request).getParameter("companyId") != null){
	companyId=PortalUtil.getOriginalServletRequest(request).getParameter("companyId");
	
	}


%>

<div class="row">  <div class="col-md-12"><h4>General Information</h4></div> </div>
  <form class="form-horizontal" >
  <div class="row generalInfoborder" > 
  <div class="col-md-6"> 
  <div class="form-group">
    <label class="control-label col-sm-4" for="company" >Company Code: <span class="mandatatory">*</span></label>
    <div class="col-sm-6">
      <input type="text" class="form-control" id="companyCode" placeholder="Enter Company Code" >
	  
    </div>
  </div>
  <div class="form-group">
    <label class="control-label col-sm-4" for="companyName">company Name: <span class="mandatatory">*</span></label>
    <div class="col-sm-6"> 
      <input type="text" class="form-control" id="companyName" placeholder="Enter company Name ">
    </div>
  </div>
  <div class="form-group"> 
        <label class="control-label col-sm-4" for="GroupName">Group Name: <span class="mandatatory">*</span></label>
    <div class="col-sm-6"> 
      <input type="text" class="form-control" id="GroupName" placeholder="Enter Group Name ">
    </div>
  </div>

  </div> 
    <div class="col-md-6"> 
  <div class="form-group">
    <label class="control-label col-sm-4" for="company">DIC: <span class="mandatatory">*</span></label>
    <div class="col-sm-6">
      <input type="text" class="form-control" id="DIC" placeholder="Enter DIC">
    </div>
  </div>
  <div class="form-group">
    <label class="control-label col-sm-4" for="DICIntial">DIC Intial: <span class="mandatatory">*</span></label>
    <div class="col-sm-6"> 
      <input type="text" class="form-control" id="DICIntial" placeholder="Enter DIC Intial">
    </div>
  </div>


  </div>
    </div>
	
	
	<div class="row">  <div class="col-md-12"><h4>Access</h4></div> </div>
<div class="row generalInfoborder" > 
  <div class="col-md-6"> 
  <div class="form-group">
    <label class="control-label col-sm-4" for="company" >PIC: <span class="mandatatory">*</span></label>
    <div class="col-sm-12">
	  
	<!--   <select class="form-control" id="pic">  -->  
	
	<select id="pic" data-placeholder="Choose a User" class="company_chosen_select" multiple style="height: 300px: width:500px;" tabindex="4">
	 
	  
	    <option value="">Please Select PIC</option> 
         <%List<User> userList=UserLocalServiceUtil.getUsers(0, UserLocalServiceUtil.getUsersCount()); 
         System.out.println(userList.size());
         for(User user_:userList){ %>
        	 <option value="<%=user_.getUserId()%>"><%=user_.getFullName() %></option> 
        	 
        	 
        	<% }%>
          
	  </select>
	  
    </div>
  </div>
 

  </div> 

    </div>
	
	
		<div class="row">  <div class="col-md-12"><h4>CLA Sign Off</h4></div> </div>
		
		
		<div class="row " > 
  <div class="col-md-6 clasingnOffSeprating " > Left Up
  <div class="form-group">
    <label class="control-label col-sm-4" for="leftUpName" >Name: <span class="mandatatory">*</span></label>
    <div class="col-sm-6">
      <input type="text" class="form-control" id="leftUpName" placeholder="Enter Name" >
	  
    </div>
  </div>
  <div class="form-group">
    <label class="control-label col-sm-4" for="leftUpPosition">Position: <span class="mandatatory">*</span></label>
    <div class="col-sm-6"> 
      <input type="text" class="form-control" id="leftUpPosition" placeholder="Enter Position  ">
    </div>
  </div>
  <div class="form-group"> 
        <label class="control-label col-sm-4" for="leftUpGroupName">Group Name: <span class="mandatatory">*</span></label>
    <div class="col-sm-6"> 
      <input type="text" class="form-control" id="leftUpGroupName" placeholder="Enter Group Name ">
    </div>
  </div>

  </div> 
   <div class="col-md-6 clasingnOffSeprating " > Left Down
  <div class="form-group">
    <label class="control-label col-sm-4" for="leftDownName" >Name: <span class="mandatatory">*</span></label>
    <div class="col-sm-6">
      <input type="text" class="form-control" id="leftDownName" placeholder="Enter Name" >
	  
    </div>
  </div>
  <div class="form-group">
    <label class="control-label col-sm-4" for="leftDownPosition">Position: <span class="mandatatory">*</span></label>
    <div class="col-sm-6"> 
      <input type="text" class="form-control" id="leftDownPosition" placeholder="Enter Position  ">
    </div>
  </div>
  <div class="form-group"> 
        <label class="control-label col-sm-4" for="leftDownGroupName">Group Name: <span class="mandatatory">*</span></label>
    <div class="col-sm-6"> 
      <input type="text" class="form-control" id="leftDownGroupName" placeholder="Enter Group Name ">
    </div>
  </div>

  </div> 
    </div>
	
		
		
		<div class="row " > 
  <div class="col-md-6 clasingnOffSeprating " > Right Up
  <div class="form-group">
    <label class="control-label col-sm-4" for="rightUpName" >Name: <span class="mandatatory">*</span></label>
    <div class="col-sm-6">
      <input type="text" class="form-control" id="rightUpName" placeholder="Enter Name" >
	  
    </div>
  </div>
  <div class="form-group">
    <label class="control-label col-sm-4" for="rightUpPosition">Position: <span class="mandatatory">*</span></label>
    <div class="col-sm-6"> 
      <input type="text" class="form-control" id="rightUpPosition" placeholder="Enter Position  ">
    </div>
  </div>
  <div class="form-group"> 
        <label class="control-label col-sm-4" for="rightUpGroupName">Group Name: <span class="mandatatory">*</span></label>
    <div class="col-sm-6"> 
      <input type="text" class="form-control" id="rightUpGroupName" placeholder="Enter Group Name ">
    </div>
  </div>

  </div> 
   <div class="col-md-6 clasingnOffSeprating " > Right Down
  <div class="form-group">
    <label class="control-label col-sm-4" for="rightDownName" >Name: <span class="mandatatory">*</span></label>
    <div class="col-sm-6">
      <input type="text" class="form-control" id="rightDownName" placeholder="Enter Name" >
	  
    </div>
  </div>
  <div class="form-group">
    <label class="control-label col-sm-4" for="rightDownPosition">Position: <span class="mandatatory">*</span></label>
    <div class="col-sm-6"> 
      <input type="text" class="form-control" id="rightDownPosition" placeholder="Enter Position  ">
    </div>
  </div>
  <div class="form-group"> 
        <label class="control-label col-sm-4" for="rightDownGroupName">Group Name: <span class="mandatatory">*</span></label>
    <div class="col-sm-6"> 
      <input type="text" class="form-control" id="rightDownGroupName" placeholder="Enter Group Name ">
    </div>
  </div>

  </div> 
    </div>

	
	
	<div class="row " > 
  <div class="col-md-6 clasingnOffSeprating " > Middle Up
  <div class="form-group">
    <label class="control-label col-sm-4" for="middleUpName" >Name: <span class="mandatatory">*</span></label>
    <div class="col-sm-6">
      <input type="text" class="form-control" id="middleUpName" placeholder="Enter Name" >
	  
    </div>
  </div>
  <div class="form-group">
    <label class="control-label col-sm-4" for="middleUpPosition">Position: <span class="mandatatory">*</span></label>
    <div class="col-sm-6"> 
      <input type="text" class="form-control" id="middleUpPosition" placeholder="Enter Position  ">
    </div>
  </div>
  <div class="form-group"> 
        <label class="control-label col-sm-4" for="middleUpGroupName">Group Name: <span class="mandatatory">*</span></label>
    <div class="col-sm-6"> 
      <input type="text" class="form-control" id="middleUpGroupName" placeholder="Enter Group Name ">
    </div>
  </div>

  </div> 
   <div class="col-md-6 clasingnOffSeprating " > Middle Down
  <div class="form-group">
    <label class="control-label col-sm-4" for="middleDownName" >Name: <span class="mandatatory">*</span></label>
    <div class="col-sm-6">
      <input type="text" class="form-control" id="middleDownName" placeholder="Enter Name" >
	  
    </div>
  </div>
  <div class="form-group">
    <label class="control-label col-sm-4" for="middleDownPosition">Position: <span class="mandatatory">*</span></label>
    <div class="col-sm-6"> 
      <input type="text" class="form-control" id="middleDownPosition" placeholder="Enter Position  ">
    </div>
  </div>
  <div class="form-group"> 
        <label class="control-label col-sm-4" for="middleDownGroupName">Group Name: <span class="mandatatory">*</span></label>
    <div class="col-sm-6"> 
      <input type="text" class="form-control" id="middleDownGroupName" placeholder="Enter Group Name ">
    </div>
  </div>

  </div> 
    </div>

</form>

<div class="row" style="padding-top:10px;">
<div class="col-md-12"> 

<div class="col-md-8">

</div>
<div class="col-md-4">
<div class="col-md-6">
<%if(companyId==""){ %>
<button type="button" class="btn btn-info" onclick="addCompany('add');" >Save</button>
<%}else{ %>
<button type="button" class="btn btn-info" onclick="addCompany('update');" >Update</button>

<%} %>
</div>
<div class="col-md-6">
<button type="button" class="btn btn-info">Cancel</button>

</div>
</div>

</div>
</div>

<script>
$(".company_chosen_select").chosen();
var companyId ="<%=companyId%>";

function addCompany(val) { 
	
	var modulearray = [];
	$('#checkboxes input:checked').each(function() {
		modulearray.push($(this).attr('name'));
	});
	
	var data={userArray:$(".company_chosen_select").val()};
	$.ajax({  
		url : '<%=listURL.toString()%>',
		data : {
				<portlet:namespace />cmd: val,
				<portlet:namespace />copmanyId: companyId,
				<portlet:namespace />companyCode: $("#companyCode").val(),		
				<portlet:namespace />companyName: $("#companyName").val(),		
				<portlet:namespace />GroupName: $("#GroupName").val(),		
				<portlet:namespace />DIC: $("#DIC").val(),		
				<portlet:namespace />DICIntial: $("#DICIntial").val(),		
				<portlet:namespace />pic: JSON.stringify(data),				
				<portlet:namespace />modulearray: $("#modulearray").val(),	
				
				//left up
				<portlet:namespace />leftUpName: $("#leftUpName").val(),
				<portlet:namespace />leftDownPosition: $("#leftDownPosition").val(),
				<portlet:namespace />leftUpGroupName: $("#leftUpGroupName").val(),
				
				//left Down
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
				<portlet:namespace />middleDownGroupName: $("#middleDownGroupName").val(),
			
				
					},
		type : "POST",
		dataType : "json",
		success : function(data) { 
				console.log(data);
			if(data.sucess=="added"){
				 location.href = '/group/astrapdca/company-data';	
			}
		},	
		error : function(response) {
			console.log("Error seen for updateValues");
			$("#<portlet:namespace />warning").show();
		}
	});
} ;

var companyId ="<%=companyId%>";

if(companyId!=""){
	//$("#ytdoladiv_").show();
initializeMyNotifications();
}
function initializeMyNotifications(){
	
	
	var val="loadData"
	if(companyId!=null){
		$.ajax({  
			url : '<%=listURL.toString()%>',
			data : {
					<portlet:namespace />cmd: val,
					<portlet:namespace />companyId: companyId,		
						},
			type : "POST",
			dataType : "json",
			success : function(data) { 
					console.log(data);
			
				 $("#companyCode").val(data.copmanycode);
					$("#companyName").val(data.company);		
				 $("#GroupName").val(data.group);		
				$("#DIC").val(data.dic);		
				 $("#DICIntial").val(data.dicintial);		
				$(".company_chosen_select").val(data.pic).trigger("chosen:updated");
			},
			error : function(response) {
				console.log("Error seen for updateValues");
				$("#<portlet:namespace />warning").show();
			}
		});
	}
}


</script>


<style>
.mandatatory{
color:red
}

.generalInfoborder{
border: 1px solid;
    padding-top: 10px;}
	
	.clasingnOffSeprating{
	border: 1px solid;
    padding-top: 15px;
	padding-bottom: 15px;
	padding-left: 15px;
	padding-right: 15px;
	
	}
</style>