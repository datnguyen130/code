package JAVA2.Lab_05;
import java.sql.*;
public class demometa {
    public static void main(String[] args) {
        try(Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/ebookshop","root","");
            Statement stmt = conn.createStatement();
                ){
            ResultSet rset = stmt.executeQuery("select * from books");

            ResultSetMetaData rsetMD = rset.getMetaData();;

            int numColums = rsetMD.getColumnCount();

            for (int i =1; i < numColums; i++){
                System.out.printf("%-30s", rsetMD.getColumnName(i));
            }
            System.out.println();

            for (int i = 1; i < numColums; i++){
                System.out.printf("%-30s","(" +rsetMD.getColumnClassName(i) + ")");
            }
            System.out.println();

            while (rset.next()){
                for (int i =1;i < numColums; i++){
                    System.out.printf("%-30s",rset.getString(i));
                }
                System.out.println();
            }
        }catch (SQLException ex){
            ex.printStackTrace();
        }
    }
}
