import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Exercise33_TransactionHandling {

    public static void main(String[] args) {

        try {

            Connection con =
                    DriverManager.getConnection(
                            "jdbc:mysql://localhost:3306/cognizantdn5",
                            "root",
                            "your_password");

            con.setAutoCommit(false);

            PreparedStatement ps1 =
                    con.prepareStatement(
                            "INSERT INTO Users VALUES(8,'Rakesh','r@gmail.com','Hyderabad','2025-06-20')");

            PreparedStatement ps2 =
                    con.prepareStatement(
                            "INSERT INTO Users VALUES(9,'Kumar','k@gmail.com','Warangal','2025-06-20')");

            ps1.executeUpdate();
            ps2.executeUpdate();

            con.commit();

            System.out.println("Transaction Success");

            con.close();

        } catch(Exception e) {

            System.out.println(e.getMessage());
        }
    }
}