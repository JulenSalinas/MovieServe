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

import javax.swing.*;
/**
* Esta clase llamada SwingPeliculas, esta basada o tiende de la superclase de Jframe, por otro lado, la interfaz del action listener también esta implementada en el código y al igual que en los otros archivos, la libreria mysql connector está implementada en el proyecto. 
* Si hacemos inacpié en la funcionalidad de la clase, se trata de una ventana gráfica que representa una muestra de datos de los títulos, géneros y duración de las distintas películas al presionar un botón
*/
public class SwingPeliculas extends JFrame implements ActionListener {
	
	//Creación pantalla de los datos de las peliculas 
	
	JLabel lblGeneral1,lblGeneral2,lblGeneral3;
	
	JLabel lblGenero1, lblGenero2, lblGenero3, lblGenero4,lblGenero5, lblGenero6, lblGenero7, lblGenero8, lblGenero9,lblGenero10,lblGenero11,lblGenero12;
	JLabel lblDuracion1 , lblDuracion2, lblDuracion3, lblDuracion4, lblDuracion5, lblDuracion6 , lblDuracion7, lblDuracion8, lblDuracion9, lblDuracion10, lblDuracion11, lblDuracion12;
	JLabel lblTitulo1, lblTitulo2, lblTitulo3, lblTitulo4,lblTitulo5, lblTitulo6, lblTitulo7, lblTitulo8, lblTitulo9,lblTitulo10 , lblTitulo11,lblTitulo12 ;
	
	JButton btnMostrar, btnSalir ;
	
	JPanel panelPeli;
/**
* En el método constructor llamado igual que la clase, implementamos todas las etiquetas, botones...; por otro lado, implementamos el título y la 'condición' de que sea visible. 
* Por último hemos de recalcar que el hemos añadido el SetLayout como BorderLayout y el uso de un panel GridLayout ha sido indispensable
*/
	SwingPeliculas(){
		setLayout(new BorderLayout());
		
		// Panel donde salen los datos de las pelis
		panelPeli = new JPanel ();
		panelPeli.setLayout(new GridLayout(13,3));
		
		// Boton para mostrar los datos
		btnMostrar = new JButton ("MOSTRAR");
		btnMostrar.addActionListener(this);
		
		//Boton para salir de la pantalla
		btnSalir = new JButton ("SALIR");
		btnSalir.addActionListener(this);
		
		// Titulos de las columnas de los datos
		lblGeneral1 = new JLabel("Genero");
		lblGeneral2 = new JLabel("Duracion");
		lblGeneral3 = new JLabel("Titulo");
	
	
	
	// Labels donde aparecen los generos de los pelis
		lblGenero1 = new JLabel();
		lblGenero2 = new JLabel();
		lblGenero3 = new JLabel();
		lblGenero4 = new JLabel();
		lblGenero5 = new JLabel();
		lblGenero6 = new JLabel();
		lblGenero7 = new JLabel();
		lblGenero8 = new JLabel();
		lblGenero9 = new JLabel();
		lblGenero10 = new JLabel();
		lblGenero11= new JLabel();
		lblGenero12= new JLabel();
		
		// Labels donde aparecen las duraciones de las pelis
		lblDuracion1 = new JLabel();
		lblDuracion2 = new JLabel();
		lblDuracion3 = new JLabel();
		lblDuracion4 = new JLabel();
		lblDuracion5 = new JLabel();
		lblDuracion6 = new JLabel();
		lblDuracion7 = new JLabel();
		lblDuracion8 = new JLabel();
		lblDuracion9 = new JLabel();
		lblDuracion10 = new JLabel();
		lblDuracion11= new JLabel();
		lblDuracion12= new JLabel();
		
		// Labels donde aparecen los titulos de las pelis
		lblTitulo1 = new JLabel();
		lblTitulo2 = new JLabel();
		lblTitulo3 = new JLabel();
		lblTitulo4 = new JLabel();
		lblTitulo5 = new JLabel();
		lblTitulo6 = new JLabel();
		lblTitulo7 = new JLabel();
		lblTitulo8 = new JLabel();
		lblTitulo9 = new JLabel();
		lblTitulo10 = new JLabel();
		lblTitulo11 = new JLabel();
		lblTitulo12 = new JLabel();
		
	
		
		
		// Boton para mostrar los datos de las peliculas 
		btnMostrar.setBorder(BorderFactory.createLineBorder(Color.black,3));
		
		//Para destinguir las casillas de los datos
		lblGenero1.setBorder(BorderFactory.createLineBorder(Color.black,3));
		lblGenero2.setBorder(BorderFactory.createLineBorder(Color.black,3));
		lblGenero3.setBorder(BorderFactory.createLineBorder(Color.black,3));
		lblGenero4.setBorder(BorderFactory.createLineBorder(Color.black,3));
		lblGenero5.setBorder(BorderFactory.createLineBorder(Color.black,3));
		lblGenero6.setBorder(BorderFactory.createLineBorder(Color.black,3));
		lblGenero7.setBorder(BorderFactory.createLineBorder(Color.black,3));
		lblGenero8.setBorder(BorderFactory.createLineBorder(Color.black,3));
		lblGenero9.setBorder(BorderFactory.createLineBorder(Color.black,3));
		lblGenero10.setBorder(BorderFactory.createLineBorder(Color.black,3));
		lblGenero11.setBorder(BorderFactory.createLineBorder(Color.black,3));
		lblGenero12.setBorder(BorderFactory.createLineBorder(Color.black,3));
		
		
	
		lblDuracion1.setBorder(BorderFactory.createLineBorder(Color.black,3));
		lblDuracion2.setBorder(BorderFactory.createLineBorder(Color.black,3));
		lblDuracion3.setBorder(BorderFactory.createLineBorder(Color.black,3));
		lblDuracion4.setBorder(BorderFactory.createLineBorder(Color.black,3));
		lblDuracion5.setBorder(BorderFactory.createLineBorder(Color.black,3));
		lblDuracion6.setBorder(BorderFactory.createLineBorder(Color.black,3));
		lblDuracion7.setBorder(BorderFactory.createLineBorder(Color.black,3));
		lblDuracion8.setBorder(BorderFactory.createLineBorder(Color.black,3));
		lblDuracion9.setBorder(BorderFactory.createLineBorder(Color.black,3));
		lblDuracion10.setBorder(BorderFactory.createLineBorder(Color.black,3));
		lblDuracion11.setBorder(BorderFactory.createLineBorder(Color.black,3));
		lblDuracion12.setBorder(BorderFactory.createLineBorder(Color.black,3));
		
		
		lblTitulo1.setBorder(BorderFactory.createLineBorder(Color.black,3));
		lblTitulo2.setBorder(BorderFactory.createLineBorder(Color.black,3));
		lblTitulo3.setBorder(BorderFactory.createLineBorder(Color.black,3));
		lblTitulo4.setBorder(BorderFactory.createLineBorder(Color.black,3));
		lblTitulo5.setBorder(BorderFactory.createLineBorder(Color.black,3));
		lblTitulo6.setBorder(BorderFactory.createLineBorder(Color.black,3));
		lblTitulo7.setBorder(BorderFactory.createLineBorder(Color.black,3));
		lblTitulo8.setBorder(BorderFactory.createLineBorder(Color.black,3));
		lblTitulo9.setBorder(BorderFactory.createLineBorder(Color.black,3));
		lblTitulo10.setBorder(BorderFactory.createLineBorder(Color.black,3));
		lblTitulo11.setBorder(BorderFactory.createLineBorder(Color.black,3));
		lblTitulo12.setBorder(BorderFactory.createLineBorder(Color.black,3));
		
		
	
		
		lblGeneral1.setLocation(340,140);
		lblGeneral1.setSize(900,60);
		
		
		
		lblGenero2.setBorder(BorderFactory.createLineBorder(Color.black,3));

		lblDuracion2.setBorder(BorderFactory.createLineBorder(Color.black,3));
		
		
		lblTitulo2.setBorder(BorderFactory.createLineBorder(Color.black,3));
		
		
		
		
		add(btnMostrar,BorderLayout.NORTH);
		add(btnSalir , BorderLayout.SOUTH);
		add(panelPeli,BorderLayout.CENTER);
	
		
		btnMostrar.setBackground(Color.cyan);
		btnMostrar.setForeground(Color.white);
		btnMostrar.setFont(new Font ("Arial", Font.BOLD,18));
		btnMostrar.setBorderPainted(true);
	
		
		panelPeli.add(lblGeneral1);
		panelPeli.add(lblGeneral2);
		panelPeli.add(lblGeneral3);
		
		panelPeli.add (lblGenero1);
		panelPeli.add(lblDuracion1);
		panelPeli.add(lblTitulo1);
	
		
		
		panelPeli.add (lblGenero2);
		panelPeli.add(lblDuracion2);
		panelPeli.add(lblTitulo2);
		
		
		panelPeli.add (lblGenero3);
		panelPeli.add(lblDuracion3);
		panelPeli.add(lblTitulo3);
		
		
		
		panelPeli.add (lblGenero4);
		panelPeli.add(lblDuracion4);
		panelPeli.add(lblTitulo4);
		
		
		panelPeli.add (lblGenero5);
		panelPeli.add(lblDuracion5);
		panelPeli.add(lblTitulo5);
		
		
		panelPeli.add (lblGenero6);
		panelPeli.add(lblDuracion6);
		panelPeli.add(lblTitulo6);
		
		
		panelPeli.add (lblGenero7);
		panelPeli.add(lblDuracion7);
		panelPeli.add(lblTitulo7);
		
		
		panelPeli.add (lblGenero8);
		panelPeli.add(lblDuracion8);
		panelPeli.add(lblTitulo8);
	
		
		panelPeli.add (lblGenero9);
		panelPeli.add(lblDuracion9);
		panelPeli.add(lblTitulo9);
		
		
		panelPeli.add (lblGenero10);	
		panelPeli.add(lblDuracion10);
		panelPeli.add(lblTitulo10);
	
		
		panelPeli.add (lblGenero11);
		panelPeli.add(lblDuracion11);	
		panelPeli.add(lblTitulo11);
		
		
		panelPeli.add (lblGenero12);
		panelPeli.add(lblDuracion12);
		panelPeli.add(lblTitulo12);
		
	
		
		setTitle("Mostrar todos los datos Pelicula");
		setResizable(false);
		setSize(1920,1080);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	
	@Override
/**
* En el actionPerformed hemos añadido la función del boton de mostrar los datos de las películas, para ello usando el código de conexión a la base de datos, además,el uso de diversas etiquetas y distintas consultas han sido indispensables para que los datos se muestren
*/
	public void actionPerformed(ActionEvent e) {
	    if (e.getSource() == btnMostrar) {
	        try {
	            // Conectar el Driver JDBC
	            Class.forName("com.mysql.cj.jdbc.Driver");

	            // variables, cambiar según corresponda
	            final String url = "jdbc:mysql://databasemovieserve.cxugqog8chqr.us-east-1.rds.amazonaws.com:3306/movieserve";
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

	            // Obtener el primer género
	            ResultSet resultSet1 = statement.executeQuery("SELECT Genero FROM peliculas LIMIT 1");
	            if (resultSet1.next()) {
	                String genero1 = resultSet1.getString(1);
	                lblGenero1.setText(genero1);
	            }

	            // Obtener el segundo género
	            ResultSet resultSet2 = statement.executeQuery("SELECT Genero FROM peliculas LIMIT 1 OFFSET 1");
	            if (resultSet2.next()) {
	                String genero2 = resultSet2.getString(1);
	                lblGenero2.setText(genero2);
	            }
	            // Obtener el tercer género
	            ResultSet resultSet3 = statement.executeQuery("SELECT Genero FROM peliculas LIMIT 1 OFFSET 2");
	            if (resultSet3.next()) {
	                String genero3 = resultSet3.getString(1);
	                lblGenero3.setText(genero3);
	            }
	            // Obtener el cuarto género
	            ResultSet resultSet4 = statement.executeQuery("SELECT Genero FROM peliculas LIMIT 1 OFFSET 3");
	            if (resultSet4.next()) {
	                String genero4 = resultSet4.getString(1);
	                lblGenero4.setText(genero4);
	            }
	            // Obtener el quinto género
	            ResultSet resultSet5 = statement.executeQuery("SELECT Genero FROM peliculas LIMIT 1 OFFSET 4");
	            if (resultSet5.next()) {
	                String genero5 = resultSet5.getString(1);
	                lblGenero5.setText(genero5);
	            }
	            // Obtener el sexto género
	            ResultSet resultSet6 = statement.executeQuery("SELECT Genero FROM peliculas LIMIT 1 OFFSET 5");
	            if (resultSet6.next()) {
	                String genero6 = resultSet6.getString(1);
	                lblGenero6.setText(genero6);
	            }
	            // Obtener el séptimo género
	            ResultSet resultSet7 = statement.executeQuery("SELECT Genero FROM peliculas LIMIT 1 OFFSET 6");
	            if (resultSet7.next()) {
	                String genero7 = resultSet7.getString(1);
	                lblGenero7.setText(genero7);
	            }
	            // Obtener el octavo género
	            ResultSet resultSet8 = statement.executeQuery("SELECT Genero FROM peliculas LIMIT 1 OFFSET 7");
	            if (resultSet8.next()) {
	                String genero8 = resultSet8.getString(1);
	                lblGenero8.setText(genero8);
	            }
	            // Obtener el noveno género
	            ResultSet resultSet9 = statement.executeQuery("SELECT Genero FROM peliculas LIMIT 1 OFFSET 8");
	            if (resultSet9.next()) {
	                String genero9 = resultSet9.getString(1);
	                lblGenero9.setText(genero9);
	            }
	            // Obtener el décimo género
	            ResultSet resultSet10 = statement.executeQuery("SELECT Genero FROM peliculas LIMIT 1 OFFSET 9");
	            if (resultSet10.next()) {
	                String genero10 = resultSet10.getString(1);
	                lblGenero10.setText(genero10);
	            }
	            // Obtener el decimoprimero género
	            ResultSet resultSet11 = statement.executeQuery("SELECT Genero FROM peliculas LIMIT 1 OFFSET 10");
	            if (resultSet11.next()) {
	                String genero11 = resultSet11.getString(1);
	                lblGenero11.setText(genero11);
	            }
	            // Obtener el decimosegundo género
	            ResultSet resultSet12 = statement.executeQuery("SELECT Genero FROM peliculas LIMIT 1 OFFSET 11");
	            if (resultSet12.next()) {
	                String genero12 = resultSet12.getString(1);
	                lblGenero12.setText(genero12);
	            }
	           
	            
	            
	            
	            
	            
	            // Obtener el primer duración
	            ResultSet resultSet13 = statement.executeQuery("SELECT Duracion FROM peliculas LIMIT 1");
	            if (resultSet13.next()) {
	                int duracion1 = resultSet13.getInt(1);
	                lblDuracion1.setText(String.valueOf(duracion1));
	            }

	            // Obtener el segundo duración
	            ResultSet resultSet14 = statement.executeQuery("SELECT Duracion FROM peliculas LIMIT 1 OFFSET 1");
	            if (resultSet14.next()) {
	                int duracion2 = resultSet14.getInt(1);
	                lblDuracion2.setText(String.valueOf(duracion2));
	            }
	            // Obtener el tercer duración
	            ResultSet resultSet15 = statement.executeQuery("SELECT Duracion FROM peliculas LIMIT 1 OFFSET 2");
	            if (resultSet15.next()) {
	                int duracion3 = resultSet15.getInt(1);
	                lblDuracion3.setText(String.valueOf(duracion3));
	            }
	            // Obtener el cuarto duración
	            ResultSet resultSet16 = statement.executeQuery("SELECT Duracion FROM peliculas LIMIT 1 OFFSET 3");
	            if (resultSet16.next()) {
	                int duracion4 = resultSet16.getInt(1);
	                lblDuracion4.setText(String.valueOf(duracion4));;
	            }
	            // Obtener el quinto duración
	            ResultSet resultSet17 = statement.executeQuery("SELECT Duracion FROM peliculas LIMIT 1 OFFSET 4");
	            if (resultSet17.next()) {
	                int duracion5 = resultSet17.getInt(1);
	                lblDuracion5.setText(String.valueOf(duracion5));
	            }
	            // Obtener el sexto duración
	            ResultSet resultSet18 = statement.executeQuery("SELECT Duracion FROM peliculas LIMIT 1 OFFSET 5");
	            if (resultSet18.next()) {
	                int duracion6 = resultSet18.getInt(1);
	                lblDuracion6.setText(String.valueOf(duracion6));
	            }
	            // Obtener el séptimo duración
	            ResultSet resultSet19 = statement.executeQuery("SELECT Duracion FROM peliculas LIMIT 1 OFFSET 6");
	            if (resultSet19.next()) {
	                int duracion7 = resultSet19.getInt(1);
	                lblDuracion7.setText(String.valueOf(duracion7));;
	            }
	            // Obtener el octavo duración
	            ResultSet resultSet20 = statement.executeQuery("SELECT Duracion FROM peliculas LIMIT 1 OFFSET 7");
	            if (resultSet20.next()) {
	                int duracion8 = resultSet20.getInt(1);
	                lblDuracion8.setText(String.valueOf(duracion8));;
	            }
	            // Obtener el noveno duración
	            ResultSet resultSet21 = statement.executeQuery("SELECT Duracion FROM peliculas LIMIT 1 OFFSET 8");
	            if (resultSet21.next()) {
	                int duracion9 = resultSet21.getInt(1);
	                lblDuracion9.setText(String.valueOf(duracion9));;
	            }
	            // Obtener el décimo duración
	            ResultSet resultSet22 = statement.executeQuery("SELECT Duracion FROM peliculas LIMIT 1 OFFSET 9");
	            if (resultSet22.next()) {
	                int duracion10 = resultSet22.getInt(1);
	                lblDuracion10.setText(String.valueOf(duracion10));
	            }
	            // Obtener el decimoprimero duración
	            ResultSet resultSet23 = statement.executeQuery("SELECT Duracion FROM peliculas LIMIT 1 OFFSET 10");
	            if (resultSet23.next()) {
	                int duracion11 = resultSet23.getInt(1);
	                lblDuracion11.setText(String.valueOf(duracion11));
	            }
	            // Obtener el decimosegundo duración
	            ResultSet resultSet24 = statement.executeQuery("SELECT Duracion FROM peliculas LIMIT 1 OFFSET 11");
	            if (resultSet24.next()) {
	                int duracion12 = resultSet24.getInt(1);
	                lblDuracion12.setText(String.valueOf(duracion12));
	            }
	            
	            
	
	            // Obtener el primer título
	            ResultSet resultSet25 = statement.executeQuery("SELECT Titulo FROM peliculas LIMIT 1");
	            if (resultSet25.next()) {
	                String titulo1 = resultSet25.getString(1);
	                lblTitulo1.setText(titulo1);
	            }

	            // Obtener el segundo título
	            ResultSet resultSet26 = statement.executeQuery("SELECT Titulo FROM peliculas LIMIT 1 OFFSET 1");
	            if (resultSet26.next()) {
	                String titulo2 = resultSet26.getString(1);
	                lblTitulo2.setText(titulo2);
	            }
	            // Obtener el tercer título
	            ResultSet resultSet27 = statement.executeQuery("SELECT Titulo FROM peliculas LIMIT 1 OFFSET 2");
	            if (resultSet27.next()) {
	                String titulo3 = resultSet27.getString(1);
	                lblTitulo3.setText(titulo3);
	            }
	            // Obtener el cuarto título
	            ResultSet resultSet28 = statement.executeQuery("SELECT Titulo FROM peliculas LIMIT 1 OFFSET 3");
	            if (resultSet28.next()) {
	                String titulo4 = resultSet28.getString(1);
	                lblTitulo4.setText(titulo4);
	            }
	            // Obtener el quinto título
	            ResultSet resultSet29 = statement.executeQuery("SELECT Titulo FROM peliculas LIMIT 1 OFFSET 4");
	            if (resultSet29.next()) {
	                String titulo5 = resultSet29.getString(1);
	                lblTitulo5.setText(titulo5);
	            }
	            // Obtener el sexto título
	            ResultSet resultSet30 = statement.executeQuery("SELECT Titulo FROM peliculas LIMIT 1 OFFSET 5");
	            if (resultSet30.next()) {
	                String titulo6 = resultSet30.getString(1);
	                lblTitulo6.setText(titulo6);
	            }
	            // Obtener el séptimo título
	            ResultSet resultSet31 = statement.executeQuery("SELECT Titulo FROM peliculas LIMIT 1 OFFSET 6");
	            if (resultSet31.next()) {
	                String titulo7 = resultSet31.getString(1);
	                lblTitulo7.setText(titulo7);
	            }
	            // Obtener el octavo título
	            ResultSet resultSet32 = statement.executeQuery("SELECT Titulo FROM peliculas LIMIT 1 OFFSET 7");
	            if (resultSet32.next()) {
	                String titulo8 = resultSet32.getString(1);
	                lblTitulo8.setText(titulo8);
	            }
	            // Obtener el noveno título
	            ResultSet resultSet33 = statement.executeQuery("SELECT Titulo FROM peliculas LIMIT 1 OFFSET 8");
	            if (resultSet33.next()) {
	                String titulo9 = resultSet33.getString(1);
	                lblTitulo9.setText(titulo9);
	            }
	            // Obtener el décimo título
	            ResultSet resultSet34 = statement.executeQuery("SELECT Titulo FROM peliculas LIMIT 1 OFFSET 9");
	            if (resultSet34.next()) {
	                String titulo10 = resultSet34.getString(1);
	                lblTitulo10.setText(titulo10);
	            }
	            // Obtener el decimoprimero título
	            ResultSet resultSet35 = statement.executeQuery("SELECT Titulo FROM peliculas LIMIT 1 OFFSET 10");
	            if (resultSet35.next()) {
	                String titulo11 = resultSet35.getString(1);
	                lblTitulo11.setText(titulo11);
	            }
	            // Obtener el decimosegundo título
	            ResultSet resultSet36 = statement.executeQuery("SELECT Titulo FROM peliculas LIMIT 1 OFFSET 11");
	            if (resultSet36.next()) {
	                String titulo12 = resultSet36.getString(1);
	                lblTitulo12.setText(titulo12);
	            }
	            
	            
	            
	 
	            // Cerrar la conexión JDBC
	            con.close();

	        } catch (Exception ex) {
	            System.out.println("Se ha producido un error. " + ex.getStackTrace());
	        }
	    }
	}
/**
* En el main hemos implementado la visualización de la ventana
*/
	public static void main(String[] args) {
	new SwingPeliculas();	

	}

}
