package org.wso2.carbon.apim.migration.validator;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.wso2.carbon.apim.migration.validator.pdfgenerator.PDFDoc;
import org.wso2.carbon.apimgt.impl.utils.APIMgtDBUtil;
import org.wso2.carbon.core.ServerStartupObserver;

import static org.wso2.carbon.apim.migration.validator.Validator320to400.validateTableCount;


public class MigrationValidationService implements ServerStartupObserver {

    private static final Log log = LogFactory.getLog(MigrationValidationService.class);

    @Override
    public void completingServerStartup() {
    }

    @Override
    public void completedServerStartup() {
        try {
            APIMgtDBUtil.initialize();
            validateTableCount();

//            PDFDoc pdf = new PDFDoc();
//            pdf.pdfCreate();

            log.info("***********************************************************************************************************************************");
            log.info("*****************************************************NADISHA MADHUSHANIE******************************************************************************");
            log.info("***********************************************************************************************************************************");
        } catch (Exception e) {
            //APIMgtDBUtil.initialize() throws generic exception
            log.error("Error occurred while initializing DB Util ", e);
        }
    }
}