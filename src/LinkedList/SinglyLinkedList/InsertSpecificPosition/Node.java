package LinkedList.SinglyLinkedList.InsertSpecificPosition;

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

    public void insertNodeAtSpecificPosition(int position, int value) {
        Node newNode = new Node(value);
        if(position < 1) {
            System.out.println("Invalid Position!");
            return;
        }
        else if(position == 1) {
            newNode.next = head;
            head = newNode;
            return;
        }

        Node current = head;
        int count = 1;
        while(count < position-1) {
            current = current.next;
            count++;
        }
        newNode.next = current.next;
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

        sl.insertNodeAtSpecificPosition(5, 5);
        sl.printList();
    }
}
