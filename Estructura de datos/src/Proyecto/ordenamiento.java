package Proyecto;

import java.util.Arrays;

public class ordenamiento 
{
	public Personas[] quickSort(Personas[] p, int izq, int der)
	{
		Personas pivote = p[izq];
		
		int i = izq;
		int d = der;
		int aux;
		
		while (i<d)
		{
			//Si el promedio es menor al del pivote
			while (pivote.compareTo(p[i])<= 0 && i < d) 
	        {
	            i++;
	        }
			//Si el promedio es menor al del pivote
			while (pivote.compareTo(p[d])>0) 
	        {
	            d--;
	        }
			
			if (i < d) 
	        {
	            Personas auxIntercambio = p[i];
	            p[i] = p[d];
	            p[d] = auxIntercambio;
	        }
		}
		p[izq] = p[d];
	    p[d] = pivote;
	    
	    if (izq < d - 1) 
	    {
	        //Quicksort aplicado al array resultante a la izquierda del pivote
	        quickSort(p, izq, d - 1);
	    }
	    if (d + 1 < der) 
	    {
	        //Quicksort aplicado al array resultante a la izquierda del pivote
	        quickSort(p, d + 1, der);
	    }
		
		return p;
		
	}
	
	public Personas[] bubbleSort(Personas[] p, int n)
	{
		
		for (int piv = 0; piv < (n-1); piv++)
		{
			for (int pun = (piv+1); pun < n; pun++)
			{				
				if (p[piv].compareTo(p[pun])<=0) //Si el puntero es mayor al pivote, hay intercambio
				{
					Personas temp = p[piv];
					p[piv] = p[pun];
					p[pun] = temp;
				}				
			}
		}
		return p;
	}
	
	public static Personas[] ordenacionMergeSort(Personas vec[])
    {
		if(vec.length<=1)
		{
			
		}
		else 
		{
            int mitad= vec.length/2; //Se obtiene la mitad del vector
            
            //Se divide el vector en dos nuevos vectores temporales
            Personas izq[]=Arrays.copyOfRange(vec, 0, mitad);
            Personas der[]=Arrays.copyOfRange(vec, mitad, vec.length);
            //Se mandan nuevamente a separar los vectores
            ordenacionMergeSort(izq);
            ordenacionMergeSort(der);       
            //Se unen de nuevo los vectores
            vec=combinarVector(vec, izq, der);
		}
		return vec;
    }
    
    public static Personas[] combinarVector(Personas v[], Personas izq[],Personas der[])
    {
            int i=0;
            int j=0;
            for(int k=0;k<v.length;k++)
            {
                    if(i>=izq.length)
                    {
                            v[k]=der[j];
                            j++;
                            continue;
                    }
                    if(j>=der.length)
                    {
                            v[k]=izq[i];
                            i++;
                            continue;
                    }
                    if(izq[i].compareTo(der[j])>0)
                    {
                            v[k]=izq[i];
                            i++;
                    }
                    else
                    {
                            v[k]=der[j];
                            j++;
                    }
            }
            return v;
    }
    
    public Personas[] shellSort(Personas A[])
	{
		int salto, i;
		Personas aux;
		boolean cambios;
		for(salto=A.length/2; salto!=0; salto/=2)
		{
			cambios=true;
			while(cambios) // Mientras se intercambie algún elemento
			{ 
				cambios=false;
				for(i=salto; i< A.length; i++) // se da una pasada
				{
					if(A[i-salto].compareTo(A[i])<=0) // y si están desordenados
					{
						aux=A[i]; // se reordenan
						A[i]=A[i-salto];
						A[i-salto]=aux;
						cambios=true; // y se marca como cambio.
					}
				}
			}
		}
		return A;
	}

}
