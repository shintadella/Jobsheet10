public class Mahasiswa22 {
    String nim;
    String nama; 
    String kelas;
    double ipk;

    public Mahasiswa22() {}

    public Mahasiswa22(String nim, String nama, String kelas, double ipk) {
        this.nim = nim;
        this.nama = nama;
        this.kelas = kelas;
        this.ipk = ipk;
    }

    public void tampilInformasi() {
        System.out.printf("%-12s %-10s %-5s %.1f\n", nama, nim, kelas, ipk);
    }
}
