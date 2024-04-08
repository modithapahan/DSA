package Collections.List_Interface;

import java.util.ArrayList;
import java.util.List;

public class Access_Elements {
    public static void main(String[] args) {
        List<String> a1 = new ArrayList<String>();

        a1.add("Moditha");
        a1.add("Pahan");
        a1.add("Abeysekara");

        String first = a1.get(0);
        String second = a1.get(1);
        String third = a1.get(2);

        System.out.println(first);
        System.out.println(second);
        System.out.println(third);
        System.out.println(a1);
    }
}
