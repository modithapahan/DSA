package Collections.List_Interface;

import java.util.ArrayList;
import java.util.List;

public class AddMethod {
    public static void main(String[] args) {
        List<String> a1 = new ArrayList<>();

        a1.add("Moditha");
        a1.add("Abeysekara");
        a1.add(1, "Pahan");

        System.out.println(a1);
    }
}
