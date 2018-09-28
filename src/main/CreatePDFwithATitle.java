package main;

import java.io.File;
import java.io.FileNotFoundException;

import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.element.Paragraph;

public class CreatePDFwithATitle {

	public static void main(String[] args) {

		File path = new File("./output3.pdf");

		PdfWriter pdfWriter;
		try {
			pdfWriter = new PdfWriter(path);
			PdfDocument pdfDocument = new PdfDocument(pdfWriter);
			Document doc = new Document(pdfDocument);
			
			Paragraph paragraph = new Paragraph("Independiente is one of the best soccer teams in Argentina.");
			doc.add(paragraph);			
			
			doc.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}
