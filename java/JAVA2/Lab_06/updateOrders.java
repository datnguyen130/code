package JAVA2.Lab_06;
import java.sql.*;
public class updateOrders {
    public static void main(String[] args) {
        try (
                Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/northwind", "root", "");
                Statement stmt = conn.createStatement();
        ) {
            String strupdate = "update orders set ShipVia = 3 where OrderID= 10313";
            stmt.executeUpdate(strupdate);
            System.out.println("Updated the SQL statement: " + strupdate);

            String strselect = "Select * from orders where OrderID= 10313";
            ResultSet rst = stmt.executeQuery(strselect);
            ResultSetMetaData rstMD = rst.getMetaData();
            for (int i = 1; i < rstMD.getColumnCount(); i++) {
                System.out.printf("%-40s", rstMD.getColumnName(i));
            }
            System.out.println();
            while (rst.next()) {
                for (int i = 1; i < rstMD.getColumnCount(); i++) {
                    System.out.printf("%-40s", rst.getString(i));
                }
                System.out.println();
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
}
