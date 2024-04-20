package Collections.ArrayList;

import java.util.ArrayList;

public class GetElement {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();

        al.add(1);
        al.add(2);
        al.add(3);
        al.add(4);
        al.add(5);

        int element = al.get(1);
        System.out.println(element);
    }
}
