import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Exercise32_InsertUpdateJDBC {

    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/cognizantdn5";
        String user = "root";
        String password = "your_password";

        try {

            Connection con =
                    DriverManager.getConnection(url,user,password);

            String insert =
                    "INSERT INTO Users VALUES(7,'Arjun','arjun@gmail.com','Hyderabad','2025-06-15')";

            PreparedStatement ps =
                    con.prepareStatement(insert);

            ps.executeUpdate();

            String update =
                    "UPDATE Users SET city='Warangal' WHERE user_id=7";

            PreparedStatement ps2 =
                    con.prepareStatement(update);

            ps2.executeUpdate();

            System.out.println("Insert & Update Successful");

            con.close();

        } catch(Exception e) {

            System.out.println(e.getMessage());
        }
    }
}