package ListaJugadores;

public class ListaJugador {

	public Nodo primerNodo;
	public Nodo ultimoNodo;
	public Nodo registroActual;
	public int length;
	
	public ListaJugador(){
		
		this.length = 0;
		
	}
	
	/**
	 * adiciona el jugadorAdicionar al final de la lista
	 * @param jugadorAdicionar el jugador que se quiere adicionar a la lista
	 */
	public void Add(Jugador jugadorAdicionar){
		
		Nodo nodoAdicionar = new Nodo(jugadorAdicionar);
		
		if(this.primerNodo == null){
			
			this.primerNodo = nodoAdicionar;
			this.ultimoNodo = this.primerNodo;
			this.registroActual = this.primerNodo;
			
		}else {
			
			this.ultimoNodo.setSiguiente(nodoAdicionar);
			nodoAdicionar.setAnterior(ultimoNodo);
			this.ultimoNodo = nodoAdicionar;
			
			/*Nodo nodoActual;
			nodoActual = this.primerNodo;
			
			while(nodoActual.getSiguiente()!=null){
				
				nodoActual = nodoActual.getSiguiente();
				
			}
			
			nodoActual.setSiguiente(nodoAdicionar);
			nodoAdicionar.setAnterior(nodoActual);*/
			
		}
		
		this.length++;
		
	}
	
	/**
	 * retorna el numero de elementos de la lista
	 * @return numero total de elementos
	 */
	public int Length(){
		
		return this.length;
		
	}
	
	/**
	 * remueve el ultimo jugador de la lista;
	 */
	public void Remove(){
		
		if(this.primerNodo==null){
			
			return;
			
		}
		
		if(this.length==1){
			
			this.primerNodo = null;
			
		}else{
			
			/*Nodo nodoActual = this.primerNodo;
			
			while(nodoActual.getSiguiente()!=null){
				
				nodoActual = nodoActual.getSiguiente();
				
			}*/
			
			Nodo nodoAnteriorActual;
			nodoAnteriorActual = this.ultimoNodo.getAnterior();
			
			nodoAnteriorActual.RomperEnlaceSiguiente();
			this.ultimoNodo.RomperEnlaceAnterior();
			this.ultimoNodo = nodoAnteriorActual;
			
		}
		
		this.length--;
		
	}
	
	/**
	 * Retorna el jugador de la posicion indicada
	 * @param posicion posicion del jugador que se quiere retornar
	 * @return jugador ubicado en la posicion
	 */
	public Jugador getJugadorAt(int posicion){
		
		if(this.primerNodo==null){
			
			return null;
			
		}else if(posicion >= length){
			
			return null;
			
		}else {
			
			Nodo nodoRequerido;
			nodoRequerido = this.primerNodo;
			int contador = 0;
			
			while(contador<posicion){
				
				nodoRequerido = nodoRequerido.getSiguiente();
				contador++;
				
			}
			
			return nodoRequerido.getJugador();
			
		}
		
	}
	
	public Jugador getNextJugador(){
		
		if(registroActual == null){
			
			return null;
			
		}else {
			
			if(this.registroActual != null){
				
				Jugador temporal;
				temporal = this.registroActual.getJugador();
				this.registroActual = this.registroActual.getSiguiente();
				
				return temporal;
				
			}else {
				
				return null;
				
			}
			
		}
		
	}
	
	/**
	 * Reubica el registro actual en el primer jugador
	 */
	public void ResetNextPaciente(){
		
		this.registroActual = this.primerNodo;
		
	}
	
}
