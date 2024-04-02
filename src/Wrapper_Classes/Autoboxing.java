package Wrapper_Classes;

import java.util.ArrayList;

public class Autoboxing {
    public static void main(String[] args) {
        char ch = 'a';

        Character a = ch; // autoboxing

        ArrayList<Integer> arrayList = new ArrayList<Integer>();

        arrayList.add(99);
        arrayList.add(199);

        System.out.println(arrayList.get(1));
    }
}