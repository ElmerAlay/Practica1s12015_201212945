package ListaZombies;

import javax.swing.JOptionPane;

public class Pila {
	
	private final int Maximo = 100;
	private int[] v;
	private int tope;
	
	public Pila(){
		
		this.v = new int [Maximo];
		this.tope = -1;
		
	}
	
	public boolean esVacia(){
		
		return tope == -1;
		
	}
	
	public boolean esLlena(){
		
		return tope == Maximo-1;
		
	}
	
	public void Apilar(int a){
		
		if(esLlena()){
			
			JOptionPane.showInputDialog("Pila llena");
			
		}else {
			
			tope++;
			v[tope] = a;
			
		}
		
	}
	
	public int desApilar(){
		
		int a = Integer.MIN_VALUE;
		
		if(esVacia()){
			
			JOptionPane.showInputDialog("Pila Vacía!");
			
		}else {
			
			a = v[tope];
			tope--;
			
		}
		
		return a;
		
	}
	
	public void Vaciar(Pila B){
		
		while(!B.esVacia()){
			
			this.Apilar(B.desApilar());
			
		}
		
	}
	
	public int Tamaño(){
		
		return tope + 1;
		
	}
	
	public int Cima(){
		
		return v[tope];
		
	}
	
	public void Mostrar(){
		
		Pila x = new Pila();
		
		while(!esVacia()){
			
			int a = desApilar();
			System.out.println(" " + a);
			x.Apilar(a);
			
		}
		
		this.Vaciar(x);
		
	}
	
}
