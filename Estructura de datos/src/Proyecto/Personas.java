package Proyecto;

public class Personas implements Comparable
{
	private String nombre;
	private int promedio;
	private int numControl;
	
	public int getNumControl() {
		return numControl;
	}
	public void setNumControl(int numControl) {
		this.numControl = numControl;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getPromedio() {
		return promedio;
	}
	public void setPromedio(int promedio) {
		this.promedio = promedio;
	}
	
	public Personas(String nombre, int promedio, int numControl) {
		super();
		this.nombre = nombre;
		this.promedio = promedio;
		this.numControl = numControl;
	}
	@Override
	public int compareTo(Object o) 
	{ 
		Personas p=(Personas) o;
		if (promedio < p.promedio) //Si el promedio de la otra persona es mayor regresa -1
		{
            return -1;
        }
		else if (promedio > p.promedio) //Si el promedio de la otra persona es menor regresa 1
        {
            return 1;
        }
		
		return 0;
	}
}