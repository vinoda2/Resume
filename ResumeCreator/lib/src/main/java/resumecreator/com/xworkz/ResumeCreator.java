package resumecreator.com.xworkz;

import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;

import javax.swing.text.StyleConstants.FontConstants;

import org.apache.pdfbox.cos.COSDictionary;
import org.apache.pdfbox.pdmodel.font.PDFont;
import org.apache.pdfbox.pdmodel.font.PDFontFactory;

import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfPage;
import com.itextpdf.kernel.pdf.PdfReader;
import com.itextpdf.kernel.pdf.canvas.PdfCanvas;
import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Chunk;
import com.itextpdf.text.Document;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.Font.FontFamily;
import com.itextpdf.text.List;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Rectangle;
import com.itextpdf.text.pdf.ColumnText;
import com.itextpdf.text.pdf.PdfWriter;

public class ResumeCreator {
	ResumeData resume = new ResumeData();
	
	public void setValue() {
		resume.setName("Vinoda");
		resume.setEmail("vinoda@gmail.com");
		resume.setPhoneNumber("+91-992948722");
		resume.setGithubLink("http:\\github\\vinoda");
	}
	
	public void createPDF()
	{
		try {
			File file = new File("Resume.pdf");
			Document doc = new Document();
			List list=new List();
			List list1=new List();
			List list2=new List();
			List list3=new List();
			PDFont font = PDFontFactory.createFont((COSDictionary) FontConstants.Bold);
			PdfWriter.getInstance(doc, new FileOutputStream(file));
			doc.open();
			Font  f = new Font ();
			Paragraph para = new Paragraph (resume.getName().toUpperCase());
			para.setAlignment(Element.ALIGN_RIGHT);
			para.setFont(f);		
			doc.add(para);			
			Paragraph para1 = new Paragraph (resume.getEmail());
			doc.add(para1);
			Paragraph para2 = new Paragraph (resume.getPhoneNumber());
			doc.add(para2);
			Paragraph para3 = new Paragraph (resume.getGithubLink());
			doc.add(para3);
			Paragraph para4 = new Paragraph (" ");
			doc.add(para4);
			Paragraph para5 = new Paragraph ("Objective:".toUpperCase());
			doc.add(para5);
			Paragraph para6 = new Paragraph ("To secure a challenging position in a reputable organization to expand my learnings, knowledge and skills");
			doc.add(para6);
			Paragraph para15 = new Paragraph (" ");
			doc.add(para15);
			Paragraph para7 = new Paragraph ("Projects:".toUpperCase());
			doc.add(para7);
			list2.add("PDF creator.");
			list2.add("Resume Builder.");
			list2.add("HotelBooking.");
			doc.add(list2);
			Paragraph para11 = new Paragraph (" ");
			doc.add(para11);
			Paragraph para10 = new Paragraph ("Technical Skills:".toUpperCase());
			doc.add(para10);
			list.add("Core Java.");
			list.add("SQL.");
			list.add("HTML,CSS,JavaScript,BootStrap,React.");
			doc.add(list);
			Paragraph para16 = new Paragraph (" ");
			doc.add(para16);
			Paragraph para17 = new Paragraph (" Hobbies:".toUpperCase());
			doc.add(para17);
			list1.add("Dairy writting");
			list1.add("Art and Craft");
			list1.add("Cricket");
			doc.add(list1);
			Paragraph para23 = new Paragraph (" ");
			doc.add(para23);
			Paragraph para26 = new Paragraph ("Certification ".toUpperCase());
			doc.add(para26);
			list3.add(" I have completed Java Entreprise Application Development Course from X-Workz, Bangalore. ");
			list3.add(" I have completed Python Course from X-Workz, Bangalore. ");
			doc.add(list3);
			Paragraph para21 = new Paragraph (" ");
			doc.add(para21);
			Paragraph para22 = new Paragraph ("I here by declared that above mentioned details are true to the best of my knowledge. ");
			doc.add(para22);
			Paragraph para27 = new Paragraph (" ");
			doc.add(para27);
			Paragraph para28 = new Paragraph ("Date: ");
			doc.add(para28);
			Paragraph para29 = new Paragraph ("Place: ");
			doc.add(para29);
			doc.close();
		}catch(Exception e) {
			
		}
		finally {
			System.out.println("Creating Resume ");
		}
	}
	
	 void writeUsingIText() {

	       Document document = new Document();
	       File file= new File("ResumeCreated.pdf");

	        try {

	          PdfWriter writer=PdfWriter.getInstance(document, new FileOutputStream(file));
	         
	            //open
	            document.open();
	            Font f = new Font();
	            f.setStyle(Font.BOLD);
	            f.setSize(10);
	            
	            Font color = new Font(FontFamily.COURIER, 12, Font.NORMAL, BaseColor.BLUE);
	            Chunk heading = new Chunk("Resume".toUpperCase(), color);
	            Paragraph p1 = new Paragraph(heading);
	            p1.setAlignment(Element.ALIGN_CENTER);
	            document.add(p1);
	            f.setSize(12);
	           
	           
	            Paragraph p = new Paragraph();
	            p.add(resume.getName());
	            p.setAlignment(Element.ALIGN_RIGHT);
	            
	            document.add(p);
	           
	            
	            Paragraph p2 = new Paragraph();
	            p2.add(resume.getPhoneNumber());
	            p2.setAlignment(Element.ALIGN_RIGHT);
	            document.add(p2);
	            
	            Paragraph p3 = new Paragraph();
	            p3.add(resume.getEmail());
	            p3.setAlignment(Element.ALIGN_RIGHT);
	            document.add(p3);
	            
	            Paragraph p4 = new Paragraph();
	            p4.add(resume.getGithubLink());
	            p4.setAlignment(Element.ALIGN_RIGHT);
	            document.add(p4);
	            
	            List list=new List();
				List list1=new List();
				List list2=new List();
				List list3=new List();
	            
				
	            document.add(new Paragraph("Objective".toUpperCase(), f));
	            document.add(new Paragraph ("To secure a challenging position in a reputable organization to expand my learnings, knowledge and skills"));
	            document.add(new Paragraph(" "));
	            
	            document.add(new Paragraph("Projects:".toUpperCase(), f));
	            list2.add("PDF creator.");
				list2.add("Resume Builder.");
				list2.add("HotelBooking.");
				document.add(list2);
				
				document.add(new Paragraph(" "));
	            document.add(new Paragraph("Technical Skills:".toUpperCase(), f));
	            list.add("Core Java.");
				list.add("SQL.");
				list.add("HTML,CSS,JavaScript,BootStrap,React.");
				document.add(list);
				
				document.add(new Paragraph(" "));
	            document.add(new Paragraph("Hobbies:".toUpperCase(), f));
	            list1.add("Dairy writting");
				list1.add("Art and Craft");
				list1.add("Cricket");
				document.add(list1);
				
				document.add(new Paragraph(" "));
	            document.add(new Paragraph("Certification:".toUpperCase(), f));
	            list3.add(" I have completed Java Entreprise Application Development Course from X-Workz, Bangalore. ");
				list3.add(" I have completed Python Course from X-Workz, Bangalore. ");
				document.add(list3);
	            
				document.add(new Paragraph(" "));
				document.add(new Paragraph ("I here by declared that above mentioned details are true to the best of my knowledge. "));
				
				document.add(new Paragraph(" "));
	            Font f1 = new Font();
	            f1.setStyle(Font.BOLD);
	            f1.setSize(10);
	            document.add(new Paragraph("Date:", f1));
	            document.add(new Paragraph("Place:", f1));

	            //close
	            document.close();
	         
	        } catch (Exception e) {
	            e.printStackTrace();
	        } 
	        finally {
	        	System.out.println("Resume created");
	        }
	    }
	
}

	
