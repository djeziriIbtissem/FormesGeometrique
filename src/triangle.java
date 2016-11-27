/**
 * Created by HP on 27/11/2016.
 */
public class triangle implements forme {

    private double A;
    private double B;
    private double C;

    public triangle(double A,double B,double C){
        this.A=A;
        this.B=B;
        this.C=C;
    }

    public double getA() {
        return A;
    }

    public double getB() {
        return B;
    }

    public double getC() {
        return C;
    }

    @Override
    public double surface() {
        return (A*B)/2;
    }

    @Override
    public double perimetre() {
        return A+B+C;
    }


    @Override
    public String toString() {

        return "("+ "A=" + " "+A+" "+ "B="+" "+B+ " "+"c="+" "+C+" "+ "surface=" + " "+surface()+" "+ "perimetre=" + " " + perimetre()+")";
    }
}
