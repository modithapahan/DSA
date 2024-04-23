package Collections.ArrayList;

import java.util.ArrayList;

public class AddAll {
    public static void main(String[] args) {
        ArrayList<Integer> al1 = new ArrayList<>();

        al1.add(1);
        al1.add(2);
        al1.add(3);
        al1.add(4);

        ArrayList<Integer> al2 = new ArrayList<>();

        al2.add(5);
        al2.add(6);
        al2.add(7);
        al2.add(8);

        // combine all ArrayLists together
        al1.addAll(al2);
        System.out.println(al1);

        System.out.println("-----------------------------");

        for (Integer i : al1) {
            System.out.println(i);
        }
    }
}
