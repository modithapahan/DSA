package LinkedList.SinglyLinkedList.InsertFront;

class Node {
    int data;
    Node next;

    Node (int data) {
        this.data = data;
        this.next = null;
    }
}

class SinglyList {
    public static Node insertAtFront(Node head, int new_data) {
        Node new_node  = new Node(new_data);
        new_node.next = head;

        return new_node;
    }

    public static void printList(Node head) {
        Node cur = head;
        while (cur != null) {
            System.out.print(cur.data + " ");
            cur = cur.next;
        }
    }

    public static void main(String[] args) {
        Node head = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);
        Node forth = new Node(4);

        head.next = second;
        second.next = third;
        third.next = forth;

        head = insertAtFront(head, 6);
        head = insertAtFront(head, 0);
        printList(head);
    }
}