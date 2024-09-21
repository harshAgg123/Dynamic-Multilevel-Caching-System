package MULTI_LEVEL_CACHE;
import java.util.*;
public class Cache {
    int capacity;
    Map<String, Node> map;
    DLL list;

    public Cache(int capacity) {
        this.capacity = capacity;
        this.map = new HashMap<>();
        this.list = new DLL();
    }

    public Node add(String key, int value) {
        Node removedNode=null;
        if (this.map.containsKey(key)) {
            this.map.remove(this.list.getHead().key);
            this.list.remove(this.list.getHead());
            Node node = this.list.add(key, value);
            this.map.put(key, node);
        } else {
            if (this.map.size() == this.capacity) {
                removedNode=this.map.get(this.list.getHead().key);
                this.map.remove(this.list.getHead().key);
                this.list.remove(this.list.getHead());
            }
            Node node = this.list.add(key, value);
            this.map.put(key, node);
        }
        return removedNode;
    }
    public Node getHead(){
        return list.getHead();
    }

    public Node remove(String key) {
        if (!this.map.containsKey(key)) {
            System.out.println("Key NOT Found!");
            return null;
        }
        Node node = this.map.get(key);
        this.map.remove(key);
        this.list.remove(node);
        return node;
    }
    public boolean isCacheFull(){
        return this.map.size() == this.capacity;
    }

    public void print() {
        this.list.print();
    }

    public int getCacheSize() {
        return this.map.size();
    }

    public int getCacheCapacity() {
        return this.capacity;
    }
}
