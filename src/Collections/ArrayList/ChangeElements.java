package Collections.ArrayList;

import java.util.ArrayList;

public class ChangeElements {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<>();

        al.add("Moditha");
        al.add("Pahan12");
        al.add("Abeysekara");

        System.out.println(al);

        al.set(1, "Pahan");

        System.out.println(al);
    }
}
