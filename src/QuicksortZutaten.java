public class QuicksortZutaten {

    public int teilung (Zutat liste[], int erstes, int letztes){

        /*pivot = Element in der Mitte des Array:
         * Erste und letzte Index werden addiert und durch 2 geteilt. Bei 11 Elementen = 0+10 -> 5
         */
        Zutat pivot = liste[(erstes + letztes)/2];
        // Positonsvariablen zeigen auf das erste und letzte Element des Arrays
        int positionLinks = erstes;
        int positionRechts = letztes;

        while (positionLinks <= positionRechts){
            // Solange die Elemente auf der linken Seite kleiner als das Pivot-Element sind, erhöhe die Position
            while (liste[positionLinks].getPreis()<pivot.getPreis()){
                positionLinks++;
            }
            // Solange die Elemente auf der rechten Seite größer als das Pivot-Element sind, verringere die Position
            while (liste[positionRechts].getPreis()>pivot.getPreis()){
                positionRechts--;
            }
            if (positionLinks<=positionRechts){ // nur falls positionLinks kleiner positionRechts ist
                Zutat tmp = liste[positionLinks]; // temp. Speicherung für Tausch
                liste[positionLinks] = liste[positionRechts]; // Tausch
                liste[positionRechts] = tmp; // Tausch
                positionLinks++; // Weil bereits ein Tausch stattgefunden hat und daher der nächste Index betrachtet wird
                positionRechts--; // Weil bereits ein Tausch stattgefunden hat und daher der nächste Index betrachtet wird
            }

        }
        return positionLinks;
    }
    public void quicksort(Zutat liste[], int erstes, int letztes) {
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
