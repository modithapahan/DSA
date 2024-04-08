package Collections.List_Interface;

import java.util.ArrayList;
import java.util.List;

public class Check {
    public static void main(String[] args) {
        List<String> a1 = new ArrayList<String>();

        a1.add("Moditha");
        a1.add("Pahan");
        a1.add("Abeysekara");

        boolean isPresent = a1.contains("Moditha");

        System.out.println(isPresent);
    }
}
