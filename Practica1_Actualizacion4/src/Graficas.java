import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.*;
import java.lang.*;
import ListaJugadores.*;

public class Graficas extends JFrame implements ActionListener{
	
	ListaJugador listaJugador = new ListaJugador();
	Jugador JugadorTemporal;
	
	public JButton btn_GraficarJugador;
	public JButton btn_CrearArchivo;
	public JButton btn_Dibujar;
	public String archivo_txt;
	
	public static void main(String [] args){
		
		//Graficas g = new Graficas();
		
	}
	
	public Graficas(){
		
		super("Gráficas");
		this.setSize(400, 400);
		this.setLayout(null);
		this.DefinirVentana();
		//this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(false);
		
	}
	
	public void DefinirVentana(){
		
		btn_GraficarJugador = new JButton("Graficar");
		btn_GraficarJugador.setBounds(25, 25, 100, 50);
		this.add(btn_GraficarJugador);
		btn_GraficarJugador.addActionListener(this);
		
		btn_CrearArchivo = new JButton("Crear Archivo");
		btn_CrearArchivo.setBounds(25, 75, 100, 50);
		this.add(btn_CrearArchivo);
		btn_CrearArchivo.addActionListener(this);
		
		btn_Dibujar = new JButton("Dibujar");
		btn_Dibujar.setBounds(25, 125, 100, 50);
		this.add(btn_Dibujar);
		btn_Dibujar.addActionListener(this);
		
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

		if(btn_GraficarJugador == e.getSource()){
			this.Graficar();
		}
		
		if(btn_CrearArchivo == e.getSource()){
			this.CrearArchivo();
		}
		
		if(btn_Dibujar == e.getSource()){
			this.Dibujar();
		}
		
	}
	
}
