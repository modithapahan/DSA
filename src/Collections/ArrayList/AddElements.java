package Collections.ArrayList;

import java.util.ArrayList;

public class AddElements {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<>();

        al.add("Moditha");
        al.add("Pahan");

        al.add(2, "Abeysekara");

        System.out.println(al);
    }
}
