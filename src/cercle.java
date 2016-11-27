import java.util.Map;

/**
 * Created by HP on 27/11/2016.
 */


public class cercle implements forme {
    private double rayon;

    // constructeur
    public cercle(double rayon){
        this.rayon=rayon;

    }

    public double getRayon() {
        return rayon;
    }

    @Override
    public double perimetre() {
        return (rayon*rayon*(Math.PI));
    }

    @Override
    public double surface() {
        return (2*rayon* Math.PI);
    }

    public String toSring(){
        return "("+ "rayan=" + " "+rayon+" "+ "surface=" + " "+surface()+" "+ "perimetre=" + " " + perimetre()+")";
    }
}
