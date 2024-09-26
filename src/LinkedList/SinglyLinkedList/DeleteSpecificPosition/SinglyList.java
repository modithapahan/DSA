package LinkedList.SinglyLinkedList.DeleteSpecificPosition;

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

    public int findSize() {
        Node current = head;
        int count = 0;
        while(current != null) {
            count++;
            current = current.next;
        }
        return count;
    }

    public void deleteNodeAtSpecificPosition(int position) {
        int listSize = findSize();

        if(head == null) {
            System.out.println("Empty List");
            return;
        }

        if (listSize < position || position <= 0) {
            System.out.println("Position out of bounds");
            return;
        }

        if(position == 1) {
            Node temp1 = head;
            head = head.next;
            temp1 = null;
            return;
        }

        Node current = head;
        int count = 1;

        while(current != null && count < position - 1) {
            current = current.next;
            count++;
        }

        if(current == null || current.next == null) {
            return;
        }

        Node temp = current.next;

        current.next = current.next.next;
        temp = null;
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

        sl.deleteNodeAtSpecificPosition(3);
        sl.deleteNodeAtSpecificPosition(0);
        sl.display();
    }
}
