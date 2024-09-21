package MULTI_LEVEL_CACHE;
//This is the node class for our Doubly Linked List
public class Node {
    String key;
    int value;
    Node next;
    Node prev;
    //Constructor
    public Node(String key, int value) {
        this.key = key;
        this.value = value;
        this.next = null;
        this.prev = null;
    }
}
