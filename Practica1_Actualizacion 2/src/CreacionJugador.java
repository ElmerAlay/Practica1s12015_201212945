import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

import ListaJugadores.*;

public class CreacionJugador extends JFrame implements ActionListener{

	public ListaJugador listaJugador = new ListaJugador();
	
	public JButton btn_AgregarJugador;
	public JButton btn_Continuar;
	
	public JLabel lbl_Nombre;
	public JLabel lbl_Cantidad;
	public JLabel lbl_TipoJugador;
	public JLabel lbl_fondo;
	
	public JTextField txt_Nombre;
	public JTextField txt_Cantidad;
	
	public JComboBox cmb_TipoJugador;
	
	public ImageIcon ico_fondo;
	public ImageIcon ico_nombre;
	public ImageIcon ico_cantidad;
	
	public CreacionJugador(){
		
		super("Creación de Jugadores");
		this.setSize(400, 400);
		this.setLayout(null);
		this.DefinirVentana();
		//this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(false);
		
	}
	
	public void DefinirVentana(){
		
		ico_fondo = new ImageIcon("C:/Users/Elmer/Documents/Programacion/Proyectos Java/Practica1/Imagenes/FJugador.png");
		ico_nombre = new ImageIcon("C:/Users/Elmer/Documents/Programacion/Proyectos Java/Practica1/Imagenes/");
		ico_cantidad = new ImageIcon("C:/Users/Elmer/Documents/Programacion/Proyectos Java/Practica1/Imagenes/");
		
		lbl_Nombre = new JLabel("Nombre");
		lbl_Cantidad = new JLabel("Cantidad");
		lbl_TipoJugador = new JLabel("Tipo de Jugador");
		lbl_fondo = new JLabel();
		
		lbl_fondo.setBounds(0, 0, 400, 400);
		lbl_fondo.setIcon(ico_fondo);
		
		lbl_Nombre.setBounds(100, 30, 100, 20);
		lbl_Nombre.setFont(new java.awt.Font("Tahoma", 0, 20));
		lbl_Nombre.setForeground(Color.WHITE);
		
		lbl_Cantidad.setBounds(100, 80, 100, 20);
		lbl_Cantidad.setFont(new java.awt.Font("Tahoma", 0, 20));
		lbl_Cantidad.setForeground(Color.WHITE);
		
		lbl_TipoJugador.setBounds(100, 130, 200, 20);
		lbl_TipoJugador.setFont(new java.awt.Font("Tahoma", 0, 20));
		lbl_TipoJugador.setForeground(Color.WHITE);
		
		txt_Nombre = new JTextField(20);
		txt_Cantidad = new JTextField(20);
		
		txt_Nombre.setBounds(100, 50, 200, 25);
		txt_Cantidad.setBounds(100, 100, 200, 25);
		
		btn_AgregarJugador = new JButton("Agregar Jugador");
		btn_Continuar = new JButton("Continuar");
		
		btn_AgregarJugador.setBounds(100, 240, 200, 50);
		btn_Continuar.setBounds(100, 300, 200, 50);
		
		btn_AgregarJugador.setForeground(Color.WHITE);
		btn_AgregarJugador.setFont(new java.awt.Font("Tahoma", 0, 20));
		btn_AgregarJugador.setFocusPainted(false);
		btn_AgregarJugador.setBorderPainted(true);
		btn_AgregarJugador.setContentAreaFilled(false);
		
		btn_Continuar.setForeground(Color.WHITE);
		btn_Continuar.setFont(new java.awt.Font("Tahoma", 0, 20));
		btn_Continuar.setFocusPainted(false);
		btn_Continuar.setBorderPainted(true);
		btn_Continuar.setContentAreaFilled(false);
		
		cmb_TipoJugador = new JComboBox();
		cmb_TipoJugador.addItem("Planta");
		cmb_TipoJugador.addItem("Zombie");
		cmb_TipoJugador.setBounds(100, 150, 100, 30);
		
		this.add(txt_Cantidad);
		this.add(txt_Nombre);
		this.add(cmb_TipoJugador);
		this.add(btn_AgregarJugador);
		this.add(btn_Continuar);
		this.add(lbl_Nombre);
		this.add(lbl_Cantidad);
		this.add(lbl_TipoJugador);
		this.add(lbl_fondo);
		
		btn_Continuar.addActionListener(this);
		btn_AgregarJugador.addActionListener(this);
	}
	
	public void actionPerformed(ActionEvent e) {
		
		if(btn_Continuar == e.getSource()){
			
			this.setVisible(false);
			
		}
		
		if(btn_AgregarJugador == e.getSource()){
			
			String nombreJugador = txt_Nombre.getText();
			int cantidadPlantas = Integer.parseInt(txt_Cantidad.getText());
			String tipoJugador = cmb_TipoJugador.getSelectedItem().toString();
			String camposExtra = "";
			
			Jugador jugadorTemporal = new Jugador(nombreJugador,camposExtra,tipoJugador,cantidadPlantas);
			
			listaJugador.Add(jugadorTemporal);
			JOptionPane.showMessageDialog(this, "El no. de jugadores es " + listaJugador.Length());
			
		}
		
	}

}
