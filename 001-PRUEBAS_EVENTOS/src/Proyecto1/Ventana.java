package Proyecto1;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class Ventana extends JFrame{
	
	private JLabel imagen;
	private JCheckBox caja;
	private JButton boton;
	
	
	
	public Ventana() {
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setBounds(300,200,800,400);
		setTitle("Ventana Goku");
		setLayout(null);
		iniciarCompo();
		setVisible(true);
	}

	private void iniciarCompo() {
		getContentPane().setBackground(Color.WHITE);
		
		imagen=new JLabel(new ImageIcon("goku2.jpg"));
		imagen.setBounds(0, 80, 400, 300);
		add(imagen);
		
		imagen.addMouseListener(new MouseListener() {
			
			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				imagen.setIcon(new ImageIcon("goku2.jpg"));
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				imagen.setIcon(new ImageIcon("goku1.jpg"));
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
		
		caja = new JCheckBox(" Acepto los terminos");
		caja.setBounds(400, 80,200, 30);
		caja.setBackground(Color.WHITE);
		add(caja);
		caja.addChangeListener(new ChangeListener() {
			
			@Override
			public void stateChanged(ChangeEvent e) {
				// TODO Auto-generated method stub
				if(caja.isSelected()) {
				    boton.setEnabled(true);
				}else {
					boton.setEnabled(false);
				}
			}
		});
		
	
		
		
		boton = new JButton("Continuar");
		boton.setBounds(400,120,150,30);
		boton.setEnabled(false);
		add(boton);
		
		boton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				JOptionPane.showMessageDialog(null, "Fenomenal!!!", "", JOptionPane.PLAIN_MESSAGE);
			}
		});
	}
}
