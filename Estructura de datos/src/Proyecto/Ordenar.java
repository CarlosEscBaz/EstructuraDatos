package Proyecto;

import java.util.Arrays;
import java.util.Scanner;

public class Ordenar 
{
	private static ordenamiento o=new ordenamiento();
	private static Busqueda b=new Busqueda();
	private static Personas[] arrayPersonas = new Personas[20];
	private static Scanner leer=new Scanner(System.in);
	//private Personas[] p=new Personas[10];
	
	private static void llenar(Personas[] a)
	{
		
		a[0] = (new Personas("Leo", 89, 1));
		a[1] = (new Personas("Carlos", 99, 2));
		a[2] = (new Personas("Max", 88, 3));
		a[3] = (new Personas("Oscar", 83, 4));
		a[4] = (new Personas("Ale", 74, 5));
		a[5] = (new Personas("Andrea", 76, 6));
		a[6] = (new Personas("Ana", 66, 7));
		a[7] = (new Personas("Ernesto", 50, 8));
		a[8] = (new Personas("Carmen", 90, 9));
		a[9] = (new Personas("Yesenia", 60, 10));
		a[10] = (new Personas("Jaqueline", 78, 11));
		a[11] = (new Personas("Alma", 79, 12));
		a[12] = (new Personas("Alejandro", 75, 13));
		a[13] = (new Personas("José", 92, 14));
		a[14] = (new Personas("Juan", 65, 15));
		a[15] = (new Personas("Laura", 96, 16));
		a[16] = (new Personas("Cinthia", 98, 17));
		a[17] = (new Personas("Jaime", 62, 18));
		a[18] = (new Personas("Sergio", 68, 19));
		a[19] = (new Personas("Andrea", 87, 20));
	}
	
	public static void menuBuscar()
	{
		boolean bandera=false;
		int op=0;
		int valor=0;
		System.out.println("=====Menú de búsqueda=====");
		System.out.println("Ingrese la calificación a buscar");
		valor=leer.nextInt();
		
		
		System.out.println("Seleccione una opción de búsqueda");
		System.out.println("\t1.- Búsqueda secuencial");
		System.out.println("\t2.- Búsqueda binaria");
		op=leer.nextInt();
		
		do {
        	switch (op) 
        	{
            case 1:
            	b.secuencial(arrayPersonas, valor);
            	bandera=true;
            	break;
            case 2:
    			b.binaria(arrayPersonas, valor);
    			bandera=true;
    			break;

    		default: System.out.println("Ingrese una opción válida");
    			break;
    		}
		} while (!bandera);
	}
	
	public static void menuOrdenar()
	{
		boolean bandera=false;
		do {
        	System.out.println("==========MENÚ==========");
        	System.out.println("Seleccione una opción para ordenar el array de alumnos: ");
        	System.out.println("\t1.- BubbleSort");
        	System.out.println("\t2.- QuickSort");
        	System.out.println("\t3.- MergeSort");
        	System.out.println("\t4.- ShellSort");
        	int op=leer.nextInt();
        	
        	switch (op) 
        	{
    		case 1: // Bubble
    			arrayPersonas=o.bubbleSort(arrayPersonas, arrayPersonas.length);
    			bandera=true;
    			break;
    		case 2: // Quick
    			arrayPersonas=o.quickSort(arrayPersonas, 0, arrayPersonas.length-1);
    			bandera=true;
    			break;
    		case 3: // Merge
    			arrayPersonas=o.ordenacionMergeSort(arrayPersonas);
    			bandera=true;
    			break;
    		case 4:
    			arrayPersonas=o.shellSort(arrayPersonas);
    			bandera=true;
    			break;
    		default:
    			System.out.println("Ingrese una opción válida");
    			break;
    		}
		} while (!bandera);
	}
    
    static void imprimeArray(Personas[] array) 
    {
        for (int i = 0; i < array.length; i++) 
        {
            System.out.println((i+1) + ".- " + array[i].getNombre() + " \t- Promedio: " + array[i].getPromedio());
        }
    }

    public static void main(String[] args) 
    {
    	boolean bandera=false;
    	llenar(arrayPersonas);
    	
    	System.out.println("Array sin ordenar por promedio\n");
        imprimeArray(arrayPersonas);
        System.out.println("\n");
        
        System.out.println("\t=====Menú principal=====");
        System.out.println("\t\tPaso 1: Ordenar el array");
        menuOrdenar();
        
        int op=0;
        while (!bandera) 
        {
        	System.out.println("¿Qué desea hacer?");
	        System.out.println("\t\t1.- Imprimir la lista de alumnos con su promedio");
	        System.out.println("\t\t2.- Buscar una calificación dentro del array");
	        System.out.println("\t\t3.- Salir");
	        op=leer.nextInt();
	        
        	switch (op) 
            {
    		case 1:
    			System.out.println("\nArray ordenado por promedio");
    	        imprimeArray(arrayPersonas);
    	        //bandera=true;
    			break;
    		case 2:
    			boolean salida=false;
    			do
    			{
    				menuBuscar();
    				
    				System.out.println("\n¿Desea buscar otro valor?");
    				System.out.println("\t1.- Si");
    				System.out.println("\t2.- No");
    				int op2 = leer.nextInt();
    				
    				if (op2==2)
    				{
    					salida=true;
    				}
    				
    			}while(!salida);
    			break;
    		case 3:
    			System.out.println("Adiós");
    			bandera=true;
    			break;
    		default: System.out.println("Ingrese un valor válido");
    			break;
    		}
		}
    }
}