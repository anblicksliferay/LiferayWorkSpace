<%@ include file="/init.jsp" %>
           <%
String getALLCompanyData_json= (String) request.getAttribute("getALLCompanyData_json");
%>

 <table class="AllcompanyDataClass table-bordered table-hover " cellspacing="0" width="100%">
			  <thead>
		        <tr>
		        <!-- Dev columns -->
		         <th></th>
		            <th>Company Name</th> 
		         
		            <th>DIC</th>
		             <th>DIC Intial</th>
		        </tr>
</table>

<script>


var getALLCompanyData_json=<%=getALLCompanyData_json%>;
var devDataGrid=null;

	  devDataGrid = $('.AllcompanyDataClass').DataTable( {
		     dom: 'lBfrtip',
		   "showNEntries" : true,
		   "bInfo" : true,
		 
		  searching: true,
		   "bLengthChange": true,
		  order: [[0, 'desc'] ],
		  "lengthMenu": [[10, 25, 50, 100, -1], [10, 25, 50,100, "All"]],  
        orderCellsTop: true,
        data:getALLCompanyData_json.company_Data, 
	    columns: [
{	
	title:			'',
	orderable:		true,
	data:			null, //editbutton  deleteButton
defaultContent:
	'<span id="editbuttonId" class=" glyphicon glyphicon-edit editbutton" style="cursor: pointer;"> </span>   <span class="glyphicon glyphicon-trash deleteButton" style="cursor: pointer;"></span>'
},
		{ data: "companyName" },
	
		{ data: "dic"},
		{ data: "dicintial" },
		],
		
		columnDefs: [{
			targets: 0,
			type: "" ,
			 "searchable": false,
			 'sortable': false,
			 "orderable": false},
		
			{targets: 1,
				type: "companyName"},
				
			
					{
						targets: 2,
						type: "dic"
						},
						{   targets: 3,
							type: "dicintial"
							}
			
		]
    
	});	
	  
	  $('.AllcompanyDataClass tbody').on( 'click', '.editbutton', function () {
	        var data = devDataGrid.row( $(this).parents('tr') ).data();
	        console.log("edit");
	        console.log(data);
	        $('#<portlet:namespace/>editid').val(data.kpiId);
		  location.href="/group/astrapdca/add-update-comapny?companyId=".concat(data.companyId)+"&id=not yet defined in table";

	    } );
   $('.AllcompanyDataClass tbody').on( 'click', '.deleteButton', function () {
	   var data = devDataGrid.row( $(this).parents('tr') ).data();
	   console.log("deleteButton");
		        console.log(data);	 
		    	$('#<portlet:namespace/>userid').val(data.kpiId);
		         console.log("opening dialog"); 
		    	$( "#confirmDelete_Admin" ).dialog( "open" );
		});
</script>