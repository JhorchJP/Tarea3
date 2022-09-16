package EcuacionCuadratica;

public class EcuacionCuadratica {
    public double a;
    public double b;
    public double c;

    public EcuacionCuadratica(double _a,double _b, double _c){
    	a = _a;
    	b = _b;
    	c = _c; 
    }

    public void setA(double numA){
        a = numA;
    }
    public double getA(){
        return a;
    }
    public void setB(double numB){
        b = numB;
    }
    public double getB(){
        return b;
    }
    public void setC(double numC){
        c = numC;
    }
    public double getC(){
        return c;
    }

    public double discriminante(){
        double expresion;
        expresion = Math.pow(getB(),2)-(4*getA()*getC());

        return expresion;
    }

    public double solucion(){
        double respuesta1;

        if (discriminante() > 0){
            System.out.println("2 soluciones");
            double respuesta2;

            respuesta1=(-getB()+Math.sqrt(discriminante()))/(2*getA());
            respuesta2=(-getB()-Math.sqrt(discriminante()))/(2*getA());

            System.out.println("X = " + respuesta1);
            System.out.println("X = " + respuesta2);
        } else if (discriminante() == 0) {
            System.out.println("1 soluciones");

            respuesta1 =(-getB())/(2*getA());
            System.out.println("X = " + respuesta1);

        } else {
            System.out.println("Ninguna solucion");
        }
        return 0;
    }
}

