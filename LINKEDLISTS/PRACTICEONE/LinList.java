package PRACTICEONE;

public class LinList {
    
    Node head;

    public void insert(int data) {
        Node node = new Node();
        node.data = data;
        node.next = null;
    
        if (head == null) {
            head = node;
        } else {
            Node n = head;
            while (n.next != null) {
                n = n.next;
            }
            n.next = node; // Link the new node to the end of the list
        }
    }
}
