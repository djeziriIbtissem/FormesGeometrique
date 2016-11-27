/**
 * Created by HP on 27/11/2016.
 */
public class Rectangle implements forme,Cloneable {
    private double l;
    private double h;

    public Rectangle(double l, double h){
        this.l=l;
        this.h=h;
    }

    public double getH() {
        return h;
    }

    public double getL() {
        return l;
    }

    @Override
    public double surface() {
        return l*h;
    }

    @Override
    public double perimetre() {
        return 2*(l+h);
    }
    protected  Object clone()
        throws CloneNotSupportedException{
        return super.clone();
    }

    public String toSring(){
        return "("+ "l=" + " "+l+" "+ "h="+" "+h+ " "+ "surface=" + " "+surface()+" "+ "perimetre=" + " " + perimetre()+")";
    }
}
