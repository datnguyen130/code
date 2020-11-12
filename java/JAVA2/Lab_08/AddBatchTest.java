package JAVA2.Lab_08;
import JAVA1.lab_08.Ex5.Square;

import java.sql.*;
public class AddBatchTest {
    public static void main(String[] args) {
        try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/ebookshop","root","");
             Statement stmt = conn.createStatement();
        ){
            conn.setAutoCommit(false);

            stmt.addBatch("insert into books values (801,'Java ABC', 'Kevin john', 11.11, 55)");
            stmt.addBatch("insert into books values (802,'Java ABC', 'Kevin john', 11.11, 55)");
            stmt.addBatch("update books set price = 22.22 where id = 801 or id = 802");
            int [] returnCodes = stmt.executeBatch();

            System.out.println("Return codes are: ");
            for (int code: returnCodes) {
                System.out.printf(code + ", ");
            }
            System.out.println();
            conn.commit();
        } catch (SQLException ex){
            ex.printStackTrace();
        }
    }
}
