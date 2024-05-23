package org.example;

import java.util.Comparator;

public class MageComparator implements Comparator<Mage>
{
    @Override
    public int compare(Mage one, Mage two)
    {
        //porzadek: power, level
        int result = Double.compare(one.getPower(), two.getPower());
        if (result == 0) {
            result = Integer.compare(one.getLevel(), two.getLevel());
        }
        return (-1*result);
    }
}
