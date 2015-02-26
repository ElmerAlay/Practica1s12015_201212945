import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import ListaJugadores.*;
import ListaPlantas.*;
import ListaZombies.*;

public class VentanaInicial extends JFrame implements ActionListener{
	
	public static void main(String [] args){
	VentanaInicial  vi = new VentanaInicial();
		
	}
	
	CreacionJugador cj = new CreacionJugador();
	CreacionPlantas cp = new CreacionPlantas();
	CreacionZombies cz = new CreacionZombies();
	Tablero t = new Tablero();
	VerGraficas vg = new VerGraficas();
	//Graficas g = new Graficas();
	
	public JButton btn_AgregarJugador;
	public JButton btn_CrearLista;
	public JButton btn_IniciarJuego;
	public JButton btn_CrearPlanta;
	public JButton btn_CrearZombie;
	public JButton btn_EliminarDatos;
	
	public ImageIcon ico_fondo;
	
	public JLabel lbl_fondo;
	
	public VentanaInicial(){
		
		super("Menú Principal");
		this.setSize(500, 500);
		this.setLayout(null);
		this.DefinirVentana();
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		
	}
	
	public void DefinirVentana(){
		
		btn_AgregarJugador = new JButton("Agregar Jugador");
		btn_CrearLista = new JButton("Crear");
		btn_IniciarJuego = new JButton("Iniciar Juego");
		btn_CrearPlanta = new JButton("Crear Planta");
		btn_CrearZombie = new JButton("Crear Zombie");
		btn_EliminarDatos = new JButton("Eliminar Datos");
		
		this.btn_AgregarJugador.setBounds(150, 140, 200, 50);
		this.btn_CrearPlanta.setBounds(90, 260, 150, 50);
		this.btn_CrearZombie.setBounds(250, 260, 150, 50);
		this.btn_IniciarJuego.setBounds(250, 320, 200, 50);
		this.btn_CrearLista.setBounds(40, 320, 200, 50);
		this.btn_EliminarDatos.setBounds(150,200,200,50);
		
		this.btn_CrearPlanta.setEnabled(false);
		this.btn_CrearZombie.setEnabled(false);
		this.btn_IniciarJuego.setEnabled(false);
		this.btn_EliminarDatos.setEnabled(false);
		
		this.btn_AgregarJugador.setForeground(Color.WHITE);
		this.btn_CrearPlanta.setForeground(Color.WHITE);
		this.btn_CrearZombie.setForeground(Color.WHITE);
		this.btn_IniciarJuego.setForeground(Color.WHITE);
		this.btn_CrearLista.setForeground(Color.WHITE);
		this.btn_EliminarDatos.setForeground(Color.WHITE);
		
		this.btn_AgregarJugador.setFocusPainted(false);
		this.btn_CrearPlanta.setFocusPainted(false);
		this.btn_CrearZombie.setFocusPainted(false);
		this.btn_IniciarJuego.setFocusPainted(false);
		this.btn_CrearLista.setFocusPainted(false);
		this.btn_EliminarDatos.setFocusPainted(false);
		
		this.btn_AgregarJugador.setContentAreaFilled(false);
		this.btn_CrearPlanta.setContentAreaFilled(false);
		this.btn_CrearZombie.setContentAreaFilled(false);
		this.btn_IniciarJuego.setContentAreaFilled(false);
		this.btn_CrearLista.setContentAreaFilled(false);
		this.btn_EliminarDatos.setContentAreaFilled(false);
		
		/*this.btn_AgregarJugador.setBorderPainted(false);
		this.btn_CrearPlanta.setBorderPainted(false);
		this.btn_CrearZombie.setBorderPainted(false);
		this.btn_IniciarJuego.setBorderPainted(false);
		this.btn_CrearLista.setBorderPainted(false);
		this.btn_EliminarDatos.setBorderPainted(false);*/
		
		ico_fondo = new ImageIcon("C:/Users/Elmer/Documents/Programacion/Proyectos Java/Practica1/Imagenes/fondo.png");
		
		lbl_fondo = new JLabel();
		lbl_fondo.setBounds(0, 0, 500, 500);
		lbl_fondo.setIcon(ico_fondo);
		
		this.add(btn_AgregarJugador);
		this.add(btn_CrearLista);
		this.add(btn_CrearPlanta);
		this.add(btn_CrearZombie);
		this.add(btn_IniciarJuego);
		this.add(btn_EliminarDatos);
		this.add(lbl_fondo);
		
		btn_AgregarJugador.addActionListener(this);
		btn_EliminarDatos.addActionListener(this);
		btn_CrearPlanta.addActionListener(this);
		btn_CrearZombie.addActionListener(this);
		btn_CrearLista.addActionListener(this);
		btn_IniciarJuego.addActionListener(this);
		
	}
	
	public void actionPerformed(ActionEvent e) {
		
		if(btn_AgregarJugador == e.getSource()){
			
			cj.setVisible(true);
			this.btn_EliminarDatos.setEnabled(true);
			this.btn_CrearPlanta.setEnabled(true);
			this.btn_CrearZombie.setEnabled(true);
			
		}
		
		if(btn_EliminarDatos == e.getSource()){
			
			cj = new CreacionJugador();
			cp = new CreacionPlantas();
			cz = new CreacionZombies();
			
			this.btn_IniciarJuego.setEnabled(false);
			this.btn_CrearPlanta.setEnabled(false);
			this.btn_CrearZombie.setEnabled(false);
			
		}
		
		if(btn_CrearPlanta == e.getSource()){
			
			cp.setVisible(true);
			
		}
		
		if(btn_CrearZombie == e.getSource()){
			
			cz.setVisible(true);
			this.btn_IniciarJuego.setEnabled(true);
			
		}
		
		if(btn_CrearLista == e.getSource()){
			
			ListaJugador lj = new ListaJugador();
			ListaPlanta lp = new ListaPlanta();
			ListaZombie lz = new ListaZombie();
			
			JOptionPane.showMessageDialog(this, "Lista Creada");
			
		}
		
		if(btn_IniciarJuego == e.getSource()){
			
			Graficas g = new Graficas();
			g.setVisible(true);
			
		}
		
		if(btn_IniciarJuego == e.getSource()){
			
			int filas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese filas de tablero"));

			int columnas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese columnas de tablero"));
			
			t.setVisible(true);
			
		}
	}

}
