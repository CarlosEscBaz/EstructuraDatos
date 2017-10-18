package listaDoble;

import unidad3.NodoSimple;

public class ListaDoble 
{
	private NodoDoble cabeza;

	public NodoDoble getCabeza() 
	{
		return cabeza;
	}

	public void setCabeza(NodoDoble cabeza) 
	{
		this.cabeza = cabeza;
	}
	
	public boolean isVacio()
	{
		boolean bandera=false;
		
		if (this.getCabeza()==null)
		{
			bandera=true;
		}
		
		return bandera;
	}
	
	public void insertar(NodoDoble nuevo)
	{
		nuevo.setAnterior(null);
		nuevo.setSiguiente(null);
		this.cabeza=nuevo;
	}
	
	public void insertarPrincipio(NodoDoble nuevo)
	{
		
		if(this.isVacio())
		{
			this.insertar(nuevo);
		}
		else
		{
			nuevo.setSiguiente(this.cabeza);
			this.cabeza.setAnterior(nuevo);
			this.cabeza=nuevo;
		}
	}
	
	public StringBuilder imprimir() 
	{
		StringBuilder cadena=new StringBuilder();
		cadena.append("Cabeza-->");
		NodoDoble temporal=this.cabeza;
		
		while(temporal!=null) 
		{
			cadena.append("Nombre: "+temporal.getNombre()+" ");
			cadena.append("Id: "+temporal.getId()+" ");
			cadena.append("Álbum: "+temporal.getAlbum()+" ");
			cadena.append("Artista: "+temporal.getArtista()+" ");
			cadena.append("Género: "+temporal.getGenero()+" ");
			cadena.append("\n");
			temporal=temporal.getSiguiente();
		}
		
		cadena.append("NULL");
		return cadena;
	}

}
