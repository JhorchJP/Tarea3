package Matriz;

public class Matriz{
	public double a;
	public double b;
	public double c;
	public double d;
	public double e;
	public double f;
	public double g;
	public double h;
	public double i;

	public Matriz(double c1, double c2, double c3, double c4, double c5, double c6, double c7, double c8, double c9){
		a = c1;
		b = c2;
		c = c3;
		d = c4;
		e = c5;
		f = c6;
		g = c7;
		h = c8; 
		i = c9;
	}


	public void mostrarDatos(){
		System.out.println("--la matriz es--");
		System.out.println("[ "+a+" ]"+"[ "+b+" ]"+"[ "+c+"]");
		System.out.println("[ "+d+" ]"+"[ "+e+" ]"+"[ "+f+"]");
		System.out.println("[ "+g+" ]"+"[ "+h+" ]"+"[ "+i+"]");

	}


}
















