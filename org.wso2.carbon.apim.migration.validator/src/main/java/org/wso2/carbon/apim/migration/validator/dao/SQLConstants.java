package org.wso2.carbon.apim.migration.validator.dao;

public class SQLConstants {

    /*api-m 4.0.0 apim_db*/

    /*table count should be equal to 176    1-apim_db , 2-176*/
    public static String GET_TABLE_COUNT = "SELECT  CASE WHEN (SELECT count(*) AS TOTAL FROM INFORMATION_SCHEMA.TABLES WHERE TABLE_SCHEMA = ? )=(?) THEN 'true' ELSE 'false' END AS Result;";

    /*In AM_API table, if status is published , revision should be created      1-apim_db.AM_API , 2-apim_db.AM_API*/
    /*public static String VALIDATE_REVISION_CREATION = "SELECT CASE WHEN (SELECT count(*) FROM ? WHERE STATUS = 'PUBLISHED' and REVISIONS_CREATED = '1')=(SELECT count(*) FROM ? WHERE STATUS = 'PUBLISHED') THEN 'true' ELSE 'false' END AS Result;";*/
    public static String VALIDATE_REVISION_CREATION = "SELECT CASE WHEN (SELECT count(*) FROM apim_db.AM_API WHERE STATUS = 'PUBLISHED' and REVISIONS_CREATED = '1')=(SELECT count(*) FROM apim_db.AM_API WHERE STATUS = 'PUBLISHED') THEN 'true' ELSE 'false' END AS Result;";

    /*All the published api’s API_UUID’s should be in the AM_REVISION table.    1-API_UUID , 2-apim_db.AM_API , 3-API_UUID , 4-apim_db.AM_REVISION
    public static String TWO = "SELECT CASE WHEN (select sum(crc32(?)) from ? where STATUS = 'PUBLISHED')=(select sum(crc32(?)) from ?) THEN 'true' ELSE 'false' END AS Result;";*/

    /*all entries in “API_UUID” are not null.   1-apim_db.AM_API , 2-API_UUID*/
    //public static String VALIDATE_API_UUID_CONTENT = "SELECT CASE WHEN (SELECT count(*) FROM ? where ? is null or API_UUID = '')=(0) THEN 'true' ELSE 'false' END AS Result;";
    public static String VALIDATE_API_UUID_CONTENT = "SELECT CASE WHEN (SELECT count(*) FROM apim_db.AM_API where API_UUID is null or API_UUID = '')=(0) THEN 'true' ELSE 'false' END AS Result;";



    /*column count is changed after the migration in some tables
    1-'apim_db' , 2-'AM_API'                    , 3-15
    1-'apim_db' , 2-'AM_API_CLIENT_CERTIFICATE' , 3-7
    1-'apim_db' , 2-'AM_API_COMMENTS'           , 3-9
    1-'apim_db' , 2-'AM_API_PRODUCT_MAPPING'    , 3-4
    1-'apim_db' , 2-'AM_API_URL_MAPPING'        , 3-8
    1-'apim_db' , 2-'AM_CERTIFICATE_METADATA'   , 3-4
    1-'apim_db' , 2-'AM_GRAPHQL_COMPLEXITY'     , 3-6
    1-'apim_db' , 2-'AM_GW_API_ARTIFACTS'       , 3-4
    1-'apim_db' , 2-'AM_GW_PUBLISHED_API_DETAILS' , 3-6
    1-'apim_db' , 2-'AM_POLICY_SUBSCRIPTION'     , 3-25
                 */
    public static String GET_COLUMN_COUNT = "SELECT CASE WHEN (select count(*) as columns from INFORMATION_SCHEMA.COLUMNS where table_schema = ? and table_name = ?)=(?) THEN 'true' ELSE 'false' END AS Result;";

    /*check whether newly added tables are exits
        1-'apim_db' , 2-'AM_API_SERVICE_MAPPING'
        1-'apim_db' , 2-'AM_DEPLOYMENT_REVISION_MAPPING'
        1-'apim_db' , 2-'AM_GATEWAY_ENVIRONMENT'
        1-'apim_db' , 2-'AM_GW_API_DEPLOYMENTS'
        1-'apim_db' , 2-'AM_GW_VHOST'
        1-'apim_db' , 2-'AM_REVISION'
        1-'apim_db' , 2-'AM_SERVICE_CATALOG'
        1-'apim_db' , 2-'AM_WEBHOOKS_SUBSCRIPTION'
        1-'apim_db' , 2-'AM_WEBHOOKS_UNSUBSCRIPTION'
        1-'apim_db' , 2-'IDN_CONFIG_ATTRIBUTE'
        1-'apim_db' , 2-'IDN_CONFIG_FILE'
        1-'apim_db' , 2-'IDN_CONFIG_RESOURCE'
        1-'apim_db' , 2-'IDN_CONFIG_TYPE'
        1-'apim_db' , 2-'IDN_CORS_ASSOCIATION'
        1-'apim_db' , 2-'IDN_CORS_ORIGIN'
        1-'apim_db' , 2-'IDN_REMOTE_FETCH_CONFIG'
        1-'apim_db' , 2-'IDN_REMOTE_FETCH_REVISIONS'
        1-'apim_db' , 2-'IDN_USER_FUNCTIONALITY_MAPPING'
        1-'apim_db' , 2-'IDN_USER_FUNCTIONALITY_PROPERTY'
    */
    public static String CHECK_TABLES_EXITS ="SELECT CASE WHEN (select count(*) FROM information_schema.tables WHERE table_schema = ? AND table_name = ?)=(1) THEN 'true' ELSE 'false' END AS Result;";
}
