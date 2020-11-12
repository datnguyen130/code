package JAVA2.Lab_08;
import java.sql.*;
public class
RollingBackCatch {
    public static void main(String[] args)  {
        try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/ebookshops","root","");
             Statement stmt = conn.createStatement();
        ){
            try{
                conn.setAutoCommit(false);
                stmt.executeUpdate("insert into books values (4001,'Paul Chan', 'Mahjong 101',44.4, 4)");
                stmt.executeUpdate("insert into books values (4002,'Peter Chan', 'ABC', 44.4,4)");
                conn.commit();
            }catch (SQLException ex){
                System.out.println("-- Rolling back changes --");
                conn.rollback();
                ex.printStackTrace();
            }
        } catch (SQLException ex){
            System.out.println("Try outside");
            ex.printStackTrace();
        }
    }
}
