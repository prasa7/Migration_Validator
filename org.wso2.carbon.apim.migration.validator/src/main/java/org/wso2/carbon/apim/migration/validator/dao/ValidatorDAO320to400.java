package org.wso2.carbon.apim.migration.validator.dao;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import org.wso2.carbon.apimgt.impl.utils.APIMgtDBUtil;

public class ValidatorDAO320to400 {
    //1
    public boolean validateAPIMDbTableCount(int tableCount, String dbName) {

        String result = " ";

        String sqlQuery = SQLConstants.GET_TABLE_COUNT;

        Connection conn = null;
        PreparedStatement ps = null;
        List<String> versionList = new ArrayList<String>();
        ResultSet resultSet = null;

       try {
            conn = APIMgtDBUtil.getConnection();
            ps = conn.prepareStatement(sqlQuery);
            ps.setString(1, dbName);
            ps.setInt(2,tableCount);
            resultSet = ps.executeQuery();


            if(resultSet.next()) {
                result = resultSet.getString("Result");
            }

            System.out.println(result);

            ps.close();
            conn.close();

        } catch (SQLException e) {
            //TODO
            System.out.println(e.getMessage());

        } finally {
            APIMgtDBUtil.closeAllConnections(ps, conn, resultSet);
        }

        if(result.equals("true")) {
            return true;
        }
        else {
            return false;
        }

    }

//2
    public boolean validateAPIMDbRevisionCreation() {
        String result = " ";

        String sqlQuery = SQLConstants.VALIDATE_REVISION_CREATION;

        Connection conn = null;
        PreparedStatement ps = null;
        List<String> versionList = new ArrayList<String>();
        ResultSet resultSet = null;

        try {
            conn = APIMgtDBUtil.getConnection();
            ps = conn.prepareStatement(sqlQuery);
            // ps.setString(1,tableName);
            // ps.setString(2,tableName);
            resultSet = ps.executeQuery();


            if (resultSet.next()) {
                result = resultSet.getString("Result");
            }

            System.out.println(result);

        } catch (SQLException e) {
            //TODO
            System.out.println(e.getMessage());

        } finally {
            APIMgtDBUtil.closeAllConnections(ps, conn, resultSet);
        }

        if (result.equals("true")) {
            return true;
        } else {
            return false;
        }
    }

//3

public boolean validateAPIMDbTableColumnCount(String dbName,String tableName,int count) {
    String result = " ";

    String sqlQuery = SQLConstants.GET_COLUMN_COUNT;

    Connection conn = null;
    PreparedStatement ps = null;
    List<String> versionList = new ArrayList<String>();
    ResultSet resultSet = null;

    try {
        conn = APIMgtDBUtil.getConnection();
        ps = conn.prepareStatement(sqlQuery);
        ps.setString(1, dbName);
        ps.setString(2, tableName);
        ps.setInt(3, count);
        resultSet = ps.executeQuery();


        if (resultSet.next()) {
            result = resultSet.getString("Result");
        }

        System.out.println(result);

    } catch (SQLException e) {
        //TODO
        System.out.println(e.getMessage());

    } finally {
        APIMgtDBUtil.closeAllConnections(ps, conn, resultSet);
    }

    if (result.equals("true")) {
        return true;
    } else {
        return false;
    }
}

//4

public boolean validateAPIMDbUuidContent() {
    String result = " ";

    String sqlQuery = SQLConstants.VALIDATE_API_UUID_CONTENT;

    Connection conn = null;
    PreparedStatement ps = null;
    List<String> versionList = new ArrayList<String>();
    ResultSet resultSet = null;

    try {
        conn = APIMgtDBUtil.getConnection();
        ps = conn.prepareStatement(sqlQuery);
        resultSet = ps.executeQuery();


        if (resultSet.next()) {
            result = resultSet.getString("Result");
        }

        System.out.println(result);

    } catch (SQLException e) {
        //TODO
        System.out.println(e.getMessage());

    } finally {
        APIMgtDBUtil.closeAllConnections(ps, conn, resultSet);
    }

    if (result.equals("true")) {
        return true;
    } else {
        return false;
    }
}

//5

public boolean checkTableExits(String dbName,String tableName) {
    String result = " ";

    String sqlQuery = SQLConstants.CHECK_TABLES_EXITS;

    Connection conn = null;
    PreparedStatement ps = null;
    List<String> versionList = new ArrayList<String>();
    ResultSet resultSet = null;

    try {
        conn = APIMgtDBUtil.getConnection();
        ps = conn.prepareStatement(sqlQuery);
        ps.setString(1, dbName);
        ps.setString(2, tableName);
        resultSet = ps.executeQuery();


        if (resultSet.next()) {
            result = resultSet.getString("Result");
        }

        System.out.println(result);

    } catch (SQLException e) {
        //TODO
        System.out.println(e.getMessage());

    } finally {
        APIMgtDBUtil.closeAllConnections(ps, conn, resultSet);
    }

    if (result.equals("true")) {
        return true;
    } else {
        return false;
    }
}

}

/*

import java.sql.*;

public class ValidatorDAO320to400 {

    //1

    public boolean validateAPIMDbTableCount(int tableCount, String dbName) {

        String result = " ";

        String sqlQuery = SQLConstants.GET_TABLE_COUNT;

        try {
            String url = "jdbc:mysql://localhost:3306/apim_db?autoReconnect=true&useSSL=false";
            String uname = "root";
            String pass = "12nadisha57";


            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(url, uname, pass);
            PreparedStatement ps = con.prepareStatement(sqlQuery);
            ps.setString(1, dbName);
            ps.setInt(2,tableCount);
            ResultSet rs = ps.executeQuery();

            rs.next();
            result = rs.getString("Result");

            ps.close();
            con.close();
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }

        if(result.equals("true")) {
            return true;
        }
        else {
            return false;
        }
    }

//2
    public boolean validateAPIMDbRevisionCreation() {
        String result = " ";

        String sqlQuery = SQLConstants.VALIDATE_REVISION_CREATION;

        try {
            String url = "jdbc:mysql://localhost:3306/apim_db?autoReconnect=true&useSSL=false";
            String uname = "root";
            String pass = "12nadisha57";


            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(url, uname, pass);
            PreparedStatement ps = con.prepareStatement(sqlQuery);
            ResultSet rs = ps.executeQuery();

            rs.next();
            result = rs.getString("Result");

            ps.close();
            con.close();
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }

        if(result.equals("true")) {
            return true;
        }
        else {
            return false;
        }

    }

    //3
    public boolean validateAPIMDbTableColumnCount(String dbName,String tableName,int count) {
        String result = " ";

        String sqlQuery = SQLConstants.GET_COLUMN_COUNT;

        try {
            String url = "jdbc:mysql://localhost:3306/apim_db?autoReconnect=true&useSSL=false";
            String uname = "root";
            String pass = "12nadisha57";


            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(url, uname, pass);
            PreparedStatement ps = con.prepareStatement(sqlQuery);
            ps.setString(1,dbName);
            ps.setString(2,tableName);
            ps.setInt(3,count);
            ResultSet rs = ps.executeQuery();

            rs.next();
            result = rs.getString("Result");

            ps.close();
            con.close();
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }

        if(result.equals("true")) {
            return true;
        }
        else {
            return false;
        }

    }

//4

    public boolean validateAPIMDbUuidContent() {
        String result = " ";

        String sqlQuery = SQLConstants.VALIDATE_API_UUID_CONTENT;

        try {
            String url = "jdbc:mysql://localhost:3306/apim_db?autoReconnect=true&useSSL=false";
            String uname = "root";
            String pass = "12nadisha57";


            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(url, uname, pass);
            PreparedStatement ps = con.prepareStatement(sqlQuery);

            ResultSet rs = ps.executeQuery();

            rs.next();
            result = rs.getString("Result");

            ps.close();
            con.close();
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }

        if(result.equals("true")) {
            return true;
        }
        else {
            return false;
        }

    }

//5

    public boolean checkTableExits(String dbName,String tableName) {
        String result = " ";

        String sqlQuery = SQLConstants.CHECK_TABLES_EXITS;

        try {
            String url = "jdbc:mysql://localhost:3306/apim_db?autoReconnect=true&useSSL=false";
            String uname = "root";
            String pass = "12nadisha57";


            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(url, uname, pass);
            PreparedStatement ps = con.prepareStatement(sqlQuery);
            ps.setString(1,dbName);
            ps.setString(2,tableName);
            ResultSet rs = ps.executeQuery();

            rs.next();
            result = rs.getString("Result");

            ps.close();
            con.close();
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }

        if(result.equals("true")) {
            return true;
        }
        else {
            return false;
        }

    }

}

*/