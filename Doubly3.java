public class Doubly3 {

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

    static class DoublyLinkedList {
        Node head;

        // Insert at a specific position (1-based index)
        public void insertAtPosition(int data, int position) {
            Node newNode = new Node(data);

            // Case 1: Insert at beginning
            if (position <= 1 || head == null) {
                newNode.next = head;
                if (head != null) head.prev = newNode;
                head = newNode;
                return;
            }

            Node temp = head;
            int count = 1;

            // Traverse to (position - 1)th node
            while (temp.next != null && count < position - 1) {
                temp = temp.next;
                count++;
            }

            // Insert after 'temp'
            newNode.next = temp.next;
            newNode.prev = temp;

            if (temp.next != null) {
                temp.next.prev = newNode;
            }

            temp.next = newNode;
        }

        // Display list
        public void display() {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + " <-> ");
                temp = temp.next;
            }
            System.out.println("null");
        }
    }

    public static void main(String[] args) {
        DoublyLinkedList list = new DoublyLinkedList();

        list.insertAtPosition(10, 1); // beginning
        list.insertAtPosition(20, 2); // end
        list.insertAtPosition(30, 3); // end
        list.insertAtPosition(15, 2); // middle

        System.out.println("List after inserting at specific positions:");
        list.display();
    }
}

