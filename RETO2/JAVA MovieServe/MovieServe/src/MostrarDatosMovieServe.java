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



public class MostrarDatosMovieServe extends JFrame implements ActionListener {

	JLabel lblImagen;
	ImageIcon imglogoMovieServe;
	
	JButton btnBotonClientes, btnAtras;
	JButton btnBotonSalas, btnBotonSalir;
	JButton btnBotonPeliculas;
	
	
	JPanel panelMostrar;
	
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
	@Override
	public void actionPerformed(ActionEvent e) {
	
		if(e.getSource()==btnAtras)
  			new SwingInicio();
		if(e.getSource()==btnBotonSalir)
			hide();
		if(e.getSource()== btnBotonClientes)
			new SwingMostrar();
	}

	public static void main(String[] args) throws Exception {
		
		new MostrarDatosMovieServe();
	}

}
