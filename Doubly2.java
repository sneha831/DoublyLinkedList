 public class Doubly2 {

    // Node class
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

    // Doubly Linked List
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

        // Insert at end
        public void insertAtEnd(int data) {
            Node newNode = new Node(data);
            if (head == null) {
                head = newNode;
                return;
            }

            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }

            temp.next = newNode;
            newNode.prev = temp;
        }

        // Delete from beginning
        public void deleteFromBeginning() {
            if (head == null) {
                System.out.println("List is empty. Nothing to delete.");
                return;
            }

            System.out.println("Deleted: " + head.data);
            head = head.next;

            if (head != null) {
                head.prev = null;
            }
        }

        // Delete from end
        public void deleteFromEnd() {
            if (head == null) {
                System.out.println("List is empty. Nothing to delete.");
                return;
            }

            if (head.next == null) {
                System.out.println("Deleted: " + head.data);
                head = null;
                return;
            }

            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }

            System.out.println("Deleted: " + temp.data);
            temp.prev.next = null;
        }

        // Display list forward
        public void displayForward() {
            Node temp = head;
            if (temp == null) {
                System.out.println("List is empty.");
                return;
            }

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

        // Insert at end
        list.insertAtEnd(10);
        list.insertAtEnd(20);
        list.insertAtEnd(30);

        // Insert at beginning
        list.insertAtBeginning(5);
        list.insertAtBeginning(2);

        System.out.println("Initial List:");
        list.displayForward();

        // Delete operations
        list.deleteFromBeginning();
        list.deleteFromEnd();

        System.out.println("\nList after deletions:");
        list.displayForward();
    }
}

    

