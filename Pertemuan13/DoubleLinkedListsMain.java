import java.util.Scanner;

public class DoubleLinkedListsMain {
    public static void main(String[] args) {
        DoubleLinkedLists list = new DoubleLinkedLists(); 
        Scanner scan = new Scanner(System.in);
        int pilihan;

        do {
            System.out.println("\nMenu Double Linked List Mahasiswa");
            System.out.println("1. Tambah di awal");
            System.out.println("2. Tambah di akhir");
            System.out.println("3. Hapus di awal");
            System.out.println("4. Hapus di akhir");
            System.out.println("5. Tampilkan data");
            System.out.println("6. Cari Mahasiswa berdasarkan NIM");
            System.out.println("7. Tambah data setelah NIM tertentu");
            System.out.println("8. Tambah data di index tertentu");
            System.out.println("9. Hapus data di index tertentu");
            System.out.println("10. Hapus setelah NIM tertentu");
            System.out.println("11. Lihat data pertama, terakhir, dan index ke-n");
            System.out.println("12. Tampilkan jumlah data");
            System.out.println("0. Keluar");
            System.out.print("Pilihan menu: ");
            pilihan = scan.nextInt();
            scan.nextLine();

            switch (pilihan) {
                case 1 -> {
                    Mahasiswa22 mhs = inputMahasiswa(scan);
                    list.addFirst(mhs);
                }
                case 2 -> {
                    Mahasiswa22 mhs = inputMahasiswa(scan);
                    list.addLast(mhs);
                }
                case 3 -> list.removeFirst();
                case 4 -> list.removeLast();
                case 5 -> list.print();
                case 6 -> {
                    System.out.print("Masukkan NIM yang dicari: ");
                    String nim = scan.nextLine();
                    Node22 found = list.search(nim);
                    if (found != null) {
                        System.out.println("Data ditemukan:");
                        found.data.tampil();
                    } else {
                        System.out.println("Data tidak ditemukan.");
                    }
                }
                case 7 -> {
                    System.out.print("Masukkan NIM yang ingin disisipi setelahnya: ");
                    String nim = scan.nextLine();
                    Mahasiswa22 mhs = inputMahasiswa(scan);
                    list.insertAfter(nim, mhs);
                }
                case 8 -> {
                    System.out.print("Masukkan index: ");
                    int idx = scan.nextInt(); scan.nextLine();
                    Mahasiswa22 mhs = inputMahasiswa(scan);
                    list.add(mhs, idx);
                }
                case 9 -> {
                    System.out.print("Masukkan index yang ingin dihapus: ");
                    int idx = scan.nextInt(); scan.nextLine();
                    list.remove(idx);
                }
                case 10 -> {
                    System.out.print("Masukkan NIM sebelum node yang ingin dihapus: ");
                    String nim = scan.nextLine();
                    list.removeAfter(nim);
                }
                case 11 -> {
                    System.out.println("Data pertama:");
                    if (list.getFirst() != null) list.getFirst().tampil();
                    System.out.println("Data terakhir:");
                    if (list.getLast() != null) list.getLast().tampil();
                    System.out.print("Masukkan index yang ingin dilihat: ");
                    int i = scan.nextInt(); scan.nextLine();
                    Mahasiswa22 data = list.getIndex(i);
                    if (data != null) data.tampil();
                    else System.out.println("Index tidak ditemukan.");
                }
                case 12 -> {
                    System.out.println("Jumlah data dalam list: " + list.size());
                }
                case 0 -> System.out.println("Keluar dari program.");
                default -> System.out.println("Pilihan tidak valid:");
            }
        } while (pilihan != 0);

        scan.close();
    }

    public static Mahasiswa22 inputMahasiswa(Scanner scan) {
        System.out.print("Masukkan NIM: ");
        String nim = scan.nextLine();
        System.out.print("Masukkan Nama: ");
        String nama = scan.nextLine();
        System.out.print("Masukkan Kelas: ");
        String kelas = scan.nextLine();
        System.out.print("Masukkan IPK: ");
        double ipk = scan.nextDouble(); scan.nextLine();

        return new Mahasiswa22(nim, nama, kelas, ipk);
    }
}