package JAVA2.Lab_06;
import java.sql.*;
public class JdbcUpdateTest {
    public static void main(String[] args) {
        try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/ebookshop","root","");
             Statement stmt = conn.createStatement();
        ) {
            String strUpdate = "update books set price = price*0.7, qty = qty + 1 where id = 8001 ";
            System.out.println("The SQL statement is : " + strUpdate);
            int countUpdated = stmt.executeUpdate(strUpdate);
            System.out.println(countUpdated + " record affected");

            String strSelect = "select * from books where id = 8002";
            System.out.println("The SQL statement is : " + strSelect + "\n");
            ResultSet rset = stmt.executeQuery(strSelect);
            while (rset.next()){
                System.out.println(rset.getInt("id") + ", " + rset.getString("author") + ", " + rset.getString("title") + ", " + rset.getDouble("price") + ", " + rset.getInt("qty"));
            }

            String strUpdate1 = " update books set price = price * 1.5 where title = \'A Cup of Java\' ";
            System.out.println("The SQL statement is : " + strUpdate1);
            int countUpdated1 = stmt.executeUpdate(strUpdate1);
            System.out.println(countUpdated1 + " record affected");

            String strUpdate2 = " update books set qty = 0 where title = \'A Teaspoon of Java\' ";
            System.out.println("The SQL statement is : " + strUpdate2);
            int countUpdated2 = stmt.executeUpdate(strUpdate2);
            System.out.println(countUpdated2 + " record affected");
        }catch (SQLException ex){
            ex.printStackTrace();
        }
    }
}
