package ListaJugadores;

public class Jugador {
	

	public String Nombre;
	public int Cantidad;
	public String Extra;
	public String Tipo;
	
	public Jugador(String Nombre, String Extra, String Tipo, int Cantidad){
		
		this.Nombre = Nombre;
		this.Extra = Extra;
		this.Tipo = Tipo;
		this.Cantidad = Cantidad;
		
	}
	
	public String getNombre(){
		
		return Nombre;
		
	}
	
	public void setNombre(String Nombre){
		
		this.Nombre = Nombre;
		
	}
	
	public String getExtra(){
		
		return Extra;
		
	}
	
	public void setExtra(String Extra){
		
		this.Extra = Extra;
		
	}
	
	public String getTipo(){
		
		return Tipo;
		
	}
	
	public void setTipo(String Tipo){
		
		this.Tipo = Tipo;
		
	}
	
	public int getCantidad(){
		
		return Cantidad;
		
	}
	
	public void setCantidad(int Cantidad){
		
		this.Cantidad = Cantidad;
		
	}
	
}
