import java.sql.Connection;
import java.sql.DriverManager;

public class Exercise31_BasicJDBCConnection {

    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/cognizantdn5";
        String user = "root";
        String password = "your_password";

        try {

            Connection con =
                    DriverManager.getConnection(url,user,password);

            System.out.println("Connection Successful");

            con.close();

        } catch(Exception e) {

            System.out.println(e.getMessage());
        }
    }
}