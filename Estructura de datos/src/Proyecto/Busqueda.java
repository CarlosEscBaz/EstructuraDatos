package Proyecto;

public class Busqueda 
{
	public boolean binaria(Personas[] a, int buscar)
	{
		int centro=0, inf=0, sup=(a.length-1), cont=1;
		boolean bandera=false;
		
		while (inf<=sup)
		{
			centro=(inf+sup)/2;
			int valor = a[centro].getPromedio();
			
			
			if (valor==buscar)
			{
				System.out.println("Número encontrado, en la posición "+(centro+1));
				System.out.println("Alumno: "+a[centro].getNombre()+" \t-Promedio: "+a[centro].getPromedio());
				inf=sup+1;
				bandera=true;
			}
			else if (buscar>valor)
			{
				//System.out.println("El número es menor que la posición "+(centro+1));
				sup=centro-1;
				//inf=centro+1;
			}
			else
			{
				//System.out.println("El número es mayor que la posición "+(centro+1));
				inf=centro+1;
				//sup=centro-1;
			}
			//System.out.println(cont);
			cont++;
		}
		if (!bandera)
		{
			System.out.println("Número no encontrado");
		}
		return bandera;
	}
	
	public boolean secuencial(Personas[] a, int buscar)
	{
		boolean bandera=false;
		int i=0;
		
		while (i<a.length)
		{
			//System.out.println("i="+i);
			int valor = a[i].getPromedio();
			
			if (valor==buscar)
			{
				System.out.println("Número encontrado, en la posición "+(i+1));
				System.out.println("\tAlumno: "+a[i].getNombre()+" \tPromedio: "+a[i].getPromedio());
				bandera=true;
				i=a.length;
			}
			/*else
			{
				if (valor>buscar)
				{
					i=a.length;
				}
			}*/
			i++;
		}
		if (!bandera)
		{
			System.out.println("Número no encontrado");
		}
		
		return bandera;
	}

}
