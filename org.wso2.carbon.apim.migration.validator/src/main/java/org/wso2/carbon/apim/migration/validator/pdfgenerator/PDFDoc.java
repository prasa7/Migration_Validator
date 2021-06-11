package org.wso2.carbon.apim.migration.validator.pdfgenerator;

import com.itextpdf.text.Document;
import com.itextpdf.text.Font;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import org.wso2.carbon.apim.migration.validator.Validator320to400;
import java.io.FileOutputStream;
import java.util.stream.Stream;

public class PDFDoc {

        public void pdfCreate()
        {
        try {
                String x = Validator320to400.validateTableCount();

                Document doc = new Document();
                PdfWriter.getInstance(doc, new FileOutputStream("Report.pdf"));
                doc.open();

                Font bold = new Font(Font.FontFamily.HELVETICA, 18, Font.BOLD);
                Paragraph paragraph = new Paragraph("Migration Validation Status.");

                PdfPTable table = new PdfPTable(1);
                Stream.of("Status").forEach(table::addCell);

                table.addCell(x);

                paragraph.add(table);
                doc.add(paragraph);
                doc.close();
        }
        catch (Exception e)
        {
                e.getMessage();
        }
    }

}



