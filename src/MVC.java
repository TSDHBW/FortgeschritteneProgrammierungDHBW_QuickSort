import java.util.Arrays;

/**
 * Klasse zum Start der Restaurantverwaltung
 * @author Timo
 * @version 1.0
 */
public class MVC {

    public static void main(String[] args) {

        //new MVCController();

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