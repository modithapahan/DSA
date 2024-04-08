package Collections.List_Interface;

import java.util.ArrayList;
import java.util.List;

public class Remove {
    public static void main(String[] args) {
        List<String> a1 = new ArrayList<String>();

        a1.add("Moditha");
        a1.add("Abeysekara");
        a1.add(1, "Pahan");
        a1.add(3, "mod1");
        a1.add(4, "mod2");

        System.out.println("List: " + a1);

        a1.remove(3);
        a1.remove("mod2");

        System.out.println("Update: " + a1); // after the remove objects

    }
}
