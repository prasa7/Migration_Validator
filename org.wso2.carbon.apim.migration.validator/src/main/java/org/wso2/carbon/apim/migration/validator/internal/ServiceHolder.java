package org.wso2.carbon.apim.migration.validator.internal;

import org.wso2.carbon.apimgt.impl.APIManagerConfigurationService;
import org.wso2.carbon.identity.application.mgt.ApplicationManagementService;
import org.wso2.carbon.registry.core.service.RegistryService;
import org.wso2.carbon.registry.core.service.TenantRegistryLoader;
import org.wso2.carbon.user.core.service.RealmService;

@SuppressWarnings("unused")
public class ServiceHolder {
    //Registry Service which is used to get registry data.
    private static RegistryService registryService;

    //Realm Service which is used to get tenant data.
    private static RealmService realmService;

    //Tenant registry loader which is used to load tenant registry
    private static TenantRegistryLoader tenantRegLoader;

    //APIM Configuration service to read api-manager.xml
    private static APIManagerConfigurationService amConfigurationService;

    private static ApplicationManagementService applicationManagementService;

    /**
     * Method to get RegistryService.
     *
     * @return registryService.
     */
    public static RegistryService getRegistryService() {
        return registryService;
    }

    /**
     * Method to set registry RegistryService.
     *
     * @param service registryService.
     */
    public static void setRegistryService(RegistryService service) {
        registryService = service;
    }

    /**
     * This method used to get RealmService.
     *
     * @return RealmService.
     */
    public static RealmService getRealmService() {
        return realmService;
    }

    /**
     * Method to set registry RealmService.
     *
     * @param service RealmService.
     */
    public static void setRealmService(RealmService service) {
        realmService = service;
    }

    /**
     * This method used to get TenantRegistryLoader
     *
     * @return tenantRegLoader  Tenant registry loader for load tenant registry
     */
    public static TenantRegistryLoader getTenantRegLoader() {
        return tenantRegLoader;
    }

    /**
     * This method used to set TenantRegistryLoader
     *
     * @param service Tenant registry loader for load tenant registry
     */
    public static void setTenantRegLoader(TenantRegistryLoader service) {
        tenantRegLoader = service;
    }

    /**
     * Returns APIManagerConfigurationService
     * @return
     */
    public static APIManagerConfigurationService getAPIManagerConfigurationService() {
        return amConfigurationService;
    }

    /**
     * Sets APIManagerConfigurationService
     * @param amConfigService
     */
    public static void setAPIManagerConfigurationService(APIManagerConfigurationService amConfigService) {
        amConfigurationService = amConfigService;
    }

    /**
     * This method is used to get ApplicationManagementService
     * @return
     */
    public static ApplicationManagementService getApplicationManagementService() {
        return applicationManagementService;
    }

    /**
     * This method is used to set ApplicationManagementService
     * @param service
     */
    public static void setApplicationManagementService(ApplicationManagementService service) {
        applicationManagementService = service;
    }
}

