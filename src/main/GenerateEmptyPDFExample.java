package main;

import java.io.File;
import java.io.FileNotFoundException;

import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;

public class GenerateEmptyPDFExample {


	public static void main(String[] args) {

		File path = new File("./output.pdf");

		PdfWriter pdfWriter;
		try {
			pdfWriter = new PdfWriter(path);
			PdfDocument pdfDocument = new PdfDocument(pdfWriter);
			pdfDocument.addNewPage();
			pdfDocument.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}


	}

}
