package org.wso2.carbon.apim.migration.validator.internal;
/*
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.osgi.service.component.ComponentContext;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Reference;
import org.osgi.service.component.annotations.ReferenceCardinality;
import org.osgi.service.component.annotations.ReferencePolicy;
import org.wso2.carbon.apimgt.api.APIManagerDatabaseException;
import org.wso2.carbon.apimgt.impl.APIManagerConfigurationService;
import org.wso2.carbon.apimgt.impl.utils.APIMgtDBUtil;

import org.wso2.carbon.apim.migration.validator.pdfgenerator.PDFDoc;
import static org.wso2.carbon.apim.migration.validator.Validator320to400.*;


@Component(
        name = "apim.migration.validator",
        immediate = true
)

public class ServiceComponent {
    private static final Log log = LogFactory.getLog(ServiceComponent.class.getName());

    @Activate
    protected void activate(ComponentContext context) {

        //try {
        //    APIMgtDBUtil.initialize();
            validateTableCount();

            PDFDoc pdf = new PDFDoc();
            pdf.pdfCreate();

            log.info("***********************************************************************************************************************************");
            log.info("*****************************************************NADISHA MADHUSHANIE******************************************************************************");
            log.info("***********************************************************************************************************************************");
        //}catch (APIManagerDatabaseException e)
        //{
        //    log.info("database initialization failed");
        //}
    }

    @Deactivate
    protected void deactivate(ComponentContext context) {

        log.info("service component is deactivated");
    }

    /*
    @Reference(
            name = "api.manager.config.service",
            service = org.wso2.carbon.apimgt.impl.APIManagerConfigurationService.class,
            cardinality = ReferenceCardinality.MANDATORY ,
            policy = ReferencePolicy.DYNAMIC,
            unbind = "unsetAPIManangerConfigurationService")
    protected void setAPIManangerConfigurationService(APIManagerConfigurationService service){
        log.debug("API manager configuration service bound to Tenant Initializer.");
        ServiceDataHolder.getInstance().setAPIManangerConfigurationService(service);
    }

    protected void unsetAPIManangerConfigurationService(APIManagerConfigurationService service){
        log.debug("API manager configuration service unbound from Tenant Initializer.");
        ServiceDataHolder.getInstance().setAPIManangerConfigurationService(null);
    }

     */

/*}*/

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.osgi.service.component.ComponentContext;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Reference;
import org.osgi.service.component.annotations.ReferenceCardinality;
import org.osgi.service.component.annotations.ReferencePolicy;
import org.wso2.carbon.apimgt.api.APIManagerDatabaseException;
import org.wso2.carbon.apimgt.impl.APIManagerConfigurationService;
import org.wso2.carbon.apimgt.impl.utils.APIMgtDBUtil;
import org.wso2.carbon.core.ServerStartupObserver;
import org.wso2.carbon.apim.migration.validator.pdfgenerator.PDFDoc;
import static org.wso2.carbon.apim.migration.validator.Validator320to400.*;


@Component(
        name = "apim.migration.validator",
        immediate = true
)
public class ServiceComponent implements ServerStartupObserver{

    private static final Log log = LogFactory.getLog(ServiceComponent.class);
    private static APIManagerConfigurationService amConfigurationService;

    @Override
    public void completingServerStartup() {
    }

    @Override
    public void completedServerStartup() {
        try {
            APIMgtDBUtil.initialize();
            //SharedDBUtil.initialize();
        } catch (Exception e) {
            //APIMgtDBUtil.initialize() throws generic exception
            log.error("Error occurred while initializing DB Util ", e);
        }
    }

    @Activate
    protected void activate(ComponentContext context) {

        validateTableCount();

        PDFDoc pdf = new PDFDoc();
        pdf.pdfCreate();

        log.info("***********************************************************************************************************************************");
        log.info("*****************************************************NADISHA MADHUSHANIE******************************************************************************");
        log.info("***********************************************************************************************************************************");

    }

    @Deactivate
    protected void deactivate(ComponentContext context) {
        if (log.isDebugEnabled()) {
            log.debug("AddNewUserOperationEventListener is deactivated ");
        }
    }
/*
    @Reference(
            name = "api.manager.config.service",
            service = org.wso2.carbon.apimgt.impl.APIManagerConfigurationService.class,
            cardinality = ReferenceCardinality.MANDATORY,
            policy = ReferencePolicy.DYNAMIC,
            unbind = "unsetAPIManagerConfigurationService"
    )
    protected void setAPIManagerConfigurationService(APIManagerConfigurationService amConfigurationService) {
        if (log.isDebugEnabled()) {
            log.debug("Setting the APIManagerConfiguration Service");
        }
        this.amConfigurationService = amConfigurationService;
    }

    protected void unsetAPIManagerConfigurationService(APIManagerConfigurationService amConfigurationService) {
        if (log.isDebugEnabled()) {
            log.debug("UnSetting the APIManagerConfiguration Service");
        }
        this.amConfigurationService = null;
    }

    public static APIManagerConfigurationService getAPIManagerConfigurationService() {
        return amConfigurationService;
    }*/

}





