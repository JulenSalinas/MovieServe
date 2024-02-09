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

/**
* Esta clase llamada SwingSalas, esta basada o tiende de la superclase de Jframe, por otro lado, la interfaz del action listener también esta implementada en el código y al igual que en los otros archivos, la libreria mysql connector está implementada en el proyecto. 
* Si hacemos inacpié en la funcionalidad de la clase, se trata de una ventana donde se muestra los datos de las salas, que peliculas se verán en ellas y el horario
*/
public class SwingSalas extends JFrame implements ActionListener {
	JLabel lblEncabezado1,lblEncabezado2,lblEncabezado3;
	JLabel lblSala1,lblSala2,lblSala3,lblSala4,lblSala5,lblSala6,lblSala7,lblSala8,lblSala9,lblSala10,lblSala11,lblSala12;
	JLabel lblPeli1,lblPeli2,lblPeli3,lblPeli4,lblPeli5,lblPeli6,lblPeli7,lblPeli8,lblPeli9,lblPeli10,lblPeli11,lblPeli12;
	JButton btnMostrar;
	//Las horas no son un registro de la base de datos, las horas están especificadas en la página de reservas
	JLabel  lblHora1,lblHora2,lblHora3,lblHora4,lblHora5,lblHora6,lblHora7,lblHora8,lblHora9,lblHora10,lblHora11,lblHora12;

	JPanel panelSalas;
	
	
/**
* En el método constructor llamado igual que la clase, implementamos todas las etiquetas, botones; todo ello en un panel, por otro lado, implementamos el título y la 'condición' de que sea visible. 
* Por último hemos de recalcar que el hemos añadido el SetLayout como un BorderLayout, además, hemos creado un panel estructurado con un GridLayout
*/
	SwingSalas(){
		setLayout(new BorderLayout());
		
		panelSalas = new JPanel ();
		panelSalas.setLayout(new GridLayout(13,3));
		
		lblEncabezado1 = new JLabel("Nº De sala");
		lblEncabezado2 = new JLabel("Título de la Película");
		lblEncabezado3 = new JLabel("Horario");	
		btnMostrar = new JButton ("Mostrar");
		btnMostrar.addActionListener(this);
		lblSala1 = new JLabel();
		lblSala2 = new JLabel();
		lblSala3 = new JLabel();
		lblSala4 = new JLabel();
		lblSala5 = new JLabel();
		lblSala6 = new JLabel();
		lblSala7 = new JLabel();
		lblSala8 = new JLabel();
		lblSala9 = new JLabel();
		lblSala10 = new JLabel();
		lblSala11 = new JLabel();
		lblSala12 = new JLabel();
		
		lblPeli1 = new JLabel();
		lblPeli2 = new JLabel();
		lblPeli3 = new JLabel();
		lblPeli4 = new JLabel();
		lblPeli5 = new JLabel();
		lblPeli6 = new JLabel();
		lblPeli7 = new JLabel();
		lblPeli8 = new JLabel();
		lblPeli9 = new JLabel();
		lblPeli10 = new JLabel();
		lblPeli11 = new JLabel();
		lblPeli12 = new JLabel();
		
		lblHora1 = new JLabel("14:00");
		lblHora2 = new JLabel("14:00");
		lblHora3 = new JLabel("15:30");
		lblHora4 = new JLabel("15:30");
		lblHora5 = new JLabel("17:00");
		lblHora6 = new JLabel("17:00");
		lblHora7 = new JLabel("18:30");
		lblHora8 = new JLabel("18:30");
		lblHora9 = new JLabel("20:00");
		lblHora10 = new JLabel("20:00");
		lblHora11 = new JLabel("21:30");
		lblHora12 = new JLabel("21:30");
	
		
		

		lblSala1.setBorder(BorderFactory.createLineBorder(Color.black,3));
		lblSala2.setBorder(BorderFactory.createLineBorder(Color.black,3));
		lblSala3.setBorder(BorderFactory.createLineBorder(Color.black,3));
		lblSala4.setBorder(BorderFactory.createLineBorder(Color.black,3));
		lblSala5.setBorder(BorderFactory.createLineBorder(Color.black,3));
		lblSala6.setBorder(BorderFactory.createLineBorder(Color.black,3));
		lblSala7.setBorder(BorderFactory.createLineBorder(Color.black,3));
		lblSala8.setBorder(BorderFactory.createLineBorder(Color.black,3));
		lblSala9.setBorder(BorderFactory.createLineBorder(Color.black,3));
		lblSala10.setBorder(BorderFactory.createLineBorder(Color.black,3));
		lblSala11.setBorder(BorderFactory.createLineBorder(Color.black,3));
		lblSala12.setBorder(BorderFactory.createLineBorder(Color.black,3));
		lblPeli1.setBorder(BorderFactory.createLineBorder(Color.black,3));
		lblPeli2.setBorder(BorderFactory.createLineBorder(Color.black,3));
		lblPeli3.setBorder(BorderFactory.createLineBorder(Color.black,3));
		lblPeli4.setBorder(BorderFactory.createLineBorder(Color.black,3));
		lblPeli5.setBorder(BorderFactory.createLineBorder(Color.black,3));
		lblPeli6.setBorder(BorderFactory.createLineBorder(Color.black,3));
		lblPeli7.setBorder(BorderFactory.createLineBorder(Color.black,3));
		lblPeli8.setBorder(BorderFactory.createLineBorder(Color.black,3));
		lblPeli9.setBorder(BorderFactory.createLineBorder(Color.black,3));
		lblPeli10.setBorder(BorderFactory.createLineBorder(Color.black,3));
		lblPeli11.setBorder(BorderFactory.createLineBorder(Color.black,3));
		lblPeli12.setBorder(BorderFactory.createLineBorder(Color.black,3));
		lblHora1.setBorder(BorderFactory.createLineBorder(Color.black,3));
		lblHora2.setBorder(BorderFactory.createLineBorder(Color.black,3));
		lblHora3.setBorder(BorderFactory.createLineBorder(Color.black,3));
		lblHora4.setBorder(BorderFactory.createLineBorder(Color.black,3));
		lblHora5.setBorder(BorderFactory.createLineBorder(Color.black,3));
		lblHora6.setBorder(BorderFactory.createLineBorder(Color.black,3));
		lblHora7.setBorder(BorderFactory.createLineBorder(Color.black,3));
		lblHora8.setBorder(BorderFactory.createLineBorder(Color.black,3));
		lblHora9.setBorder(BorderFactory.createLineBorder(Color.black,3));
		lblHora10.setBorder(BorderFactory.createLineBorder(Color.black,3));
		lblHora11.setBorder(BorderFactory.createLineBorder(Color.black,3));
		lblHora12.setBorder(BorderFactory.createLineBorder(Color.black,3));
		
		
		
		btnMostrar.setBackground(Color.cyan);
		btnMostrar.setForeground(Color.white);
		btnMostrar.setFont(new Font ("Arial", Font.BOLD,18));
		btnMostrar.setBorderPainted(true);
		
		add(btnMostrar,BorderLayout.NORTH);
		add(panelSalas,BorderLayout.CENTER);
		
		panelSalas.add(lblEncabezado1);
		panelSalas.add(lblEncabezado2);
		panelSalas.add(lblEncabezado3);
		
		panelSalas.add(lblSala1);
		panelSalas.add(lblPeli1);
		panelSalas.add(lblHora1);

		panelSalas.add(lblSala2);
		panelSalas.add(lblPeli2);
		panelSalas.add(lblHora2);
		
		panelSalas.add(lblSala3);
		panelSalas.add(lblPeli3);
		panelSalas.add(lblHora3);
		
		panelSalas.add(lblSala4);
		panelSalas.add(lblPeli4);
		panelSalas.add(lblHora4);
		
		panelSalas.add(lblSala5);
		panelSalas.add(lblPeli5);
		panelSalas.add(lblHora5);
		
		panelSalas.add(lblSala6);
		panelSalas.add(lblPeli6);
		panelSalas.add(lblHora6);
		
		panelSalas.add(lblSala6);
		panelSalas.add(lblPeli6);
		panelSalas.add(lblHora6);
		
		panelSalas.add(lblSala7);
		panelSalas.add(lblPeli7);
		panelSalas.add(lblHora7);
		
		panelSalas.add(lblSala8);
		panelSalas.add(lblPeli8);
		panelSalas.add(lblHora8);
		
		panelSalas.add(lblSala9);
		panelSalas.add(lblPeli9);
		panelSalas.add(lblHora9);
		
		panelSalas.add(lblSala10);
		panelSalas.add(lblPeli10);
		panelSalas.add(lblHora10);
		
		panelSalas.add(lblSala11);
		panelSalas.add(lblPeli11);
		panelSalas.add(lblHora11);
		
		panelSalas.add(lblSala12);
		panelSalas.add(lblPeli12);
		panelSalas.add(lblHora12);
		
		
		
		setTitle("Insertar datos MovieServe");
		setResizable(false);
		setSize(1920,1080);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	@Override
/**
* En el actionPerformed hemos añadido la función del boton de mostrar los datos de las salas, para ello usando el código de conexión a la base de datos, además,el uso de diversas etiquetas y distintas consultas han sido indispensables para que los datos se muestren
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

		            // Obtener la primera sala
		            ResultSet resultSet1 = statement.executeQuery("SELECT idSala FROM salas where idSala = 1");
		            if (resultSet1.next()) {
		                int sala1 = resultSet1.getInt(1);
		                lblSala1.setText(String.valueOf(sala1));
		            }
		            // Obtener la segunda sala
		            ResultSet resultSet2 = statement.executeQuery("SELECT idSala FROM salas where idSala = 2");
		            if (resultSet2.next()) {
		                int sala2 = resultSet2.getInt(1);
		                lblSala2.setText(String.valueOf(sala2));
		            }
		            // Obtener la tercera sala
		            ResultSet resultSet3 = statement.executeQuery("SELECT idSala FROM salas where idSala = 3");
		            if (resultSet3.next()) {
		                String sala3 = resultSet3.getString(1);
		                lblSala3.setText(String.valueOf(sala3));
		            }
		            // Obtener la cuarta sala
		            ResultSet resultSet4 = statement.executeQuery("SELECT idSala FROM salas where idSala = 4");
		            if (resultSet4.next()) {
		                String sala4 = resultSet4.getString(1);
		                lblSala4.setText(String.valueOf(sala4));
		            }
		            // Obtener la quinta sala
		            ResultSet resultSet5 = statement.executeQuery("SELECT idSala FROM salas where idSala = 5");
		            if (resultSet5.next()) {
		                String sala5 = resultSet5.getString(1);
		                lblSala5.setText(String.valueOf(sala5));
		            }
		            // Obtener la sexta sala
		            ResultSet resultSet6 = statement.executeQuery("SELECT idSala FROM salas where idSala = 6");
		            if (resultSet6.next()) {
		                String sala6 = resultSet6.getString(1);
		                lblSala6.setText(String.valueOf(sala6));
		            }
		            // Obtener la séptima sala
		            ResultSet resultSet7 = statement.executeQuery("SELECT idSala FROM salas where idSala = 7");
		            if (resultSet7.next()) {
		                String sala7 = resultSet7.getString(1);
		                lblSala7.setText(String.valueOf(sala7));
		            }
		            // Obtener la octava sala
		            ResultSet resultSet8 = statement.executeQuery("SELECT idSala FROM salas where idSala = 8");
		            if (resultSet8.next()) {
		                String sala8 = resultSet8.getString(1);
		                lblSala8.setText(String.valueOf(sala8));
		            }
		            // Obtener la novena sala
		            ResultSet resultSet9 = statement.executeQuery("SELECT idSala FROM salas where idSala = 1");
		            if (resultSet9.next()) {
		                String sala9 = resultSet9.getString(1);
		                lblSala9.setText(String.valueOf(sala9));
		            }
		            // Obtener la cuarta sala
		            ResultSet resultSet10 = statement.executeQuery("SELECT idSala FROM salas where idSala = 2");
		            if (resultSet10.next()) {
		                String sala10 = resultSet10.getString(1);
		                lblSala10.setText(String.valueOf(sala10));
		            }
		            // Obtener la cuarta sala
		            ResultSet resultSet11 = statement.executeQuery("SELECT idSala FROM salas where idSala = 3");
		            if (resultSet11.next()) {
		                String sala11 = resultSet11.getString(1);
		                lblSala11.setText(String.valueOf(sala11));
		            }
		            // Obtener la cuarta sala
		            ResultSet resultSet12 = statement.executeQuery("SELECT idSala FROM salas where idSala = 4");
		            if (resultSet12.next()) {
		                String sala12 = resultSet12.getString(1);
		                lblSala12.setText(String.valueOf(sala12));
		            }
		            
		            
		            // Obtener el primer título
		            ResultSet resultSet25 = statement.executeQuery("SELECT Titulo FROM peliculas LIMIT 1");
		            if (resultSet25.next()) {
		                String titulo1 = resultSet25.getString(1);
		                lblPeli1.setText(titulo1);
		            }

		            // Obtener el segundo título
		            ResultSet resultSet26 = statement.executeQuery("SELECT Titulo FROM peliculas LIMIT 1 OFFSET 1");
		            if (resultSet26.next()) {
		                String titulo2 = resultSet26.getString(1);
		                lblPeli2.setText(titulo2);
		            }
		            // Obtener el tercer título
		            ResultSet resultSet27 = statement.executeQuery("SELECT Titulo FROM peliculas LIMIT 1 OFFSET 2");
		            if (resultSet27.next()) {
		                String titulo3 = resultSet27.getString(1);
		                lblPeli3.setText(titulo3);
		            }
		            // Obtener el cuarto título
		            ResultSet resultSet28 = statement.executeQuery("SELECT Titulo FROM peliculas LIMIT 1 OFFSET 3");
		            if (resultSet28.next()) {
		                String titulo4 = resultSet28.getString(1);
		                lblPeli4.setText(titulo4);
		            }
		            // Obtener el quinto título
		            ResultSet resultSet29 = statement.executeQuery("SELECT Titulo FROM peliculas LIMIT 1 OFFSET 4");
		            if (resultSet29.next()) {
		                String titulo5 = resultSet29.getString(1);
		                lblPeli5.setText(titulo5);
		            }
		            // Obtener el sexto título
		            ResultSet resultSet30 = statement.executeQuery("SELECT Titulo FROM peliculas LIMIT 1 OFFSET 5");
		            if (resultSet30.next()) {
		                String titulo6 = resultSet30.getString(1);
		                lblPeli6.setText(titulo6);
		            }
		            // Obtener el séptimo título
		            ResultSet resultSet31 = statement.executeQuery("SELECT Titulo FROM peliculas LIMIT 1 OFFSET 6");
		            if (resultSet31.next()) {
		                String titulo7 = resultSet31.getString(1);
		                lblPeli7.setText(titulo7);
		            }
		            // Obtener el octavo título
		            ResultSet resultSet32 = statement.executeQuery("SELECT Titulo FROM peliculas LIMIT 1 OFFSET 7");
		            if (resultSet32.next()) {
		                String titulo8 = resultSet32.getString(1);
		                lblPeli8.setText(titulo8);
		            }
		            // Obtener el noveno título
		            ResultSet resultSet33 = statement.executeQuery("SELECT Titulo FROM peliculas LIMIT 1 OFFSET 8");
		            if (resultSet33.next()) {
		                String titulo9 = resultSet33.getString(1);
		                lblPeli9.setText(titulo9);
		            }
		            // Obtener el décimo título
		            ResultSet resultSet34 = statement.executeQuery("SELECT Titulo FROM peliculas LIMIT 1 OFFSET 9");
		            if (resultSet34.next()) {
		                String titulo10 = resultSet34.getString(1);
		                lblPeli10.setText(titulo10);
		            }
		            // Obtener el decimoprimero título
		            ResultSet resultSet35 = statement.executeQuery("SELECT Titulo FROM peliculas LIMIT 1 OFFSET 10");
		            if (resultSet35.next()) {
		                String titulo11 = resultSet35.getString(1);
		                lblPeli11.setText(titulo11);
		            }
		            // Obtener el decimosegundo título
		            ResultSet resultSet36 = statement.executeQuery("SELECT Titulo FROM peliculas LIMIT 1 OFFSET 11");
		            if (resultSet36.next()) {
		                String titulo12 = resultSet36.getString(1);
		                lblPeli12.setText(titulo12);
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
		
		new SwingSalas();

	}

}
