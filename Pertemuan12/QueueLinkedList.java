public class QueueLinkedList {
    NodeQ22 front, rear;
    int size = 0;
    int kapasitas = 100; 

    public boolean isEmpty() {
        return front == null;
    }

    public boolean isFull() {
        return size == kapasitas;
    }

    public void enqueue(MahasiswaQ22 mhs) {
        if (isFull()) {
            System.out.println("Antrian penuh!");
            return;
        }
        NodeQ22 baru = new NodeQ22(mhs);
        if (isEmpty()) {
            front = rear = baru;
        } else {
            rear.next = baru;
            rear = baru;
        }
        size++;
        System.out.println("Mahasiswa berhasil ditambahkan ke antrian.");
    }

    public void dequeue() {
        if (isEmpty()) {
            System.out.println("Antrian kosong, tidak ada yang dipanggil.");
        } else {
            System.out.print("Mahasiswa yang dipanggil: ");
            front.data.tampil();
            front = front.next;
            size--;
            if (isEmpty()) rear = null;
        }
    }

    public void peekFront() {
        if (!isEmpty()) {
            System.out.print("Antrian terdepan: ");
            front.data.tampil();
        } else {
            System.out.println("Antrian kosong");
        }
    }

    public void peekRear() {
        if (!isEmpty()) {
            System.out.print("Antrian paling akhir: ");
            rear.data.tampil();
        } else {
            System.out.println("Antrian kosong");
        }
    }

    public void clear() {
        front = rear = null;
        size = 0;
        System.out.println("Antrian dikosongkan.");
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("Antrian kosong");
        } else {
            System.out.println("Daftar Mahasiswa dalam Antrian:");
            NodeQ22 current = front;
            while (current != null) {
                current.data.tampil();
                current = current.next;
            }
        }
    }

    public int count() {
        return size;
    }
}