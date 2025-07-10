public class Doubly1 {

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

        // Display list forward
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

        list.insertAtEnd(34);
        list.insertAtEnd(45);
        list.insertAtEnd(57);
        list.insertAtEnd(60);
        list.insertAtEnd(70);

        list.displayForward();
    }
}

