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
	
	public boolean insertarPrincipio(NodoDoble nuevo)
	{
		boolean bandera=false;
		
		if(this.isVacio())
		{
			this.insertar(nuevo);
			bandera=true;
		}
		else
		{
			nuevo.setSiguiente(this.cabeza);
			this.cabeza.setAnterior(nuevo);
			this.cabeza=nuevo;
			bandera=true;
		}
		
		return bandera;
	}
	
	public boolean insertarFinal(NodoDoble nuevo)
	{
		boolean bandera=false;
		
		if(this.isVacio())
		{
			this.insertar(nuevo);
			bandera=true;
		}
		else
		{
			nuevo.setSiguiente(null);
			nuevo.setAnterior(this.cabeza);
			this.cabeza.setSiguiente(nuevo);
			bandera=true;
		}
		
		return bandera;
	}
	
	public boolean eliminarPrimerNodo()
	{
		boolean bandera=false;
		
		
		return bandera;
	}
	
	public StringBuilder imprimirAdelante() 
	{
		StringBuilder cadena=new StringBuilder();
		cadena.append("--Cabeza--\n");
		NodoDoble temporal=this.cabeza;
		
		while(temporal!=null) 
		{
			cadena.append("\t-Nombre: "+temporal.getCancion().getNombre()+" ");
			cadena.append("Id: "+temporal.getCancion().getId()+" ");
			cadena.append("Álbum: "+temporal.getCancion().getAlbum()+" ");
			cadena.append("Artista: "+temporal.getCancion().getArtista()+" ");
			cadena.append("Género: "+temporal.getCancion().getGenero()+" ");
			cadena.append("\n");
			temporal=temporal.getSiguiente();
		}
		
		cadena.append("--NULL--");
		return cadena;
	}
	
	public StringBuilder imprimirAtras() 
	{
		StringBuilder cadena=new StringBuilder();
		cadena.append("--Fin de la lista--\n");
		NodoDoble temporal=this.cabeza;
		
		while (temporal.getSiguiente()!=null)
		{
			temporal=temporal.getSiguiente();
		}
		
		while(temporal!=null) 
		{
			cadena.append("\t-Nombre: "+temporal.getCancion().getNombre()+" ");
			cadena.append("Id: "+temporal.getCancion().getId()+" ");
			cadena.append("Álbum: "+temporal.getCancion().getAlbum()+" ");
			cadena.append("Artista: "+temporal.getCancion().getArtista()+" ");
			cadena.append("Género: "+temporal.getCancion().getGenero()+" ");
			cadena.append("\n");
			temporal=temporal.getAnterior();
		}
		
		cadena.append("--CABEZA--");
		return cadena;
	}

}
