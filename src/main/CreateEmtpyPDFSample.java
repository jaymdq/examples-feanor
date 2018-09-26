package main;

import java.io.FileNotFoundException;

import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;

public class CreateEmtpyPDFSample {

	public static void main(String[] args) {

		try {
			PdfWriter pdfWriter = new PdfWriter("./output-yellow.pdf");
			PdfDocument pdfDocument = new PdfDocument(pdfWriter);
			for (int i = 0; i < 3; i++)
				pdfDocument.addNewPage();
			pdfDocument.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

	}

}
