package org.wso2.carbon.apim.migration.validator.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import org.wso2.carbon.apimgt.impl.utils.APIMgtDBUtil;

public class ValidatorDAO320to400 {

    public boolean validateAPIMDbTableCount(int tableCount, String dbName) {

        //String sql = "SELECT  CASE WHEN (SELECT count(*) AS TOTAL FROM INFORMATION_SCHEMA.TABLES WHERE TABLE_SCHEMA = ?)=(176) THEN 1 ELSE 0 END AS RowCountResult;";
        String sqlQuery = "SELECT  CASE WHEN (SELECT count(*) AS TOTAL FROM INFORMATION_SCHEMA.TABLES WHERE TABLE_SCHEMA = ?)=(?) THEN 'true' ELSE 'false' END AS Result;";

        Connection conn = null;
        PreparedStatement ps = null;
        List<String> versionList = new ArrayList<String>();
        ResultSet resultSet = null;

        //String sqlQuery = SQLConstants.GET_TABLE_COUNT;
        String result = "";

        try {
            conn = APIMgtDBUtil.getConnection();
            ps = conn.prepareStatement(sqlQuery);
            ps.setString(1, dbName);
            ps.setInt(2,tableCount);
            resultSet = ps.executeQuery();

            if(resultSet.next()) {
                result = resultSet.getString("Result");
            }

            System.out.println(resultSet);

        } catch (SQLException e) {
            //TODO
            System.out.println(e.getMessage());

        } finally {
            APIMgtDBUtil.closeAllConnections(ps, conn, resultSet);
        }

        if(result == "true"){
            return true;
        }
        else{
            return false;
        }
    }
}
