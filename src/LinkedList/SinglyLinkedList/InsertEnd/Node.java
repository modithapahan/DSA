package LinkedList.SinglyLinkedList.InsertEnd;

class Node {
    public int data;
    public Node next;

    public Node (int data) {
        this.data = data;
        this.next = null;
    }
}

class SinglyList {
    private Node head;

    public void insertNodeAtEnd(int value) {
        Node newNode = new Node(value);
        if(head == null) {
            newNode.next = head;
            head = newNode;
            return;
        }
        Node current = head;
        while(current.next != null) {
            current = current.next;
        }
        current.next = newNode;
    }

    public void printList() {
        Node cur = head;
        while (cur != null) {
            System.out.print(cur.data + " --> ");
            cur = cur.next;
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

        sl.insertNodeAtEnd(5);
        sl.printList();
    }
}