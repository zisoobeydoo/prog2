//Ein `PrecomputedBurger`-Objekt soll jedoch schon bei seiner Erstellung den fertig berechneten
// Gesamtpreis, die Gesamtkalorienzahl, sowie die Namen der Zutaten übergeben bekommen

package htw.berlin.wi.prog2.domain;

import java.util.List;

public class PrecomputedBurger implements Burger {
    private final double gesamterPreis;
    private final int gesamteKalorien;
    private final List<String> namenZutaten;

    public PrecomputedBurger(double gesamterPreis, int gesamteKalorien, List<String> namenZutaten) {
        this.gesamterPreis = gesamterPreis;
        this.totalCalories = totalCalories;
        this.namenZutaten = namenZutaten;
    }

    public double berechnePreis() { //gibt den Wert einfach zurück
        return gesamterPreis;
    }

    public int berechneKalorien() {
        return gesamteKalorien;
    }

    public List<String> getnamenZutaten() {
        return namenZutaten;
    }
}

