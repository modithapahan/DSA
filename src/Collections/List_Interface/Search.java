package Collections.List_Interface;

import java.util.ArrayList;
import java.util.List;

public class Search {
    public static void main(String[] args) {
        List<String> a1 = new ArrayList<String>();

        a1.add("moditha");
        a1.add("pahan");
        a1.add("modi1");
        a1.add("mod");
        a1.add("pahan12");
        a1.add("pahan");

        int index1 = a1.indexOf("Moditha1");
        System.out.println(index1); // -1 means not found

        int index2 = a1.indexOf("pahan");
        System.out.println(index2);

        int index3 = a1.lastIndexOf("pahan");
        System.out.println(index3);
    }
}
