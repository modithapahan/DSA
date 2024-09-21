package LinkedList.SinglyLinkedList.DeleteLastNode;

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

    public void deleteLastNode() {
        if(head == null) {
            System.out.println("Empty list");
        }
        else if(head.next == null) {
            return;
        } else {
            Node current = head;
            while(current.next.next != null) {
                current = current.next;
            }
            current.next = null;
        }
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

        sl.deleteLastNode();
        sl.display();
    }
}
