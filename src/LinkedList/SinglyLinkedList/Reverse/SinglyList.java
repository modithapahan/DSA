package LinkedList.SinglyLinkedList.Reverse;

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

    public Node reverse (Node head) {
        Node cur = head;
        Node pre = null;
        Node next = null;

        if (head == null) {
            return head;
        }

        while (cur != null) {
             next = cur.next;
             cur.next = pre;
             pre = cur;
             cur = next;
        }
        return pre;
    }

    public void display (Node head) {
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
        sl.head.next = new Node(2);
        sl.head.next.next = new Node(3);
        sl.head.next.next.next = new Node(4);

        sl.display(sl.head);
        sl.head = sl.reverse(sl.head);
        sl.display(sl.head);
    }
}
