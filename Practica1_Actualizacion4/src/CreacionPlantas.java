import java.awt.*;
import java.awt.event.*;
import java.io.File;
import java.io.FileWriter;

import javax.swing.*;

import ListaPlantas.*;

public class CreacionPlantas extends JFrame implements ActionListener {

	public ListaPlanta listaPlanta = new ListaPlanta();
	public Planta plantaTemporal;
	public String archivo_txt;
	
	public JLabel lbl_Nombre;
	public JLabel lbl_PuntosAtaque;
	public JLabel lbl_TipoAtaque;
	public JLabel lbl_PuntosDefensa;
	public JLabel lbl_Imagen;
	public JLabel lbl_Fondo;
	public JLabel lbl_ImagenPlanta;
	
	public ImageIcon ico_fondo;
	public ImageIcon planta1, planta2, planta3;
	public ImageIcon planta4, planta5, planta6;
	public ImageIcon planta7, planta8, planta9;
	public ImageIcon planta10;
	
	public JComboBox cmb_TipoAtaque;
	public JComboBox cmb_Imagen;
	
	public JTextField txt_Nombre;
	public JTextField txt_PuntosAtaque;
	public JTextField txt_PuntosDefensa;
	
	public JButton btn_AgregarPlanta;
	public JButton btn_EliminarPlanta;
	public JButton btn_EditarPlanta;
	public JButton btn_Continuar;
	
	public CreacionPlantas(){
		
		super("Creación de Plantas");
		this.setLayout(null);
		this.setSize(600, 600);
		this.DefinirVentana();
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(false);
		
	}
	
	public void DefinirVentana(){
		
		ico_fondo = new ImageIcon("C:/Users/Elmer/Documents/Programacion/Proyectos Java/Practica1/Imagenes/FPlanta.png");
		planta1 = new ImageIcon("C:/Users/Elmer/Documents/Programacion/Proyectos Java/Practica1/Imagenes/ImagenesPlantas/ImagenesPlantasEditadas/planta1.png");
		planta2 = new ImageIcon("C:/Users/Elmer/Documents/Programacion/Proyectos Java/Practica1/Imagenes/ImagenesPlantas/ImagenesPlantasEditadas/planta2.png");
		planta3 = new ImageIcon("C:/Users/Elmer/Documents/Programacion/Proyectos Java/Practica1/Imagenes/ImagenesPlantas/ImagenesPlantasEditadas/planta3.png");
		planta4 = new ImageIcon("C:/Users/Elmer/Documents/Programacion/Proyectos Java/Practica1/Imagenes/ImagenesPlantas/ImagenesPlantasEditadas/planta4.png");
		planta5 = new ImageIcon("C:/Users/Elmer/Documents/Programacion/Proyectos Java/Practica1/Imagenes/ImagenesPlantas/ImagenesPlantasEditadas/planta5.png");
		planta6 = new ImageIcon("C:/Users/Elmer/Documents/Programacion/Proyectos Java/Practica1/Imagenes/ImagenesPlantas/ImagenesPlantasEditadas/planta6.png");
		planta7 = new ImageIcon("C:/Users/Elmer/Documents/Programacion/Proyectos Java/Practica1/Imagenes/ImagenesPlantas/ImagenesPlantasEditadas/planta7.png");
		planta8 = new ImageIcon("C:/Users/Elmer/Documents/Programacion/Proyectos Java/Practica1/Imagenes/ImagenesPlantas/ImagenesPlantasEditadas/planta8.png");
		planta9 = new ImageIcon("C:/Users/Elmer/Documents/Programacion/Proyectos Java/Practica1/Imagenes/ImagenesPlantas/ImagenesPlantasEditadas/planta9.png");
		planta10 = new ImageIcon("C:/Users/Elmer/Documents/Programacion/Proyectos Java/Practica1/Imagenes/ImagenesPlantas/ImagenesPlantasEditadas/planta10.png");
		
		lbl_Nombre = new JLabel("Nombre");
		lbl_TipoAtaque = new JLabel("Tipo de Ataque");
		lbl_PuntosAtaque = new JLabel("Puntos de Ataque");
		lbl_PuntosDefensa = new JLabel("Puntos de Defensa");
		lbl_Imagen = new JLabel("Imagen");
		lbl_Fondo = new JLabel();
		lbl_ImagenPlanta = new JLabel();
		
		lbl_Fondo.setBounds(0, 0, 600, 600);
		lbl_Fondo.setIcon(ico_fondo);
		
		lbl_ImagenPlanta.setBounds(225, 320, 200, 200);
		lbl_ImagenPlanta.setIcon(planta1);
		
		lbl_Nombre.setBounds(141, 130, 100, 20);
		lbl_Nombre.setForeground(Color.WHITE);
		lbl_Nombre.setFont(new java.awt.Font("Tahoma", 0, 20));
		
		lbl_TipoAtaque.setBounds(75, 170, 200, 20);
		lbl_TipoAtaque.setForeground(Color.YELLOW);
		lbl_TipoAtaque.setFont(new java.awt.Font("Tahoma", 0, 20));
		
		lbl_PuntosAtaque.setBounds(55, 210, 200, 20);
		lbl_PuntosAtaque.setForeground(Color.YELLOW);
		lbl_PuntosAtaque.setFont(new java.awt.Font("Tahoma", 0, 20));
		
		lbl_PuntosDefensa.setBounds(49, 250, 200, 20);
		lbl_PuntosDefensa.setForeground(Color.YELLOW);
		lbl_PuntosDefensa.setFont(new java.awt.Font("Tahoma", 0, 20));
		
		lbl_Imagen.setBounds(147, 290, 200, 20);
		lbl_Imagen.setForeground(Color.BLACK);
		lbl_Imagen.setFont(new java.awt.Font("Tahoma", 0, 20));
		
		txt_Nombre = new JTextField(20);
		txt_PuntosAtaque = new JTextField(20);
		txt_PuntosDefensa = new JTextField(20);
		
		txt_Nombre.setBounds(225, 130, 200, 20);
		txt_PuntosAtaque.setBounds(225, 210, 200, 20);
		txt_PuntosDefensa.setBounds(225, 250, 200, 20);
		
		cmb_TipoAtaque = new JComboBox();
		cmb_TipoAtaque.setBounds(225, 170, 200, 20);
		cmb_TipoAtaque.addItem("Disparo");
		cmb_TipoAtaque.addItem("Directo");
		
		cmb_Imagen = new JComboBox();
		cmb_Imagen.setBounds(225, 290, 200, 20);
		cmb_Imagen.addItem("Imagen 1");
		cmb_Imagen.addItem("Imagen 2");
		cmb_Imagen.addItem("Imagen 3");
		cmb_Imagen.addItem("Imagen 4");
		cmb_Imagen.addItem("Imagen 5");
		cmb_Imagen.addItem("Imagen 6");
		cmb_Imagen.addItem("Imagen 7");
		cmb_Imagen.addItem("Imagen 8");
		cmb_Imagen.addItem("Imagen 9");
		cmb_Imagen.addItem("Imagen 10");
		
		btn_AgregarPlanta = new JButton("Agregar Planta");
		btn_EditarPlanta = new JButton("Editar Planta");
		btn_EliminarPlanta = new JButton("Eliminar Planta");
		btn_Continuar = new JButton("Continuar");
		
		btn_AgregarPlanta.setBounds(25, 350, 150, 50);
		btn_EditarPlanta.setBounds(25, 410, 150, 50);
		btn_EliminarPlanta.setBounds(25, 470, 150, 50);
		btn_Continuar.setBounds(450, 470, 100, 50);
		
		btn_AgregarPlanta.setFocusPainted(false);
		btn_EditarPlanta.setFocusPainted(false);
		btn_EliminarPlanta.setFocusPainted(false);
		btn_Continuar.setFocusPainted(false);
		
		btn_AgregarPlanta.setContentAreaFilled(false);
		btn_EditarPlanta.setContentAreaFilled(false);
		btn_EliminarPlanta.setContentAreaFilled(false);
		btn_Continuar.setContentAreaFilled(false);
		
		btn_AgregarPlanta.setForeground(Color.WHITE);
		btn_EditarPlanta.setForeground(Color.WHITE);
		btn_EliminarPlanta.setForeground(Color.WHITE);
		btn_Continuar.setForeground(Color.WHITE);
		
		this.add(lbl_Nombre);
		this.add(lbl_TipoAtaque);
		this.add(lbl_PuntosAtaque);
		this.add(lbl_PuntosDefensa);
		this.add(lbl_Imagen);
		this.add(lbl_ImagenPlanta);
		this.add(txt_Nombre);
		this.add(txt_PuntosAtaque);
		this.add(txt_PuntosDefensa);
		this.add(cmb_Imagen);
		this.add(cmb_TipoAtaque);
		this.add(btn_AgregarPlanta);
		this.add(btn_EditarPlanta);
		this.add(btn_EliminarPlanta);
		this.add(btn_Continuar);
		this.add(lbl_Fondo);
		
		btn_Continuar.addActionListener(this);
		cmb_Imagen.addActionListener(this);
		btn_AgregarPlanta.addActionListener(this);
		btn_EliminarPlanta.addActionListener(this);
		btn_EditarPlanta.addActionListener(this);
		
	}
	
public void Graficar(){
		
		try{
			int nodos = listaPlanta.Length();
			int indice = 0;
		
			archivo_txt = "digraph G {\n";
			archivo_txt = archivo_txt + "raíz;\n";
		
			while(indice<nodos){
			
					plantaTemporal = this.listaPlanta.getPlantaAt(indice);
			
					archivo_txt = archivo_txt + plantaTemporal.getNombre() + ";\n";
					archivo_txt = archivo_txt + plantaTemporal.getTipoAtaque() + ";\n";
					archivo_txt = archivo_txt + plantaTemporal.getPuntosAtaque() + ";\n";
					archivo_txt = archivo_txt + plantaTemporal.getPuntosDefensa() + ";\n";
					archivo_txt = archivo_txt + plantaTemporal.getImagenPlanta() + ";\n";
					
					archivo_txt = archivo_txt + plantaTemporal.getNombre() + "->" + plantaTemporal.getTipoAtaque() + "->" +
							plantaTemporal.getPuntosAtaque() + "->" + plantaTemporal.getPuntosDefensa() + "->" +
							plantaTemporal.getImagenPlanta() + ";\n";
			
					archivo_txt = archivo_txt + "raíz -> " + plantaTemporal.getNombre() + ";\n";
			
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
			
			File archivo = new File("C:/textoPlanta.txt");
			
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
			String fileInputPath = "C:/textoPlanta.txt";
			String fileOutputPath = "C:/imagenPlanta.jpg";
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
		
		if(cmb_Imagen.getSelectedIndex() == 0){
			
			lbl_ImagenPlanta.setIcon(planta1);
			
		}
		
		if(cmb_Imagen.getSelectedIndex() == 1){
			
			lbl_ImagenPlanta.setIcon(planta2);
			
		}
		
		if(cmb_Imagen.getSelectedIndex() == 2){
			
			lbl_ImagenPlanta.setIcon(planta3);
			
		}
		
		if(cmb_Imagen.getSelectedIndex() == 3){
			
			lbl_ImagenPlanta.setIcon(planta4);
			
		}
		
		if(cmb_Imagen.getSelectedIndex() == 4){
			
			lbl_ImagenPlanta.setIcon(planta5);
			
		}
		
		if(cmb_Imagen.getSelectedIndex() == 5){
			
			lbl_ImagenPlanta.setIcon(planta6);
			
		}
		
		if(cmb_Imagen.getSelectedIndex() == 6){
			
			lbl_ImagenPlanta.setIcon(planta7);
			
		}
		
		if(cmb_Imagen.getSelectedIndex() == 7){
			
			lbl_ImagenPlanta.setIcon(planta8);
			
		}
		
		if(cmb_Imagen.getSelectedIndex() == 8){
			
			lbl_ImagenPlanta.setIcon(planta9);
			
		}
		
		if(cmb_Imagen.getSelectedIndex() == 9){
			
			lbl_ImagenPlanta.setIcon(planta10);
			
		}
		
		if(btn_AgregarPlanta == e.getSource()){
			
			String NombrePlanta = this.txt_Nombre.getText();
			String TipoAtaque = this.cmb_TipoAtaque.getSelectedItem().toString();
			String ImagenPlanta = this.cmb_Imagen.getSelectedItem().toString();
			int PuntosAtaque = Integer.parseInt(this.txt_PuntosAtaque.getText());
			int PuntosDefensa = Integer.parseInt(this.txt_PuntosDefensa.getText());
			
			Planta PlantaTemporal = new Planta(NombrePlanta, TipoAtaque, ImagenPlanta, PuntosAtaque, PuntosDefensa);
			
			listaPlanta.Add(PlantaTemporal);
			JOptionPane.showMessageDialog(this, "El número de Plantas es " + listaPlanta.Length());
			
			Cola c = new Cola();
			c.adicionar((listaPlanta.Length()));
			
		}
		
		if(btn_EliminarPlanta == e.getSource()){
			
			this.listaPlanta.Remove();
			JOptionPane.showMessageDialog(this, "El número de plantas es" + this.listaPlanta.Length());
			
		}
		
		if(btn_EditarPlanta == e.getSource()){
			
			String mostrar = "";
			/*int casilla = 0;
			while(casilla<this.listaPlanta.Length()){
				
				Planta PlantaTemporal = this.listaPlanta.getPlantaAt(casilla);
				mostrar = mostrar + PlantaTemporal.getNombre() + "-" + PlantaTemporal.getTipoAtaque() + "-" + 
						PlantaTemporal.getPuntosAtaque() + "-" + PlantaTemporal.getPuntosDefensa() + "-" +
						PlantaTemporal.getImagenPlanta() + "\n";
				
				casilla++;
				
			}*/
			
			this.listaPlanta.ResetNextPlanta();
			Planta PlantaTemporal = this.listaPlanta.getNextPlanta();
			
			while(PlantaTemporal!=null){
				
				mostrar = mostrar + PlantaTemporal.getNombre() + "-" + PlantaTemporal.getTipoAtaque() + "-" + 
						PlantaTemporal.getPuntosAtaque() + "-" + PlantaTemporal.getPuntosDefensa() + "-" +
						PlantaTemporal.getImagenPlanta() + "\n";
				
				PlantaTemporal = this.listaPlanta.getNextPlanta();
				
			}
			
			System.out.println(mostrar);
			
		}
		
	}

}
