package pilas;

public class pila 
{
	private nodo top;
	int c=0;

	public int getC() 
	{
		return c;
	}

	public nodo getTop() 
	{
		return top;
	}

	public void setTop(nodo top) 
	{
		this.top = top;
	}
	
	public boolean isVacio()
	{
		boolean bandera=false;
		
		if (this.getTop()==null)
		{
			bandera=true;
		}
		
		return bandera;
	}
	
	public boolean isFull()
	{
		boolean bandera=false;
		
		if (this.c==3)
		{
			bandera=true;
		}
		
		return bandera;
	}
	
	public void insertar1(nodo n)
	{
		n.setSiguiente(null);
		this.top=n;
		c++;
	}
	
	public boolean insertar2(nodo n)
	{
		boolean bandera=false;
		
		if (this.isVacio())
		{
			insertar1(n);
			bandera=true;
		}
		else
		{
			if (!this.isFull())
			{
				n.setSiguiente(top);
				this.top=n;
				c++;
				bandera=true;
			}
		}
		return bandera;
	}

}
