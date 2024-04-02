package OOP_Concept.Access_Modifiers.Private;

public class B {
    public static void main(String[] args) {
        A obj = new A();

        obj.display(); // can;t access the method. because the method is private.
    }
}
