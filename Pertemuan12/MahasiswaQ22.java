public class MahasiswaQ22 {
    String nim;
    String nama;

    public MahasiswaQ22(String nim, String nama) {
        this.nim = nim;
        this.nama = nama;
    }

    public void tampil() {
        System.out.printf("NIM: %-10s Nama: %s\n", nim, nama);
    }
}
