/**
 * Created by HP on 27/11/2016.
 */
public class main {

    public static void main(String[] args) {

        forme tab[] = new forme[5];
        tab[0] = new cercle(4);
        tab[1] = new triangle(1, 2, 3);
        tab[2] = new Rectangle(5, 3);
        tab[3] = new carre(2);

        for (int i = 0; i < 4; i++) {
            System.out.println(i);
            System.out.println(tab[i]);
        }

        try {
           tab[4]=(carre)((carre)tab[3]).clone();
            System.out.println(4);
            System.out.println(tab[4]);

        } catch (CloneNotSupportedException ex) {
            ex.printStackTrace();


        }
    }
}