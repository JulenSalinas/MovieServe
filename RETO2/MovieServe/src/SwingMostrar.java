import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class SwingMostrar extends JFrame implements ActionListener  {
	final int CANTIDADREGISTROS=5; //Una constante fija para que muestre como maximo 5 registros.
	String encabezado[] = {"Telefono","Nombre","Apellido","DNI","Email","Película","Cantidad de Asientos","Fecha"};
	String datos[][] = new String[CANTIDADREGISTROS][encabezado.length]; // Una tabla bidimensional en el que mostrara todos los datos.
	JButton btnMostrar;

	
	SwingMostrar(){
	
		
		setLayout(null);
		
		btnMostrar = new JButton("Mostrar Datos"); // Para que muestre los 5 registros al darle al boton.
		btnMostrar.addActionListener(this);

		btnMostrar.setBorderPainted(true);
		btnMostrar.setBorder(BorderFactory.createLineBorder(Color.black,3));
		btnMostrar.setBackground(Color.cyan);
		btnMostrar.setForeground(Color.white);
		btnMostrar.setFont(new Font ("Arial", Font.BOLD,18));
	
		add(btnMostrar);
		btnMostrar.setLocation(375,40);
		btnMostrar.setSize(600,90);
		
		
		setTitle("Mostrar todos los datos MovieServe");
		setResizable(false);
		setSize(1920,1080);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
	  if (true) {
		try {
		// Conectar el Driver JDBC
	      Class.forName("com.mysql.cj.jdbc.Driver");

	      // Conexion con la base de datos.
	      final String url = "jdbc:mysql://databasemovieserve.cxugqog8chqr.us-east-1.rds.amazonaws.com:3306 /movieserve";
	      final String user = "empleadoms";
	      final String password = "movieserveAWS67210";

	      // Establecer la conexión
	      Connection con = DriverManager.getConnection(url, user, password);
	      
	      // Para verificar que esta la conexion establecida o no.
	      if (con == null) {
	          System.out.println("No se ha establecido la conexión");
	          return;
	       } else
	          System.out.println("¡Felicidades! Se ha establecido la conexión");
	      Statement statement = con.createStatement();
	      
	      // La consulta a la base de datos.
	      ResultSet resultSet = statement.executeQuery("SELECT Telefono,Nombre,Apellido,DNI,Email,peliculaAVer,cantidadAsientos,Fecha FROM clientes ORDER BY idCliente desc LIMIT " + CANTIDADREGISTROS);
	      System.out.println("SELECT Telefono,Nombre,Apellido,DNI,Email,peliculaAVer,cantidadAsientos,Fecha FROM clientes ORDER BY idCliente desc LIMIT " + CANTIDADREGISTROS);
	      int fila = 0; // Una variable para saber donde imprimir el dato. Va sumando por lo que va cambiando de texto.
	      while(resultSet.next()){
	    	datos[fila][0] = resultSet.getString(1); // Para especificar donde poner el resultado de la consulta
	    	datos[fila][1] = resultSet.getString(2);
	    	datos[fila][2] = resultSet.getString(3);
	    	datos[fila][3] = resultSet.getString(4);
	    	datos[fila][4] = resultSet.getString(5);
	    	datos[fila][5] = resultSet.getString(6);
	    	datos[fila][6] = String.valueOf(resultSet.getInt(7));
	    	datos[fila][7] = resultSet.getString(8);
	    	
	    	
	    	System.out.println(datos[fila][0]);
	    	
	    	fila++;
	      }
		
	      // Cerrar la conexión JDBC
	      con.close();
	      
	      DefaultTableModel model = new DefaultTableModel(datos, encabezado);

	        // Crear tabla y añadirle el modelo
	        JTable table = new JTable(model);
	        
	      
	        JFrame frame = new JFrame();
	        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        frame.add(new JScrollPane(table));

	        // Mostrar marco
	        frame.pack();
	        frame.setVisible(true);
	        frame.setSize(10050,145);
	        frame.setLocation(1, 350);
	    
	        
		} catch (Exception ex) {
			System.out.println("Se ha producido un error. "+ ex.getStackTrace());
		}
		
		
		
	  }
	}

	public static void main(String[] args){

		
	      new SwingMostrar();
		
	}

}
