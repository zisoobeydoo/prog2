package htw.berlin.wi.prog2.service;

import htw.berlin.wi.prog2.domain.DummyBurgerImpl;
import htw.berlin.wi.prog2.domain.Ingredient;
import htw.berlin.wi.prog2.domain.Burger;


public class BurgerBuilder {

    public BurgerBuilder add(Ingredient ingredient) {
        //Methode erstellt Burger,wo Gesamtpreis,Gesamtkalorien und Zutaten bereits vorberechnet

        ingredients.add(ingredient); //ingredient wird zu anderen Ingredients hinzugefügt, um den Burger zusammenzustellen (Liste)
        return this; // die Rückgabe von this sollte beibehalten bleiben (siehe Benutzung im BurgerBuilderTest)
    }

    public Burger buildPrecomputed() {
        if (ingredients.isEmpty())
        throw new IllegalBurgerException("Der Burger muss aus mindestens einer Zutat bestehen.");
    }


    double gesamterPreis = ingredients.stream().mapToDouble(Ingredient::getPreis).sum();
    //Funktionsweise:Für jedes Ingredient-Objekt wird die Methode getPreis() aufgerufen,
    // um den Preis zu erhalten. Diese Preise werden dann in doubles zu einem Gesamtpreis addiert
    int gesamteKalorien = ingredients.stream().mapToInt(Ingredient::getKalorien).sum();
    List<String> namenZutaten = ingredients.stream().map(Ingredient::getName).toList();

    return new PrecomputedBurger(gesamterPreis, gesamteKalorien, namenZutaten);
}


public Burger buildDynamicallyComputed() {
    // berechnung erfolgt, wenn die entsprechende Methode aufgerufen wird
    throw new IllegalBurgerException("Der Burger muss aus mindestens einer Zutat bestehen.");
}
    return new DynamicallyComputedBurger(ingredients);
    }
}
