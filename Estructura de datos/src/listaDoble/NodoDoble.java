package listaDoble;

public class NodoDoble 
{
	
	private NodoDoble anterior, siguiente;
	private Cancion cancion;
	
	public Cancion getCancion() {
		return cancion;
	}
	public void setCancion(Cancion cancion) {
		this.cancion = cancion;
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
	
	@Override
	public String toString() {
		return "NodoDoble [anterior=" + anterior + ", siguiente=" + siguiente + ", cancion=" + cancion.toString() + "]";
	}
	

}
