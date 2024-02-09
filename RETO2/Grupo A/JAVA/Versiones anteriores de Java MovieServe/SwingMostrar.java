import java.awt.BorderLayout;
import java.awt.Color;
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

public class SwingMostrar extends JFrame implements ActionListener  {
	
	JLabel lblEncabezado1,lblEncabezado2,lblEncabezado3,lblEncabezado4,lblEncabezado5,lblEncabezado6,lblEncabezado7,lblEncabezado8;
	JLabel lblTelefono1,lblTelefono2,lblTelefono3,lblTelefono4,lblTelefono5;
	JLabel lblNombre1,lblNombre2,lblNombre3,lblNombre4,lblNombre5;
	JLabel lblApellido1,lblApellido2,lblApellido3,lblApellido4,lblApellido5;
	JLabel lblDNI1,lblDNI2,lblDNI3,lblDNI4,lblDNI5;
	JLabel lblEmail1,lblEmail2,lblEmail3,lblEmail4,lblEmail5;
	JLabel lblPeli1,lblPeli2,lblPeli3,lblPeli4,lblPeli5;
	JLabel lblAsientos1,lblAsientos2,lblAsientos3,lblAsientos4,lblAsientos5;
	JLabel lblFecha1,lblFecha2,lblFecha3,lblFecha4,lblFecha5;
	
	
	
	JButton btnMostrar;
	
	JPanel panelMostrar;
	SwingMostrar(){
		setLayout(new GridLayout(2,8));
		
		btnMostrar = new JButton("Mostrar Datos");
		btnMostrar.addActionListener(this);
		panelMostrar = new JPanel();
		panelMostrar.setLayout(new GridLayout(6,8));
		
		
		lblEncabezado1 = new JLabel("Teléfono");
		lblEncabezado2 = new JLabel("Nombre");
		lblEncabezado3 = new JLabel("Apellido");
		lblEncabezado4 = new JLabel("DNI");
		lblEncabezado5 = new JLabel("Email");
		lblEncabezado6 = new JLabel("Película");
		lblEncabezado7 = new JLabel("Asientos");
		lblEncabezado8 = new JLabel("Fecha");
		
		lblTelefono1 = new JLabel();
		lblTelefono2 = new JLabel();
		lblTelefono3 = new JLabel();
		lblTelefono4 = new JLabel();
		lblTelefono5 = new JLabel();
		lblNombre1 = new JLabel();
		lblNombre2 = new JLabel();
		lblNombre3 = new JLabel();
		lblNombre4 = new JLabel();
		lblNombre5 = new JLabel();
		
		lblApellido1 = new JLabel();
		lblApellido2 = new JLabel();
		lblApellido3 = new JLabel();
		lblApellido4 = new JLabel();
		lblApellido5 = new JLabel();
		
		lblDNI1 = new JLabel();
		lblDNI2 = new JLabel();
		lblDNI3 = new JLabel();
		lblDNI4 = new JLabel();
		lblDNI5 = new JLabel();
		
		lblEmail1 = new JLabel();
		lblEmail2 = new JLabel();
		lblEmail3 = new JLabel();
		lblEmail4 = new JLabel();
		lblEmail5 = new JLabel();
		
		lblPeli1 = new JLabel();
		lblPeli2 = new JLabel();
		lblPeli3 = new JLabel();
		lblPeli4 = new JLabel();
		lblPeli5 = new JLabel();
		
		lblAsientos1 = new JLabel();
		lblAsientos2 = new JLabel();
		lblAsientos3 = new JLabel();
		lblAsientos4 = new JLabel();
		lblAsientos5 = new JLabel();
		
		lblFecha1 = new JLabel();
		lblFecha2 = new JLabel();
		lblFecha3 = new JLabel();
		lblFecha4 = new JLabel();
		lblFecha5 = new JLabel();
		
		btnMostrar.setBorderPainted(true);
		btnMostrar.setBorder(BorderFactory.createLineBorder(Color.black,3));
		btnMostrar.setBackground(Color.cyan);
		btnMostrar.setForeground(Color.white);
		btnMostrar.setFont(new Font ("Arial", Font.BOLD,18));
		
		
		
		add(btnMostrar,BorderLayout.NORTH);
		add(panelMostrar,BorderLayout.CENTER);
		
		
		panelMostrar.add(lblEncabezado1);
		panelMostrar.add(lblEncabezado2);
		panelMostrar.add(lblEncabezado3);
		panelMostrar.add(lblEncabezado4);
		panelMostrar.add(lblEncabezado5);
		panelMostrar.add(lblEncabezado6);
		panelMostrar.add(lblEncabezado7);
		panelMostrar.add(lblEncabezado8);
		
				
		
		panelMostrar.add(lblTelefono1);
		panelMostrar.add(lblNombre1);
		panelMostrar.add(lblApellido1);
		panelMostrar.add(lblDNI1);
		panelMostrar.add(lblEmail1);
		panelMostrar.add(lblPeli1);
		panelMostrar.add(lblAsientos1);
		panelMostrar.add(lblFecha1);

		
		
		panelMostrar.add(lblTelefono2);
		panelMostrar.add(lblNombre2);
		panelMostrar.add(lblApellido2);
		panelMostrar.add(lblDNI2);
		panelMostrar.add(lblEmail2);
		panelMostrar.add(lblPeli2);
		panelMostrar.add(lblAsientos2);
		panelMostrar.add(lblFecha2);

		
		
		
		panelMostrar.add(lblTelefono3);
		panelMostrar.add(lblNombre3);
		panelMostrar.add(lblApellido3);
		panelMostrar.add(lblDNI3);
		panelMostrar.add(lblEmail3);
		panelMostrar.add(lblPeli3);
		panelMostrar.add(lblAsientos3);
		panelMostrar.add(lblFecha3);

		
		
		
		panelMostrar.add(lblTelefono4);
		panelMostrar.add(lblNombre4);
		panelMostrar.add(lblApellido4);
		panelMostrar.add(lblDNI4);
		panelMostrar.add(lblEmail4);
		panelMostrar.add(lblPeli4);
		panelMostrar.add(lblAsientos4);
		panelMostrar.add(lblFecha4);

		
		
		
		panelMostrar.add(lblTelefono5);
		panelMostrar.add(lblNombre5);
		panelMostrar.add(lblApellido5);
		panelMostrar.add(lblDNI5);
		panelMostrar.add(lblEmail5);
		panelMostrar.add(lblPeli5);
		panelMostrar.add(lblAsientos5);
		panelMostrar.add(lblFecha5);



		
	
		
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
	      
	      
	   // Obtener el primer teléfono
	      ResultSet resultSet = statement.executeQuery("SELECT Telefono FROM clientes ORDER BY idCliente desc LIMIT 1");
	      while(resultSet.next()){
	    	
	    	  ResultSet resultSet1 = statement.executeQuery("SELECT Telefono FROM clientes ORDER BY idCliente desc LIMIT 1");
		      if (resultSet1.next()) {
		          String telefono1 = resultSet1.getString(1);
		          lblTelefono1.setText(telefono1);
		      }
		   // Obtener el primer Nombre
		      ResultSet resultSet2 = statement.executeQuery("SELECT Nombre FROM clientes ORDER BY idCliente desc LIMIT 1");
		      if (resultSet2.next()) {
		          String nombre1 = resultSet2.getString(1);
		          lblNombre1.setText(nombre1);
		      }
		      // Obtener el primer Apellido
		      ResultSet resultSet3 = statement.executeQuery("SELECT Apellido FROM clientes ORDER BY idCliente desc LIMIT 1");
		      if (resultSet3.next()) {
		          String apellido1 = resultSet3.getString(1);
		          lblApellido1.setText(apellido1);
		      }
		      // Obtener el primer DNI
		      ResultSet resultSet4 = statement.executeQuery("SELECT DNI FROM clientes ORDER BY idCliente desc LIMIT 1");
		      if (resultSet4.next()) {
		          String dni1 = resultSet4.getString(1);
		          lblDNI1.setText(dni1);
		      }
		      // Obtener el primer Email
		      ResultSet resultSet5 = statement.executeQuery("SELECT Email FROM clientes ORDER BY idCliente desc LIMIT 1");
		      if (resultSet5.next()) {
		          String email1 = resultSet5.getString(1);
		          lblEmail1.setText(email1);
		      }
		      // Obtener la primera Peli
		      ResultSet resultSet6 = statement.executeQuery("SELECT peliculaAVer FROM clientes ORDER BY idCliente desc LIMIT 1");
		      if (resultSet6.next()) {
		          String peli1 = resultSet6.getString(1);
		          lblPeli1.setText(peli1);
		      }
		      // Obtener los primeros Asientos Reservados
		      ResultSet resultSet7 = statement.executeQuery("SELECT cantidadAsientos FROM clientes ORDER BY idCliente desc LIMIT 1");
		      if (resultSet7.next()) {
		          int asientos1 = resultSet7.getInt(1);
		          lblAsientos1.setText(String.valueOf(asientos1));
		      }
		      // Obtener la primera Fecha
		      ResultSet resultSet8 = statement.executeQuery("SELECT Fecha FROM clientes ORDER BY idCliente desc LIMIT 1");
		      if (resultSet8.next()) {
		          String fecha1 = resultSet8.getString(1);
		          lblFecha1.setText(fecha1);
		      }
		      
		      
		      
		      
		      
		      
			   // Obtener el segundo teléfono
			      ResultSet resultSet9 = statement.executeQuery("SELECT Telefono FROM clientes ORDER BY idCliente desc LIMIT 1 OFFSET 1");
			      if (resultSet9.next()) {
			          String telefono2 = resultSet9.getString(1);
			          lblTelefono2.setText(telefono2);
			      }
			   // Obtener el segundo Nombre
			      ResultSet resultSet10 = statement.executeQuery("SELECT Nombre FROM clientes ORDER BY idCliente desc LIMIT 1 OFFSET 1");
			      if (resultSet10.next()) {
			          String nombre2 = resultSet10.getString(1);
			          lblNombre2.setText(nombre2);
			      }
			      // Obtener el segundo Apellido
			      ResultSet resultSet11 = statement.executeQuery("SELECT Apellido FROM clientes ORDER BY idCliente desc LIMIT 1 OFFSET 1");
			      if (resultSet11.next()) {
			          String apellido2 = resultSet11.getString(1);
			          lblApellido2.setText(apellido2);
			      }
			      // Obtener el segundo DNI
			      ResultSet resultSet12 = statement.executeQuery("SELECT DNI FROM clientes ORDER BY idCliente desc LIMIT 1 OFFSET 1");
			      if (resultSet12.next()) {
			          String dni2 = resultSet12.getString(1);
			          lblDNI2.setText(dni2);
			      }
			      // Obtener el sefundo Email
			      ResultSet resultSet13 = statement.executeQuery("SELECT Email FROM clientes ORDER BY idCliente desc LIMIT 1 OFFSET 1");
			      if (resultSet13.next()) {
			          String email2 = resultSet13.getString(1);
			          lblEmail2.setText(email2);
			      }
			      // Obtener la segunda Peli
			      ResultSet resultSet14 = statement.executeQuery("SELECT peliculaAVer FROM clientes ORDER BY idCliente desc LIMIT 1 OFFSET 1");
			      if (resultSet14.next()) {
			          String peli2 = resultSet14.getString(1);
			          lblPeli2.setText(peli2);
			      }
			      // Obtener los segundos Asientos Reservados
			      ResultSet resultSet15 = statement.executeQuery("SELECT cantidadAsientos FROM clientes ORDER BY idCliente desc LIMIT 1 OFFSET 1");
			      if (resultSet15.next()) {
			          int asientos2 = resultSet15.getInt(1);
			          lblAsientos2.setText(String.valueOf(asientos2));
			      }
			      // Obtener la segunda Fecha
			      ResultSet resultSet16 = statement.executeQuery("SELECT Fecha FROM clientes ORDER BY idCliente desc LIMIT 1 OFFSET 1");
			      if (resultSet16.next()) {
			          String fecha2 = resultSet16.getString(1);
			          lblFecha2.setText(fecha2);
			      }
			      
			      
			      
			      
			      // Obtener el tercer teléfono
			      ResultSet resultSet17 = statement.executeQuery("SELECT Telefono FROM clientes ORDER BY idCliente desc LIMIT 1 OFFSET 2");
			      if (resultSet17.next()) {
			          String telefono3 = resultSet17.getString(1);
			          lblTelefono3.setText(telefono3);
			      }
			   // Obtener el tercer Nombre
			      ResultSet resultSet18 = statement.executeQuery("SELECT Nombre FROM clientes ORDER BY idCliente desc LIMIT 1 OFFSET 2");
			      if (resultSet18.next()) {
			          String nombre3 = resultSet18.getString(1);
			          lblNombre3.setText(nombre3);
			      }
			      // Obtener el tercer Apellido
			      ResultSet resultSet19 = statement.executeQuery("SELECT Apellido FROM clientes ORDER BY idCliente desc LIMIT 1 OFFSET 2");
			      if (resultSet19.next()) {
			          String apellido3 = resultSet19.getString(1);
			          lblApellido3.setText(apellido3);
			      }
			      // Obtener el terer DNI
			      ResultSet resultSet20 = statement.executeQuery("SELECT DNI FROM clientes ORDER BY idCliente desc LIMIT 1 OFFSET 2");
			      if (resultSet20.next()) {
			          String dni3 = resultSet20.getString(1);
			          lblDNI3.setText(dni3);
			      }
			      // Obtener el tercer Email
			      ResultSet resultSet21 = statement.executeQuery("SELECT Email FROM clientes ORDER BY idCliente desc LIMIT 1 OFFSET 2");
			      if (resultSet21.next()) {
			          String email3 = resultSet21.getString(1);
			          lblEmail3.setText(email3);
			      }
			      // Obtener la tercera Peli
			      ResultSet resultSet22 = statement.executeQuery("SELECT peliculaAVer FROM clientes ORDER BY idCliente desc LIMIT 1 OFFSET 2");
			      if (resultSet22.next()) {
			          String peli3 = resultSet22.getString(1);
			          lblPeli3.setText(peli3);
			      }
			      // Obtener los terceros Asientos Reservados
			      ResultSet resultSet23 = statement.executeQuery("SELECT cantidadAsientos FROM clientes ORDER BY idCliente desc LIMIT 1 OFFSET 2");
			      if (resultSet23.next()) {
			          int asientos3 = resultSet23.getInt(1);
			          lblAsientos3.setText(String.valueOf(asientos3));
			      }
			      // Obtener la tercera Fecha
			      ResultSet resultSet24 = statement.executeQuery("SELECT Fecha FROM clientes ORDER BY idCliente desc LIMIT 1 OFFSET 2");
			      if (resultSet24.next()) {
			          String fecha3 = resultSet24.getString(1);
			          lblFecha3.setText(fecha3);
			      }
			      
			      
			      
			      
			      // Obtener el cuarto teléfono
			      ResultSet resultSet25 = statement.executeQuery("SELECT Telefono FROM clientes ORDER BY idCliente desc LIMIT 1 OFFSET 3");
			      if (resultSet25.next()) {
			          String telefono4 = resultSet25.getString(1);
			          lblTelefono4.setText(telefono4);
			      }
			   // Obtener el cuarto Nombre
			      ResultSet resultSet26 = statement.executeQuery("SELECT Nombre FROM clientes ORDER BY idCliente desc LIMIT 1 OFFSET 3");
			      if (resultSet26.next()) {
			          String nombre4 = resultSet26.getString(1);
			          lblNombre4.setText(nombre4);
			      }
			      // Obtener el cuarto Apellido
			      ResultSet resultSet27 = statement.executeQuery("SELECT Apellido FROM clientes ORDER BY idCliente desc LIMIT 1 OFFSET 3");
			      if (resultSet27.next()) {
			          String apellido4 = resultSet27.getString(1);
			          lblApellido4.setText(apellido4);
			      }
			      // Obtener el cuarto DNI
			      ResultSet resultSet28 = statement.executeQuery("SELECT DNI FROM clientes ORDER BY idCliente desc LIMIT 1 OFFSET 3");
			      if (resultSet28.next()) {
			          String dni4 = resultSet28.getString(1);
			          lblDNI4.setText(dni4);
			      }
			      // Obtener el cuarto Email
			      ResultSet resultSet29 = statement.executeQuery("SELECT Email FROM clientes ORDER BY idCliente desc LIMIT 1 OFFSET 3");
			      if (resultSet29.next()) {
			          String email4 = resultSet29.getString(1);
			          lblEmail4.setText(email4);
			      }
			      // Obtener la cuarta Peli
			      ResultSet resultSet30 = statement.executeQuery("SELECT peliculaAVer FROM clientes ORDER BY idCliente desc LIMIT 1 OFFSET 3");
			      if (resultSet30.next()) {
			          String peli4 = resultSet30.getString(1);
			          lblPeli4.setText(peli4);
			      }
			      // Obtener los cuartos Asientos Reservados
			      ResultSet resultSet31 = statement.executeQuery("SELECT cantidadAsientos FROM clientes ORDER BY idCliente desc LIMIT 1 OFFSET 3");
			      if (resultSet31.next()) {
			          int asientos4 = resultSet31.getInt(1);
			          lblAsientos4.setText(String.valueOf(asientos4));
			      }
			      // Obtener la cuarta Fecha
			      ResultSet resultSet32 = statement.executeQuery("SELECT Fecha FROM clientes ORDER BY idCliente desc LIMIT 1 OFFSET 3");
			      if (resultSet32.next()) {
			          String fecha4 = resultSet32.getString(1);
			          lblFecha4.setText(fecha4);
			      }
			      
			      // Obtener el quinto teléfono
			      ResultSet resultSet35 = statement.executeQuery("SELECT Telefono FROM clientes ORDER BY idCliente desc LIMIT 1 OFFSET 4");
			      if (resultSet35.next()) {
			          String telefono5 = resultSet35.getString(1);
			          lblTelefono5.setText(telefono5);
			      }
			   // Obtener el quinto Nombre
			      ResultSet resultSet36 = statement.executeQuery("SELECT Nombre FROM clientes ORDER BY idCliente desc LIMIT 1 OFFSET 4");
			      if (resultSet36.next()) {
			          String nombre5 = resultSet36.getString(1);
			          lblNombre5.setText(nombre5);
			      }
			      // Obtener el quinto Apellido
			      ResultSet resultSet37 = statement.executeQuery("SELECT Apellido FROM clientes ORDER BY idCliente desc LIMIT 1 OFFSET 4");
			      if (resultSet37.next()) {
			          String apellido5 = resultSet37.getString(1);
			          lblApellido5.setText(apellido5);
			      }
			      // Obtener el quinto DNI
			      ResultSet resultSet38 = statement.executeQuery("SELECT DNI FROM clientes ORDER BY idCliente desc LIMIT 1 OFFSET 4");
			      if (resultSet38.next()) {
			          String dni5 = resultSet38.getString(1);
			          lblDNI5.setText(dni5);
			      }
			      // Obtener el quinto Email
			      ResultSet resultSet39 = statement.executeQuery("SELECT Email FROM clientes ORDER BY idCliente desc LIMIT 1 OFFSET 4");
			      if (resultSet39.next()) {
			          String email5 = resultSet39.getString(1);
			          lblEmail5.setText(email5);
			      }
			      // Obtener la quinta Peli
			      ResultSet resultSet40 = statement.executeQuery("SELECT peliculaAVer FROM clientes ORDER BY idCliente desc LIMIT 1 OFFSET 4");
			      if (resultSet40.next()) {
			          String peli5 = resultSet40.getString(1);
			          lblPeli5.setText(peli5);
			      }
			      // Obtener los quintos Asientos Reservados
			      ResultSet resultSet41 = statement.executeQuery("SELECT cantidadAsientos FROM clientes ORDER BY idCliente desc LIMIT 1 OFFSET 4");
			      if (resultSet41.next()) {
			          int asientos5 = resultSet41.getInt(1);
			          lblAsientos5.setText(String.valueOf(asientos5));
			      }
			      // Obtener la quinta Fecha
			      ResultSet resultSet42 = statement.executeQuery("SELECT Fecha FROM clientes ORDER BY idCliente desc LIMIT 1 OFFSET 4");
			      if (resultSet42.next()) {
			          String fecha5 = resultSet42.getString(1);
			          lblFecha5.setText(fecha5);
			      }
			      
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
