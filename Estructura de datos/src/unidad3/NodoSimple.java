package unidad3;

public class NodoSimple 
{
	//Estos son los atributos que tendr�n los objetos de la clase NodoSimple
	private int dato;
	private NodoSimple siguiente;
	
	//Estos son los m�todos para acceder a los atributos de los objetos de esta clase
	public int getDato() 
	{
		return dato;
	}
	public void setDato(int dato) 
	{
		this.dato = dato;
	}
	public NodoSimple getSiguiente() 
	{
		return siguiente;
	}
	public void setSiguiente(NodoSimple siguiente) 
	{
		this.siguiente = siguiente;
	}
}
