import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class conexionBBDD {
   public static void main(String[] args) throws Exception {

      // Conectar el Driver JDBC
      Class.forName("com.mysql.cj.jdbc.Driver");

      // variables, cambiar según corresponda
      final String url = "jdbc:mysql://databasemovieserve.cxugqog8chqr.us-east-1.rds.amazonaws.com:3306 /movieserve";
      final String user = "empleadoms";
      final String password = "movieserveAWS67210";

      // establecer la conexión
      Connection con = DriverManager.getConnection(url, user, password);

      // mostrar mensaje de conexión exitosa o fallo
      if (con == null) {
         System.out.println("No se ha establecido la conexión");
         return;
      } else
         System.out.println("¡Felicidades! Se ha establecido la conexión");

      Statement statement = con.createStatement();
      ResultSet resultSet = statement.executeQuery("select * from clientes");
      while (resultSet.next()) {
          System.out.println(resultSet.getInt(1) + " " + resultSet.getString(2) + " " + resultSet.getString(3) + " " + resultSet.getString(4) + " " + resultSet.getString(5)+ " " + resultSet.getString(6) + " " + resultSet.getString(7)+ " " + resultSet.getInt(8)+ " " + resultSet.getDate(9)+ " " + resultSet.getInt(10)+ " " + resultSet.getInt(11));
          ;

      }
      
      // Cerrar la conexión JDBC
      con.close();

   } 
}