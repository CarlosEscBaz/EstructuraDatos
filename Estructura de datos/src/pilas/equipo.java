package pilas;

public class equipo 
{
	int id;
	String nombre, ciudad, estadio;
	
	public int getId() 
	{
		return id;
	}
	public void setId(int id) 
	{
		this.id = id;
	}
	public String getNombre() 
	{
		return nombre;
	}
	public void setNombre(String nombre) 
	{
		this.nombre = nombre;
	}
	public String getCiudad() 
	{
		return ciudad;
	}
	public void setCiudad(String ciudad) 
	{
		this.ciudad = ciudad;
	}
	public String getEstadio() 
	{
		return estadio;
	}
	public void setEstadio(String estadio) 
	{
		this.estadio = estadio;
	}
	
	@Override
	public String toString() 
	{
		return "equipo [id=" + id + ", nombre=" + nombre + ", ciudad=" + ciudad + ", estadio=" + estadio + "]";
	}

}
