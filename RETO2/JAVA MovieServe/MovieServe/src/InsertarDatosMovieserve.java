import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class InsertarDatosMovieserve extends JFrame implements ActionListener {

	
	JLabel lblImagen;
	ImageIcon imglogoMovieServe;
	JButton btnBotonInsertar , btnBajar, btnSubir, btnAtras, btnBotonSalir;
	
	JLabel lblTelefono,lblNombre,lblApellido,lblDNI,lblGmail,lblCantidadAsientos,lblFecha;
	JTextField txtTelefono,txtNombre,txtApellido,txtDNI,txtGmail,txtCantidadAsientos,txtFecha;
	JComboBox cboPelis;
	String peliculas[] = {"El regreso de Jaava","La BakQ perdida","Las Aventuras de Inti: El duende de Garbera","Tamayo:El escape","Programación eterna","El gasto","Asesinato en la máquina virtual","El Break","La ley prohibida","El arte de la doma clásica","El Wuekii","El trén de vuelta"};
	
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
		lblGmail = new JLabel ("Gmail");
		lblCantidadAsientos = new JLabel ("NºASIENTOS");
		
		txtTelefono = new JTextField ();
		txtNombre = new JTextField ();
		txtApellido = new JTextField ();
		txtDNI = new JTextField ();
		txtGmail = new JTextField ();
		txtCantidadAsientos = new JTextField ("0");
	
		
		add(lblImagen);
		lblImagen.setIcon(imglogoMovieServe);
		add(btnBotonInsertar);
		add(cboPelis);
		add(lblTelefono);
		add(lblNombre);
		add(lblApellido);
		add(lblDNI);
		add(lblGmail);
		add(lblCantidadAsientos);
		
		add(txtTelefono);
		add(txtNombre);
		add(txtApellido);
		add(txtDNI);
		add(txtGmail);
		add(txtCantidadAsientos);
		
		add(btnSubir);
		add(btnBajar);
		add(btnAtras);
		
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
		
		btnSubir.setLocation(620,690);
		btnSubir.setSize(50,30);
		
		btnBajar.setLocation(370,690);
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
		
		lblGmail.setLocation(655,500);
		lblGmail.setSize(100,30);
		lblGmail.setFont(new Font ("Arial", Font.BOLD,21));
		
		lblCantidadAsientos.setLocation(225,660);
		lblCantidadAsientos.setSize(700,100);
		lblCantidadAsientos.setFont(new Font ("Arial", Font.BOLD,21));
		
	
		txtTelefono.setSize(100,30);
		txtTelefono.setFont(new Font ("Arial", Font.ITALIC,19));
		txtTelefono.setBounds(270,390,150,30);
		
		
		txtNombre.setSize(100,30);
		txtNombre.setFont(new Font ("Arial", Font.ITALIC,19));
		txtNombre.setBounds(660,390,150,30);
	
	
		txtApellido.setSize(100,30);
		txtApellido.setFont(new Font ("Arial", Font.ITALIC,19));
		txtApellido.setBounds(1070,390,150,30);


		txtDNI.setSize(100,30);
		txtDNI.setFont(new Font ("Arial", Font.ITALIC,19));
		txtDNI.setBounds(285,540,150,30);


		txtGmail.setSize(100,30);
		txtGmail.setFont(new Font ("Arial", Font.ITALIC,19));
		txtGmail.setBounds(660,540,150,30);

	
		txtCantidadAsientos.setSize(400,40);
		txtCantidadAsientos.setFont(new Font ("Arial", Font.ITALIC,19));
		txtCantidadAsientos.setBounds(450,690,150,30);
	
		
		
		setTitle("Insertar datos MovieServe");
		setResizable(false);
		setSize(1920,1080);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	@Override
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
	  }


	public static void main(String[] args) {
		
		new InsertarDatosMovieserve();
	}

}
