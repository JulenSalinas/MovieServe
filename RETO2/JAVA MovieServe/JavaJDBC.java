import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JavaJDBC {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/eventos", "root", ""
            );
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("select * from inscripciones");
            while (resultSet.next()) {
                System.out.println(resultSet.getInt(2) + " " + resultSet.getString(1));
                ;

            }
            connection.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
