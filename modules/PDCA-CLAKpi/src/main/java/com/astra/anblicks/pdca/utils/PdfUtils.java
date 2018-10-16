package com.astra.anblicks.pdca.utils;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.StringReader;
import java.util.List;

import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

import com.astra.anblicks.pdca.constants.PDCAPortletKeys;
import com.astra.anblicks.pdca.model.AstraPdca_CompanyData;
import com.astra.anblicks.pdca.model.kpi;
import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Font;
import com.itextpdf.text.pdf.PdfWriter;
import com.itextpdf.tool.xml.XMLWorker;
import com.itextpdf.tool.xml.XMLWorkerHelper;
import com.itextpdf.tool.xml.css.CssFile;
import com.itextpdf.tool.xml.css.StyleAttrCSSResolver;
import com.itextpdf.tool.xml.html.Tags;
import com.itextpdf.tool.xml.parser.XMLParser;
import com.itextpdf.tool.xml.pipeline.css.CSSResolver;
import com.itextpdf.tool.xml.pipeline.css.CssResolverPipeline;
import com.itextpdf.tool.xml.pipeline.end.PdfWriterPipeline;
import com.itextpdf.tool.xml.pipeline.html.HtmlPipeline;
import com.itextpdf.tool.xml.pipeline.html.HtmlPipelineContext;
import com.liferay.document.library.kernel.model.DLFolder;
import com.liferay.document.library.kernel.model.DLFolderConstants;
import com.liferay.document.library.kernel.service.DLAppServiceUtil;
import com.liferay.document.library.kernel.service.DLFileEntryLocalServiceUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.repository.model.FileEntry;
import com.liferay.portal.kernel.repository.model.Folder;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.service.ServiceContextFactory;
import com.liferay.portal.kernel.theme.ThemeDisplay;
import com.liferay.portal.kernel.util.WebKeys;
import com.liferay.util.ContentUtil;

public class PdfUtils {
	
	public static final String DEST = "E:/html_table_2.pdf";
    public static final String CSS = "table, th, td { border: 1px solid black; border-collapse: collapse; } th, td { padding: 5px; text-align: left; } tr#financial,#strategies { background-color: #FCFC8F; }";
	
	private static Font catFont = new Font(Font.FontFamily.TIMES_ROMAN, 18, Font.BOLD);
	private static Font redFont = new Font(Font.FontFamily.TIMES_ROMAN, 12, Font.NORMAL, BaseColor.RED);
	private static Font subFont = new Font(Font.FontFamily.TIMES_ROMAN, 16, Font.BOLD);
	private static Font smallBold = new Font(Font.FontFamily.TIMES_ROMAN, 12, Font.BOLD);

	public static void getCompany_Kpis_PdfUrl(List<kpi> list_kpis, ResourceRequest resourceRequest, ResourceResponse resourceResponse) throws IOException, DocumentException {
		
	//	getpdffile(resourceRequest,resourceResponse);
		
		    File file = new File(DEST);
	        createPdf(DEST);
		
		
	}
	
	
	public static void getpdffile(ResourceRequest resourceRequest, ResourceResponse resourceResponse) {
		try {
			ThemeDisplay themeDisplay = (ThemeDisplay) resourceRequest.getAttribute(WebKeys.THEME_DISPLAY);
			long repositoryId = themeDisplay.getScopeGroupId();
			Long parentFolderId = DLFolderConstants.DEFAULT_PARENT_FOLDER_ID;
			Folder folder = DLAppServiceUtil.getFolder(themeDisplay.getScopeGroupId(), parentFolderId,
					PDCAPortletKeys.AstraParentFolderName);
			FileEntry fileEntry = DLAppServiceUtil.getFileEntry(repositoryId, folder.getFolderId(),
					PDCAPortletKeys.AstraSamplePdf);
			File file = DLFileEntryLocalServiceUtil.getFile(fileEntry.getFileEntryId(), "", true);
			boolean isFolderExist = isFolderExist(themeDisplay, PDCAPortletKeys.CLAFolderName);
			if (!isFolderExist) {
				createFolder(resourceRequest, themeDisplay, PDCAPortletKeys.CLAFolderName);
			}
			Folder rootfolder = getFolder(themeDisplay, PDCAPortletKeys.CLAFolderName);
		//	String url = pdfWrite(themeDisplay, resourceRequest, rootfolder, fileEntry, file);
		//	System.out.println(url);
		} catch (Exception e) {
		}

	}
	
	
	private static Folder createFolder(ResourceRequest resourceRequest, ThemeDisplay themeDisplay, String clafoldername) {
		Folder folder = null;
		long repositoryId = themeDisplay.getScopeGroupId();
		try {
			ServiceContext serviceContext = ServiceContextFactory.getInstance(DLFolder.class.getName(), resourceRequest);
			folder = DLAppServiceUtil.addFolder(repositoryId, DLFolderConstants.DEFAULT_PARENT_FOLDER_ID, clafoldername,
					PDCAPortletKeys.CLAFolderDesc, serviceContext);
		} catch (PortalException e1) {
			e1.printStackTrace();
		} catch (SystemException e1) {
			e1.printStackTrace();
		}
		return folder;
	}

	private static boolean isFolderExist(ThemeDisplay themeDisplay, String ROOT_FOLDER_NAME) {
		boolean folderExist = false;
		try {
			DLAppServiceUtil.getFolder(themeDisplay.getScopeGroupId(), DLFolderConstants.DEFAULT_PARENT_FOLDER_ID,
					ROOT_FOLDER_NAME);
			folderExist = true;
			System.out.println("Folder is already Exist");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return folderExist;
	}

	private static Folder getFolder(ThemeDisplay themeDisplay, String ROOT_FOLDER_NAME) {
		Folder folder = null;
		try {
			folder = DLAppServiceUtil.getFolder(themeDisplay.getScopeGroupId(),
					DLFolderConstants.DEFAULT_PARENT_FOLDER_ID, ROOT_FOLDER_NAME);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return folder;
	}
	
	
	
	
	public static void createPdf(String file) throws IOException, DocumentException {
        // step 1
        Document document = new Document();
        // step 2
        PdfWriter writer = PdfWriter.getInstance(document, new FileOutputStream(file));
        // step 3
        document.open();
        // step 4
      //  String claPdfToHtmlTemplate = PdftoHtmlTemplate.getClaPdfToHtmlTemplate();
    /*    StringBuilder sb = new StringBuilder();
        sb.append("<table border=\"2\">");
        sb.append("<tr>");
        sb.append("<th>Sr. No.</th>");
        sb.append("<th>Text Data</th>");
        sb.append("<th>Number Data</th>");
        sb.append("</tr>");
        for (int i = 0; i < 10; ) {
            i++;
            sb.append("<tr>");
            sb.append("<td>");
            sb.append(i);
            sb.append("</td>");
            sb.append("<td>This is text data ");
            sb.append(i);
            sb.append("</td>");
            sb.append("<td>");
            sb.append(i);
            sb.append("</td>");
            sb.append("</tr>");
        }
        sb.append("</table>"); */
 
  /*      CSSResolver cssResolver = new StyleAttrCSSResolver();
        CssFile cssFile = XMLWorkerHelper.getCSS(new ByteArrayInputStream(CSS.getBytes()));
        cssResolver.addCss(cssFile);
 
        // HTML
        HtmlPipelineContext htmlContext = new HtmlPipelineContext(null);
        htmlContext.setTagFactory(Tags.getHtmlTagProcessorFactory());
 
        // Pipelines
        PdfWriterPipeline pdf = new PdfWriterPipeline(document, writer);
        HtmlPipeline html = new HtmlPipeline(htmlContext, pdf);
        CssResolverPipeline css = new CssResolverPipeline(cssResolver, html);
 
        // XML Worker
        XMLWorker worker = new XMLWorker(css, true);
        XMLParser p = new XMLParser(worker);
        p.parse(new ByteArrayInputStream(claPdfToHtmlTemplate.getBytes())); */
        
     //   PdfWriter writer = PdfWriter.getInstance(document,new FileOutputStream("E://Kranthi_Liferay//WorkSpace//DxpWorkSpace//modules//AccountingApp//src//main//resources//META-INF//resources//pdf//piinvocie"+latest+".pdf"));
        document.open();
        String sb=ContentUtil.get("/content/test.html");
     //   XMLWorkerHelper.getInstance().parseXHtml(writer, document,new FileInputStream("D://Honda//liferay-plugins-sdk-6.2.0//hma-wms//liferay-plugins-sdk-6.2.0//portlets//AccountingApp-portlet//docroot//WEB-INF//src//content//email-notification-changeover.html"));
        XMLWorkerHelper.getInstance().parseXHtml(writer, document,new StringReader(sb));
 
        // step 5
        document.close();
    }
	
}
