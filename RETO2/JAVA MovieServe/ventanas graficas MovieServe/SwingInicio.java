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

public class SwingInicio extends JFrame implements ActionListener {
	
	JLabel lblImagen;
	ImageIcon imglogoMovieServe;
	
	JButton btnBotonMostrar;
	JButton btnBotonInsertar;
	JButton btnBotonSalir;
	
	
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
	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource()==btnBotonMostrar)
			new MostrarDatosMovieServe();
		
		if(e.getSource()==btnBotonInsertar)
			new InsertarDatosMovieserve();
		
		if(e.getSource()==btnBotonSalir)
			hide();
		
	}

	public static void main(String[] args) {
		new SwingInicio();

	}

}
