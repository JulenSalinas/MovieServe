import java.awt.Color;
import java.awt.Font;
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

public class SwingMostrar extends JFrame implements ActionListener  {
	
	JLabel lblregistros,lblencabezados,lblregistro;
	JButton btnMostrar;
	
	SwingMostrar(){
		setLayout(null);
		
		btnMostrar = new JButton("Mostrar Datos");
		btnMostrar.addActionListener(this);
		lblregistros = new JLabel();
		lblencabezados = new JLabel("  "+"ID"+"           " + "Teléfono"+"           " + "Nombre"+"                             " + "Apellido"+"                         " + "DNI"+"           "+"Email"+"       " + "Pelicula A Ver"+"           " + "Cantidad Asientos"+"           " + "Fecha");
		lblregistro = new JLabel();
	
		lblregistros.setLocation(250,140);
		lblregistros.setSize(900,500);
		lblregistro.setLocation(250,200);
		lblregistro.setSize(700,100);
	
		
		lblencabezados.setLocation(250,140);
		lblencabezados.setSize(900,60);
		btnMostrar.setLocation(250,30);
		btnMostrar.setSize(900,60);
		
		
		btnMostrar.setBorderPainted(true);
		btnMostrar.setBorder(BorderFactory.createLineBorder(Color.black,3));
		btnMostrar.setBackground(Color.cyan);
		btnMostrar.setForeground(Color.white);
		btnMostrar.setFont(new Font ("Arial", Font.BOLD,18));
		
		
		
		add(lblencabezados);
		add(lblregistros);
		add(btnMostrar);
		add(lblregistro);
		
		
		lblregistros.setBorder(BorderFactory.createLineBorder(Color.black,3));
		
		setTitle("Mostrar todos los datos MovieServe");
		setResizable(false);
		setSize(1920,1080);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
	}
	
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
	  if (e.getSource()==btnMostrar) {
			
		try {
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
	      ResultSet resultSet = statement.executeQuery("select idCliente,Telefono,Nombre,Apellido,DNI,Email,peliculaAVer,cantidadAsientos,Fecha from clientes");
	      while (resultSet.next()) {
	  		lblregistro.setText(resultSet.getInt(1) + " " + resultSet.getString(2) + " " + resultSet.getString(3) + " " + resultSet.getString(4) + " " + resultSet.getString(5)+ " " + resultSet.getString(6) + " " + resultSet.getString(7)+ " " + resultSet.getInt(8)+ " " + resultSet.getDate(9)+ "\n");

	          ;
	      }
	      
	      // Cerrar la conexión JDBC
	      con.close();
	      
		} catch (Exception ex) {
			System.out.println("Se ha producido un error. "+ ex.getStackTrace());
		}
		
		
		
	  }
	}

	public static void main(String[] args){

		
	      new SwingMostrar();
		
	}

}
