package Collections.ArrayList;

import java.util.ArrayList;

public class Iterate {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<>();

        al.add("Moditha");
        al.add("Pahan");
        al.add("Abeysekara");

        for (int i = 0; i < al.size(); i++) {
            System.out.println(al.get(i));
        }

        System.out.println("---------------------");

        for (String i : al) {
            System.out.println(i);
        }
    }
}
