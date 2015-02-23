package ListaJugadores;

public class Nodo {

	public Jugador jugador;
	Nodo Siguiente;
	Nodo Anterior;
	
	/**
	 * constructor de la clase
	 * @param jugador
	 */
	public Nodo (Jugador jugador){
		
		this.jugador = jugador;
		
	}

	/**
	 * retorna siguiente nodo a este nodo
	 * 
	 */
	public Nodo getSiguiente(){
		
		return Siguiente;
		
	}
	
	/**
	 * enlaza el nodo actual por el enlace siguiente con el nodo especificado
	 * @param sigiente el nodo con el que se va a enlazar
	 */
	public void setSiguiente(Nodo Siguiente){
		
		this.Siguiente = Siguiente;
		
	}
	
	/**
	 * retorna el nodo anterior a este nodo
	 * 
	 */
	public Nodo getAnterior(){
		
		return Anterior;
		
	}
	
	/**
	 * enlaza el nodo actual por el enlace anterior con el nodo especificado
	 * @param Anterior el nodo con el que se va a enlazar
	 */
	public void setAnterior(Nodo Anterior){
		
		this.Anterior = Anterior;
		
	}
	
	/**
	 * el jugador con el que se va a enlazar el nodo
	 * @return
	 */
	public Jugador getJugador(){
		
		return jugador;
	}
	
	/**
	 * Establece a null el enlace siguiente del nodo
	 * 
	 */
	public void RomperEnlaceSiguiente(){
		
		this.Siguiente = null;
		
	}
	
	/**
	 * Establece a null el enlace anterior del nodo
	 * 
	 */
	public void RomperEnlaceAnterior(){
		
		this.Anterior = null;
		
	}
	
}
