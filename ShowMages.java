package org.example;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class ShowMages {
    public ShowMages() {
    }

    public static void displayMages(Set<Mage> mages)
    {
        int i = 1;
        for (Mage mage : mages)
        {
            System.out.println(getMageStructure(mage, 0, i));
            i++;
        }
    }

    public static String getMageStructure(Mage mage, int indent, int counter)
    {
        StringBuilder sb = new StringBuilder();
        //wypisanie przedrostka
        for (int i = 0; i < indent; i++)
        {
            sb.append("   ");
        }
        sb.append(counter);
        if (indent != 0) sb.append("." + indent);
        //wypisanie statystyk maga
        sb.append(" " + mage.toString());

        //rekurencyjne wywolanie dla potomkow
        for (Mage apprentice : mage.getApprentices())
        {
            sb.append("\n");
            sb.append(getMageStructure(apprentice, indent + 1, counter));
        }
        return sb.toString();
    }

    public static String getStatistics(Mage mage)
    {
        StringBuilder sb = new StringBuilder();

        Set mageList = new TreeSet<>();
        if (mageList.getClass() != mage.getApprentices().getClass()) mageList = new HashSet();

        for (Mage apprentice : mage.getApprentices())
        {
            sb.append("1");
            sb.append(getStatistics(apprentice));
        }

        return sb.toString();
    }

}
