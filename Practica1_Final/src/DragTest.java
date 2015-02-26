import javax.swing.*;

import java.awt.*;

import java.awt.event.*;



public class DragTest {



	public static void main(String[] args) {

		MyWindow window = new MyWindow();

		window.setVisible(true);

		window.setPreferredSize(new Dimension(815,650));

		window.pack();

		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}

class MyWindow extends JFrame{

	public ImageIcon ico_planta1,ico_planta2,ico_planta3,ico_planta4,ico_planta5, ico_tablero;
	public JLabel lbl_fondo;
	
	public MyWindow(){

		super("Drag test");
		
		Container container = getContentPane();

		container.setLayout(null);

		MyButton boton1 = new MyButton("");
		MyButton boton2 = new MyButton("");
		MyButton boton3 = new MyButton("");
		MyButton boton4 = new MyButton("");
		MyButton boton5 = new MyButton("");
		MyButton boton6 = new MyButton("");
		
		ico_planta1 = new ImageIcon("C:/Users/Elmer/Documents/Programacion/Proyectos Java/Practica1/Imagenes/ImagenesPlantas/ImagenesPlantasEditadas/PlantasEditadasTablero/planta1.png");
		ico_planta2 = new ImageIcon("C:/Users/Elmer/Documents/Programacion/Proyectos Java/Practica1/Imagenes/ImagenesPlantas/ImagenesPlantasEditadas/PlantasEditadasTablero/planta2.png");
		ico_planta3 = new ImageIcon("C:/Users/Elmer/Documents/Programacion/Proyectos Java/Practica1/Imagenes/ImagenesPlantas/ImagenesPlantasEditadas/PlantasEditadasTablero/planta3.png");
		ico_planta4 = new ImageIcon("C:/Users/Elmer/Documents/Programacion/Proyectos Java/Practica1/Imagenes/ImagenesPlantas/ImagenesPlantasEditadas/PlantasEditadasTablero/planta4.png");
		ico_planta5 = new ImageIcon("C:/Users/Elmer/Documents/Programacion/Proyectos Java/Practica1/Imagenes/ImagenesPlantas/ImagenesPlantasEditadas/PlantasEditadasTablero/planta5.png");
		ico_tablero = new ImageIcon("C:/Users/Elmer/Documents/Programacion/Proyectos Java/Practica1/Imagenes/tablero.png");
		
		container.add(boton1);
		container.add(boton2);
		container.add(boton3);
		container.add(boton4);
		container.add(boton5);
		container.add(boton6);
		
		boton1.setBounds(0, 0, 60, 70);
		boton1.setIcon(ico_planta1);
		boton2.setBounds(60, 0, 60, 70);
		boton2.setIcon(ico_planta2);
		boton3.setBounds(120, 0, 60, 70);
		boton3.setIcon(ico_planta3);
		boton4.setBounds(180, 0, 60, 70);
		boton4.setIcon(ico_planta4);
		boton5.setBounds(240, 0, 60, 70);
		boton5.setIcon(ico_planta5);
		boton6.setBounds(0, 70, 800, 400);
		boton6.setIcon(ico_tablero);

		lbl_fondo.setBounds(0, 70, 800, 400);
		lbl_fondo.setIcon(ico_tablero);
		
		this.add(lbl_fondo);

	}

}

class MyButton extends JButton implements MouseMotionListener{

	public MyButton(String text){

		super.setText(text);

		addMouseMotionListener(this);

	}



	public void mouseDragged(MouseEvent mme) {

		setLocation(

				this.getX() + mme.getX() - this.getWidth() / 2,

				this.getY() + mme.getY() - this.getHeight() / 2

				);

	}

	public void mouseMoved(MouseEvent mme) {}

}