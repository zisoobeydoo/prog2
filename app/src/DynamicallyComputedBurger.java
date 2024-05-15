//DynamicallyComputedBurger`-Objekt bei seiner Erstellung nur eine Liste von `Ingredient`-Objekten
//// übergeben bekommt und die jeweiligen Preis-, Kalorien- und Zutatenangaben erst zu dem Zeitpunkt
//// berechnet, wenn die entsprechende Methode aufgerufen wird.
//
       package htw.berlin.wi.prog2.domain;

import java.util.List;

public class DynamicallyComputedBurger implements Burger {
    private final List<Ingredient> zutaten;

    public DynamicallyComputedBurger(List<Ingredient> zutaten) {
        this.zutaten = zutaten;
    }

    public double berechnePreis() {
        double gesamterPreis = zutaten.stream().mapToDouble(Ingredient::getPreis).sum(); //rechnet Preise der Zutaten zusammen, um den Gesamtpreis herauszufinden
        return gesamterPreis;
    }

    public int berechneKalorien() {
        int gesamteKalorien = zutaten.stream().mapToInt(Ingredient::getKalorien).sum();//rechnet alle Kalorien zusammen, um den Gesamtkalorieanzahl herauszufinden
        return gesamteKalorien;
    }

    public List<String> getZutatenNamen() {
       List<String> zutatenNamen = zutaten.stream().map(Ingredient::getName).toList();//erstellt Liste der Namen aller Zutaten in der Liste
        return zutatenNamen;
    }

}

