import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class SwingPeliculas extends JFrame implements ActionListener {
	JLabel lblGeneral1,lblGeneral2,lblGeneral3,lblGeneral4;
	
	JLabel lblGenero1, lblGenero2, lblGenero3, lblGenero4,lblGenero5, lblGenero6, lblGenero7, lblGenero8, lblGenero9,lblGenero10,lblGenero11,lblGenero12;
	JLabel lblDuracion1 , lblDuracion2, lblDuracion3, lblDuracion4, lblDuracion5, lblDuracion6 , lblDuracion7, lblDuracion8, lblDuracion9, lblDuracion10, lblDuracion11, lblDuracion12;
	JLabel lblTitulo1, lblTitulo2, lblTitulo3, lblTitulo4,lblTitulo5, lblTitulo6, lblTitulo7, lblTitulo8, lblTitulo9,lblTitulo10 , lblTitulo11,lblTitulo12 ;
	JLabel lblAsientos1,lblAsientos2,lblAsientos3,lblAsientos4,lblAsientos5, lblAsientos6,lblAsientos7,lblAsientos8,lblAsientos9,lblAsientos10,lblAsientos11,lblAsientos12;
	
	JButton btnMostrar ;
	
	JPanel panelPeli;
	SwingPeliculas(){
		setLayout(new BorderLayout());
		
		panelPeli = new JPanel ();
		panelPeli.setLayout(new GridLayout(14,4));
		
		btnMostrar = new JButton ("Mostrar");
		btnMostrar.addActionListener(this);
		
		
		lblGeneral1 = new JLabel("Genero");
		lblGeneral2 = new JLabel("Duracion");
		lblGeneral3 = new JLabel("Titulo");
		lblGeneral4 = new JLabel("Asientos disponible");
	
	
	
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
		
		lblAsientos1 = new JLabel();
		lblAsientos2 = new JLabel();
		lblAsientos3 = new JLabel();
		lblAsientos4 = new JLabel();
		lblAsientos5 = new JLabel();
		lblAsientos6 = new JLabel();
		lblAsientos7 = new JLabel();
		lblAsientos8 = new JLabel();
		lblAsientos9 = new JLabel();
		lblAsientos10 = new JLabel();
		lblAsientos11 = new JLabel();
		lblAsientos12 = new JLabel();
		
		
		
		btnMostrar.setBorder(BorderFactory.createLineBorder(Color.black,3));
		
		
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
		
		
		lblAsientos1.setBorder(BorderFactory.createLineBorder(Color.black,3));
		lblAsientos2.setBorder(BorderFactory.createLineBorder(Color.black,3));
		lblAsientos3.setBorder(BorderFactory.createLineBorder(Color.black,3));
		lblAsientos4.setBorder(BorderFactory.createLineBorder(Color.black,3));
		lblAsientos5.setBorder(BorderFactory.createLineBorder(Color.black,3));
		lblAsientos6.setBorder(BorderFactory.createLineBorder(Color.black,3));
		lblAsientos7.setBorder(BorderFactory.createLineBorder(Color.black,3));
		lblAsientos8.setBorder(BorderFactory.createLineBorder(Color.black,3));
		lblAsientos9.setBorder(BorderFactory.createLineBorder(Color.black,3));
		lblAsientos10.setBorder(BorderFactory.createLineBorder(Color.black,3));
		lblAsientos11.setBorder(BorderFactory.createLineBorder(Color.black,3));
		lblAsientos12.setBorder(BorderFactory.createLineBorder(Color.black,3));

		
	
		
		lblGeneral1.setLocation(340,140);
		lblGeneral1.setSize(900,60);
		
		
		
		lblGenero2.setBorder(BorderFactory.createLineBorder(Color.black,3));

		lblDuracion2.setBorder(BorderFactory.createLineBorder(Color.black,3));
		
		
		lblTitulo2.setBorder(BorderFactory.createLineBorder(Color.black,3));
		
		
		
		lblAsientos2.setBorder(BorderFactory.createLineBorder(Color.black,3));
		
		add(btnMostrar,BorderLayout.NORTH);
		add(panelPeli,BorderLayout.CENTER);
	
	
		
		panelPeli.add(lblGeneral1);
		panelPeli.add(lblGeneral2);
		panelPeli.add(lblGeneral3);
		panelPeli.add(lblGeneral4);
		
		
		panelPeli.add (lblGenero1);
		panelPeli.add(lblDuracion1);
		panelPeli.add(lblTitulo1);
		panelPeli.add(lblAsientos1);
		
		
		panelPeli.add (lblGenero2);
		panelPeli.add(lblDuracion2);
		panelPeli.add(lblTitulo2);
		panelPeli.add(lblAsientos2);
		
		panelPeli.add (lblGenero3);
		panelPeli.add(lblDuracion3);
		panelPeli.add(lblTitulo3);
		panelPeli.add(lblAsientos3);
		
		
		panelPeli.add (lblGenero4);
		panelPeli.add(lblDuracion4);
		panelPeli.add(lblTitulo4);
		panelPeli.add(lblAsientos4);
		
		panelPeli.add (lblGenero5);
		panelPeli.add(lblDuracion5);
		panelPeli.add(lblTitulo5);
		panelPeli.add(lblAsientos5);
		
		panelPeli.add (lblGenero6);
		panelPeli.add(lblDuracion6);
		panelPeli.add(lblTitulo6);
		panelPeli.add(lblAsientos6);
		
		panelPeli.add (lblGenero7);
		panelPeli.add(lblDuracion7);
		panelPeli.add(lblTitulo7);
		panelPeli.add(lblAsientos7);
		
		panelPeli.add (lblGenero8);
		panelPeli.add(lblDuracion8);
		panelPeli.add(lblTitulo8);
		panelPeli.add(lblAsientos8);
		
		panelPeli.add (lblGenero9);
		panelPeli.add(lblDuracion9);
		panelPeli.add(lblTitulo9);
		panelPeli.add(lblAsientos9);
		
		panelPeli.add (lblGenero10);	
		panelPeli.add(lblDuracion10);
		panelPeli.add(lblTitulo10);
		panelPeli.add(lblAsientos10);
		
		panelPeli.add (lblGenero11);
		panelPeli.add(lblDuracion11);	
		panelPeli.add(lblTitulo11);
		panelPeli.add(lblAsientos11);
		
		panelPeli.add (lblGenero12);
		panelPeli.add(lblDuracion12);
		panelPeli.add(lblTitulo12);
		panelPeli.add(lblAsientos12);
	
		
		setTitle("Mostrar todos los datos Pelicula");
		setResizable(false);
		setSize(1920,1080);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		

	}

	public static void main(String[] args) {
	new SwingPeliculas();	

	}

}
