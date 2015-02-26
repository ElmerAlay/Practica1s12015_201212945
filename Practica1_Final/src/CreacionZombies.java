import java.awt.*;
import java.awt.event.*;
import java.io.File;
import java.io.FileWriter;

import javax.swing.*;

import ListaZombies.*;


public class CreacionZombies extends JFrame implements ActionListener {
	
	ListaZombie listaZombie = new ListaZombie();
	public Pila p  =  new Pila();
	public Zombie zombieTemporal;
	public String archivo_txt;
	public String archivo_txtPila;
	public int nodos;
	
	public JLabel lbl_Nombre;
	public JLabel lbl_PuntosAtaque;
	public JLabel lbl_TipoAtaque;
	public JLabel lbl_PuntosDefensa;
	public JLabel lbl_Imagen;
	public JLabel lbl_Fondo;
	public JLabel lbl_ImagenZombie;
	
	public ImageIcon ico_fondo;
	public ImageIcon zombie1, zombie2, zombie3;
	public ImageIcon zombie4, zombie5, zombie6;
	public ImageIcon zombie7, zombie8, zombie9;
	public ImageIcon zombie10;
	
	public JComboBox cmb_TipoAtaque;
	public JComboBox cmb_Imagen;
	
	public JTextField txt_Nombre;
	public JTextField txt_PuntosAtaque;
	public JTextField txt_PuntosDefensa;
	
	public JButton btn_AgregarZombie;
	public JButton btn_EliminarZombie;
	public JButton btn_EditarZombie;
	public JButton btn_Continuar;
	public JButton btn_Graficar;
	
	public CreacionZombies(){
		
		super("Creación de Zombies");
		this.setLayout(null);
		this.setSize(600, 600);
		this.DefinirVentana();
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(false);
		
	}
	
	public void DefinirVentana(){
		
		ico_fondo = new ImageIcon("C:/Users/Elmer/Documents/Programacion/Proyectos Java/Practica1/Imagenes/FZombie.png");
		zombie1 = new ImageIcon("C:/Users/Elmer/Documents/Programacion/Proyectos Java/Practica1/Imagenes/ImagenesZombies/ImagenesZombiesEditadas/zombie1.png");
		zombie2 = new ImageIcon("C:/Users/Elmer/Documents/Programacion/Proyectos Java/Practica1/Imagenes/ImagenesZombies/ImagenesZombiesEditadas/zombie2.png");
		zombie3 = new ImageIcon("C:/Users/Elmer/Documents/Programacion/Proyectos Java/Practica1/Imagenes/ImagenesZombies/ImagenesZombiesEditadas/zombie3.png");
		zombie4 = new ImageIcon("C:/Users/Elmer/Documents/Programacion/Proyectos Java/Practica1/Imagenes/ImagenesZombies/ImagenesZombiesEditadas/zombie4.png");
		zombie5 = new ImageIcon("C:/Users/Elmer/Documents/Programacion/Proyectos Java/Practica1/Imagenes/ImagenesZombies/ImagenesZombiesEditadas/zombie5.png");
		zombie6 = new ImageIcon("C:/Users/Elmer/Documents/Programacion/Proyectos Java/Practica1/Imagenes/ImagenesZombies/ImagenesZombiesEditadas/zombie6.png");
		zombie7 = new ImageIcon("C:/Users/Elmer/Documents/Programacion/Proyectos Java/Practica1/Imagenes/ImagenesZombies/ImagenesZombiesEditadas/zombie7.png");
		zombie8 = new ImageIcon("C:/Users/Elmer/Documents/Programacion/Proyectos Java/Practica1/Imagenes/ImagenesZombies/ImagenesZombiesEditadas/zombie8.png");
		zombie9 = new ImageIcon("C:/Users/Elmer/Documents/Programacion/Proyectos Java/Practica1/Imagenes/ImagenesZombies/ImagenesZombiesEditadas/zombie9.png");
		zombie10 = new ImageIcon("C:/Users/Elmer/Documents/Programacion/Proyectos Java/Practica1/Imagenes/ImagenesZombies/ImagenesZombiesEditadas/zombie10.png");
		
		lbl_Nombre = new JLabel("Nombre");
		lbl_TipoAtaque = new JLabel("Tipo de Ataque");
		lbl_PuntosAtaque = new JLabel("Puntos de Ataque");
		lbl_PuntosDefensa = new JLabel("Puntos de Defensa");
		lbl_Imagen = new JLabel("Imagen");
		lbl_Fondo = new JLabel();
		lbl_ImagenZombie = new JLabel();
		
		lbl_Fondo.setBounds(0, 0, 600, 600);
		lbl_Fondo.setIcon(ico_fondo);
		
		lbl_ImagenZombie.setBounds(225, 320, 200, 200);
		lbl_ImagenZombie.setIcon(zombie1);
		
		lbl_Nombre.setBounds(141, 130, 100, 20);
		lbl_Nombre.setForeground(Color.WHITE);
		lbl_Nombre.setFont(new java.awt.Font("Tahoma", 0, 20));
		
		lbl_TipoAtaque.setBounds(75, 170, 200, 20);
		lbl_TipoAtaque.setForeground(Color.WHITE);
		lbl_TipoAtaque.setFont(new java.awt.Font("Tahoma", 0, 20));
		
		lbl_PuntosAtaque.setBounds(55, 210, 200, 20);
		lbl_PuntosAtaque.setForeground(Color.WHITE);
		lbl_PuntosAtaque.setFont(new java.awt.Font("Tahoma", 0, 20));
		
		lbl_PuntosDefensa.setBounds(49, 250, 200, 20);
		lbl_PuntosDefensa.setForeground(Color.WHITE);
		lbl_PuntosDefensa.setFont(new java.awt.Font("Tahoma", 0, 20));
		
		lbl_Imagen.setBounds(147, 290, 200, 20);
		lbl_Imagen.setForeground(Color.WHITE);
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
		cmb_Imagen.addItem("Imagen_1");
		cmb_Imagen.addItem("Imagen_2");
		cmb_Imagen.addItem("Imagen_3");
		cmb_Imagen.addItem("Imagen_4");
		cmb_Imagen.addItem("Imagen_5");
		cmb_Imagen.addItem("Imagen_6");
		cmb_Imagen.addItem("Imagen_7");
		cmb_Imagen.addItem("Imagen_8");
		cmb_Imagen.addItem("Imagen_9");
		cmb_Imagen.addItem("Imagen_10");
		
		btn_AgregarZombie = new JButton("Agregar Zombie");
		btn_EditarZombie = new JButton("Editar Zombie");
		btn_EliminarZombie = new JButton("Eliminar Zombie");
		btn_Continuar = new JButton("Continuar");
		btn_Graficar = new JButton("Graficar");
		
		btn_AgregarZombie.setBounds(25, 350, 150, 50);
		btn_EditarZombie.setBounds(25, 410, 150, 50);
		btn_EliminarZombie.setBounds(25, 470, 150, 50);
		btn_Continuar.setBounds(450, 470, 100, 50);
		btn_Graficar.setBounds(450, 410, 100, 50);
		
		btn_AgregarZombie.setFocusPainted(false);
		btn_EditarZombie.setFocusPainted(false);
		btn_EliminarZombie.setFocusPainted(false);
		btn_Continuar.setFocusPainted(false);
		btn_Graficar.setFocusPainted(false);
		
		btn_AgregarZombie.setContentAreaFilled(false);
		btn_EditarZombie.setContentAreaFilled(false);
		btn_EliminarZombie.setContentAreaFilled(false);
		btn_Continuar.setContentAreaFilled(false);
		btn_Graficar.setContentAreaFilled(false);
		
		btn_AgregarZombie.setForeground(Color.WHITE);
		btn_EditarZombie.setForeground(Color.WHITE);
		btn_EliminarZombie.setForeground(Color.WHITE);
		btn_Continuar.setForeground(Color.WHITE);
		btn_Graficar.setForeground(Color.WHITE);
		
		this.add(lbl_Nombre);
		this.add(lbl_TipoAtaque);
		this.add(lbl_PuntosAtaque);
		this.add(lbl_PuntosDefensa);
		this.add(lbl_Imagen);
		this.add(lbl_ImagenZombie);
		this.add(txt_Nombre);
		this.add(txt_PuntosAtaque);
		this.add(txt_PuntosDefensa);
		this.add(cmb_Imagen);
		this.add(cmb_TipoAtaque);
		this.add(btn_AgregarZombie);
		this.add(btn_EditarZombie);
		this.add(btn_EliminarZombie);
		this.add(btn_Continuar);
		this.add(btn_Graficar);
		this.add(lbl_Fondo);
		
		btn_Continuar.addActionListener(this);
		cmb_Imagen.addActionListener(this);
		btn_AgregarZombie.addActionListener(this);
		btn_Graficar.addActionListener(this);
		btn_EliminarZombie.addActionListener(this);
		btn_EditarZombie.addActionListener(this);
		
	}
	
public void Graficar(){
		
		try{
			int nodos = listaZombie.Length();
			int indice = 0;
		
			archivo_txt = "digraph G {\n";
			archivo_txt = archivo_txt + "raíz;\n";
		
			while(indice<nodos){
			
					zombieTemporal = this.listaZombie.getZombieAt(indice);
			
					archivo_txt = archivo_txt + zombieTemporal.getNombre() + ";\n";
					archivo_txt = archivo_txt + zombieTemporal.getTipoAtaque() + ";\n";
					archivo_txt = archivo_txt + zombieTemporal.getPuntosAtaque() + ";\n";
					archivo_txt = archivo_txt + zombieTemporal.getPuntosDefensa() + ";\n";
					archivo_txt = archivo_txt + zombieTemporal.getImagenZombie() + ";\n";
					
					archivo_txt = archivo_txt + zombieTemporal.getNombre() + "->" + zombieTemporal.getTipoAtaque() + "->" +
							zombieTemporal.getPuntosAtaque() + "->" + zombieTemporal.getPuntosDefensa() + "->" +
							zombieTemporal.getImagenZombie() + ";\n";
			
					archivo_txt = archivo_txt + "raíz -> " + zombieTemporal.getNombre() + ";\n";
			
					indice++;
			
			}
		
			archivo_txt = archivo_txt + "}";
		
			System.out.println(archivo_txt);
			
		}catch(Exception e){
			
			System.out.println("Error al graficar");
			
		}
		
		
	}

	public void GraficarPila(){
	
		try{
		//System.out.println(nodos);
			int indice = 0;
			nodos = p.Tamaño();
			archivo_txtPila = "digraph G {\n";
			archivo_txtPila = archivo_txtPila + "raíz;\n";
			archivo_txtPila = archivo_txtPila + "raíz -> ";
		
			while(nodos>indice){
			
				zombieTemporal = this.listaZombie.getZombieAt(nodos-1);
			
				archivo_txtPila = archivo_txtPila + zombieTemporal.getNombre() + ";\n";
				archivo_txtPila = archivo_txtPila + zombieTemporal.getNombre() + "->";
			
				nodos--;
			
			}
	
			archivo_txtPila = archivo_txtPila + zombieTemporal.getNombre() + ";\n";
			archivo_txtPila = archivo_txtPila + "}";
	
			System.out.println(archivo_txtPila);
			//System.out.println(p.Tamaño());
		
		}catch(Exception e){
		
			System.out.println("Error al graficar");
			
		}
		
	}
	
	public void CrearArchivo(){
		
		try{
			
			File archivo = new File("C:/textoZombie.txt");
			
			FileWriter escribir = new FileWriter(archivo, true);
			
			escribir.write(archivo_txt);
			escribir.close();
			
		}catch(Exception e){
			System.out.println("Error al escribir");
		}
		
	}
	
	public void CrearArchivoPila(){
		
		try{
			
			File archivo = new File("C:/textoPila.txt");
			
			FileWriter escribir = new FileWriter(archivo, true);
			
			escribir.write(archivo_txtPila);
			escribir.close();
			
		}catch(Exception e){
			System.out.println("Error al escribir");
		}
		
	}
	
	public void Dibujar(){
		
		try{
			
			String dotPath = "C:/Program Files (x86)/Graphviz2.39/bin/dot.exe";
			String fileInputPath = "C:/textoZombie.txt";
			String fileOutputPath = "C:/imagenZombie.jpg";
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
			rt.runFinalization();
			
		}catch(Exception e){
			
			JOptionPane.showMessageDialog(this, "Error al dibujar");
			System.out.println("Error al dibujar");
			
		}finally{
			
		}
		
	}
	
public void DibujarPila(){
		
		try{
			
			String dotPath = "C:/Program Files (x86)/Graphviz2.39/bin/dot.exe";
			String fileInputPath = "C:/textoPila.txt";
			String fileOutputPath = "C:/imagenPila.jpg";
			String tParam = "-Tjpg";
			String tOParam = "-o";
			
			String [] cmd = new String[5];
			
			cmd[0] = dotPath;
			cmd[1] = tParam;
			cmd[2] = fileInputPath;
			cmd[3] = tOParam;
			cmd[4] = fileOutputPath;
			
			Runtime rt2 = Runtime.getRuntime();
			rt2.exec(cmd);
			
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
			
			lbl_ImagenZombie.setIcon(zombie1);
			
		}
		
		if(cmb_Imagen.getSelectedIndex() == 1){
			
			lbl_ImagenZombie.setIcon(zombie2);
			
		}
		
		if(cmb_Imagen.getSelectedIndex() == 2){
			
			lbl_ImagenZombie.setIcon(zombie3);
			
		}
		
		if(cmb_Imagen.getSelectedIndex() == 3){
			
			lbl_ImagenZombie.setIcon(zombie4);
			
		}
		
		if(cmb_Imagen.getSelectedIndex() == 4){
			
			lbl_ImagenZombie.setIcon(zombie5);
			
		}
		
		if(cmb_Imagen.getSelectedIndex() == 5){
			
			lbl_ImagenZombie.setIcon(zombie6);
			
		}
		
		if(cmb_Imagen.getSelectedIndex() == 6){
			
			lbl_ImagenZombie.setIcon(zombie7);
			
		}
		
		if(cmb_Imagen.getSelectedIndex() == 7){
			
			lbl_ImagenZombie.setIcon(zombie8);
			
		}
		
		if(cmb_Imagen.getSelectedIndex() == 8){
			
			lbl_ImagenZombie.setIcon(zombie9);
			
		}
		
		if(cmb_Imagen.getSelectedIndex() == 9){
			
			lbl_ImagenZombie.setIcon(zombie10);
			
		}
		
		if(btn_AgregarZombie == e.getSource()){
			
			try{
				
				String NombreZombie = this.txt_Nombre.getText();
				String TipoAtaque = this.cmb_TipoAtaque.getSelectedItem().toString();
				String ImagenZombie = this.cmb_Imagen.getSelectedItem().toString();
				int PuntosAtaque = Integer.parseInt(this.txt_PuntosAtaque.getText());
				int PuntosDefensa = Integer.parseInt(this.txt_PuntosDefensa.getText());
				
				Zombie ZombieTemporal = new Zombie(NombreZombie, TipoAtaque, ImagenZombie, PuntosAtaque, PuntosDefensa);
				
				listaZombie.Add(ZombieTemporal);
				JOptionPane.showMessageDialog(this, "El número de Zombies es " + listaZombie.Length());
				
				p.Apilar(listaZombie.Length());
				nodos  = this.p.Tamaño();
				System.out.println(nodos);
				
			}catch(Exception arg){
				JOptionPane.showMessageDialog(this, "Error al insertar");
			}
			
		}
		
		if(btn_Graficar == e.getSource()){
			
			this.Graficar();
			this.CrearArchivo();
			this.Dibujar();
			
			this.GraficarPila();
			this.DibujarPila();
			this.CrearArchivoPila();
			
		}
		
		if(btn_EliminarZombie == e.getSource()){
			
			this.listaZombie.Remove();
			JOptionPane.showMessageDialog(this, "El número de plantas es" + this.listaZombie.Length());
			
		}
		
		if(btn_EditarZombie == e.getSource()){
			
			try{
				
				int posicion = Integer.parseInt(JOptionPane.showInputDialog("Digite posición"));
				Zombie ZombieTemporal = this.listaZombie.getZombieAt(posicion);
				
				String NombreZombie = this.txt_Nombre.getText();
				String TipoAtaque = this.cmb_TipoAtaque.getSelectedItem().toString();
				String ImagenZombie = this.cmb_Imagen.getSelectedItem().toString();
				int PuntosAtaque = Integer.parseInt(this.txt_PuntosAtaque.getText());
				int PuntosDefensa = Integer.parseInt(this.txt_PuntosDefensa.getText());
				
				ZombieTemporal.setNombre(NombreZombie);
				ZombieTemporal.setTipoAtaque(TipoAtaque);
				ZombieTemporal.setImagenZombie(ImagenZombie);
				ZombieTemporal.setPuntosAtaque(PuntosAtaque);
				ZombieTemporal.setPuntosDefensa(PuntosDefensa);
				
			}catch(Exception arg){
				JOptionPane.showMessageDialog(this, "Error al modificar");
			}
			
			/*int casilla = 0;
			while(casilla<this.listaPlanta.Length()){
				
				Planta PlantaTemporal = this.listaPlanta.getPlantaAt(casilla);
				mostrar = mostrar + PlantaTemporal.getNombre() + "-" + PlantaTemporal.getTipoAtaque() + "-" + 
						PlantaTemporal.getPuntosAtaque() + "-" + PlantaTemporal.getPuntosDefensa() + "-" +
						PlantaTemporal.getImagenPlanta() + "\n";
				
				casilla++;
				
			}*/
			
		}
		
	}

}
