import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

import ListaJugadores.*;
import ListaPlantas.*;
import ListaZombies.*; 

public class Tablero extends JFrame implements ActionListener, MouseMotionListener{

	public static void main(String [] args){
		Tablero t = new Tablero();
	}
	
	public Point p;
    public Point pl;
    public int lx,ly;
    public boolean calcular_diferencia=true;
	
	public JButton btn_SacarPila;
	public JButton btn_SacarCola;
	public JButton btn_VerGraficas;
	
	public JLabel lbl_Tablero;
	public JLabel lbl_Planta1, lbl_Planta2, lbl_Planta3, lbl_Planta4, lbl_Planta5;
	public JLabel lbl_Planta6, lbl_Planta7, lbl_Planta8, lbl_Planta9, lbl_Planta10;
	public JLabel lbl_Zombie1, lbl_Zombie2, lbl_Zombie3, lbl_Zombie4, lbl_Zombie5;
	public JLabel lbl_Zombie6, lbl_Zombie7, lbl_Zombie8, lbl_Zombie9, lbl_Zombie10;
	
	public ImageIcon ico_Tablero;
	public ImageIcon ico_Planta1, ico_Planta2, ico_Planta3, ico_Planta4, ico_Planta5;
	public ImageIcon ico_Planta6, ico_Planta7, ico_Planta8, ico_Planta9, ico_Planta10;
	public ImageIcon ico_Zombie1, ico_Zombie2, ico_Zombie3, ico_Zombie4, ico_Zombie5;
	
	public Tablero(){
		
		super("Plantas Vs Zombies!!!");
		this.setSize(815, 637);
		this.setLayout(null);
		this.DefinirVentana();
		//this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(false);
		
	}
	
	public void DefinirVentana(){
		
		btn_SacarCola = new JButton("Sacar Planta");
		btn_SacarCola.setBounds(520, 50, 150, 50);
		
		btn_SacarPila = new JButton("Sacar Zombie");
		btn_SacarPila.setBounds(520, 550, 150, 50);
		
		btn_VerGraficas = new JButton("Ver Gráficas");
		btn_VerGraficas.setBounds(520, 0, 150, 50);
		
		ico_Tablero = new ImageIcon("C:/Users/Elmer/Documents/Programacion/Proyectos Java/Practica1/Imagenes/tablero.png");
		ico_Planta1 = new ImageIcon("C:/Users/Elmer/Documents/Programacion/Proyectos Java/Practica1/Imagenes/ImagenesPlantas/ImagenesPlantasEditadas/PlantasEditadasTablero2/planta1.png");
		ico_Planta2 = new ImageIcon("C:/Users/Elmer/Documents/Programacion/Proyectos Java/Practica1/Imagenes/ImagenesPlantas/ImagenesPlantasEditadas/PlantasEditadasTablero2/planta1.png");
		ico_Planta3 = new ImageIcon("C:/Users/Elmer/Documents/Programacion/Proyectos Java/Practica1/Imagenes/ImagenesPlantas/ImagenesPlantasEditadas/PlantasEditadasTablero2/planta1.png");
		ico_Planta4 = new ImageIcon("C:/Users/Elmer/Documents/Programacion/Proyectos Java/Practica1/Imagenes/ImagenesPlantas/ImagenesPlantasEditadas/PlantasEditadasTablero2/planta1.png");
		ico_Planta5 = new ImageIcon("C:/Users/Elmer/Documents/Programacion/Proyectos Java/Practica1/Imagenes/ImagenesPlantas/ImagenesPlantasEditadas/PlantasEditadasTablero2/planta1.png");
		ico_Zombie1 = new ImageIcon("C:/Users/Elmer/Documents/Programacion/Proyectos Java/Practica1/Imagenes/ImagenesZombies/ImagenesZombiesEditadas/EditadasZombiesTablero/zombie1.png");
		ico_Planta6 = new ImageIcon("C:/Users/Elmer/Documents/Programacion/Proyectos Java/Practica1/Imagenes/ImagenesPlantas/ImagenesPlantasEditadas/PlantasEditadasTablero/planta1.png");
		ico_Planta7 = new ImageIcon("C:/Users/Elmer/Documents/Programacion/Proyectos Java/Practica1/Imagenes/ImagenesPlantas/ImagenesPlantasEditadas/PlantasEditadasTablero/planta2.png");
		ico_Planta8 = new ImageIcon("C:/Users/Elmer/Documents/Programacion/Proyectos Java/Practica1/Imagenes/ImagenesPlantas/ImagenesPlantasEditadas/PlantasEditadasTablero/planta3.png");
		ico_Planta9 = new ImageIcon("C:/Users/Elmer/Documents/Programacion/Proyectos Java/Practica1/Imagenes/ImagenesPlantas/ImagenesPlantasEditadas/PlantasEditadasTablero/planta4.png");
		ico_Planta10 = new ImageIcon("C:/Users/Elmer/Documents/Programacion/Proyectos Java/Practica1/Imagenes/ImagenesPlantas/ImagenesPlantasEditadas/PlantasEditadasTablero/planta5.png");
		ico_Zombie2 = new ImageIcon("C:/Users/Elmer/Documents/Programacion/Proyectos Java/Practica1/Imagenes/ImagenesZombies/ImagenesZombiesEditadas/EditadasZombiesTablero2/zombie6.png");
		ico_Zombie3 = new ImageIcon("C:/Users/Elmer/Documents/Programacion/Proyectos Java/Practica1/Imagenes/ImagenesZombies/ImagenesZombiesEditadas/EditadasZombiesTablero2/zombie7.png");
		ico_Zombie4 = new ImageIcon("C:/Users/Elmer/Documents/Programacion/Proyectos Java/Practica1/Imagenes/ImagenesZombies/ImagenesZombiesEditadas/EditadasZombiesTablero2/zombie8.png");
		ico_Zombie5 = new ImageIcon("C:/Users/Elmer/Documents/Programacion/Proyectos Java/Practica1/Imagenes/ImagenesZombies/ImagenesZombiesEditadas/EditadasZombiesTablero2/zombie9.png");
		
		lbl_Tablero = new JLabel();
		lbl_Tablero.setBounds(0, 100, 800, 400);
		lbl_Tablero.setIcon(ico_Tablero);
		
		lbl_Planta1 = new JLabel();
		lbl_Planta1.setBounds(0, 0, 100, 100);
		lbl_Planta1.setIcon(ico_Planta1);
		
		lbl_Zombie2 = new JLabel();
		lbl_Zombie2.setBounds(100, 500, 100, 100);
		lbl_Zombie2.setIcon(ico_Zombie1);
	
		lbl_Zombie3 = new JLabel();
		lbl_Zombie3.setBounds(200, 500, 100, 100);
		lbl_Zombie3.setIcon(ico_Zombie1);
		
		lbl_Zombie4 = new JLabel();
		lbl_Zombie4.setBounds(300, 500, 100, 100);
		lbl_Zombie4.setIcon(ico_Zombie1);
		
		lbl_Zombie5 = new JLabel();
		lbl_Zombie5.setBounds(400, 500, 100, 100);
		lbl_Zombie5.setIcon(ico_Zombie1);
		
		lbl_Zombie6 = new JLabel();
		lbl_Zombie6.setBounds(650, 200, 70, 70);
		lbl_Zombie6.setIcon(ico_Zombie2);
		
		lbl_Zombie7 = new JLabel();
		lbl_Zombie7.setBounds(650, 400, 70, 70);
		lbl_Zombie7.setIcon(ico_Zombie3);
		
		lbl_Zombie8 = new JLabel();
		lbl_Zombie8.setBounds(500, 300, 70, 70);
		lbl_Zombie8.setIcon(ico_Zombie4);
		
		lbl_Zombie9 = new JLabel();
		lbl_Zombie9.setBounds(500, 200, 70, 70);
		lbl_Zombie9.setIcon(ico_Zombie5);
		
		lbl_Zombie1 = new JLabel();
		lbl_Zombie1.setBounds(0, 500, 100, 100);
		lbl_Zombie1.setIcon(ico_Zombie1);
		
		lbl_Planta2 = new JLabel();
		lbl_Planta2.setBounds(100, 0, 100, 100);
		lbl_Planta2.setIcon(ico_Planta1);

		lbl_Planta3 = new JLabel();
		lbl_Planta3.setBounds(200, 0, 100, 100);
		lbl_Planta3.setIcon(ico_Planta1);
		
		lbl_Planta4 = new JLabel();
		lbl_Planta4.setBounds(300, 0, 100, 100);
		lbl_Planta4.setIcon(ico_Planta1);
		
		lbl_Planta5 = new JLabel();
		lbl_Planta5.setBounds(400, 0, 100, 100);
		lbl_Planta5.setIcon(ico_Planta1);
		
		lbl_Planta6 = new JLabel();
		lbl_Planta6.setBounds(50, 220, 70, 70);
		lbl_Planta6.setIcon(ico_Planta6);
		
		lbl_Planta7 = new JLabel();
		lbl_Planta7.setBounds(130, 300, 70, 70);
		lbl_Planta7.setIcon(ico_Planta7);
		
		lbl_Planta8 = new JLabel();
		lbl_Planta8.setBounds(50, 420, 70, 70);
		lbl_Planta8.setIcon(ico_Planta8);
		
		lbl_Planta9 = new JLabel();
		lbl_Planta9.setBounds(300, 420, 70, 70);
		lbl_Planta9.setIcon(ico_Planta9);
		
		lbl_Planta10 = new JLabel();
		lbl_Planta10.setBounds(200, 220, 70, 70);
		lbl_Planta10.setIcon(ico_Planta10);
		
		this.add(lbl_Planta1);
		this.add(lbl_Planta2);
		this.add(lbl_Planta3);
		this.add(lbl_Planta4);
		this.add(lbl_Planta5);
		this.add(lbl_Planta6);
		this.add(lbl_Planta7);
		this.add(lbl_Planta8);
		this.add(lbl_Planta9);
		this.add(lbl_Planta10);
		this.add(lbl_Zombie6);
		this.add(lbl_Zombie7);
		this.add(lbl_Zombie8);
		this.add(lbl_Zombie9);
		this.add(lbl_Tablero);
		this.add(lbl_Zombie1);
		this.add(lbl_Zombie2);
		this.add(lbl_Zombie3);
		this.add(lbl_Zombie4);
		this.add(lbl_Zombie5);
		this.add(btn_SacarCola);
		this.add(btn_SacarPila);
		this.add(btn_VerGraficas);
		
		btn_VerGraficas.addActionListener(this);
		
	}
	
	
	public void actionPerformed(ActionEvent arg0) {
		
		if(this.btn_VerGraficas==arg0.getSource()){
			
			VerGraficas vg = new VerGraficas();
			vg.setVisible(true);
			
		}
		
	}

	public void mouseDragged(MouseEvent mme) {
		
		//setLocation(this.getX() + mme.getX() - this.getWidth() / 2,
			//	this.getY() + mme.getY() - this.getHeight() / 2);
		
		lbl_Tablero.setLocation(mme.getX(), mme.getY());
		
	}

	
	public void mouseMoved(MouseEvent arg0) {
		
		
	}

}
