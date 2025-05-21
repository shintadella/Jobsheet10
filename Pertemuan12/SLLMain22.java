public class SLLMain22 {
    public static void main(String[] args) {
        SingleLinkedList22 sll = new SingleLinkedList22();

        Mahasiswa22 mhs0 = new Mahasiswa22("21212203", "Dirga", "4D", 3.6); 
        Mahasiswa22 mhs1 = new Mahasiswa22("22212202", "Cintia", "3C", 3.5); 
        Mahasiswa22 mhs2 = new Mahasiswa22("23212201", "Bimon", "2B", 3.8);  

        sll.addLast(mhs0); 
        sll.addLast(mhs1); 
        sll.addLast(mhs2); 

        System.out.println("data index 1 : ");
        sll.getData(1); 

        System.out.println("data mahasiswa an Bimon berada pada index : " + sll.indexOf("bimon"));
        System.out.println();

        sll.removeFirst();
        sll.print(); 
        sll.removeFirst();
        sll.print();
    }
}
