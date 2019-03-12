import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Calculadora extends JFrame{  // la clase debe extender de JFrame
	
	
	public JLabel jl1,jl2,resul,logo;
	public JTextField campo1,campo2;
	public JButton sumar,restar,multi,divi,raiz2,raiz3;
	
	/***********************************************************************************/
	
	
	/*Diseño de ventana*/
	public Calculadora() { // Constructor
		super("Calculadora"); // Nombre de la ventana, Calculadora en este caso
		this.setBounds(200,200,640,600); // Medidas posicion x e y en ventana y tamaño 400x400
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		/*Con el metodo setDefaultCloseOperation cambiamos el comportamiento del cierre
		 * de la ventana. En este caso salir al cerrar*/
		
		/*Añado un icono previamente descargado y metido en el proyecto.*/
		setIconImage(Toolkit.getDefaultToolkit().getImage("icono.png"));
		
		this.setLayout(null);
		/*Desconecto el gestor de contenido poniendolo a null*/
		
		
		
		/********Añadir fondo de la calculadora.******************************************/
		getContentPane().setBackground(new Color(227, 243, 238));
		
		/*LOGOTIPO*/
		Image img= new ImageIcon("casio.png").getImage();
		logo= new JLabel(new ImageIcon(img.getScaledInstance(180, 80,Image.SCALE_SMOOTH)));
		logo.setBounds(230,45,180,80);
		add(logo);
		
		/*Diseño de botones*/
		/************JLabel***********************************************************************/
		jl1  = new JLabel("1º numero"); /*Creo el objeto jl1 que sera el texto 1º numero*/
		jl1.setBounds(100, 150, 128, 16);/*Doy medidas y posicion al objeto jl1*/
		jl1.setToolTipText("Valor entero");/*Pongo una ventana emergente recordando que es entero */
		jl1.setFont(new Font("Dialog",Font.ITALIC,20));// Añado un tipo de letra al Jlabel
		jl1.setForeground(new Color(0,109,240));// Cambio el color del texto de JLabel.
		this.add(jl1);/*Añado jl1 a la ventana.*/
		
		jl2 = new JLabel("2º numero");/*Creo el objeto jl2 que sera el texto 2º numero*/
		jl2.setBounds(100, 200, 128, 16);/*Doy medidas y posicion al objeto jl2*/
		jl2.setToolTipText("Valor entero");/*Pongo una ventana emergente recordando que es entero */
		jl2.setFont(new Font("Dialog",Font.ITALIC,20));// Añado un tipo de letra al Jlabel
		jl2.setForeground(new Color(0,109,240));// Cambio el color del texto de JLabel.
		this.add(jl2);/*Añado jl2 a la ventana.*/
		
		/************Campos de texto JTexField*****************************************************/
		campo1 = new JTextField(); /*Creo el objeto campo1 que sera donde metemos el 1º numero*/
		campo1.setBounds(240, 150, 150, 35);/*Doy medias y posicion al objeto campo1*/
		campo1.setBorder(null);// Quito el borde a la caja.
		campo1.setForeground(new Color(0,109,240));// Añado un color a lo que escribimos dentro de la caja
		campo1.setFont(new Font("Dialog",Font.ITALIC,20));// Añado un tipo de letra al contenido de la caja
		this.add(campo1);/*Añado el objeto campo1 a la ventana.*/
		campo1.requestFocus();
		//campo1.requestFocus(); 
		//El foco tengo que añadirlo dentro de Action listener?
	
		
		campo2 = new JTextField();/*Creo el objeto campo1 que sera donde metemos el 2º numero*/
		campo2.setBounds(240, 200, 150, 35);/*Doy medias y posicion al objeto campo2*/
		campo2.setBorder(null);// Quito el borde a la caja.
		campo2.setForeground(new Color(0,109,240));// Añado un color a lo que escribimos dentro de la caja
		campo2.setFont(new Font("Dialog",Font.ITALIC,20));// Añado un tipo de letra al contenido de la caja
		this.add(campo2);/*Añado el objeto campo1 a la ventana.*/
		
		/*****************Botones JButton**********************************************************/
		sumar = new JButton(new ImageIcon("sumar.png"));/*Creo el objeto sumar que sera el boton Sumar*/
		/*Dentro del JButton creo un objeto icono, con el icono dentro.*/
		sumar.setBackground(Color.WHITE);// Le doy el color blanco al fondo del boton.
		sumar.setBounds(100,250,120,60);/*Le doy posicion y medidas al objeto sumar*/
		this.add(sumar);/*Añado el boton sumar a la ventana*/
		
		this.setVisible(true);/*Hago la ventana visible, en ultimo lugar.*/
		
		
		/*Pongo a la escucha el objeto y a la vez implemento el metodo ActionListener*/
		sumar.addActionListener(new ActionListener() {
			/*Añado el escuchador al boton e implemento ActionPerformed con la operacion
			 * que el boton tiene que hacer.*/
			

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				int v1=Integer.parseInt(campo1.getText());
				int v2=Integer.parseInt(campo2.getText());
				int suma = v1+v2;
				resul.setText(String.valueOf(suma));
				/*Introduzco en dos variables v1 y v2 el valor de los campos donde
				 * ponemos los numeros y los paso a int para poder sumar y obterner 
				 * el resultado*/
			}
		});
	
		restar = new JButton(new ImageIcon("restar.png"));/*Creo el objeto restar que sera el boton Restar*/
		/*Dentro del JButton creo un objeto icono, con el icono dentro.*/
		
		restar.setBounds(250,250,120,60);/*Le doy posicion y medidas al objeto Restar*/
		restar.setBackground(Color.WHITE);// Le doy el color blanco al fondo del boton.
		this.add(restar);/*Añado el boton sumar a la ventana*/
		/*Pongo a la escucha el objeto y a la vez implemento el metodo ActionListener*/
		restar.addActionListener(new ActionListener() {
			/*Añado el escuchador al boton e implemento ActionPerformed con la operacion
			 * que el boton tiene que hacer.*/
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				int v1=Integer.parseInt(campo1.getText());
				int v2=Integer.parseInt(campo2.getText());
				int resta = v1-v2;
				resul.setText(String.valueOf(resta));
				/*Introduzco en dos variables v1 y v2 el valor de los campos donde
				 * ponemos los numeros y los paso a int para poder sumar y obterner 
				 * el resultado. En este caso restar el contenido de las variables.*/
			}
		});
		
		multi = new JButton(new ImageIcon("multi.png"));/*Creo el objeto multi que sera el boton Multiplicar*/
		/*Dentro del JButton creo un objeto icono, con el icono dentro.*/
		
		multi.setBounds(100,350,120,60);/*Le doy posicion y medidas al objeto Multiplicar*/
		this.add(multi);/*Añado el boton Multiplicar  a la ventana*/
		multi.setBackground(Color.WHITE);// Le doy el color blanco al fondo del boton.
		/*Pongo a la escucha el objeto y a la vez implemento el metodo ActionListener*/
		multi.addActionListener(new ActionListener() {
			/*Añado el escuchador al boton e implemento ActionPerformed con la operacion
			 * que el boton tiene que hacer.*/
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				int v1=Integer.parseInt(campo1.getText());
				int v2=Integer.parseInt(campo2.getText());
				int multi = v1*v2;
				resul.setText(String.valueOf(multi));
				/*Introduzco en dos variables v1 y v2 el valor de los campos donde
				 * ponemos los numeros y los paso a int para poder multiplicar y obterner 
				 * el resultado.*/
			}
		});
		
		divi = new JButton (new ImageIcon("divi.png"));/*Creo el objeto multi que sera el boton Dividir*/
		/*Dentro del JButton creo un objeto icono, con el icono dentro.*/
		
		divi.setBounds(250,350,120,60);/*Le doy posicion y medidas al objeto Dividir*/
		this.add(divi);/*Añado el boton Dividir  a la ventana*/
		divi.setBackground(Color.WHITE);// Le doy el color blanco al fondo del boton.
		/*Pongo a la escucha el objeto y a la vez implemento el metodo ActionListener*/
		divi.addActionListener(new ActionListener() {
			/*Añado el escuchador al boton e implemento ActionPerformed con la operacion
			 * que el boton tiene que hacer.*/
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				int v1=Integer.parseInt(campo1.getText());
				int v2=Integer.parseInt(campo2.getText());
				int divi = v1/v2;
				resul.setText(String.valueOf(divi));
				/*Introduzco en dos variables v1 y v2 el valor de los campos donde
				 * ponemos los numeros y los paso a int para poder dividir y obterner 
				 * el resultado. */
			}
		});
		raiz2 = new JButton("Raiz 2");/*Creo el objeto raiz2 que sera el boton Raiz 2*/
		raiz2.setBackground(Color.WHITE);// Le doy el color blanco al fondo del boton.
		raiz2.setBounds(400,250,120,60);/*Le doy posicion y medidas al objeto raiz2*/
		raiz2.setForeground(new Color(0,109,240));// Cambio el color del texto de Button.
		this.add(raiz2);/*Añado el boton raiz2 a la ventana*/
		raiz2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
			JOptionPane.showMessageDialog(null,"Funcionalidad no disponible", "Aviso", JOptionPane.INFORMATION_MESSAGE);
			/*Dentro de la interfaz introduzco un cuadro de dialogo, avisandole.
			 * Pertenece a JOptionPane con el metodo estatico showMessageDialog.*/
			}
		});
		
		raiz3 = new JButton("Raiz 3");/*Creo el objeto sumar que sera el boton Raiz 3*/
		raiz3.setBackground(Color.WHITE);// Le doy el color blanco al fondo del boton.
		raiz3.setBounds(400,350,120,60);/*Le doy posicion y medidas al objeto raiz3*/
		raiz3.setForeground(new Color(0,109,240));// Cambio el color del texto de JButton.
		this.add(raiz3);/*Añado el boton raiz3 a la ventana*/
		raiz3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String contra = JOptionPane.showInputDialog("Escriba su contraseña");
				/*Declaro una variable que contndra lo que escribamos en el cuadro
				 * de dialogo en contraseña*/
				String clave;
				if (contra == null)
				JOptionPane.showMessageDialog(null,"No escribio nada","Cuadro 1", JOptionPane.WARNING_MESSAGE);
				/*Si, no se escribe nada dira no escribio nada*/
				else
				clave=contra;
				/*Y si no, metemos el valor en la variable clave.*/
			}
		});
		
		/************JLabel Resultado**************************************************************/
		resul = new JLabel ("Resultado");/*Creo el objeto resul que sera el texto Resultado*/
		resul.setBounds(100,420,150,60);/*Le doy posicion y medidas al objeto Resultado*/
		resul.setForeground(new Color(0,109,240)); // Cambio el color del JLabel
		resul.setFont(new Font("Dialog",Font.ITALIC,30));// Cambio el tipo de letra y tamaño del Jlabel.
		this.add(resul);/*Añado el texto Dividir  a la ventana*/
	
		
		//0,109,240
			
		};
		
		
		
		
		
		
		
	}
	
	
	
	
	
	


