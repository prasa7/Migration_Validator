package org.wso2.carbon.apim.migration.validator.dao;

public class SQLConstants {

    public static String GET_TABLE_COUNT = "SELECT  CASE WHEN (SELECT count(*) AS TOTAL FROM INFORMATION_SCHEMA.TABLES WHERE TABLE_SCHEMA = ?)=(?) THEN 'true' ELSE 'false' END AS Result;";

}
