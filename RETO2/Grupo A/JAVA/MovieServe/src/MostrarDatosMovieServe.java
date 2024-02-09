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
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;



/**
* Esta clase llamada MostrarDatosMovieServe, esta basada o tiende de la superclase de Jframe, por otro lado, la interfaz del action listener también esta implementada en el código y al igual que en los otros archivos, la libreria mysql connector está implementada en el proyecto.
* Si hacemos inacpié en la funcionalidad de la clase, se trata de una ventana gráfica que representa un menú para ver distintas ventanas con diversas opciones de mostrar datos, se muestran 3 botones: uno para que se visualice una ventana para mostrar todos los datos de los últimos 5 registros; esta ventana se llama SwingMostrar, otro para que se muestre la ventana llamada SwingPeliculas que podemos visualizar en ella diversos datos sobre las películas y por último, otro para que se muestre la ventana llamada SwingSalas, en esta ventana podemos ver datos sobre salas, películas y horario  
*/
public class MostrarDatosMovieServe extends JFrame implements ActionListener {

	//Creacion pantalla para mostrar datos
	JLabel lblImagen;
	ImageIcon imglogoMovieServe;
	
	JButton btnBotonClientes, btnAtras;
	JButton btnBotonSalas, btnBotonSalir;
	JButton btnBotonPeliculas;
	
	
	JPanel panelMostrar;
	
/**
* En el método constructor llamado igual que la clase, implementamos todas las etiquetas, botones...; todo ello en un panel, por otro lado, implementamos el título y la 'condición' de que sea visible. 
* Por último hemos de recalcar que el hemos añadido el SetLayout como un BorderLayout, además, hemos creado un panel estructurado con un GridLayout
*/
	MostrarDatosMovieServe(){
	
		setLayout(new BorderLayout());
		
		imglogoMovieServe = new ImageIcon("LogoMovieServe.png");
		lblImagen = new JLabel(imglogoMovieServe);
		lblImagen.setIcon(imglogoMovieServe);
		panelMostrar = new JPanel();
		panelMostrar.setLayout(new GridLayout(1,1));
		
		btnAtras = new JButton ("Atras");
		btnAtras.addActionListener(this);
		btnBotonSalir = new JButton ("Salir");
		btnBotonSalir.addActionListener(this);
		add(btnBotonSalir);
		add(btnAtras);
		btnBotonSalir.setLocation(1100,150);
		btnBotonSalir.setSize(100,30);
		btnAtras.setLocation(1100,100);
		btnAtras.setSize(100,30);
		
		btnBotonSalir.setBackground(Color.lightGray);
		btnBotonSalir.setForeground(Color.white);
		btnBotonSalir.setFont(new Font ("Arial", Font.ITALIC,18));
		
		btnAtras.setBackground(Color.lightGray);
		btnAtras.setForeground(Color.white);
		btnAtras.setFont(new Font ("Arial", Font.ITALIC,18));
		btnAtras.setBorderPainted(true);

		btnBotonClientes = new JButton ("Mostrar todos los datos de los clientes");
		btnBotonClientes.addActionListener(this);
		btnBotonSalas = new JButton ("Mostrar todos los datos de las salas");
		btnBotonSalas.addActionListener(this);
		btnBotonPeliculas = new JButton ("Mostrar todos los datos de las peliculas a ver");
		btnBotonPeliculas.addActionListener(this);
		
		add(lblImagen,BorderLayout.NORTH);
		add(panelMostrar,BorderLayout.CENTER);
		
		panelMostrar.add(btnBotonClientes);
	
		
		
		panelMostrar.add(btnBotonSalas);
		
		
		
		panelMostrar.add(btnBotonPeliculas);

		
		
		btnBotonClientes.setBackground(Color.cyan);
		btnBotonClientes.setForeground(Color.white);
		btnBotonClientes.setFont(new Font ("Arial", Font.BOLD,18));
		btnBotonClientes.setBorderPainted(true);
		btnBotonClientes.setBorder(BorderFactory.createLineBorder(Color.black,3));
		btnBotonSalas.setBackground(Color.cyan);
		btnBotonSalas.setForeground(Color.white);
		btnBotonSalas.setFont(new Font ("Arial", Font.BOLD,18));
		btnBotonSalas.setBorderPainted(true);
		btnBotonSalas.setBorder(BorderFactory.createLineBorder(Color.black,3));
		btnBotonPeliculas.setBackground(Color.cyan);
		btnBotonPeliculas.setForeground(Color.white);
		btnBotonPeliculas.setFont(new Font ("Arial", Font.BOLD,18));
		btnBotonPeliculas.setBorderPainted(true);
		btnBotonPeliculas.setBorder(BorderFactory.createLineBorder(Color.black,3));
		
		setTitle("Mostrar datos MovieServe");
		setResizable(false);
		setSize(1920,1080);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
/**
* En el actionPerformed hemos añadido las funcionalidades de los distintos botones
*/
	@Override
	public void actionPerformed(ActionEvent e) {
	
		//Botones para ir a los datos clientes, peliculas y salas 
		if(e.getSource()==btnAtras)
  			new SwingInicio();
		if(e.getSource()==btnBotonSalir)
			hide();
		if(e.getSource()== btnBotonClientes)
			new SwingMostrar();
		if(e.getSource()==btnBotonSalas)
			new SwingSalas();
		if(e.getSource()==btnBotonPeliculas)
			new SwingPeliculas();
	
	}
/**
* En el main hemos implementado la visualización de la ventana
*/
	public static void main(String[] args) throws Exception {
		
		new MostrarDatosMovieServe();
	}

}
