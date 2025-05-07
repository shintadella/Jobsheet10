public class AntrianLayanan22 {
    Mahasiswa22[] data;
        int front;
        int rear;
        int size; 
        int max;
    
        public AntrianLayanan22(int max) {
            this.max = max;
            this.data = new Mahasiswa22[max];
            this.front = 0;
            this.rear = -1;
            this.size = 0;
        }
    
        public boolean IsEmpty() {
            if (size == 0) {
                return true;
            } else {
                return false;
            }
        }
    
        public boolean IsFull() {
            if (size == max) {
                return true;
            } else {
                return false;
            }
        }
    
        public void lihatTerdepan() {
            if (!IsEmpty()) {
                System.out.println("Antrian kosong.");
            } else {
                System.out.print("Mahasiswa terdepan:");
                System.out.println("NIM - NAMA - PRODI - KELAS");
                data[front].tampilkanData();
            }
        }
    
        public void tampilkanSemua() {
            if (IsEmpty()) {
                System.out.println("Antrian koson.");
                return;
            } 
            System.out.println("Daftar Mahasiswa dalam Antrian:");
            System.out.println("NIM - NAMA - PRODI - KELAS");
            for (int i = 0; i < size; i++) {
                int index = (front + i) % max;
                System.out.print((i + 1) + ". ");
                data[index].tampilkanData();   
            }
        }
    
        public void clear() {
            if (!IsEmpty()) {
                front = rear = -1;
                size = 0;
                System.out.println("Queue berhasil dikosongkan");
            } else {
                System.out.println("Queue masih kosong");
            }
        }
    
        public void tambahAntrian(Mahasiswa22 mhs) {
            if (IsFull()) {
                System.out.println("Antrian penuh, tidak dapat menambah mahasiswa.");
                return;
            } 
            rear = (rear + 1) % max;
            data[rear] = mhs;
            size++;
            System.out.println(mhs.nama + " berhasil masuk ke antrian.");
            }
    
        public Mahasiswa22 layananMahasiswa() {
            if (IsEmpty()) {
                System.out.println("Antrian kosong");
                return null;
            }
            Mahasiswa22 mhs = data[front];
            front = (front + 1) % max;
            size--;
            return mhs;
        }

        public int getJumlahAntrian() {
            return size;
        }

        public void lihatAkhir() {
            if (IsEmpty()) {
                System.out.println("Antrian kosong.");
            } else {
                System.out.print("Mahasiswa di posisi belakang:\nNIM - NAMA - PRODI - KELAS\n");
                data[rear].tampilkanData();
            }
        }        
    }