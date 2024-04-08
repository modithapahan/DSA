package Collections.List_Interface;

import java.util.ArrayList;
import java.util.List;

public class UsingForLoop {
    public static void main(String[] args) {
        List<String> a1 = new ArrayList<String>();

        a1.add("Moditha");
        a1.add("Pahan");
        a1.add("Abeysekara");

        for (int i = 0; i < a1.size(); i++) {
            System.out.println(a1.get(i));
        }

        System.out.println("");

        for (String srr : a1) {
            System.out.println(srr);
        }
    }
}
