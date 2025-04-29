import java.util.Scanner;
public class SuratIzinDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StackSurat stack = new StackSurat(8); 
        int pilih;
        do {
            System.out.println("\n===== Menu Surat Izin =====");
            System.out.println("1. Terima Surat Izin");
            System.out.println("2. Proses Surat Izin");
            System.out.println("3. Lihat Surat Izin Terakhir");
            System.out.println("4. Cari Surat Izin");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu: ");
            pilih = sc.nextInt();
            sc.nextLine(); 
            switch (pilih) {
                case 1:
                    System.out.print("ID Surat       : ");
                    String id = sc.nextLine();
                    System.out.print("Nama Mahasiswa : ");
                    String nama = sc.nextLine();
                    System.out.print("Kelas          : ");
                    String kelas = sc.nextLine();
                    System.out.print("Jenis Izin (S/I): ");
                    char jenis = sc.next().charAt(0);
                    System.out.print("Durasi (hari)  : ");
                    int durasi = sc.nextInt();
                    sc.nextLine();
                    Surat s = new Surat(id, nama, kelas, jenis, durasi);
                    stack.push(s);
                    break;
                case 2:
                    stack.pop();
                    break;
                case 3:
                    stack.peek();
                    break;
                case 4:
                    System.out.print("Masukkan nama mahasiswa: ");
                    String cari = sc.nextLine();
                    stack.cariSurat(cari);
                    break;
                case 5:
                    System.out.println("Program selesai.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid!");
            }
        } while (pilih != 5);
    }
}
