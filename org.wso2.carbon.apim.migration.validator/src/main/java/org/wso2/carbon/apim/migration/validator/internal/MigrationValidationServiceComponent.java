package org.wso2.carbon.apim.migration.validator.internal;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.osgi.service.component.ComponentContext;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Reference;
import org.osgi.service.component.annotations.ReferenceCardinality;
import org.osgi.service.component.annotations.ReferencePolicy;
import org.wso2.carbon.apim.migration.validator.MigrationValidationService;
import org.wso2.carbon.apim.migration.validator.pdfgenerator.PDFDoc;
import org.wso2.carbon.apimgt.impl.APIManagerConfigurationService;
import org.wso2.carbon.apimgt.impl.utils.APIMgtDBUtil;
import org.wso2.carbon.core.ServerStartupObserver;
import org.wso2.carbon.user.core.service.RealmService;

import static org.wso2.carbon.apim.migration.validator.Validator320to400.validateTableCount;


@Component(
        name = "apim.migration.validator",
        immediate = true
)
public class MigrationValidationServiceComponent implements ServerStartupObserver {

    private static final Log log = LogFactory.getLog(MigrationValidationServiceComponent.class);
    private static APIManagerConfigurationService amConfigurationService;
    private RealmService realmService;

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
    protected void activate(ComponentContext context)
    //throws APIManagerDatabaseException
    {
        context.getBundleContext().registerService(ServerStartupObserver.class.getName(), new
                MigrationValidationService(), null);

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

    @Reference(
            name = "realm.service",
            service = RealmService.class,
            cardinality = ReferenceCardinality.MANDATORY,
            policy = ReferencePolicy.DYNAMIC,
            unbind = "unsetRealmService"
    )
    protected void setRealmService(RealmService realmService) {

        this.realmService = realmService;
    }

    protected void unsetRealmService(RealmService realmService) {

        this.realmService = null;
    }
}
