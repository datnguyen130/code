package JAVA2.Lab_08;
import java.sql.*;
public class JdbcPreparedStatementTest {
    public static void main(String[] args) {
        try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/ebookshop","root","");
             Statement stmt = conn.createStatement();
             PreparedStatement pstmt = conn.prepareStatement("insert into books values (?,?,?,?,?)");
             PreparedStatement pstmtSelect = conn.prepareStatement("select * from books");

        ){
            pstmt.setInt(1,70022);
            pstmt.setString(2, "Mahjong 102");
            int rowInserted = pstmt.executeUpdate();
            System.out.println(rowInserted + " inserted");

            ResultSet rset = pstmtSelect.executeQuery();
            while (rset.next()){
                System.out.println(rset.getInt("id") + ", " +
                         rset.getString("author") + ", " +
                         rset.getString("title") + ", " +
                         rset.getDouble("price") + ", " +
                         rset.getInt("qty") );
            }
        }
        catch (SQLException ex){
            ex.printStackTrace();
        }
    }
}
