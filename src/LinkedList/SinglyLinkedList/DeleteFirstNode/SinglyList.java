package LinkedList.SinglyLinkedList.DeleteFirstNode;

class Node {
    public int data;
    public Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class SinglyList {
    private Node head;

    public void deleteFirstNode() {
        if(head == null) {
            System.out.println("Empty List");
            return;
        }
        Node current = head;
        head = current.next;

        System.out.println("Delete value " + current.data);
    }

    public void display() {
        Node current = head;
        while(current != null) {
            System.out.print(current.data + " --> ");
            current = current.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        SinglyList sl = new SinglyList();

        sl.head = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);
        Node forth = new Node(4);

        sl.head.next = second;
        second.next = third;
        third.next = forth;

        sl.deleteFirstNode();
        sl.display();
    }
}
