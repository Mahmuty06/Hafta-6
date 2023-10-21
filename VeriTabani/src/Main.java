
import java.sql.*;

public class Main {
        public static final String DB_URL = "jdbc:mysql://localhost/employees";
        public static final String DB_USER = "root" ;
        public static final String DB_PASSWORD ="Mahmut06" ;


    public static void main(String[] args) {
        Connection connect = null   ;
        String sql = "SELECT * FROM employess" ;

        try {
            connect = DriverManager.getConnection(DB_URL,DB_USER,DB_PASSWORD);
           Statement stb = connect.createStatement() ;
          ResultSet data  =  stb.executeQuery(sql) ;
          while (data.next()) {
              System.out.println("ID : " + data.getInt("id"));
              System.out.println("Name : " + data.getString("name"));
              System.out.println("Position : " + data.getString("position"));
              System.out.println("Salary : " + data.getInt("salary"));
              System.out.println("************************");
          }

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }


    }
}