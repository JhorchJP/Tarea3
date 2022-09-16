package SumaMatriz;

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

	public void setColumnaA(double sumaA){
		double resultado;
		resultado=c1+c2+c3;
		resultado=sumaA;
	}
	public void setColumnaB(double sumaB){
		double resultado1;
		resultado1=c4+c5+c6;
		resultado1=sumaB;
	}
	public void setColumnaC(double sumaC){
		double resultado2;
		resultado2=c7+c8+c9;
		resultado2=sumaC;
	}

	public double calcular(){
		total=setColumnaA+setColumnaB+setColumnaC;

		System.out.println("la suma es  "+total);
	}


}







