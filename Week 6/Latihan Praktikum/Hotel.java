public class Hotel {
    String nama, kota;
    int harga;
    byte bintang;
    
    Hotel(String n, String k, int h, byte b) {
        nama = n;
        kota = k;
        harga = h;
        bintang = b;
    }
}

class HotelService {
    Hotel rooms[] = new Hotel[10];
    int count = 0;

    void tambah(Hotel H) {
        if (count < rooms.length) {
            rooms[count] = H;
            count++;
        }
    }

    void tampilAll() {
        for (int i = 0; i < count; i++) {
            System.out.printf("\nNama hotel : %s\nKota\t: %s\nHarga\t: %s\nBintang\t: %s\n", rooms[i].nama, rooms[i].kota, rooms[i].harga, rooms[i].bintang);
        }
    }

    void bubbleSort() {
        for (int i = 0; i < count - 1; i++) {
            for (int j = 1; j < count - i; j++) {
                if (rooms[j].harga < rooms[j - 1].harga) {
                    Hotel temp = rooms[j];
                    rooms[j] = rooms[j - 1];
                    rooms[j - 1] = temp;
                }
            }
        }
    }

    void selectionSort() {
        for (int i = 0; i < count - 1; i++) {
            int index = i;
            for (int j = i + 1; j < count; j++) {
                if (rooms[j].bintang > rooms[index].bintang) {
                    index = j;
                }
            }
            Hotel temp = rooms[index];
            rooms[index] = rooms[i];
            rooms[i] = temp;
        }
    }
}
