import java.awt.*;
import java.awt.event.*;
import java.io.File;
import java.io.FileWriter;

import javax.swing.*;

import ListaJugadores.*;

public class CreacionJugador extends JFrame implements ActionListener{

	public ListaJugador listaJugador = new ListaJugador();
	public Jugador JugadorTemporal;
	public String archivo_txt;
	public String mostrar = "";
	
	public JButton btn_AgregarJugador;
	public JButton btn_Continuar;
	public JButton btn_Graficar;
	
	public JLabel lbl_Nombre;
	public JLabel lbl_Cantidad;
	public JLabel lbl_TipoJugador;
	public JLabel lbl_fondo;
	public JLabel lbl_contador;
	
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
		lbl_contador = new JLabel("0");
		
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
		
		lbl_contador.setBounds(367, 330, 100, 20);
		lbl_contador.setFont(new java.awt.Font("Tahoma", 0, 20));
		lbl_contador.setForeground(Color.WHITE);
		
		txt_Nombre = new JTextField(20);
		txt_Cantidad = new JTextField(20);
		
		txt_Nombre.setBounds(100, 50, 200, 25);
		txt_Cantidad.setBounds(100, 100, 200, 25);
		
		btn_AgregarJugador = new JButton("Agregar Jugador");
		btn_Continuar = new JButton("Continuar");
		btn_Graficar = new JButton("Graficar");
		
		btn_AgregarJugador.setBounds(100, 260, 200, 30);
		btn_Continuar.setBounds(100, 300, 200, 30);
		btn_Graficar.setBounds(100, 220, 200, 30);
		
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
		
		btn_Graficar.setForeground(Color.WHITE);
		btn_Graficar.setFont(new java.awt.Font("Tahoma", 0, 20));
		btn_Graficar.setFocusPainted(false);
		btn_Graficar.setBorderPainted(true);
		btn_Graficar.setContentAreaFilled(false);
		
		cmb_TipoJugador = new JComboBox();
		cmb_TipoJugador.addItem("Planta");
		cmb_TipoJugador.addItem("Zombie");
		cmb_TipoJugador.setBounds(100, 150, 100, 30);
		
		this.add(txt_Cantidad);
		this.add(txt_Nombre);
		this.add(cmb_TipoJugador);
		this.add(btn_AgregarJugador);
		this.add(btn_Continuar);
		this.add(btn_Graficar);
		this.add(lbl_Nombre);
		this.add(lbl_Cantidad);
		this.add(lbl_TipoJugador);
		this.add(lbl_contador);
		this.add(lbl_fondo);
		
		btn_Continuar.addActionListener(this);
		btn_AgregarJugador.addActionListener(this);
		btn_Graficar.addActionListener(this);
	}
	
		
	public void Graficar(){
		
		try{
			int nodos = listaJugador.Length();
			int indice = 0;
		
			archivo_txt = "digraph G {\n";
			archivo_txt = archivo_txt + "raíz;\n";
		
			while(indice<nodos){
			
					JugadorTemporal = this.listaJugador.getJugadorAt(indice);
			
					archivo_txt = archivo_txt + JugadorTemporal.getNombre() + ";\n";
					archivo_txt = archivo_txt + JugadorTemporal.getCantidad() + ";\n";
					archivo_txt = archivo_txt + JugadorTemporal.getTipo() + ";\n";
					archivo_txt = archivo_txt + JugadorTemporal.getExtra() + ";\n";
			
					archivo_txt = archivo_txt + JugadorTemporal.getNombre() + "->" + JugadorTemporal.getCantidad() + "->" +
							JugadorTemporal.getTipo() + "->" + JugadorTemporal.getExtra() + ";\n";
			
					archivo_txt = archivo_txt + "raíz -> " + JugadorTemporal.getNombre() + ";\n";
			
					indice++;
			
			}
		
			archivo_txt = archivo_txt + "}";
		
			System.out.println(archivo_txt);
			
		}catch(Exception e){
			
			System.out.println("Error");
			
		}
		
		
	}
	
public void CrearArchivo(){
		
		try{
			
			File archivo = new File("C:/texto.txt");
			
			FileWriter escribir = new FileWriter(archivo, true);
			
			escribir.write(archivo_txt);
			escribir.close();
			
		}catch(Exception e){
			System.out.println("Error al escribir");
		}
		
	}
	
	public void Dibujar(){
		
		try{
			
			String dotPath = "C:/Program Files (x86)/Graphviz2.39/bin/dot.exe";
			String fileInputPath = "C:/texto.txt";
			String fileOutputPath = "C:/imagen.jpg";
			String tParam = "-Tjpg";
			String tOParam = "-o";
			
			String [] cmd = new String[5];
			
			cmd[0] = dotPath;
			cmd[1] = tParam;
			cmd[2] = fileInputPath;
			cmd[3] = tOParam;
			cmd[4] = fileOutputPath;
			
			Runtime rt = Runtime.getRuntime();
			rt.exec(cmd);
			
		}catch(Exception e){
			
			JOptionPane.showMessageDialog(this, "Error al dibujar");
			System.out.println("Error al dibujar");
			
		}finally{
			
		}
		
	}
	
	public void actionPerformed(ActionEvent e) {
		
		if(btn_Continuar == e.getSource()){
			
			this.setVisible(false);
			
		}
		
		if(btn_Graficar == e.getSource()){
			
			this.Graficar();
			this.CrearArchivo();
			this.Dibujar();
			
		}
		
		if(btn_AgregarJugador == e.getSource()){
			
			try{
			
				String nombreJugador = txt_Nombre.getText();
				int cantidadPlantas = Integer.parseInt(txt_Cantidad.getText());
				String tipoJugador = cmb_TipoJugador.getSelectedItem().toString();
				String camposExtra = JOptionPane.showInputDialog("Agregar Campos Extras");
			
				Jugador jugadorTemporal = new Jugador(nombreJugador,camposExtra,tipoJugador,cantidadPlantas);
			
				listaJugador.Add(jugadorTemporal);
				JOptionPane.showMessageDialog(this, "El no. de jugadores es " + listaJugador.Length());
				
				this.lbl_contador.setText(Integer.toString(listaJugador.Length()));
				

				if(lbl_contador.getText().equals("2")){
					
					btn_AgregarJugador.setEnabled(false);
					
				}
				
			
			}catch(Exception arg){
				
				System.out.println("Error Fatal");
				
			}
			
		}
		
	}

}
