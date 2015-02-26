import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class VerGraficas extends JFrame implements ActionListener{

	public JButton btn_GraficaJugadores, btn_GraficaPlantas, btn_GraficaZombies, btn_GraficaCola, btn_GraficaPila;
	public JLabel lbl_grafica;
	public ImageIcon ico_1, ico_2, ico_3, ico_4, ico_5;
	
	public VerGraficas(){
		
		super("Graficas");
		this.setSize(800,800);
		this.setLayout(null);
		this.DefinirVentana();
		this.setVisible(false);
		
	}
	
	public void DefinirVentana(){
		
		ico_1 = new ImageIcon("C:/imagen.jpg");
		ico_2 = new ImageIcon("C:/imagenPlanta.jpg");
		ico_3 = new ImageIcon("C:/imagenCola.jpg");
		ico_4 = new ImageIcon("C:/imagenZombie.jpg");
		ico_5 = new ImageIcon("C:/imagenPila.jpg");
		
		btn_GraficaJugadores = new JButton("Jugadores");
		btn_GraficaPlantas = new JButton("Plantas");
		btn_GraficaZombies = new JButton("Zombies");
		btn_GraficaCola = new JButton("Cola");
		btn_GraficaPila = new JButton("Pila");
		
		btn_GraficaJugadores.setBounds(10, 20, 150, 50);
		btn_GraficaPlantas.setBounds(10, 100, 150, 50);
		btn_GraficaZombies.setBounds(10, 200, 150, 50);
		btn_GraficaCola.setBounds(10, 300, 150, 50);
		btn_GraficaPila.setBounds(10, 400, 150, 50);
		
		lbl_grafica = new JLabel("");
		lbl_grafica.setBounds(300, 20, 600, 600);
		lbl_grafica.setIcon(ico_1);
		
		this.add(btn_GraficaCola);
		this.add(btn_GraficaJugadores);
		this.add(btn_GraficaPila);
		this.add(btn_GraficaPlantas);
		this.add(btn_GraficaZombies);
		this.add(lbl_grafica);
		
		btn_GraficaCola.addActionListener(this);
		btn_GraficaPila.addActionListener(this);
		btn_GraficaPlantas.addActionListener(this);
		btn_GraficaZombies.addActionListener(this);
		btn_GraficaJugadores.addActionListener(this);
	}
	
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		if(this.btn_GraficaCola==e.getSource()){
			lbl_grafica.setIcon(ico_3);
			
		}
		
		if(this.btn_GraficaPila==e.getSource()){
			lbl_grafica.setIcon(ico_5);
			
		}
		
		if(this.btn_GraficaZombies==e.getSource()){
			lbl_grafica.setIcon(ico_4);
			
		}
		
		if(this.btn_GraficaPlantas==e.getSource()){
			lbl_grafica.setIcon(ico_2);
			
		}
		
		if(this.btn_GraficaJugadores==e.getSource()){
			lbl_grafica.setIcon(ico_1);
			
		}
		
	}

	
	
}
