package org.example;

import java.util.*;

public class Mage implements Comparable<Mage>
{
    private String name;
    private int level;
    private double power;
    private Set<Mage> apprentices;

    public Mage(String name, int level, double power, int arg) {
        this.name = name;
        this.level = level;
        this.power = power;
        //typ struktury uwarunkowany argumentem
        if (arg == 1) this.apprentices = new TreeSet<>();
        else if (arg == 2) this.apprentices = new TreeSet<>(new MageComparator());
        else this.apprentices = new HashSet<>();
    }

    @Override
    public int compareTo(Mage other)
    {
        //porzadek: name, level, power
        int result = this.name.compareTo(other.name);
        if (result == 0) {
            result = Integer.compare(this.level, other.level);
            if (result == 0) {
                result = Double.compare(this.power, other.power);
            }
        }
        return result;
    }

    @Override
    public String toString() {
        return "Mage{name='" + name + "', level=" + level + ", power=" + power + "}";
    }
    public void setName(String name) {
        this.name = name;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public void setPower(double power) {
        this.power = power;
    }

    public void setApprentices(Set<Mage> apprentices) {
        this.apprentices = apprentices;
    }

    public String getName() {
        return name;
    }

    public int getLevel() {
        return level;
    }

    public double getPower() {
        return power;
    }

    public Set<Mage> getApprentices() {
        return apprentices;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Mage mage = (Mage) o;
        return level == mage.level && Double.compare(power, mage.power) == 0 && Objects.equals(name, mage.name) && Objects.equals(apprentices, mage.apprentices);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, level, power, apprentices);
    }
}
