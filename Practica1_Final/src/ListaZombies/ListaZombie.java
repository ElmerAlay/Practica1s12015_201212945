package ListaZombies;

public class ListaZombie {

	public Nodo PrimerNodo;
	public Nodo UltimoNodo;
	public Nodo RegistroActual;
	public int length;
	
	public ListaZombie(){
		
		this.length = 0;
		
	}
	
	public void Add(Zombie ZombieAdicionar){
		
		Nodo NodoAdicionar = new Nodo(ZombieAdicionar);
		
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
	
	public Zombie getZombieAt(int Posicion){
		
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
			
			return NodoRequerido.getZombie();
			
		}
		
	}
	
	public Zombie getNextZombie(){
		
		if(this.RegistroActual == null){
			
			return null;
			
		}else {
			
			if(this.RegistroActual != null){
				
				Zombie Temporal = this.RegistroActual.getZombie();
				this.RegistroActual = this.RegistroActual.getSiguienteNodo();
				return Temporal;
				
			}else {
				
				return null;
				
			}
			
		}
		
	}
	
	public void ResetNextZombie(){
		
		this.RegistroActual = this.PrimerNodo;
		
	}
	
}
