import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class CreacionPlantas extends JFrame implements ActionListener {

	public JLabel lbl_Nombre;
	public JLabel lbl_PuntosAtaque;
	public JLabel lbl_TipoAtaque;
	public JLabel lbl_PuntosDefensa;
	public JLabel lbl_Imagen;
	
	public JComboBox cmb_TipoAtaque;
	public JComboBox cmb_Imagen;
	
	public JTextField txt_Nombre;
	public JTextField txt_PuntosAtaque;
	public JTextField txt_PuntosDefensa;
	
	public JButton AgregarPlanta;
	public JButton EliminarPlanta;
	public JButton EditarPlanta;
	public JButton Continuar;
	
	public CreacionPlantas(){
		
		super("Creación de Plantas");
		this.setLayout(null);
		this.setSize(600, 600);
		this.DefinirVentana();
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(false);
		
	}
	
	public void DefinirVentana(){
		
		lbl_Nombre = new JLabel();
		
	}
	
	public void actionPerformed(ActionEvent e) {
	}

}
