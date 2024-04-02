package Wrapper_Classes;

import java.util.ArrayList;

public class Unboxing {
    public static void main(String[] args) {
        Character a = 'a';

        char b = a;

        ArrayList<Integer> arrayList = new ArrayList<Integer>();

        arrayList.add(12);

        int num = arrayList.get(0);
        System.out.println(num);
    }
}
