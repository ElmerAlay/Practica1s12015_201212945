import javax.swing.*;
import java.awt.*;

public class Ventana_Principal extends JFrame{
	
	public JButton btn_JPlantas;
	public JButton btn_JZombies;
	public JButton btn_IniciarJuego;
	public JButton btn_EliminarDatos;
	
	public JLabel lbl_ImagenFondo;
	
	public ImageIcon icono;
	
	public Ventana_Principal(){
		
		super("Plantas Vs Zombies!!!!!");
		this.setSize(500, 500);
		this.setLayout(null);
		this.Definir_Ventana();
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		
	}
	
	public void Definir_Ventana(){
		
		icono = new ImageIcon("C:/Users/Elmer/Documents/Programacion/Proyectos Java/Práctica1/Imagenes/fondo.png");
		
		btn_JPlantas = new JButton("Jugador Plantas");
		btn_JZombies = new JButton("Jugador Zombies");
		btn_IniciarJuego = new JButton("Iniciar Juego");
		btn_EliminarDatos = new JButton("Eliminar Datos");
		
		btn_JPlantas.setBounds(150, 110, 200, 100);
		btn_JZombies.setBounds(150, 220, 200, 100);
		btn_IniciarJuego.setBounds(40, 350, 200, 100);
		btn_EliminarDatos.setBounds(250, 350, 200, 100);
		
		btn_JPlantas.setForeground(Color.WHITE);
		btn_JZombies.setForeground(Color.WHITE);
		btn_IniciarJuego.setForeground(Color.WHITE);
		btn_EliminarDatos.setForeground(Color.WHITE);
		
		btn_JPlantas.setFocusPainted(false);
		btn_JZombies.setFocusPainted(false);
		btn_IniciarJuego.setFocusPainted(false);
		btn_EliminarDatos.setFocusPainted(false);
		
		btn_JPlantas.setBorderPainted(false);
		btn_JZombies.setBorderPainted(false);
		btn_IniciarJuego.setBorderPainted(false);
		btn_EliminarDatos.setBorderPainted(false);
		
		btn_JPlantas.setContentAreaFilled(false);
		btn_JZombies.setContentAreaFilled(false);
		btn_IniciarJuego.setContentAreaFilled(false);
		btn_EliminarDatos.setContentAreaFilled(false);
		
		lbl_ImagenFondo = new JLabel();
		lbl_ImagenFondo.setBounds(0, 0, 500, 500);
		lbl_ImagenFondo.setIcon(icono);
		
		this.add(btn_JPlantas);
		this.add(btn_JZombies);
		this.add(btn_IniciarJuego);
		this.add(btn_EliminarDatos);
		
		this.add(lbl_ImagenFondo);
		
	}

}
