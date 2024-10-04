package LinkedList.SinglyLinkedList.CycleDetect;


class Node {
    int data;
    Node next;

    public Node (int data) {
        this.data = data;
        this.next = null;
    }
}

class SinglyList {
    private Node head;

    public boolean hasCycle () {
        Node fastNode = head;
        Node slowNode = head;

        if (head == null || head.next == null) {
            System.out.println("Empty");
            return false;
        }

        while (fastNode.next != null) {
            fastNode = fastNode.next.next;
            slowNode = slowNode.next;

            if (fastNode == slowNode) {
                return true;
            }
        }
        return false;
    }

    public Node createList () {
        Node first = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);
        Node forth = new Node(4);
        Node fifth = new Node(5);
        Node sixth = new Node(6);

        head = first;
        first.next = second;
        second.next = third;
        third.next = forth;
        forth.next = fifth;
        fifth.next = sixth;
        sixth.next = third;

        return head;
    }

    public static void main(String[] args) {
        SinglyList sl = new SinglyList();

        sl.createList();
        System.out.println(sl.hasCycle());
    }
}
