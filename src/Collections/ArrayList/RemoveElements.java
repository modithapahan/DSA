package Collections.ArrayList;

import java.util.ArrayList;

public class RemoveElements {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<>();
        al.add("Moditha");
        al.add("Pahan12");
        al.add("Pahan");

        System.out.println(al);

        al.remove(1);

        System.out.println(al);
    }
}
