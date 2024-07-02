public class Node {
        Kendaraan data;
        Node prev;
        Node next;
    
        Node(Node prev, Kendaraan data, Node next) {
            this.prev = prev;
            this.data = data;
            this.next = next;
        }
}
