package org.wso2.carbon.apim.migration.validator.internal;

import org.wso2.carbon.registry.core.service.RegistryService;
import org.wso2.carbon.registry.core.service.TenantRegistryLoader;
import org.wso2.carbon.user.core.service.RealmService;
import org.wso2.carbon.apimgt.impl.APIManagerConfigurationService;

public class ServiceDataHolder {

    private static ServiceDataHolder instance = new ServiceDataHolder();

    private static  APIManagerConfigurationService amConfigurationService;

    public static ServiceDataHolder getInstance() {
        return instance;
    }

    public void setAPIManangerConfigurationService(APIManagerConfigurationService amConfigurationService){
        this.amConfigurationService =amConfigurationService;
   }

    public void unsetAPIManangerConfigurationService(APIManagerConfigurationService amConfigurationService){
        this.amConfigurationService = null;
    }

    public static APIManagerConfigurationService getAPIManagerConfigurationService() {
        return amConfigurationService;
    }
}
