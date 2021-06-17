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

                String column_count_am_api = Validator320to400.validateTableColumnCount1();
                LOGGER.info(column_count_am_api);

                String column_count_am_api_client_certificate = Validator320to400.validateTableColumnCount2();
                LOGGER.info(column_count_am_api_client_certificate);

                String column_count_am_api_comments = Validator320to400.validateTableColumnCount3();
                LOGGER.info(column_count_am_api_comments);

                String column_count_am_api_product_mapping = Validator320to400.validateTableColumnCount4();
                LOGGER.info(column_count_am_api_product_mapping);

                String column_count_am_api_url_mapping = Validator320to400.validateTableColumnCount5();
                LOGGER.info(column_count_am_api_url_mapping);

                String column_count_am_certificate_metadata = Validator320to400.validateTableColumnCount6();
                LOGGER.info(column_count_am_certificate_metadata);

                String column_count_am_graphql = Validator320to400.validateTableColumnCount7();
                LOGGER.info(column_count_am_graphql);

                String column_count_am_gateway_artifacts = Validator320to400.validateTableColumnCount8();
                LOGGER.info(column_count_am_gateway_artifacts);

                String column_count_am_gw_published_api_details = Validator320to400.validateTableColumnCount9();
                LOGGER.info(column_count_am_gw_published_api_details);

                String column_count_am_policy_subscription = Validator320to400.validateTableColumnCount10();
                LOGGER.info(column_count_am_policy_subscription);

                String uuid_column_validation = Validator320to400.validateApiUuidContent();
                LOGGER.info(uuid_column_validation);

                String am_api_service_mapping_exits = Validator320to400.checkTableExits();
                LOGGER.info(am_api_service_mapping_exits);

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
                table.addCell(column_count_am_api);
                table.addCell(column_count_am_api_client_certificate);
                table.addCell(column_count_am_api_comments);
                table.addCell(column_count_am_api_product_mapping);
                table.addCell(column_count_am_api_url_mapping);
                table.addCell(column_count_am_certificate_metadata);
                table.addCell(column_count_am_graphql);
                table.addCell(column_count_am_gateway_artifacts);
                table.addCell(column_count_am_gw_published_api_details);
                table.addCell(column_count_am_policy_subscription);

                //4
                table.addCell(uuid_column_validation);

                //5
                table.addCell(am_api_service_mapping_exits);

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



