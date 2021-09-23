package QLKS;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.SQLException;
public class MyConnection {
    public static java.sql.Connection getConnection() {
        java.sql.Connection conn = null;
        try {
            String url = "jdbc:sqlserver://DESKTOP-2I3M01H;databaseName=QL_KHACHSAN;port=1433";
         Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String username = "sa";
            String password = "123456";
            conn = DriverManager.getConnection(url, username, password);
            System.out.println("Kết nối thành công");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return conn;
    }

    public static void closeConnection(java.sql.Connection c) {
        try {
            c.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
