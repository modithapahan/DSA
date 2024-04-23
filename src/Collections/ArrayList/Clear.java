package Collections.ArrayList;

import java.util.ArrayList;

public class Clear {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();

        al.add(1);
        al.add(2);
        al.add(3);
        al.add(4);

        System.out.println(al);

        al.clear(); // clear the array list

        System.out.println(al);

        /* Another example */

        ArrayList<String> al2 = new ArrayList<>();

        al2.add("Dog");
        al2.add("Cat");
        al2.add("Rabbit");
        al2.add("Bird");

        System.out.println(al2);

        al2.clear();

        System.out.println(al2);
    }
}
