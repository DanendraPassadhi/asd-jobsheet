public class Node06 {
    Pembeli06 data06;
    Node06 prev06;
    Node06 next06;

    Node06(Node06 prev06, Pembeli06 data06, Node06 next06) {
        this.prev06 = prev06;
        this.data06 = data06;
        this.next06 = next06;
    }
}

class NodePesanan06 {
    Pesanan06 data06;
    NodePesanan06 next06;
    NodePesanan06 prev06;
    
    NodePesanan06(Pesanan06 data06, NodePesanan06 prev06, NodePesanan06 next06) {
        this.prev06 = prev06;
        this.data06 = data06;
        this.next06 = next06;
    }
}
