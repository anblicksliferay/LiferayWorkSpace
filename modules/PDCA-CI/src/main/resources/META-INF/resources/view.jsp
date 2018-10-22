<%@page import="java.util.List"%>
<%@page import="com.astra.anblicks.pdca.service.companyLocalServiceUtil"%>
<%@page import="com.astra.anblicks.pdca.model.company"%>
<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<%@ include file="/init.jsp" %>

<portlet:resourceURL var="listURL"/>
<portlet:actionURL var="deleteProfile" name="deleteProfile"/>
<portlet:actionURL var="editProfile" name="editProfile"/>
<portlet:actionURL var="addKpi" name="addKpi"/>



<portlet:actionURL var="getfile" name="getfile"/>
<%
String kpidevData= (String) request.getAttribute("update_kpi_json");
%>
<form name="deleteForm" id="deleteForm" action="<%=deleteProfile.toString() %>" method="post" name="update">
	<input type="hidden" id="<portlet:namespace/>userid" name="<portlet:namespace/>userid"/>
</form>
<form name="editForm" id="editForm" action="<%=editProfile.toString() %>" method="post" name="update">
	<input type="hidden" id="<portlet:namespace/>editid" name="<portlet:namespace/>editid"/>
</form>
<div id="confirmDelete_Admin" style="background-color:#ffffff;  height: 15px; display: none;">
				<p style="margin: -9px 0 10px;" >Confirm Delete</p>
			</div> 

<div class="row">
<div class="col-md-4">
<div class="col-md-8">
<select class="getTableDataOnchage"  id="company_"> 
<option value="">Select Company</option>
<% List<company> companyList_=companyLocalServiceUtil.getcompanies(0, companyLocalServiceUtil.getcompaniesCount());
for( company val:companyList_){%>
<option value="<%=val.getCompanyId()%>"><%=val.getCompanyName() %></option>

	<% }%>
</select>
</div>
</div>
<div class="col-md-4">
<div class="col-md-8">
<select class="getTableDataOnchage" id="year_"> 
 <option value="">Select Year</option>
         <option value="2018">2018</option>
         <option value="2017">2017</option>
          <option value="2016">2016</option>
           <option value="2015">2015</option>
            <option value="2014">2014</option></select>
</div>
</div>
<div class="col-md-4"> <a  href="/group/astrapdca/addcidata" class="btn btn-info ">Add New Data </a>
</div>
</div>
 	 <div class="new-buttons-area"></div>
 <ul class="nav nav-tabs">
    <li class="active dev"><a data-toggle="tab" href="#home" onclick="drawDataTable('0');">Development</a></li>
    <li class="dev"><a data-toggle="tab" href="#menu1" onclick="drawDataTable('6');" >  &nbsp;&nbsp; &nbsp;Period 1 &nbsp;&nbsp; &nbsp;  </a></li>
    <li class="dev"><a data-toggle="tab" href="#menu2" onclick="drawDataTable('7');" >  &nbsp;&nbsp; &nbsp;Period 2 &nbsp; &nbsp; &nbsp; </a></li>
    <li class="dev" ><a data-toggle="tab" href="#menu3" onclick="drawDataTable('8');" > &nbsp; &nbsp; Period 3 &nbsp; &nbsp;</a></li>
    <li class="dev" ><a data-toggle="tab" href="#menu3" onclick="drawDataTable('9');" >  &nbsp; &nbsp; &nbsp;Period 4 &nbsp; &nbsp; &nbsp; </a></li>
   
 <div class="new-search-area"></div>
  </ul>


 <table class="devDataTablePhycial" class="table-responsive  table-bordered table-hover" cellspacing="0" width="100%">
			  <thead>
		        <tr>
		        <!-- Dev columns -->
		            <th>Strategy Type</th>
		            <th>Strategy</th>
		            <th>KPI</th>
		            <th>Target</th>
		            <th>Achivement</th>
		            <th>Status</th>
		            <th>Problem Identification</th>
		            <th>Proposed Action</th>
		            <th></th>
		        </tr>
</table>

<script>
var kpidevJson=<%=kpidevData%>;
var devDataGrid=null;

	  devDataGrid = $('.devDataTablePhycial').DataTable( {
		  initComplete : function() {
		        $("#DataTables_Table_0_filter").detach().appendTo('.new-buttons-area');
		        $(".dt-buttons").detach().appendTo('.new-search-area');
		             
		    }, 
		    dom: 'lBfrtip',
		  // "showNEntries" : false,
		   "bInfo" : false,
		    buttons: [
        	  { className:'button',
                  extend: 'print',
                  exportOptions: {
                	  columns: [0,1,2,3, 4,5,6]
                  }
              },
            { className:'button',
                extend: 'copyHtml5',
                exportOptions: {
                    columns: [0, 1, 2, 3, 4,5]
                }
            },
            { className:'button',
                extend: 'csvHtml5',

                	 exportOptions: {
                         columns: [ 0, 1, 2, 3, 4,5 ,6,7]
                     }
            },
            {   className:'button',
                extend: 'pdfHtml5',
                exportOptions: {
                    columns: [ 0, 1, 2, 3, 4,5,6,7]
                }
            }
          
        ],
		  searching: false,
		   "bLengthChange": false,
		  order: [[0, 'desc'] ],
		  "lengthMenu": [[10, 25, 50, 100, -1], [10, 25, 50,100, "All"]],  
        orderCellsTop: true,
        data:kpidevJson.kpi_Data, 
	    columns: [
		{ data: "Strategytype" },
		{ data: "Strategy" },
		{ data: "kpi"},
		{ data: "target" },
		{ data: "Achivement" },
		{ data: "Status" },
		{ data: "ProblemIdentification" },
		{ data: "ProposedAction" },
		{	
			title:			'',
			orderable:		true,
			data:			null, //editbutton  deleteButton
		defaultContent:
			'<span class=" glyphicon glyphicon-edit editbutton" style="cursor: pointer;"> </span>   <span class="glyphicon glyphicon-trash deleteButton" style="cursor: pointer;"></span>'
		}
		],
		
		columnDefs: [{
			targets: 0,
			type: "Strategytype"},
		
			{targets: 1,
				type: "Strategy"},
				
				{   targets: 2,
					type: "kpi"
				},
					{
						targets: 3,
						type: "target"
						},
						{   targets: 4,
							type: "Achivement"
							},
							
							{   targets: 5,
								type: "Status" 
								},
								{   targets: 6,
									type: "ProblemIdentification" 
									},
									{   targets: 7,
										type: "ProposedAction" 
										},
						
							{   targets: 8,
									type: "" ,
									 "searchable": false,
									 'sortable': false,
									 "orderable": false
									}
		]
    
	});	
	    devDataGrid.column(4).visible(false);
	    devDataGrid.column(5).visible(false); 
	    devDataGrid.column(6).visible(false);
	    devDataGrid.column(7).visible(false); 
	  $('.devDataTablePhycial').addClass("table-bordered");
	  $('.devDataTablePhycial tbody').on( 'click', '.editbutton', function () {
	        var data = devDataGrid.row( $(this).parents('tr') ).data();
	        console.log("edit");
	        console.log(data);
	        $('#<portlet:namespace/>editid').val(data.kpiId);
		  location.href="/group/astrapdca/addcidata?kpiId=".concat(data.kpiId)+"&Period=".concat(data.period)+"&companyId=not yet defined in table";

	    } );
     $('.devDataTablePhycial tbody').on( 'click', '.deleteButton', function () {
	   var data = devDataGrid.row( $(this).parents('tr') ).data();
	   console.log("deleteButton");
		        console.log(data);	 
		    	$('#<portlet:namespace/>userid').val(data.kpiId);
		         console.log("opening dialog"); 
		    	$( "#confirmDelete_Admin" ).dialog( "open" );
		});
     $("#confirmDelete_Admin").dialog({
 		height:'130',
 		width:'250',
 		modal: true,
 		autoOpen: false,
 		draggable: false,
 	buttons: {
 		"Delete": function() {
 			$( this ).dialog( "close" );
 			$('#deleteForm').submit();
 		},
 		"Cancel": function() {
 			$( this ).dialog( "close" );
 		},
 	}
 	});
function drawDataTable(val) {
	var cmd = 'list';
	$.ajax({  
		url : '<%=listURL.toString()%>',
		data : {
				<portlet:namespace />cmd: cmd,
				<portlet:namespace />cmdType: val,
					},
		type : "POST",
		dataType : "json",
		success : function(data) { 
	
		//	console.log(data.kpi_Data[0].period);
			var periodString=data.kpi_Data[0].period;
			if(periodString == "0")
    	{
				 devDataGrid.column(4).visible(false);
				 devDataGrid.column(5).visible(false); 
				 devDataGrid.column(6).visible(false);
				 devDataGrid.column(7).visible(false); 
			           var data = data.kpi_Data;
				       devDataGrid.clear();	
				       devDataGrid.rows.add(data).draw();
				       devDataGrid.draw();
		    
		}
			
			if(periodString=="6" || periodString=="7" || periodString=="8" || periodString=="9")
			{
				devDataGrid.column(0).visible(true);
				devDataGrid.column(1).visible(true);
				devDataGrid.column(2).visible(false);
				devDataGrid.column(3).visible(true);
				devDataGrid.column(4).visible(true);
				devDataGrid.column(5).visible(true); 
				devDataGrid.column(6).visible(true);
				devDataGrid.column(7).visible(true); 
			    	var data = data.kpi_Data;
			       devDataGrid.clear();	
			       devDataGrid.rows.add(data).draw();
			       devDataGrid.draw();
			    
			}
			
		},	
		error : function(response) {
			console.log("Error seen for updateValues");
			$("#<portlet:namespace />warning").show();
		}
	});
} ;

</script>

<style>
.new-search-area{
margin-left: 1015px;
    width: 18%;
}
</style>
