package MULTI_LEVEL_CACHE;
//This is the class of Doubly Linked List
public class DLL {
    Node head;
    Node end;
    //Constructor
    public DLL() {
        this.head = null;
        this.end = null;
    }

    // Method for adding node in doubly linked list
    //Time Complexity: O(1)
    public Node add(String key, int value) {
        Node node = new Node(key, value);
        if (this.head == null) {
            this.head = node;
            this.end = node;
        } else {
            this.end.next = node;
            node.prev = this.end;
            this.end = node;
        }
        return node;
    }

    // Method for removing node in doubly linked list
    //Time Complexity: O(1)
    public void remove(Node node) {
        if (node == this.head) {
            this.head = node.next;
            if (this.head != null) {
                this.head.prev = null;
            } else {
                this.end = null;
            }
        } else if (node == this.end) {
            this.end = node.prev;
            if (this.end != null) {
                this.end.next = null;
            } else {
                this.head = null;
            }
        } else {
            Node prevNode = node.prev;
            Node nextNode = node.next;
            prevNode.next = nextNode;
            nextNode.prev = prevNode;
        }
    }
    // This method returns head of doubly linked list
    //Time Complexity: O(1)
    public Node getHead() {
        return this.head;
    }

    // Method for displaying all nodes of doubly linked list
    //Time Complexity: O(n)
    //n: No. of nodes in linked list
    public void print() {
        Node current = this.head;
        while (current != null) {
            System.out.print(" " + current.key + ":" + current.value+ " , ");
            current = current.next;
        }
    }
}
