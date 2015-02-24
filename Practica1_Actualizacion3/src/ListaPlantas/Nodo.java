package ListaPlantas;

public class Nodo {

	public Nodo AnteriorNodo;
	public Nodo SiguienteNodo;
	public Planta planta;
	
	public Nodo(Planta planta){
		
		this.planta = planta;
		
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
	
	public Planta getPlanta(){
		
		return planta;
		
	}
	
	public void RomperEnlaceSiguiente(){
		
		this.SiguienteNodo = null;
		
	}
	
	public void RomperEnlaceAnterior(){
		
		this.AnteriorNodo = null;
		
	}
	
}
