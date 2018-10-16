<%@page import="com.astra.anblicks.pdca.service.AstraPdca_CompanyDataLocalServiceUtil"%>
<%@page import="com.astra.anblicks.pdca.model.AstraPdca_CompanyData"%>
<%@page import="java.util.List"%>
<%@ include file="/init.jsp" %>

<portlet:resourceURL var="listURL"/>


  
  <div class="row  ">
      <div class="col-md-12"> <div class="col-md-8">
    Module:  <select id="moduleId" onchange="getAdminSettings();">
    <option value="">Select Module</option> 
    <option value="1">CLI</option> 
    <option value="2">CI</option> 
    <option value="3">MOM</option> 
    </select>
    </div></div>
    <div class="col-md-3  borderDiv" >
	
	  <div> Years</div>

    </div>
    <div class="col-md-3   borderDiv" >
	<div> Periods</div>
    </div>
	<div class="col-md-6   borderDiv">
	<div class="col-md-8"> Company List </div>
	<div class="col-md-4"> <label class="switch">
  <input type="checkbox"  id="toggleId_">
  <span class="slider round"></span>
</label></div>
	

	
	</div>
  </div>
  
    <div class="row  ">
    

    <div class="col-md-3 yearsdiv" >
	
<div class="radio">
  <label><input type="radio" name="yearRadio"  value="2018">2018</label>
</div>
<div class="radio">
  <label><input type="radio" name="yearRadio" value="2017" >2017</label>
</div>
<div class="radio ">
  <label><input type="radio" name="yearRadio" value="2016" >2016</label>
</div>
<div class="radio">
  <label><input type="radio" name="yearRadio" value="2015" >2015</label>
</div>
<div class="radio ">
  <label><input type="radio" name="yearRadio"  value="2014" >2014</label>
</div>
    </div>
	
	
	
    <div class="col-md-3   yearsdiv" >
<div class="radio">
  <label><input type="radio" name="periodRadio" value="1" >OL 1</label>
</div>
<div class="radio">
  <label><input type="radio" name="periodRadio" value="2"  >OL 2</label>
</div>
<div class="radio ">
  <label><input type="radio" name="periodRadio"  value="3"  >Ol Adj.</label>
</div>
<div class="radio">
  <label><input type="radio" name="periodRadio" value="4"  >OL 3</label>
</div>
<div class="radio ">
  <label><input type="radio" name="periodRadio"  value="5"  >Full Year</label>
</div>    </div>
	<div class="col-md-6 companydropdownDIV  ">
	
<select id="second" data-placeholder="Choose a Company" class="company_chosen_select" multiple style="height: 300px: width:500px;" tabindex="4">
        
     
          <%	List<AstraPdca_CompanyData>  list= AstraPdca_CompanyDataLocalServiceUtil.getAstraPdca_CompanyDatas(0, AstraPdca_CompanyDataLocalServiceUtil.getAstraPdca_CompanyDatasCount());
 for(AstraPdca_CompanyData val:list){ %>
    <option value="<%=val.getCompanyId()%>"><%=val.getCompanyName()%></option>
 
	 <% }%>

        </select> 
        
        
                
        	</div>
  </div>
  
     <div class="row"> 
     
     <div class="col-md-10"></div>
     <div class="col-md-2">   <button type="button" class="btn btn-info" id="btnGetValue">Save</button></div>
   
     </div>

<style>

.borderDiv{
border: 1px solid;
height:35px;
text-align:center;
}
.companydropdownDIV{
height: 260px;
border: 1px solid;
}

.yearsdiv{
height:260px;
border: 1px solid;
text-align:center;
}
</style>
<script>
$(".company_chosen_select").chosen();
$('.chzn-drop').css({"width": "300px"});
var checkFlag=false;
$("#toggleId_").on('change', function() {
	
	  if ($(this).is(':checked')) {
	   checkFlag=true;
	  } else {
	     checkFlag=false;
	  }
	  

		var val="checkUncheck"
			$.ajax({  
				url : '<%=listURL.toString()%>',
				data : {
						<portlet:namespace />cmd: val,
						<portlet:namespace />checkFlag: checkFlag,
							},
				type : "POST",
				dataType : "json",
				success : function(data) { 
						console.log(data);
					   $(".company_chosen_select").val(data.companyIds).trigger("chosen:updated");
				},
				error : function(response) {
					console.log("Error seen for updateValues");
					$("#<portlet:namespace />warning").show();
				}
			});
	  
	  
	  });
$('#btnGetValue').click(function() {
    var yearvalue = $('input[name=yearRadio]:checked').val(); 
    var periodvalue = $('input[name=periodRadio]:checked').val(); 
	var data={companyArray:$(".company_chosen_select").val()};
	$.ajax({  
		url : '<%=listURL.toString()%>',
		data : {
				<portlet:namespace />cmd: 'adminSettings',
				<portlet:namespace />moduleId: $("#moduleId").val(),
				<portlet:namespace />yearvalue: yearvalue,
				<portlet:namespace />periodvalue: periodvalue,
				<portlet:namespace />checkFlag: checkFlag,
				<portlet:namespace />companysId: JSON.stringify(data),				
					},
		type : "POST",
		dataType : "json",
		success : function(data) { 
				console.log(data);
			if(data.sucess=="added"){
				 location.href = '/group/astrapdca/adminstration-settings';	
			}
		},	
		error : function(response) {
			console.log("Error seen for updateValues");
			$("#<portlet:namespace />warning").show();
		}
	});
    
    
 });
function getAdminSettings(){
	
	var val="getAdminSettings"
		$.ajax({  
			url : '<%=listURL.toString()%>',
			data : {
					<portlet:namespace />cmd: val,
					<portlet:namespace />moduleId: $("#moduleId").val(),
						},
			type : "POST",
			dataType : "json",
			success : function(data) { 
					console.log(data);
					$("input[name=yearRadio][value=" + data.year + "]").prop('checked', 'checked');
					$("input[name=periodRadio][value=" + data.period + "]").prop('checked', 'checked');
				   $(".company_chosen_select").val(data.companyIds).trigger("chosen:updated");
				   if(data.checkFlag=="true"){  $('#toggleId_').prop('checked', true);} 
				 else{  $('#toggleId_').prop('checked',false);}
				 
			},
			error : function(response) {
				console.log("Error seen for updateValues");
				$("#<portlet:namespace />warning").show();
			}
		});

}


	  
 $('#langOpt3').multiselect({
    columns: 1,
    placeholder: 'Select Languages',
    search: true,
    selectAll: true
});
 
 //$("#langOpt3").find("option[value=Java)].prop("selected", true);
        $("#langOpt3").find("option[value=Java]").prop("selected", true)

 $("#langOpt3").multiselect("refresh");

/*  $('#langOpt3').multiselect({
		'loadOptions': [{
	          name   : 'Option Name 1',
	          value  : 'option-value-1',
	          checked: false,
	          attributes : {
	              custom1: 'value1',
	              custom2: 'value2'
	          }
	      },{
	          name   : 'Option Name 2',
	          value  : 'option-value-2',
	          checked: false,
	          attributes : {
	              custom1: 'value1',
	              custom2: 'value2'
	          }
	      }],
		
		 columns: 1,
		    placeholder: 'Select Languages',
		    search: true,
		    selectAll: true
		
 }); */
</script>


<style>
.switch {
  position: relative;
  display: inline-block;
  width: 60px;
  height: 34px;
}

.switch input {display:none;}

.slider {
  position: absolute;
  cursor: pointer;
  top: 0;
  left: 0;
  right: 0;
  bottom: 0;
  background-color: #ccc;
  -webkit-transition: .4s;
  transition: .4s;
}

.slider:before {
  position: absolute;
  content: "";
  height: 26px;
  width: 26px;
  left: 4px;
  bottom: 4px;
  background-color: white;
  -webkit-transition: .4s;
  transition: .4s;
}

input:checked + .slider {
  background-color: #2196F3;
}

input:focus + .slider {
  box-shadow: 0 0 1px #2196F3;
}

input:checked + .slider:before {
  -webkit-transform: translateX(26px);
  -ms-transform: translateX(26px);
  transform: translateX(26px);
}

/* Rounded sliders */
.slider.round {
  border-radius: 34px;
}

.slider.round:before {
  border-radius: 50%;
}
</style>