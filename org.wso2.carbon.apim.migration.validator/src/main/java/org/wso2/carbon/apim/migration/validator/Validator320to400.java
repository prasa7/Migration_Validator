package org.wso2.carbon.apim.migration.validator;
import org.wso2.carbon.apim.migration.validator.dao.ValidatorDAO320to400;

import java.sql.*;
import java.util.logging.Logger;

public class Validator320to400 {

    public static String validateTableCount()
    {
        final Logger LOGGER = Logger.getLogger(Validator320to400.class.getName());

        ValidatorDAO320to400 validate = new ValidatorDAO320to400();
        boolean countValidator = validate.validateAPIMDbTableCount(176,"apim_db");

        if(countValidator) {
            return " * 3.2.0 to 4.0.0 table count validation is successful.";
        }
        else {
            return "3.2.0 to 4.0.0 table count validation is fail.";
        }

    }

    public static String validateRevisionCreation()
    {

        ValidatorDAO320to400 validate = new ValidatorDAO320to400();
        boolean revisionValidator = validate.validateAPIMDbRevisionCreation();

        if(revisionValidator) {
            return " * 3.2.0 to 4.0.0 revision creation validation is successful.";
        }
        else {
            return "3.2.0 to 4.0.0 revision creation validation is fail.";
        }

    }

    public static String validateTableColumnCount1()
    {

        ValidatorDAO320to400 validate = new ValidatorDAO320to400();
        boolean columnCountValidatorAmApi = validate.validateAPIMDbTableColumnCount("apim_db","AM_API",15);

        if(columnCountValidatorAmApi) {
            return " * 3.2.0 to 4.0.0 AM_API table column count validation is successful.";
        }
        else {
            return "3.2.0 to 4.0.0 AM_API table column count validation is fail.";
        }


    }

    public static String validateTableColumnCount2() {

        ValidatorDAO320to400 validate = new ValidatorDAO320to400();
        boolean columnCountValidatorAmApiClientCertificate = validate.validateAPIMDbTableColumnCount("apim_db","AM_API_CLIENT_CERTIFICATE",7);

        if(columnCountValidatorAmApiClientCertificate) {
            return " * 3.2.0 to 4.0.0 AM_API_CLIENT_CERTIFICATE table column count validation is successful.";
        }
        else {
            return "3.2.0 to 4.0.0 AM_API_CLIENT_CERTIFICATE table column count validation is fail.";
        }

    }

    public static String validateTableColumnCount3() {

        ValidatorDAO320to400 validate = new ValidatorDAO320to400();
        boolean columnCountValidatorAmApiComments = validate.validateAPIMDbTableColumnCount("apim_db","AM_API_COMMENTS",9);

        if(columnCountValidatorAmApiComments) {
            return " * 3.2.0 to 4.0.0 AM_API_COMMENTS table column count validation is successful.";
        }
        else {
            return "3.2.0 to 4.0.0 AM_API_COMMENTS table column count validation is fail.";
        }

    }

    public static String validateTableColumnCount4() {

        ValidatorDAO320to400 validate = new ValidatorDAO320to400();
        boolean columnCountValidatorAmApiProductMapping = validate.validateAPIMDbTableColumnCount("apim_db","AM_API_PRODUCT_MAPPING",4);

        if(columnCountValidatorAmApiProductMapping) {
            return " * 3.2.0 to 4.0.0 AM_API_PRODUCT_MAPPING table column count validation is successful.";
        }
        else {
            return "3.2.0 to 4.0.0 AM_API_PRODUCT_MAPPING table column count validation is fail.";
        }
    }

    public static String validateTableColumnCount5() {

        ValidatorDAO320to400 validate = new ValidatorDAO320to400();
        boolean columnCountValidatorAmApiUrlMapping = validate.validateAPIMDbTableColumnCount("apim_db","AM_API_URL_MAPPING",8);

        if(columnCountValidatorAmApiUrlMapping) {
            return " * 3.2.0 to 4.0.0 AM_API_URL_MAPPING table column count validation is successful.";
        }
        else {
            return "3.2.0 to 4.0.0 AM_API_URL_MAPPING table column count validation is fail.";
        }

    }

    public static String validateTableColumnCount6() {

        ValidatorDAO320to400 validate = new ValidatorDAO320to400();
        boolean columnCountValidatorAmCertificateMataData = validate.validateAPIMDbTableColumnCount("apim_db","AM_CERTIFICATE_METADATA",4);

        if(columnCountValidatorAmCertificateMataData) {
            return " * 3.2.0 to 4.0.0 AM_CERTIFICATE_METADATA table column count validation is successful.";
        }
        else {
            return "3.2.0 to 4.0.0 AM_CERTIFICATE_METADATA table column count validation is fail.";
        }

    }

    public static String validateTableColumnCount7() {

        ValidatorDAO320to400 validate = new ValidatorDAO320to400();
        boolean columnCountValidatorAmGraphqlComplexity = validate.validateAPIMDbTableColumnCount("apim_db","AM_GRAPHQL_COMPLEXITY",6);

        if(columnCountValidatorAmGraphqlComplexity) {
            return " * 3.2.0 to 4.0.0 AM_GRAPHQL_COMPLEXITY table column count validation is successful.";
        }
        else {
            return "3.2.0 to 4.0.0 AM_GRAPHQL_COMPLEXITY table column count validation is fail.";
        }

    }

    public static String validateTableColumnCount8() {

        ValidatorDAO320to400 validate = new ValidatorDAO320to400();
        boolean columnCountValidatorAmGwApiArtifacts = validate.validateAPIMDbTableColumnCount("apim_db","AM_GW_API_ARTIFACTS",4);

        if(columnCountValidatorAmGwApiArtifacts) {
            return " * 3.2.0 to 4.0.0 AM_GW_API_ARTIFACTS table column count validation is successful.";
        }
        else {
            return "3.2.0 to 4.0.0 AM_GW_API_ARTIFACTS table column count validation is fail.";
        }

    }
    public static String validateTableColumnCount9() {

        ValidatorDAO320to400 validate = new ValidatorDAO320to400();
        boolean columnCountValidatorAmGwPublishedApiDetails = validate.validateAPIMDbTableColumnCount("apim_db","AM_GW_PUBLISHED_API_DETAILS",6);

        if(columnCountValidatorAmGwPublishedApiDetails) {
            return " * 3.2.0 to 4.0.0 AM_GW_PUBLISHED_API_DETAILS table column count validation is successful.";
        }
        else {
            return "3.2.0 to 4.0.0 AM_GW_PUBLISHED_API_DETAILS table column count validation is fail.";
        }

    }
    public static String validateTableColumnCount10() {

        ValidatorDAO320to400 validate = new ValidatorDAO320to400();
        boolean columnCountValidatorAmPolicySubscription = validate.validateAPIMDbTableColumnCount("apim_db","AM_POLICY_SUBSCRIPTION",25);

        if(columnCountValidatorAmPolicySubscription) {
            return " * 3.2.0 to 4.0.0 AM_POLICY_SUBSCRIPTION table column count validation is successful.";
        }
        else {
            return "3.2.0 to 4.0.0 AM_POLICY_SUBSCRIPTION table column count validation is fail.";
        }

    }

    public static String validateApiUuidContent() {

        ValidatorDAO320to400 validate = new ValidatorDAO320to400();
        boolean uuidContentValidator = validate.validateAPIMDbUuidContent();

        if(uuidContentValidator) {
            return " * 3.2.0 to 4.0.0 UUID column validation is successful.";
        }
        else {
            return "3.2.0 to 4.0.0 UUID column validation is fail.";
        }

    }

    public static String checkTableExits1() {

        ValidatorDAO320to400 validate = new ValidatorDAO320to400();
        boolean tableExits = validate.checkTableExits("apim_db","AM_API_SERVICE_MAPPING");

        if(tableExits) {
            return " * 3.2.0 to 4.0.0 AM_API_SERVICE_MAPPING table validation is successful.";
        }
        else {
            return "3.2.0 to 4.0.0 AM_API_SERVICE_MAPPING table validation is fail.";
        }

    }

    public static String checkTableExits2() {

        ValidatorDAO320to400 validate = new ValidatorDAO320to400();
        boolean tableExits = validate.checkTableExits("apim_db","AM_DEPLOYMENT_REVISION_MAPPING");

        if(tableExits) {
            return " * 3.2.0 to 4.0.0 AM_DEPLOYMENT_REVISION_MAPPING table validation is successful.";
        }
        else {
            return "3.2.0 to 4.0.0 AM_DEPLOYMENT_REVISION_MAPPING table validation is fail.";
        }

    }

    public static String checkTableExits3() {

        ValidatorDAO320to400 validate = new ValidatorDAO320to400();
        boolean tableExits = validate.checkTableExits("apim_db","AM_GATEWAY_ENVIRONMENT");

        if(tableExits) {
            return " * 3.2.0 to 4.0.0 AM_GATEWAY_ENVIRONMENT table validation is successful.";
        }
        else {
            return "3.2.0 to 4.0.0 AM_GATEWAY_ENVIRONMENT table validation is fail.";
        }

    }

    public static String checkTableExits4() {

        ValidatorDAO320to400 validate = new ValidatorDAO320to400();
        boolean tableExits = validate.checkTableExits("apim_db","AM_GW_API_DEPLOYMENTS");

        if(tableExits) {
            return " * 3.2.0 to 4.0.0 AM_GW_API_DEPLOYMENTS table validation is successful.";
        }
        else {
            return "3.2.0 to 4.0.0 AM_GW_API_DEPLOYMENTS table validation is fail.";
        }

    }

    public static String checkTableExits5() {

        ValidatorDAO320to400 validate = new ValidatorDAO320to400();
        boolean tableExits = validate.checkTableExits("apim_db","AM_GW_VHOST");

        if(tableExits) {
            return " * 3.2.0 to 4.0.0 AM_GW_VHOST table validation is successful.";
        }
        else {
            return "3.2.0 to 4.0.0 AM_GW_VHOST table validation is fail.";
        }

    }

    public static String checkTableExits6() {

        ValidatorDAO320to400 validate = new ValidatorDAO320to400();
        boolean tableExits = validate.checkTableExits("apim_db","AM_REVISION");

        if(tableExits) {
            return " * 3.2.0 to 4.0.0 AM_REVISION table validation is successful.";
        }
        else {
            return "3.2.0 to 4.0.0 AM_REVISION table validation is fail.";
        }

    }

    public static String checkTableExits7() {

        ValidatorDAO320to400 validate = new ValidatorDAO320to400();
        boolean tableExits = validate.checkTableExits("apim_db","AM_SERVICE_CATALOG");

        if(tableExits) {
            return " * 3.2.0 to 4.0.0 AM_SERVICE_CATALOG table validation is successful.";
        }
        else {
            return "3.2.0 to 4.0.0 AM_SERVICE_CATALOG table validation is fail.";
        }

    }

    public static String checkTableExits8() {

        ValidatorDAO320to400 validate = new ValidatorDAO320to400();
        boolean tableExits = validate.checkTableExits("apim_db","AM_WEBHOOKS_SUBSCRIPTION");

        if(tableExits) {
            return " * 3.2.0 to 4.0.0 AM_WEBHOOKS_SUBSCRIPTION table validation is successful.";
        }
        else {
            return "3.2.0 to 4.0.0 AM_WEBHOOKS_SUBSCRIPTION table validation is fail.";
        }

    }

    public static String checkTableExits9() {

        ValidatorDAO320to400 validate = new ValidatorDAO320to400();
        boolean tableExits = validate.checkTableExits("apim_db","AM_WEBHOOKS_UNSUBSCRIPTION");

        if(tableExits) {
            return " * 3.2.0 to 4.0.0 AM_WEBHOOKS_UNSUBSCRIPTION table validation is successful.";
        }
        else {
            return "3.2.0 to 4.0.0 AM_WEBHOOKS_UNSUBSCRIPTION table validation is fail.";
        }

    }

    public static String checkTableExits10() {

        ValidatorDAO320to400 validate = new ValidatorDAO320to400();
        boolean tableExits = validate.checkTableExits("apim_db","IDN_CONFIG_ATTRIBUTE");

        if(tableExits) {
            return " * 3.2.0 to 4.0.0 IDN_CONFIG_ATTRIBUTE table validation is successful.";
        }
        else {
            return "3.2.0 to 4.0.0 IDN_CONFIG_ATTRIBUTE table validation is fail.";
        }

    }

    public static String checkTableExits11() {

        ValidatorDAO320to400 validate = new ValidatorDAO320to400();
        boolean tableExits = validate.checkTableExits("apim_db","IDN_CONFIG_FILE");

        if(tableExits) {
            return " * 3.2.0 to 4.0.0 IDN_CONFIG_FILE table validation is successful.";
        }
        else {
            return "3.2.0 to 4.0.0 IDN_CONFIG_FILE table validation is fail.";
        }

    }

    public static String checkTableExits12() {

        ValidatorDAO320to400 validate = new ValidatorDAO320to400();
        boolean tableExits = validate.checkTableExits("apim_db","IDN_CONFIG_RESOURCE");

        if(tableExits) {
            return " * 3.2.0 to 4.0.0 IDN_CONFIG_RESOURCE table validation is successful.";
        }
        else {
            return "3.2.0 to 4.0.0 IDN_CONFIG_RESOURCE table validation is fail.";
        }

    }

    public static String checkTableExits13() {

        ValidatorDAO320to400 validate = new ValidatorDAO320to400();
        boolean tableExits = validate.checkTableExits("apim_db","IDN_CONFIG_TYPE");

        if(tableExits) {
            return " * 3.2.0 to 4.0.0 IDN_CONFIG_TYPE table validation is successful.";
        }
        else {
            return "3.2.0 to 4.0.0 IDN_CONFIG_TYPE table validation is fail.";
        }

    }

    public static String checkTableExits14() {

        ValidatorDAO320to400 validate = new ValidatorDAO320to400();
        boolean tableExits = validate.checkTableExits("apim_db","IDN_CORS_ASSOCIATION");

        if(tableExits) {
            return " * 3.2.0 to 4.0.0 IDN_CORS_ASSOCIATION table validation is successful.";
        }
        else {
            return "3.2.0 to 4.0.0 IDN_CORS_ASSOCIATION table validation is fail.";
        }

    }

    public static String checkTableExits15() {

        ValidatorDAO320to400 validate = new ValidatorDAO320to400();
        boolean tableExits = validate.checkTableExits("apim_db","IDN_CORS_ORIGIN");

        if(tableExits) {
            return " * 3.2.0 to 4.0.0 IDN_CORS_ORIGIN table validation is successful.";
        }
        else {
            return "3.2.0 to 4.0.0 IDN_CORS_ORIGIN table validation is fail.";
        }

    }

    public static String checkTableExits16() {

        ValidatorDAO320to400 validate = new ValidatorDAO320to400();
        boolean tableExits = validate.checkTableExits("apim_db","IDN_REMOTE_FETCH_CONFIG");

        if(tableExits) {
            return " * 3.2.0 to 4.0.0 IDN_REMOTE_FETCH_CONFIG table validation is successful.";
        }
        else {
            return "3.2.0 to 4.0.0 IDN_REMOTE_FETCH_CONFIG table validation is fail.";
        }

    }

    public static String checkTableExits17() {

        ValidatorDAO320to400 validate = new ValidatorDAO320to400();
        boolean tableExits = validate.checkTableExits("apim_db","IDN_REMOTE_FETCH_REVISIONS");

        if(tableExits) {
            return " * 3.2.0 to 4.0.0 IDN_REMOTE_FETCH_REVISIONS table validation is successful.";
        }
        else {
            return "3.2.0 to 4.0.0 IDN_REMOTE_FETCH_REVISIONS table validation is fail.";
        }

    }

    public static String checkTableExits18() {

        ValidatorDAO320to400 validate = new ValidatorDAO320to400();
        boolean tableExits = validate.checkTableExits("apim_db","IDN_USER_FUNCTIONALITY_MAPPING");

        if(tableExits) {
            return " * 3.2.0 to 4.0.0 IDN_USER_FUNCTIONALITY_MAPPING table validation is successful.";
        }
        else {
            return "3.2.0 to 4.0.0 IDN_USER_FUNCTIONALITY_MAPPING table validation is fail.";
        }

    }

    public static String checkTableExits19() {

        ValidatorDAO320to400 validate = new ValidatorDAO320to400();
        boolean tableExits = validate.checkTableExits("apim_db","IDN_USER_FUNCTIONALITY_PROPERTY");

        if(tableExits) {
            return " * 3.2.0 to 4.0.0 IDN_USER_FUNCTIONALITY_PROPERTY table validation is successful.";
        }
        else {
            return "3.2.0 to 4.0.0 IDN_USER_FUNCTIONALITY_PROPERTY table validation is fail.";
        }

    }



}
