package ListaZombies;

public class Nodo {
	

	public Nodo AnteriorNodo;
	public Nodo SiguienteNodo;
	public Zombie zombie;
	
	public Nodo(Zombie zombie){
		
		this.zombie = zombie;
		
	}
	
	public Nodo getSiguienteNodo(){
		
		return SiguienteNodo;
		
	}
	
	public Nodo getAnteriorNodo(){
		
		return AnteriorNodo;
		
	}
	
	public void setSiguienteNodo(Nodo SiguienteNodo){
		
		this.SiguienteNodo = SiguienteNodo;
		
	}
	
	public void setAnteriorNodo(Nodo AnteriorNodo){
		
		this.AnteriorNodo = AnteriorNodo;
		
	}
	
	public Zombie getZombie(){
		
		return zombie;
		
	}
	
	public void RomperEnlaceSiguiente(){
		
		this.SiguienteNodo = null;
		
	}
	
	public void RomperEnlaceAnterior(){
		
		this.AnteriorNodo = null;
		
	}
	

}
