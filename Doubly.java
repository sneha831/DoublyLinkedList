 public class Doubly {

    // Node class inside the same file
    static class Node {
        int data;
        Node next;
        Node prev;

        Node(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    // DoublyLinkedList class
    static class DoublyLinkedList {
        Node head;

        // Insert at beginning
        public void insertAtBeginning(int data) {
            Node newNode = new Node(data);

            if (head != null) {
                newNode.next = head;
                head.prev = newNode;
            }

            head = newNode;
        }

        // Display list
        public void displayForward() {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + " <-> ");
                temp = temp.next;
            }
            System.out.println("null");
        }
    }

    // Main method
    public static void main(String[] args) {
        DoublyLinkedList list = new DoublyLinkedList();

        list.insertAtBeginning(34);
        list.insertAtBeginning(45);
        list.insertAtBeginning(57);
        list.insertAtBeginning(60);
        list.insertAtBeginning(70);

        list.displayForward();
    }
}



