import java.util.Scanner;

public class MainQueue22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        QueueLinkedList antrian = new QueueLinkedList();
        int pilihan;

        do {
            System.out.println("\n========= MENU ANTRIAN =========");
            System.out.println("1. Tambah Antrian");
            System.out.println("2. Panggil Antrian");
            System.out.println("3. Lihat Antrian Terdepan");
            System.out.println("4. Lihat Antrian Terakhir");
            System.out.println("5. Tampilkan Semua Antrian");
            System.out.println("6. Jumlah Mahasiswa dalam Antrian");
            System.out.println("7. Kosongkan Antrian");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = sc.nextInt(); sc.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan NIM  : ");
                    String nim = sc.nextLine();
                    System.out.print("Masukkan Nama : ");
                    String nama = sc.nextLine();
                    antrian.enqueue(new MahasiswaQ22(nim, nama));
                    break;
                case 2:
                    antrian.dequeue();
                    break;
                case 3:
                    antrian.peekFront();
                    break;
                case 4:
                    antrian.peekRear();
                    break;
                case 5:
                    antrian.display();
                    break;
                case 6:
                    System.out.println("Jumlah antrian: " + antrian.count());
                    break;
                case 7:
                    antrian.clear();
                    break;
                case 0:
                    System.out.println("Program selesai.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (pilihan != 0);
    }
}