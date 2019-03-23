import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import javax.swing.*;

public class Ventana extends JFrame implements WindowListener, ActionListener {
	private static final long serialVersionUID = 1L;
	private JPanel p=new JPanel();
	private JButton botonAzul = new JButton("Azul");
	private JButton botonVerde = new JButton("Verde");
	private JButton botonRojo = new JButton("Rojo");
	
	Ventana() {
		super ("Mi primera ventana swing");
	}
	
	public void iniciar() {
		this.setLocation(200,200);
		this.setSize(400,200);
		this.setVisible(true);
		this.add(p); // Añadimos panel a la ventana.
		p.add(botonRojo);
		p.add(botonAzul);
		p.add(botonVerde);
		this.addWindowListener(this);
		this.botonAzul.addActionListener(this);
		this.botonRojo.addActionListener(this);
		this.botonVerde.addActionListener(this);
		
	}

	@Override
	public void windowActivated(WindowEvent arg0) {
		System.out.println("Se ha activado la ventana");
	}

	@Override
	public void windowClosed(WindowEvent arg0) {
		System.out.println("Se ha terminado de cerrar la ventana");
	}

	@Override
	public void windowClosing(WindowEvent arg0) {
		System.out.println("Se está comenzando a cerrar la ventana");
	}

	@Override
	public void windowDeactivated(WindowEvent arg0) {
		System.out.println("Se está desactivando la ventana");	
	}

	@Override
	public void windowDeiconified(WindowEvent arg0) {
		System.out.println("Se está restaurando una ventana que estaba iconizada");
	}

	@Override
	public void windowIconified(WindowEvent arg0) {
		System.out.println("Se está iconizando la ventana"); 
	}

	@Override
	public void windowOpened(WindowEvent arg0) {
		System.out.println("Se está abriendo la ventana");
	}	
	
	
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == this.botonAzul)
			this.p.setBackground(Color.BLUE);
		else if (e.getSource() == this.botonRojo)
			this.p.setBackground(Color.RED);
		else
			this.p.setBackground(Color.GREEN);
	}
	
}