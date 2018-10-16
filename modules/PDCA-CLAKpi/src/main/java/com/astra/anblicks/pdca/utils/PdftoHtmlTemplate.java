package com.astra.anblicks.pdca.utils;

public class PdftoHtmlTemplate {

	public static String getClaPdfToHtmlTemplate() {
		
		 StringBuilder sb = new StringBuilder();
		 
		 sb.append("<h2>[Company Name]</h2>");
		 		sb.append( "<center><h3>[Group Name]</h3></center>");
		 		sb.append( "<center><h4>Company Key Performance Indicator</h4></center>");
		 		sb.append( "<br/><br/>");
		 		sb.append( "<table style=\"width:100%\" align=\"center\">");
		 				sb.append( "<tr>");
		 				sb.append( "<th>S.No</th>");
		 				sb.append( "<th>Item Description</th>");
		 				sb.append( "<th>Weight</th>");
		 				sb.append( "<th>Unit</th>");
		 				sb.append( "<th>Target</th>");
		 				sb.append( "<th>Achivement Formula</th>");
		 				sb.append( "</tr>");
		 				sb.append( "<tr id=\"strategies\">");
		 						sb.append( "<th colspan=\"6\">FINANCIAL</th>");
		 								sb.append( "</tr>");
		 								sb.append( "<tr>");
		 								sb.append( "<td>1</td>");
		 								sb.append( "<td></td>");
		 								sb.append( "<td></td>");
		 								sb.append( "<td></td>");
		 								sb.append( "<td></td>");
		 								sb.append( "<td></td>");
		 								sb.append( "</tr>");
		 								sb.append( "<tr id=\"strategies\">");
		 										sb.append( "<th colspan=\"6\">STRATEGIES</th>");
		 												sb.append( " </tr>");
		 												sb.append( "<tr>");
		 												sb.append( "<td>1</td>");
		 												sb.append( "<td></td>");
		 												sb.append( "<td></td>");
		 												sb.append( "<td></td>");
		 												sb.append( "<td></td>");
		 												sb.append( "<td></td>");
		 												sb.append( "</tr> <tr>");
		 												sb.append( "<td>2</td>");
		 												sb.append( "<td></td>");
		 												sb.append( "<td></td>");
		 												sb.append( "<td></td>");
		 												sb.append( "<td></td>");
		 												sb.append( "<td></td>");
		 												sb.append( "</tr> <tr>");
		 												sb.append( "<td>3</td>");
		 												sb.append( "<td></td>");
		 												sb.append( "<td></td>");
		 												sb.append( "<td></td>");
		 												sb.append( "<td></td>");
		 												sb.append( "<td></td>");
		 												sb.append( "</tr>");
		 												sb.append( "</table>");
		 												sb.append( "<center><h4>Jagarta,[Date]</h4><center>");
		 												sb.append( "<div>");
		 												sb.append( "<div style=\"width:33.3%; float:left;\">");
		 												sb.append( "<p> Gopala Krishna<br/> Kranti<br/> Abhilash </p> </div>");
		 												sb.append( " <div style=\"width:33.3%; float:left;\">");
		 												sb.append( "<p> Gopala Krishna<br/> Kranti<br/> Abhilash </p> </div>");
		 												sb.append( " <div style=\"width:33.3%; float:left;\">");
		 												sb.append( "<p> Gopala Krishna<br/> Kranti<br/> Abhilash </p>");
		 										        sb.append( "</div>");
		 												sb.append( "</div>");
		 												sb.append( "<br/><br/><br/><br/><br/><br/><br/>");
		 												sb.append( "<div>");
		 												sb.append( "<div style=\"width:33.3%; float:left;\">");
		 											    sb.append( "<p> Gopala Krishna<br/> Kranti<br/> Abhilash </p> </div>");
		 												sb.append( "<div style=\"width:33.3%; float:left;\">");
		 												sb.append( "<p> Gopala Krishna<br/> Kranti<br/> Abhilash </p> </div>");
		 												sb.append( "<div style=\"width:33.3%; float:left;\">");
		 												sb.append( "<p> Gopala Krishna<br/> Kranti<br/> Abhilash </p> </div> </div>");
		 
		 return sb.toString();
		 		
		
	}
	
	

}
