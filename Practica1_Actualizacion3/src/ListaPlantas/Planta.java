package ListaPlantas;

public class Planta {

	public String Nombre;
	public String TipoAtaque;
	public String ImagenPlanta;
	public int PuntosAtaque;
	public int PuntosDefensa;
	
	public Planta(String Nombre, String TipoAtaque, String ImagenPlanta, int PuntosAtaque, int PuntosDefensa){
		
		this.Nombre = Nombre;
		this.TipoAtaque = TipoAtaque;
		this.ImagenPlanta = ImagenPlanta;
		this.PuntosAtaque = PuntosAtaque;
		this.PuntosDefensa = PuntosDefensa;
		
	}
	
	public String getNombre(){
		
		return Nombre;
		
	}
	
	public String getTipoAtaque(){
		
		return TipoAtaque;
		
	}
	
	public String getImagenPlanta(){
		
		return ImagenPlanta;
		
	}
	
	public int getPuntosAtaque(){
		
		return PuntosAtaque;
		
	}
	
	public int getPuntosDefensa(){
		
		return PuntosDefensa;
		
	}
	
	public void setNombre(String Nombre){
		
		this.Nombre = Nombre;
		
	}
	
	public void setTipoAtaque(String TipoAtaque){
		
		this.TipoAtaque = TipoAtaque;
		
	}
	
	public void setImagenPlanta(String ImagenPlanta){
		
		this.ImagenPlanta = ImagenPlanta;
		
	}
	
	public void setPuntosAtaque(int PuntosAtaque){
		
		this.PuntosAtaque = PuntosAtaque;
		
	}
	
	public void setPuntosDefensa(int PuntosDefensa){
		
		this.PuntosDefensa = PuntosDefensa;
		
	}
	
}
