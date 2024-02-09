import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.JTextField;
/**
* Esta clase llamada InsertarDatosMovieServe, esta basada o tiende de la superclase de Jframe, por otro lado, la interfaz del action listener también esta implementada en el código y al igual que en los otros archivos, la libreria mysql connector está implementada en el proyecto. 
* Si hacemos inacpié en la funcionalidad de la clase, se trata de una ventana donde se muestran diversos "campos" o textos vacíos para añadir reservas a última hora, sobre todo, el programa está orientado para que un empleado pueda hacer una reserva a un cliente a última hora
* Tenemos que recalcar que el código no esta terminado pero si está en una versiión muy avanzada
*/
public class InsertarDatosMovieserve extends JFrame implements ActionListener {

	
	JLabel lblImagen;
	ImageIcon imglogoMovieServe;
	JButton btnBotonInsertar , btnBajar, btnSubir, btnAtras, btnBotonSalir;
	
	JLabel lblTelefono,lblNombre,lblApellido,lblDNI,lblEmail,lblCantidadAsientos,lblFecha,lblIdSala,lblIdPelicula;
	JTextField txtTelefono,txtNombre,txtApellido,txtDNI,txtEmail,txtCantidadAsientos,txtFecha,txtPeli,txtIdSala,txtIdPelicula;
	JComboBox cboPelis;
	String peliculas[] = {"El regreso de Jaava","La BakQ perdida","Las Aventuras de Inti: El duende de Garbera","Tamayo:El escape","Programación eterna","El gasto","Asesinato en la máquina virtual","El Break","La ley prohibida","El arte de la doma clásica","El Wuekii","El trén de vuelta"};
	
/**
* En el método constructor llamado igual que la clase, implementamos todas las etiquetas, botones...; todo ello en un panel, por otro lado, implementamos el título y la 'condición' de que sea visible. 
* Por último hemos de recalcar que el hemos usado SetLayout null y un panel GridLayout
*/
	InsertarDatosMovieserve(){ 
		
		setLayout(null);
		imglogoMovieServe = new ImageIcon("LogoMovieServe.png");
		lblImagen = new JLabel(imglogoMovieServe);
		
		btnBotonInsertar = new JButton ("Insertar Datos");
		btnBotonInsertar.addActionListener(this);
		
		btnAtras = new JButton ("Atras");
		btnAtras.addActionListener(this);
		btnBotonSalir = new JButton ("Salir");
		btnBotonSalir.addActionListener(this);
		add(btnBotonSalir);
		btnBotonSalir.setLocation(1100,150);
		btnBotonSalir.setSize(100,30);
		
		btnBotonSalir.setBackground(Color.lightGray);
		btnBotonSalir.setForeground(Color.white);
		btnBotonSalir.setFont(new Font ("Arial", Font.ITALIC,18));
		
		btnSubir = new JButton ("+");
		btnSubir.addActionListener(this);
		btnBajar = new JButton ("-");
		btnBajar.addActionListener(this);
		
		cboPelis = new JComboBox(peliculas);
		cboPelis.addActionListener(this);
		
		lblTelefono = new JLabel ("Teléfono");
		lblNombre = new JLabel ("Nombre");
		lblApellido = new JLabel ("Apellido");
		lblDNI = new JLabel ("DNI");
		lblEmail = new JLabel ("Email");
		lblCantidadAsientos = new JLabel ("NºASIENTOS");
		lblFecha = new JLabel ("Fecha");
		
		txtTelefono = new JTextField ();
		txtNombre = new JTextField ();
		txtApellido = new JTextField ();
		txtDNI = new JTextField ();
		txtEmail = new JTextField ();
		txtCantidadAsientos = new JTextField ("0");
		txtFecha = new JTextField ();
		txtPeli = new JTextField ();
		
		
		txtIdSala = new JTextField ();

		txtIdPelicula = new JTextField ();
		
		
		add(lblImagen);
		lblImagen.setIcon(imglogoMovieServe);
		add(btnBotonInsertar);
		add(cboPelis);
		add(lblTelefono);
		add(lblNombre);
		add(lblApellido);
		add(lblDNI);
		add(lblEmail);
		add(lblCantidadAsientos);
		add(lblFecha);
		
		add(txtTelefono);
		add(txtNombre);
		add(txtApellido);
		add(txtDNI);
		add(txtEmail);
		add(txtPeli);
		add(txtCantidadAsientos);
		add(txtFecha);
		
		add(btnSubir);
		add(btnBajar);
		add(btnAtras);
		
		add(txtIdSala);
		add(txtIdPelicula);
		
		btnAtras.setBackground(Color.lightGray);
		btnAtras.setForeground(Color.white);
		btnAtras.setFont(new Font ("Arial", Font.ITALIC,18));
		btnAtras.setBorderPainted(true);
		
		btnBotonInsertar.setBackground(Color.cyan);
		btnBotonInsertar.setForeground(Color.white);
		btnBotonInsertar.setFont(new Font ("Arial", Font.BOLD,18));
		btnBotonInsertar.setBorderPainted(true);
		
		btnSubir.setBackground(Color.lightGray);
		btnSubir.setForeground(Color.white);
		btnSubir.setFont(new Font ("Arial", Font.BOLD,18));
		btnSubir.setBorderPainted(true);
		
		btnBajar.setBackground(Color.lightGray);
		btnBajar.setForeground(Color.white);
		btnBajar.setFont(new Font ("Arial", Font.BOLD,18));
		btnBajar.setBorderPainted(true);
		
		
		
		
		lblImagen.setLocation(530, 10);
		lblImagen.setSize(300,300);
		
		
		btnAtras.setLocation(1100,100);
		btnAtras.setSize(90,30);
		
		btnSubir.setLocation(430,690);
		btnSubir.setSize(50,30);
	
		btnBajar.setLocation(205,690);
		btnBajar.setSize(50,30);
		
		btnBotonInsertar.setLocation(880,670);
		btnBotonInsertar.setSize(250,60);
		cboPelis.setLocation(998,540);
		cboPelis.setSize(200,30);

		lblTelefono.setLocation(250,350);
		lblTelefono.setSize(100,30);
		lblTelefono.setFont(new Font ("Arial", Font.BOLD,21));
		
		lblNombre.setLocation(650,350);
		lblNombre.setSize(100,30);
		lblNombre.setFont(new Font ("Arial", Font.BOLD,21));
	
		lblApellido.setLocation(1050,350);
		lblApellido.setSize(100,30);
		lblApellido.setFont(new Font ("Arial", Font.BOLD,21));
		
		lblDNI.setLocation(265,500);
		lblDNI.setSize(100,30);
		lblDNI.setFont(new Font ("Arial", Font.BOLD,21));
		
		lblEmail.setLocation(655,500);
		lblEmail.setSize(100,30);
		lblEmail.setFont(new Font ("Arial", Font.BOLD,21));
		
		
		lblCantidadAsientos.setLocation(225,610);
		lblCantidadAsientos.setSize(700,100);
		lblCantidadAsientos.setFont(new Font ("Arial", Font.BOLD,21));
		
		lblFecha.setLocation(545,610);
		lblFecha.setSize(700,100);
		lblFecha.setFont(new Font ("Arial", Font.BOLD,21));
	
		txtTelefono.setSize(100,30);
		txtTelefono.setFont(new Font ("Arial", Font.ITALIC,19));
		txtTelefono.setBounds(270,390,150,30);
		
		
		txtNombre.setSize(100,30);
		txtNombre.setFont(new Font ("Arial", Font.ITALIC,19));
		txtNombre.setBounds(660,390,150,30);
	
	
		txtApellido.setSize(100,30);
		txtApellido.setFont(new Font ("Arial", Font.ITALIC,19));
		txtApellido.setBounds(1070,390,150,30);
		

		txtPeli.setSize(100,30);
		txtPeli.setFont(new Font ("Arial", Font.ITALIC,19));
		txtPeli.setBounds(1007,590,160,30);

		txtDNI.setSize(100,30);
		txtDNI.setFont(new Font ("Arial", Font.ITALIC,19));
		txtDNI.setBounds(285,540,150,30);


		txtEmail.setSize(100,30);
		txtEmail.setFont(new Font ("Arial", Font.ITALIC,19));
		txtEmail.setBounds(660,540,150,30);

	
		txtCantidadAsientos.setSize(400,40);
		txtCantidadAsientos.setFont(new Font ("Arial", Font.ITALIC,19));
		txtCantidadAsientos.setBounds(270,690,150,30);
	
		txtFecha.setSize(400,40);
		txtFecha.setFont(new Font ("Arial", Font.ITALIC,19));
		txtFecha.setBounds(540,690,150,30);
		
		txtIdSala.setLocation(1200,590);

		txtIdSala.setSize(30,30);

		txtIdSala.setFont(new Font ("Arial", Font.BOLD,21));



		txtIdPelicula.setLocation(1250,590);

		txtIdPelicula.setSize(30,30);

		txtIdPelicula.setFont(new Font ("Arial", Font.BOLD,21));
		
		
		setTitle("Insertar datos MovieServe");
		setResizable(false);
		setSize(1920,1080);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	@Override
/**
* En el actionPerformed, mediante el código de conexión a la base de datos hemos intentado hacer una insercción de los distintos campos en la base de datos mediante este código java 
* Por otro lado, hemos automatizado que al seleccionar cualquier película en el combo, los IdSala e IdPelicula se auto asignen valores automáticos
*/
	public void actionPerformed(ActionEvent e) {
		 int valor = Integer.parseInt(txtCantidadAsientos.getText());
		if(e.getSource()==btnSubir) {
	          valor++;  
	          txtCantidadAsientos.setText(String.valueOf(valor));
		}
	          if (e.getSource()==btnBajar) {
	        	  valor -- ;
	      txtCantidadAsientos.setText(String.valueOf(valor));
	      }

	          if(e.getSource()==btnAtras)
	  			new SwingInicio();
	          
	          if(e.getSource()==btnBotonSalir)
	  			hide();
	          
	          if (true) {
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
	      	      
	      	    //Datos del formulario
	      	    String Telefono = txtTelefono.getText();
	      	    String Nombre = txtNombre.getText();
	      	    String Apellido = txtApellido.getText();
	      	    String DNI = txtDNI.getText();
	      	    String Email = txtEmail.getText();
	      	    String peliculaAVer = "El regreso de Javaa";
	      		int cantidadAsientos = Integer.parseInt(txtCantidadAsientos.getText());
		      	String Fecha = txtFecha.getText();
		      	
		      	int idsala = 0;
		      	int idpelicula = 0;
	      	
		      	// Insertar datos a la base de datos
		      	if(cboPelis.getSelectedItem() == "El regreso de Jaava") {
		      		peliculaAVer = "El regreso de Jaava";
		      		txtPeli.setText(peliculaAVer);
		      		txtPeli.getText();
		      		
		      		idsala = 1;
		      		txtIdSala.setText(String.valueOf(idsala));
		      		idsala = Integer.parseInt(txtIdSala.getText());
		      		idpelicula = 1;
		      		txtIdPelicula.setText(String.valueOf(idpelicula));
		      		idpelicula = Integer.parseInt(txtIdSala.getText());
		      		
		      		
		      	}
		      	if(cboPelis.getSelectedItem() == "La BakQ perdida"){
		      		peliculaAVer = "La BakQ perdida";
		      		txtPeli.setText(peliculaAVer);
		      		txtPeli.getText();
		      		
		      		idsala = 2;
		      		txtIdSala.setText(String.valueOf(idsala));
		      		idsala = Integer.parseInt(txtIdSala.getText());
		      		idpelicula = 2;
		      		txtIdPelicula.setText(String.valueOf(idpelicula));
		      		idpelicula = Integer.parseInt(txtIdSala.getText());
		      		
		      	}
		      	if(cboPelis.getSelectedItem() == "Las Aventuras de Inti:El duende de Garbera"){
		      		peliculaAVer = "Las Aventuras de Inti:El duende de Garbera";
		      		txtPeli.setText(peliculaAVer);
		      		txtPeli.getText();
		      		
		      		idsala = 3;
		      		txtIdSala.setText(String.valueOf(idsala));
		      		idsala = Integer.parseInt(txtIdSala.getText());
		      		idpelicula = 3;
		      		txtIdPelicula.setText(String.valueOf(idpelicula));
		      		idpelicula = Integer.parseInt(txtIdSala.getText());
		      		
		      	}
	      	    
		      	if(cboPelis.getSelectedItem() == "Tamayo:El escape"){
		      		peliculaAVer = "Tamayo:El escape";
		      		txtPeli.setText(peliculaAVer);
		      		txtPeli.getText();
		      		
		      		idsala = 4;
		      		txtIdSala.setText(String.valueOf(idsala));
		      		idsala = Integer.parseInt(txtIdSala.getText());
		      		idpelicula = 4;
		      		txtIdPelicula.setText(String.valueOf(idpelicula));
		      		idpelicula = Integer.parseInt(txtIdSala.getText());
		      		
		      	}
		      	if(cboPelis.getSelectedItem() == "Programación eterna"){
		      		peliculaAVer = "Programación eterna";
		      		txtPeli.setText(peliculaAVer);
		      		txtPeli.getText();
		      		
		      		idsala = 5;
		      		txtIdSala.setText(String.valueOf(idsala));
		      		idsala = Integer.parseInt(txtIdSala.getText());
		      		idpelicula = 5;
		      		txtIdPelicula.setText(String.valueOf(idpelicula));
		      		idpelicula = Integer.parseInt(txtIdSala.getText());
		      		
		      	}
		      	if(cboPelis.getSelectedItem() == "El gasto"){
		      		peliculaAVer = "El gasto";
		      		txtPeli.setText(peliculaAVer);
		      		txtPeli.getText();
		      		
		      		idsala = 6;
		      		txtIdSala.setText(String.valueOf(idsala));
		      		idsala = Integer.parseInt(txtIdSala.getText());
		      		idpelicula = 6;
		      		txtIdPelicula.setText(String.valueOf(idpelicula));
		      		idpelicula = Integer.parseInt(txtIdSala.getText());
		      		
		      	}
		      	if(cboPelis.getSelectedItem() == "Asesinato en la máquina virtual"){
		      		peliculaAVer = "Asesinato en la máquina virtual";
		      		txtPeli.setText(peliculaAVer);
		      		txtPeli.getText();
		      		
		      		idsala = 7;
		      		txtIdSala.setText(String.valueOf(idsala));
		      		idsala = Integer.parseInt(txtIdSala.getText());
		      		idpelicula = 7;
		      		txtIdPelicula.setText(String.valueOf(idpelicula));
		      		idpelicula = Integer.parseInt(txtIdSala.getText());
		      		
		      	}
		      	if(cboPelis.getSelectedItem() == "El Break"){
		      		peliculaAVer = "El Break";
		      		txtPeli.setText(peliculaAVer);
		      		txtPeli.getText();
		      		
		      		idsala = 8;
		      		txtIdSala.setText(String.valueOf(idsala));
		      		idsala = Integer.parseInt(txtIdSala.getText());
		      		idpelicula = 8;
		      		txtIdPelicula.setText(String.valueOf(idpelicula));
		      		idpelicula = Integer.parseInt(txtIdSala.getText());
		      		
		      	}
		      	if(cboPelis.getSelectedItem() == "La ley prohibida"){
		      		peliculaAVer = "La ley prohibida";
		      		txtPeli.setText(peliculaAVer);
		      		txtPeli.getText();
		      		
		      		idsala = 1;
		      		txtIdSala.setText(String.valueOf(idsala));
		      		idsala = Integer.parseInt(txtIdSala.getText());
		      		idpelicula = 9;
		      		txtIdPelicula.setText(String.valueOf(idpelicula));
		      		idpelicula = Integer.parseInt(txtIdSala.getText());
		      		
		      	}
		      	if(cboPelis.getSelectedItem() == "El arte de la doma clásica"){
		      		peliculaAVer = "El arte de la doma clásica";
		      		txtPeli.setText(peliculaAVer);
		      		txtPeli.getText();
		      		
		      		idsala = 2;
		      		txtIdSala.setText(String.valueOf(idsala));
		      		idsala = Integer.parseInt(txtIdSala.getText());
		      		idpelicula = 10;
		      		txtIdPelicula.setText(String.valueOf(idpelicula));
		      		idpelicula = Integer.parseInt(txtIdSala.getText());
		      		
		      	}
		      	if(cboPelis.getSelectedItem() == "El Wuekii"){
		      		peliculaAVer = "El Wuekii";
		      		txtPeli.setText(peliculaAVer);
		      		txtPeli.getText();
		      		
		      		idsala = 3;
		      		txtIdSala.setText(String.valueOf(idsala));
		      		idsala = Integer.parseInt(txtIdSala.getText());
		      		idpelicula = 11;
		      		txtIdPelicula.setText(String.valueOf(idpelicula));
		      		idpelicula = Integer.parseInt(txtIdSala.getText());
		      		
		      	}	
		      	if(cboPelis.getSelectedItem() == "El trén de vuelta"){
		      		peliculaAVer = "El trén de vuelta";
		      		txtPeli.setText(peliculaAVer);
		      		txtPeli.getText();
		      		
		      		idsala = 4;
		      		txtIdSala.setText(String.valueOf(idsala));
		      		idsala = Integer.parseInt(txtIdSala.getText());
		      		idpelicula = 12;
		      		txtIdPelicula.setText(String.valueOf(idpelicula));
		      		idpelicula = Integer.parseInt(txtIdSala.getText());
		      		
		      	}
		      	
		      	
	      	      ResultSet resultSet = statement.executeQuery("INSERT INTO clientes (Telefono,Nombre,Apellido,DNI,Email,peliculaAVer,cantidadAsientos,Fecha,id_Sala,id_Pelicula) VALUES ('"+Telefono+"','"+Nombre+"','"+Apellido+"','"+DNI+"','"+Email+"','"+peliculaAVer+"','"+cantidadAsientos+"','"+Fecha+"','"+idsala+"','"+idpelicula+"')");
	      	      
	      	      
	      		
	      	      // Cerrar la conexión JDBC
	      	      con.close();
	   
	      	      
	      	     //Para cuando se haya introducido un dato mal 
	      		} catch (Exception ex) {
	      			System.out.println("Se ha producido un error. "+ ex.getStackTrace());
	      		}
	      		
	      	  }
	  }

/**
* En el main hemos implementado la visualización de la ventana
*/
	public static void main(String[] args) {
		
		new InsertarDatosMovieserve();
	}

}
