import java.awt.*;
import javax.swing.*;

public class JPlantas extends JFrame {

	public JButton btn_AgregarCampos;
	public JButton btn_Continuar;
	
	public JTextField txt_Nombre;
	public JTextField txt_Cantidad;
	
	public JLabel lbl_Nombre;
	public JLabel lbl_Cantidad;
	public JLabel lbl_Fondo;
	
	public ImageIcon icono;
	public ImageIcon iconoNombre;
	public ImageIcon iconoCantidad;
	
	public JPlantas(){
		
		super("Jugador Plantas!!!!");
		this.setSize(500,500);
		this.setLayout(null);
		this.DefinirVentana();
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		
	}
	
	public void DefinirVentana(){
		
		icono = new ImageIcon("C:/Users/Elmer/Documents/Programacion/Proyectos Java/Práctica1/Imagenes/FPlanta.png");
		iconoNombre = new ImageIcon("C:/Users/Elmer/Documents/Programacion/Proyectos Java/Práctica1/Imagenes/NomJugadorIco.png");
		iconoCantidad = new ImageIcon("C:/Users/Elmer/Documents/Programacion/Proyectos Java/Práctica1/Imagenes/CantJugadorIco.png");
		
		btn_AgregarCampos = new JButton("Agregar Más Campos");
		btn_Continuar = new JButton("Continuar");
		
		btn_AgregarCampos.setBounds(40, 300, 200, 100);
		btn_Continuar.setBounds(250, 300, 200, 100);
		
		txt_Nombre = new JTextField(20);
		txt_Cantidad = new JTextField(20);
		
		txt_Nombre.setBounds(200, 100, 250, 50);
		txt_Cantidad.setBounds(200, 170, 250, 50);
		
		lbl_Nombre = new JLabel(iconoNombre);
		lbl_Cantidad = new JLabel(iconoCantidad);
		lbl_Fondo = new JLabel();
		
		lbl_Nombre.setForeground(Color.WHITE);
		lbl_Cantidad.setForeground(Color.WHITE);
		
		btn_Continuar.setForeground(Color.WHITE);
		btn_AgregarCampos.setForeground(Color.WHITE);
		
		btn_Continuar.setFocusPainted(false);
		btn_AgregarCampos.setFocusPainted(false);
		
		btn_Continuar.setContentAreaFilled(false);
		btn_AgregarCampos.setContentAreaFilled(false);
		
		btn_Continuar.setBorderPainted(false);
		btn_AgregarCampos.setBorderPainted(false);

		lbl_Nombre.setBounds(90, 100, 100, 50);
		lbl_Cantidad.setBounds(90, 170, 100, 50);
		lbl_Fondo.setBounds(0, 0, 500, 500);
		
		lbl_Fondo.setIcon(icono);
		
		this.add(btn_AgregarCampos);
		this.add(btn_Continuar);
		
		this.add(txt_Cantidad);
		this.add(txt_Nombre);
		
		this.add(lbl_Nombre);
		this.add(lbl_Cantidad);
		this.add(lbl_Fondo);
		
	}
	
}
