import java.awt.*;

import javax.swing.*;

public class VenCamposZombie extends JFrame {

public JTextArea txt_Campos;
	
	public JButton btn_AgrCampos;
	
	public ImageIcon icono;
	
	public JLabel lbl_Fondo;
	
	public VenCamposZombie(){
		
		super("Agregar Más Campos Zombie!!!!");
		this.setSize(400, 400);
		this.setLayout(null);
		this.DefinirVentana();
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		
	}
	
	public void DefinirVentana(){
		
		icono = new ImageIcon("C:/Users/Elmer/Documents/Programacion/Proyectos Java/Práctica1/Imagenes/FCampos.png");
		
		txt_Campos = new JTextArea();
		txt_Campos.setBounds(40, 20, 300, 300);
		
		btn_AgrCampos = new JButton("Agregar");
		btn_AgrCampos.setBounds(90, 330, 200, 20);
		
		lbl_Fondo = new JLabel(icono);
		lbl_Fondo.setBounds(0, 0, 400, 400);
		
		/*btn_AgrCampos.setForeground(Color.WHITE);
		btn_AgrCampos.setBorderPainted(false);
		btn_AgrCampos.setContentAreaFilled(false);
		btn_AgrCampos.setFocusPainted(false);*/
		
		this.add(txt_Campos);
		this.add(btn_AgrCampos);
		this.add(lbl_Fondo);
		
	}
		
}
