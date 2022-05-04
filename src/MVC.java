import java.util.Arrays;

/**
 * Klasse zum Start der Restaurantverwaltung
 * @author Timo
 * @version 1.0
 */
public class MVC {

    public static void main(String[] args) {

        //new MVCController();
        Quicksort q = new Quicksort();
        int[] zuSortieren = {7,2,4,8,6,1,3,5,9};
        System.out.println(Arrays.toString(zuSortieren));
        q.quicksort(zuSortieren, 0, 8);
        System.out.println(Arrays.toString(zuSortieren));
        Zutat orange = new Zutat("Orange", 10.00);
        Zutat zitrone = new Zutat("Zitrone", 8.50);
        Zutat zucker = new Zutat("Zucker", 2.50);
        Zutat wasser = new Zutat("Wasser", 0.50);
        Zutat limette = new Zutat("Limette", 11.20);
        Zutat mango = new Zutat("Mango", 7.50);
        Zutat[] zutaten = {orange, zitrone, zucker, wasser, limette, mango};
        for (Zutat zutat: zutaten){
            System.out.println(zutat.getName());
            System.out.println(zutat.getPreis());
        }
        System.out.println("-");
        QuicksortZutaten qz = new QuicksortZutaten();
        qz.quicksort(zutaten, 0, 5);
        for (Zutat zutat: zutaten){
            System.out.println(zutat.getName());
            System.out.println(zutat.getPreis());
        }
    }

}