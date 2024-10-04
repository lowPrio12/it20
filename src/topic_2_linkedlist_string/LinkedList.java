package topic_2_linkedlist_string;

public class LinkedList {

    //head of the list
    private Node head;

    //Method to add a new node
    public void add(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
    }
  //Method to print linked list
    public void printList() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }
     //Method to move a node to a new position/swap nodes
    public void moveNodePointer(int currentIndex, int newIndex) {
        if (head == null || currentIndex == newIndex) {
            return;
        }

        Node current = head;
        Node prev = null;
        Node movingNode = null;
        Node movingPrev = null;

        for (int i = 0; current != null && i < currentIndex; i++) {
            movingPrev = prev;
            prev = current;
            current = current.next;
        }
        movingNode = current;

        if (movingNode == null) {
            return;
        }

        if (movingPrev != null) {
            movingPrev.next = movingNode.next;
        } else {
            head = movingNode.next;
        }

        current = head;
        prev = null;
        for (int i = 0; current != null && i < newIndex; i++) {
            prev = current;
            current = current.next;
        }

        if (prev != null) {
            movingNode.next = current;
            prev.next = movingNode;
        } else {
            movingNode.next = head;
            head = movingNode;
        }
    }
     //Method to delete a node by value
    public void deleteByValue(String value) {
        if (head == null) {
            return;
        }

        if (head.data.equals(value)) {
            head = head.next;
            return;
        }

        Node current = head;
        while (current.next != null) {
            if (current.next.data.equals(value)) {
                current.next = current.next.next;
                return;
            }
            current = current.next;
        }
    }

}