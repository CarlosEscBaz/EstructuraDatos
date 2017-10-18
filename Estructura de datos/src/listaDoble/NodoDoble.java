package listaDoble;

public class NodoDoble 
{
	private int id;
	private String 	nombre,
					album,
					artista,
					genero;
	private NodoDoble anterior, siguiente;
	
	public String getNombre() 
	{
		return nombre;
	}
	public void setNombre(String nombre) 
	{
		this.nombre = nombre;
	}	
	public int getId() 
	{
		return id;
	}
	public void setId(int id) 
	{
		this.id = id;
	}
	public String getAlbum() 
	{
		return album;
	}
	public void setAlbum(String album) 
	{
		this.album = album;
	}
	public String getArtista() 
	{
		return artista;
	}
	public void setArtista(String artista) 
	{
		this.artista = artista;
	}
	public String getGenero() 
	{
		return genero;
	}
	public void setGenero(String genero) 
	{
		this.genero = genero;
	}
	public NodoDoble getAnterior() 
	{
		return anterior;
	}
	public void setAnterior(NodoDoble anterior) 
	{
		this.anterior = anterior;
	}
	public NodoDoble getSiguiente() 
	{
		return siguiente;
	}
	public void setSiguiente(NodoDoble siguiente) 
	{
		this.siguiente = siguiente;
	}

}
