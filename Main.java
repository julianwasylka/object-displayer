package org.example;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args)
    {
        //wybór sortowania lub jego brak
        //int sort = Integer.parseInt(args[0]);
        int sort = 2;

        Mage mage0 = new Mage("Mistrz", 1000, 1000, sort);

        //tworzenie zbioru magów
        Mage mage1 = new Mage("Saruman", 20, 150.0, sort);
        Mage apprentice1 = new Mage("Gandalf", 19, 130.0, sort);
        mage1.getApprentices().add(apprentice1);

        Mage mage2 = new Mage("Dumbledore", 18, 120.0, sort);
        Mage apprentice2 = new Mage("Harry", 6, 55.0, sort);
        Mage apprentice2a = new Mage("Ron", 6, 40.0, sort);
        Mage apprentice2b = new Mage("Hermiona", 6, 60, sort);
        Mage apprentice2c = new Mage("Neville", 6, 50.0, sort);

        mage2.getApprentices().add(apprentice2);
        mage2.getApprentices().add(apprentice2a);
        mage2.getApprentices().add(apprentice2b);
        mage2.getApprentices().add(apprentice2c);

        Mage mage3 = new Mage("Tissaia", 17, 100.0, sort);
        Mage apprentice3a1 = new Mage("Yennefer", 14, 90.0, sort);
        Mage apprentice3a2 = new Mage("Ciri", 3, 110.0, sort);
        Mage apprentice3b1 = new Mage("Triss", 15, 80, sort);
        Mage apprentice3b2 = new Mage("Geralt", 15, 20, sort);
        Mage apprentice3b3 = new Mage("Jaskier", 10, 2, sort);

        apprentice3a1.getApprentices().add(apprentice3a2);
        mage3.getApprentices().add(apprentice3a1);

        apprentice3b2.getApprentices().add(apprentice3b3);
        apprentice3b1.getApprentices().add(apprentice3b2);
        mage3.getApprentices().add(apprentice3b1);

        mage0.getApprentices().add(mage1);
        mage0.getApprentices().add(mage2);
        mage0.getApprentices().add(mage3);

        //wypisywanie magów
        ShowMages display = new ShowMages();
        display.displayMages(mage0.getApprentices());
        display.getStatistics(mage0);
    }
}