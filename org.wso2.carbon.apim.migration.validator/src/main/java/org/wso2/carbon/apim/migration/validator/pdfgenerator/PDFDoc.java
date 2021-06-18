package org.wso2.carbon.apim.migration.validator.pdfgenerator;

import com.itextpdf.text.Document;
import com.itextpdf.text.Font;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import org.wso2.carbon.apim.migration.validator.Validator320to400;
import java.io.FileOutputStream;
import java.util.stream.Stream;
import java.util.logging.Logger;

public class PDFDoc {

        final Logger LOGGER = Logger.getLogger(PDFDoc.class.getName());

        public void pdfCreate()
        {
        try {
                String table_count = Validator320to400.validateTableCount();
                LOGGER.info(table_count);

                String revision_creation = Validator320to400.validateRevisionCreation();
                LOGGER.info(revision_creation);


                String[] column_count_methods ={Validator320to400.validateTableColumnCount1(),Validator320to400.validateTableColumnCount2(),Validator320to400.validateTableColumnCount3(),Validator320to400.validateTableColumnCount4(),Validator320to400.validateTableColumnCount5(),Validator320to400.validateTableColumnCount6(),Validator320to400.validateTableColumnCount7(),Validator320to400.validateTableColumnCount8(),Validator320to400.validateTableColumnCount9(),Validator320to400.validateTableColumnCount10()};
                String[] column_count = new String[100];

                for(int i=0;i<10;i++)
                {
                        column_count[i+1] = column_count_methods[i];
                        LOGGER.info(column_count[i+1]);
                }


                String uuid_column_validation = Validator320to400.validateApiUuidContent();
                LOGGER.info(uuid_column_validation);


                String[] methods = {Validator320to400.checkTableExits1(),Validator320to400.checkTableExits2(),Validator320to400.checkTableExits3(),Validator320to400.checkTableExits4(),Validator320to400.checkTableExits5(),Validator320to400.checkTableExits6(),Validator320to400.checkTableExits7(),Validator320to400.checkTableExits8(),Validator320to400.checkTableExits9(),Validator320to400.checkTableExits10(),Validator320to400.checkTableExits11(),Validator320to400.checkTableExits12(),Validator320to400.checkTableExits13(),Validator320to400.checkTableExits14(),Validator320to400.checkTableExits15(),Validator320to400.checkTableExits16(),Validator320to400.checkTableExits17(),Validator320to400.checkTableExits18(),Validator320to400.checkTableExits19()};
                String[] table_exits = new String[100];

                for(int i=0;i<19;i++)
                {
                         table_exits[i+1] = methods[i];
                         LOGGER.info(table_exits[i+1]);
                }



                Document doc = new Document();
                PdfWriter.getInstance(doc, new FileOutputStream("Report.pdf"));
                doc.open();

                Font bold = new Font(Font.FontFamily.HELVETICA, 18, Font.BOLD);
                Paragraph paragraph = new Paragraph("Migration Validation Status.");

                PdfPTable table = new PdfPTable(1);
                Stream.of("STATUS").forEach(table::addCell);

                //1
                table.addCell(table_count);

                //2
                table.addCell(revision_creation);

                //3
                for(int i=0;i<10;i++)
                {
                        table.addCell(column_count[i+1]);
                }


                //4
                table.addCell(uuid_column_validation);

                //5
                for(int i=0;i<19;i++)
                {
                        table.addCell(table_exits[i+1]);
                }


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



