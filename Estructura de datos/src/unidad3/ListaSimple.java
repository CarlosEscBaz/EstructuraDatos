package unidad3;

public class ListaSimple {
	private NodoSimple cabeza;
	
	//Al momento de crearla, está vacía, por lo que la cabeza apunta a null
	public ListaSimple() 
	{
		this.cabeza=null;
	}

	//Métodos para manipular la cabeza
	public NodoSimple getCabeza() 
	{
		return cabeza;
	}
	
	public void setCabeza(NodoSimple cabeza) 
	{
		this.cabeza = cabeza;
	}
	
	//Método que comprueba si la lista está vacía, regresa true si está vacía
	public boolean isVacio() 
	{
		boolean respuesta=true;
		
		if(this.cabeza!=null) //Si la lista no está vacía, regresará false
		{
			respuesta=false;
		}
		return respuesta;
	}
	
	//Este método inserta un valor cuando la lista está vacía
	public void insertar(int valor) 
	{
		NodoSimple nuevo=new NodoSimple(); //Se crea un nuevo objeto de la clase NodoSimple
		nuevo.setDato(valor); //Se le asigna el valor al nodo
		nuevo.setSiguiente(null); //Y como es un único valor en la lista, este nodo apuntará a null
		this.cabeza=nuevo; //El nuevo nodo será la cabeza de la lista
	}
	//Este método inserta un nodo al principio de la lista
	public void insertarPrincipio(int valor) 
	{
		if(this.isVacio()) //Si la lista está vacía, el nodo obviamente será ingresado al principio
		{
			this.insertar(valor);
		}
		else 
		{
			//Si no está vacía, se insertará el nuevo nodo al principio de la lista
			NodoSimple nuevo=new NodoSimple();
			nuevo.setDato(valor);
			nuevo.setSiguiente(this.cabeza); //El nuevo nodo apunta al otro nodo
			this.cabeza=nuevo;		//Y el nuevo nodo será la nueva cabeza
		}
	}
	
	//Método que inserta al final de la lista
	public void insertarFinal(int valor) 
	{
		if(this.isVacio()) //Si está vacía, se insertará el nuevo nodo al final de la lista sin hacer más operaciones 
		{
			this.insertar(valor);
		}
		else 
		{
			//Se crea un nuevo nodo con los valores nuevos
			NodoSimple nuevo=new NodoSimple();
			nuevo.setDato(valor);
			nuevo.setSiguiente(null);
			
			//Se crea un nodo temporal con los valores de la cabeza, para que no se pierdan sus valores al hacer el cambio
			NodoSimple temporal=this.cabeza;
			
			//Recorre la lista buscando el nodo que apunta a null (O sea, el último de la lista)
			while(temporal.getSiguiente()!=null) 
			{
				temporal=temporal.getSiguiente();
			}
			//Una vez que lo encuentra, sale del ciclo y hace que el último nodo, apunte al nuevo nodo
			temporal.setSiguiente(nuevo);
		}
	}
	//Este método devuelve el número de valores en la lista
	public int contar() 
	{
		int respuesta=0;
		NodoSimple temporal=this.cabeza; //Se crea un nuevo objeto que se utilizará para recorrer la lista
		
		//Se usa el ciclo para buscar el último elemento en la lista
		while(temporal!=null) 
		{
			respuesta++; //Cada vuelta del ciclo, es un elemento más recorrido, o sea, un elemento en la lista, por lo que se van contando
			temporal=temporal.getSiguiente();
		}
		return respuesta;
	}
	
	//Este método busca un nodo en una posición determinada
	public NodoSimple encontrar(int posicion) {
		NodoSimple temporal=this.cabeza;
		NodoSimple anterior=null;
		int i=0;
		while(i<posicion) {
			i++;
			anterior=temporal;
			temporal=temporal.getSiguiente();
		}
		return anterior;
	}
	
	//Este método inserta un nodo en una pisición determinada
	public void insertarPosicion(int valor, int posicion) 
	{
		if(posicion>0 && this.contar()>1 && posicion<=this.contar()) 
		{
			if(posicion==1) 
			{
				this.insertarPrincipio(valor);
			}
			else if(posicion==this.contar()) 
			{
				this.insertarFinal(valor);
			}
			else 
			{
				NodoSimple anterior=this.encontrar(posicion-1);
				NodoSimple nuevo=new NodoSimple();
				nuevo.setDato(valor);
				nuevo.setSiguiente(anterior.getSiguiente());
				anterior.setSiguiente(nuevo);
			}
			
		}
	}
	public boolean localizar(int valor) 
	{
		boolean respuesta=false;
		
		NodoSimple temporal=this.cabeza;
		while(temporal!=null) 
		{
			if(temporal.getDato()==valor) 
			{
				respuesta=true;
			}
			temporal=temporal.getSiguiente();
		}
		
		return respuesta;
	}
	
	public void buscar(int valor) 
	{
		boolean respuesta=false;
		
		NodoSimple temporal=this.cabeza;
	
		while(temporal!=null) 
		{
			if(temporal.getDato()==valor) 
			{
				respuesta=true;
				System.out.println("El valor encontrado es:"+temporal.getDato());
			}
			temporal=temporal.getSiguiente();
		}
		if(respuesta==false) 
		{
			System.out.println("El valor no fue encontrado");
		}
		
	}
	
	public boolean eliminar(int valor, int posicion)
	{
		boolean bandera=false;
		
		
		
		return bandera;
	}
	
	public StringBuilder imprimir() 
	{
		StringBuilder cadena=new StringBuilder();
		cadena.append("Cabeza-->");
		NodoSimple temporal=this.cabeza;
		
		while(temporal!=null) 
		{
			cadena.append(temporal.getDato());
			cadena.append("-->");
			temporal=temporal.getSiguiente();
		}
		
		cadena.append("NULL");
		return cadena;
	}
}