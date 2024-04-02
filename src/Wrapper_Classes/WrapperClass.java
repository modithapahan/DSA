package Wrapper_Classes;

public class WrapperClass {
    public static void main(String[] args) {
        // use wrapper classes
        byte a = 1;
        Byte byteobj = new Byte(a);

        int b = 10;
        Integer intobj = new Integer(b);

        float c = 18.6f;
        Float floatobj = new Float(c);

        double d = 250.5;
        Double doubleobj = new Double(d);

        char e = 'a';
        Character charobj = e;

        System.out.println("Values of Wrapper objects (printing as objects)");
        System.out.println("\nByte object byteobj: " + byteobj);
        System.out.println("\nInteger object intobj: " + intobj);
        System.out.println("\nFloat object floatobj: " + floatobj);
        System.out.println("\nDouble object doubleobj: " + doubleobj);
        System.out.println("\nCharacter object charobj: " + charobj);

        // unwrap
        byte bv = byteobj;
        int iv = intobj;
        float fv = floatobj;
        double dv = doubleobj;
        char cv = charobj;

        System.out.println("\nUnwrapped values (printing as data types)");
        System.out.println("\nbyte value, bv: " + bv);
        System.out.println("\nint value, iv: " + iv);
        System.out.println("\nfloat value, fv: " + fv);
        System.out.println("\ndouble value, dv: " + dv);
        System.out.println("\nchar value, cv: " + cv);
    }
}
