package ListaPlantas;

public class ListaPlanta {

	public Nodo PrimerNodo;
	public Nodo UltimoNodo;
	public Nodo RegistroActual;
	public int length;
	
	public ListaPlanta(){
		
		this.length = 0;
		
	}
	
	public void Add(Planta PlantaAdicionar){
		
		Nodo NodoAdicionar = new Nodo(PlantaAdicionar);
		
		if(this.PrimerNodo == null){
			
			this.PrimerNodo = NodoAdicionar;
			this.UltimoNodo = this.PrimerNodo;
			this.RegistroActual = this.PrimerNodo;
			
		}else {
			
			this.UltimoNodo.setSiguienteNodo(NodoAdicionar);
			NodoAdicionar.setAnteriorNodo(UltimoNodo);
			this.UltimoNodo = NodoAdicionar;
			
		}
		
		this.length++;
		
	}
	
	public int Length(){
		
		return this.length;
		
	}
	
	public void Remove(){
		
		if(this.PrimerNodo == null){
			
			return;
			
		}else if(this.length==1){
			
			this.PrimerNodo = null;
			
		}else {
			
			Nodo NodoAnteriorActual = this.UltimoNodo.getAnteriorNodo();
			NodoAnteriorActual.RomperEnlaceSiguiente();
			this.UltimoNodo.RomperEnlaceAnterior();
			this.UltimoNodo = NodoAnteriorActual;
			
		}
		
		this.length--;
		
	}
	
	public Planta getPlantaAt(int Posicion){
		
		if(this.PrimerNodo == null){
			
			return null;
			
		}else if(Posicion >= this.length){
			
			return null;
			
		}else {
			
			Nodo NodoRequerido = this.PrimerNodo;
			int Contador = 0;
			
			while(Contador < Posicion){
				
				NodoRequerido = NodoRequerido.getSiguienteNodo();
				Contador++;
				
			}
			
			return NodoRequerido.getPlanta();
			
		}
		
	}
	
	public Planta getNextPlanta(){
		
		if(this.RegistroActual == null){
			
			return null;
			
		}else {
			
			if(this.RegistroActual != null){
				
				Planta Temporal = this.RegistroActual.getPlanta();
				this.RegistroActual = this.RegistroActual.getSiguienteNodo();
				return Temporal;
				
			}else {
				
				return null;
				
			}
			
		}
		
	}
	
	public void ResetNextPlanta(){
		
		this.RegistroActual = this.PrimerNodo;
		
	}
	
}
