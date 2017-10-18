package unidad3;

import java.util.Scanner;

public class TestListaSimple 
{
	private ListaSimple lista=new ListaSimple(); //Se crea un objeto nuevo de la clase ListaSimple

	public static void main(String[] args) 
	{
		TestListaSimple tls=new TestListaSimple(); //Objeto para acceder a los m�todos de la clase TestListaSimple
		int op=0;
		Scanner leer=new Scanner(System.in);
		
		do { //Mientras la opci�n sea diferente a la de salir, se ejecutar� el men� principal
			System.out.println("Men� de opciones");
			System.out.println("\t1.- Vac�o");
			System.out.println("\t2.- Insertar inicio");
			System.out.println("\t3.- Insertar fin");
			System.out.println("\t4.- Insertar posici�n");
			System.out.println("\t5.- Localizar");
			System.out.println("\t6.- Buscar");
			System.out.println("\t7.- Eliminar");
			System.out.println("\t8.- Imprimir");
			System.out.println("\t9.- Salir");
			System.out.println("Seleccione una opci�n");
			op=leer.nextInt();
			
			//Seg�n el valor elegido, se ejecuta una opci�n
			switch (op) {
			case 1: //Para comprobar si la lista est� vac�a
					if (tls.lista.isVacio())
					{
						System.out.println("Lista vac�a");
					}
					else
					{
						System.out.println("Lista no vac�a");
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
			case 4: //Ingresar un valor en una posici�n
					System.out.print("Ingresa valor a insertar:");
					int valor=leer.nextInt();
					System.out.print("Ingresa la posici�n:");
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
