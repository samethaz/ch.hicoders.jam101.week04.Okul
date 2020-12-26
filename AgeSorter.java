package corejava.compare;

import Okul.Ogrenci;

import java.util.Comparator;

public class AgeSorter implements Comparator<Ogrenci> {
    @Override
    public int compare(Ogrenci o1, Ogrenci o2)
    {
        return o1.getYas() - o2.getYas();
    }
}