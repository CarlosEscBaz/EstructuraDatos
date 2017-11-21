package pilas;

import java.util.Stack;

import unidad3.NodoSimple;

public class pila 
{
	Stack <nodo> pila=new Stack<nodo>();
	private nodo top;

	public void setTop(nodo top) 
	{
		this.top = top;
	}
	
	public boolean isVacio()
	{
		boolean bandera=false;
		
		if (this.pila.isEmpty())
		{
			bandera=true;
		}
		
		return bandera;
	}
	
	public boolean isFull()
	{
		boolean bandera=false;
		
		if (this.pila.size()==3)
		{
			bandera=true;
		}
		
		return bandera;
	}
	
	private void insertarN(nodo n)
	{
		this.pila.push(n);
		n.setSiguiente(null);
	}
	
	public boolean push(nodo n)
	{
		boolean bandera=false;
		
		if (this.isVacio())
		{
			insertarN(n);
			bandera=true;
		}
		else
		{
			if (!this.isFull())
			{
				n.setSiguiente(this.pila.peek());
				this.pila.push(n);
				bandera=true;
			}
		}
		return bandera;
	}
	
	public StringBuilder pop()
	{
		StringBuilder cadena=new StringBuilder();
		nodo temporal = this.pila.pop();
		cadena.append("Id: "+temporal.getE().getId()+"\n");
		cadena.append("Nombre: "+temporal.getE().getNombre()+"\n");
		cadena.append("Ciudad: "+temporal.getE().getId()+"\n");
		cadena.append("Estadio: "+temporal.getE().getId());
		
		return cadena;
	}
	
	public StringBuilder imprimir()
	{
		StringBuilder cadena=new StringBuilder();
		int b=1;
		
		if (this.pila.isEmpty())
		{
			cadena.append("-------------------------------------------------------------------------------------------------------\n");
			cadena.append("\t~~~~~~~~~~~~LISTA VACÍA~~~~~~~~~~~~~~\n");
			cadena.append("-------------------------------------------------------------------------------------------------------\n");
		}
		else
		{
			cadena.append("TOPE");
			nodo temporal=this.pila.peek();
		
			while (temporal!=null)
			{
				cadena.append("\t"+b+".- ");
				cadena.append("Id: "+temporal.getE().getId()+" - ");
				cadena.append("Nombre: "+temporal.getE().getNombre()+" - ");
				cadena.append("Ciudad: "+temporal.getE().getCiudad()+" - ");
				cadena.append("Estadio: "+temporal.getE().getEstadio());
				cadena.append("\n");
				temporal=temporal.getSiguiente();
				b++;
			}
			cadena.append("FIN");
		}
		
		return cadena;
	}
	public StringBuilder tope()
	{
		StringBuilder cadena=new StringBuilder();
		nodo temporal=this.pila.peek();
		
		cadena.append("El tope de la pila es:\n");
		cadena.append("Id: "+temporal.getE().getId()+"\n");
		cadena.append("Nombre: "+temporal.getE().getNombre()+"\n");
		cadena.append("Ciudad: "+temporal.getE().getCiudad()+"\n");
		cadena.append("Estadio: "+temporal.getE().getEstadio());
		
		return cadena;
	}

}
