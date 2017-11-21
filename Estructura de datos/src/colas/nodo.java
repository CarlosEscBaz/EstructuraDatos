package colas;

public class nodo 
{
	private nodo siguiente;
	private equipo e;
	
	public nodo getSiguiente() 
	{
		return siguiente;
	}
	public void setSiguiente(nodo siguiente) 
	{
		this.siguiente = siguiente;
	}
	public equipo getE() 
	{
		return e;
	}
	public void setE(equipo e) 
	{
		this.e = e;
	}
}
