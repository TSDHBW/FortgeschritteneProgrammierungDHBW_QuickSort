public class Quicksort {
    // https://www.youtube.com/watch?v=9FsPkAH7qds
    public int teilung (int liste[], int erstes, int letztes){

        /*pivot = Element in der Mitte des Array:
         * Erste und letzte Index werden addiert und durch 2 geteilt. Bei 11 Elementen = 0+10 -> 5
         */
        int pivot = liste[(erstes + letztes)/2];
        // Positonsvariablen zeigen auf das erste und letzte Element des Arrays
        int positionLinks = erstes;
        int positionRechts = letztes;

        while (positionLinks <= positionRechts){
            // Solange die Elemente auf der linken Seite kleiner als das Pivot-Element sind, erhöhe die Position
            while (liste[positionLinks]<pivot){
                positionLinks++;
            }
            // Solange die Elemente auf der rechten Seite größer als das Pivot-Element sind, verringere die Position
            while (liste[positionRechts]>pivot){
                positionRechts--;
            }
            if (positionLinks<=positionRechts){ // nur falls positionLinks kleiner positionRechts ist
                int tmp = liste[positionLinks]; // temp. Speicherung für Tausch
                liste[positionLinks] = liste[positionRechts]; // Tausch
                liste[positionRechts] = tmp; // Tausch
                positionLinks++; // Weil bereits ein Tausch stattgefunden hat und daher der nächste Index betrachtet wird
                positionRechts--; // Weil bereits ein Tausch stattgefunden hat und daher der nächste Index betrachtet wird
            }

        }
        System.out.println("Links:" + positionLinks);
        System.out.println("Rechts:" + positionRechts);
        return positionLinks;
    }
    public void quicksort(int liste[], int erstes, int letztes) {
        // Wert nach der Teilung des Arrays in zwei Teile. Linke Seite < Pivot, rechte Seite > Pivot
        int index = teilung(liste, erstes, letztes);
        // repräsentiert linke Seite vom Pivot Element
        if (erstes < index -1){
            quicksort(liste, erstes, index-1);
        }
        // repräsentiert die rechte Seite vom Pivot Element
        if (index < letztes){
            quicksort(liste, index, letztes);
        }

    }

}