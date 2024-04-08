package Collections.List_Interface;

import java.util.ArrayList;
import java.util.List;

public class UpdateList {
    public static void main(String[] args) {
        List<String> a1 = new ArrayList<String>();

        a1.add("Moditha");
        a1.add("Pahan12");
        a1.add("Abeysekara");

        System.out.println(a1);

        a1.set(1, "Pahan");
        System.out.println(a1);// updated list
    }
}
