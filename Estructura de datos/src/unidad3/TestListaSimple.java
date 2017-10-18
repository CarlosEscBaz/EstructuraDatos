package unidad3;

import java.util.Scanner;

public class TestListaSimple 
{
	private ListaSimple lista=new ListaSimple(); //Se crea un objeto nuevo de la clase ListaSimple

	public static void main(String[] args) 
	{
		TestListaSimple tls=new TestListaSimple(); //Objeto para acceder a los métodos de la clase TestListaSimple
		int op=0;
		Scanner leer=new Scanner(System.in);
		
		do { //Mientras la opción sea diferente a la de salir, se ejecutará el menú principal
			System.out.println("Menú de opciones");
			System.out.println("\t1.- Vacío");
			System.out.println("\t2.- Insertar inicio");
			System.out.println("\t3.- Insertar fin");
			System.out.println("\t4.- Insertar posición");
			System.out.println("\t5.- Localizar");
			System.out.println("\t6.- Buscar");
			System.out.println("\t7.- Eliminar");
			System.out.println("\t8.- Imprimir");
			System.out.println("\t9.- Salir");
			System.out.println("Seleccione una opción");
			op=leer.nextInt();
			
			//Según el valor elegido, se ejecuta una opción
			switch (op) {
			case 1: //Para comprobar si la lista está vacía
					if (tls.lista.isVacio())
					{
						System.out.println("Lista vacía");
					}
					else
					{
						System.out.println("Lista no vacía");
					}
				break;
			case 2:	//Ingresar un valor al principio
					System.out.println("Ingresar el valor a insertar");
					tls.lista.insertarPrincipio(leer.nextInt());
					System.out.println("Valor insertado");
				break;
			case 3:	//Ingresar un valor al final
					System.out.println("Ingresar el valor a insertar");
					tls.lista.insertarFinal(leer.nextInt());
					System.out.println("Valor insertado");
				break;
			case 4: //Ingresar un valor en una posición
					System.out.print("Ingresa valor a insertar:");
					int valor=leer.nextInt();
					System.out.print("Ingresa la posición:");
					int posicion=leer.nextInt();				
					tls.lista.insertarPosicion(valor, posicion);
					System.out.println("valor insertado");
				break;
				
			case 5:	//Localizar un valor en la lista
					System.out.print("Ingresa valor a localizar:");
					
					if(tls.lista.localizar(leer.nextInt())) 
					{
						System.out.println("nodo localizado");
					}
					else 
					{
						System.out.println("nodo no localizado");
					}				
				break;
			case 6: //Buscar un valor a ver si esxiste
					System.out.print("Ingresa valor a buscar:");
					tls.lista.buscar(leer.nextInt());				
				break;
			case 8: //Imprimir la lista
					System.out.println(tls.lista.imprimir());
				break;
			default:
				break;
			}
			
		} while (op!=9);
	}

}
