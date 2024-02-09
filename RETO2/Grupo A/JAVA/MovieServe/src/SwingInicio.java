import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;


/**
* Esta clase llamada SwingInicio, esta basada o tiende de la superclase de Jframe, por otro lado, la interfaz del action listener también esta implementada en el código y al igual que en los otros archivos, la libreria mysql connector está implementada en el proyecto. 
* Si hacemos inacpié en la funcionalidad de la clase, se trata de una ventana gráfica que representa un menú de inicio, en él se muestran 3 botones: uno para salir, otro para que se muestre la ventana llamada MostrarDatosMovieServe y por último, otro para que se muestre la ventana llamada InsertarDatosMovieServe
*/

public class SwingInicio extends JFrame implements ActionListener {
	
	JLabel lblImagen;
	ImageIcon imglogoMovieServe;
	
	JButton btnBotonMostrar;
	JButton btnBotonInsertar;
	JButton btnBotonSalir;
	
	
/**
* En el método constructor llamado igual que la clase, implementamos todas las etiquetas, botones,el logo..., por otro lado, implementamos el título y la 'condición' de que sea visible. 
* Por último hemos de recalcar que el hemos añadido el SetLayout null
*/
	SwingInicio(){

		setLayout(null);
		imglogoMovieServe = new ImageIcon("LogoMovieServe.png");
		lblImagen = new JLabel(imglogoMovieServe);
		
		btnBotonMostrar = new JButton ("Mostrar Datos");
		btnBotonMostrar.addActionListener(this);
		btnBotonInsertar = new JButton ("Insertar Datos");
		btnBotonInsertar.addActionListener(this);
		btnBotonSalir = new JButton ("Salir");
		btnBotonSalir.addActionListener(this);
		
		add(lblImagen);
		lblImagen.setIcon(imglogoMovieServe);
		
		
		add(btnBotonMostrar);
		add(btnBotonInsertar);
		add(btnBotonSalir);
		
		lblImagen.setLocation(540, 10);
		lblImagen.setSize(300,300);
		btnBotonMostrar.setLocation(225,370);
		btnBotonMostrar.setSize(250,60);
		btnBotonInsertar.setLocation(877,370);
		btnBotonInsertar.setSize(250,60);
		btnBotonSalir.setLocation(430,540);
		btnBotonSalir.setSize(500,70);
		
		btnBotonMostrar.setBackground(Color.cyan);
		btnBotonMostrar.setForeground(Color.white);
		btnBotonMostrar.setFont(new Font ("Arial", Font.BOLD,30));
		btnBotonInsertar.setBackground(Color.cyan);
		btnBotonInsertar.setForeground(Color.white);
		btnBotonInsertar.setFont(new Font ("Arial", Font.BOLD,30));
		btnBotonSalir.setBackground(Color.magenta);
		btnBotonSalir.setForeground(Color.white);
		btnBotonSalir.setFont(new Font ("Arial", Font.BOLD,30));
		
		setTitle("Inicio MovieServe");
		setResizable(false);
		setSize(1920,1080);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
/**
* En el actionPerformed hemos añadido las funcionalidades de los distintos botones para que se visualicen distintas ventanas
*/
	@Override
	public void actionPerformed(ActionEvent e) {
		
		// Botones para ir a las pantallas de mostrar datos y insertar datos
		
		if(e.getSource()==btnBotonMostrar)
			new MostrarDatosMovieServe();
		
		if(e.getSource()==btnBotonInsertar)
			new InsertarDatosMovieserve();
		
		if(e.getSource()==btnBotonSalir)
			hide();
		
	}
/**
* En el main hemos implementado la visualización de la ventana
*/
	public static void main(String[] args) {
		new SwingInicio();
	}

}
