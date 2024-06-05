package Week_15.Percobaan_1;

public class Node {
    int data;
    Node prev, next;
    int jarak;

    public Node() {

    }

    public Node(Node prev, int data, int jarak, Node next) {
        this.prev = prev;
        this.data = data;
        this.next = next;
        this.jarak = jarak;
    }
}
