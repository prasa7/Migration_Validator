package org.wso2.carbon.apim.migration.validator.internal;

import org.osgi.service.component.ComponentContext;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.wso2.carbon.apim.migration.validator.pdfgenerator.PDFDoc;

import java.util.logging.Logger;
import static org.wso2.carbon.apim.migration.validator.Validator320to400.*;

@Component(
        name = "apim.migration.validator",
        immediate = true
)

public class ServiceComponent {
    private static final Logger LOGGER = Logger.getLogger(ServiceComponent.class.getName());

    @Activate
    protected void activate(ComponentContext context) {

        validateTableCount();

        PDFDoc pdf= new PDFDoc();
        pdf.pdfCreate();

        LOGGER.info("***********************************************************************************************************************************");
        LOGGER.info("*****************************************************NADISHA MADHUSHANIE******************************************************************************");
        LOGGER.info("***********************************************************************************************************************************");

    }
}
