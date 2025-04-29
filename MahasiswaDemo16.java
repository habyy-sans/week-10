import java.util.Scanner;

public class MahasiswaDemo16 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        StackTugasMahasiswa16 stack = new StackTugasMahasiswa16(5);
        int pilih;
    do {
        System.out.println("\nMENU:");
        System.out.println("1. mengumpulkan tugas");
        System.out.println("2. menilai tugas");
        System.out.println("3. melihat tugas teratas");
        System.out.println("4. melihat daftar tugas");
        System.out.println("5. melihat tugas pertama dikumpulkan");
        System.out.println("6. melihat jumlah tugas yang dikumpulkan");
        System.out.print("Pilih: ");
        pilih = scan.nextInt();
        scan.nextLine();

        switch (pilih) {
            case 1:
                System.out.print("Nim: ");
                String nim = scan.nextLine();
                System.out.print("Nama: ");
                String nama = scan.nextLine();
                System.out.print("Kelas: ");
                String kelas = scan.nextLine();
                Mahasiswa16 mhs = new Mahasiswa16(nim, nama, kelas);
                stack.push(mhs);
                System.out.printf("Tugas %s berhasil dikumpulkan\n", mhs.Nama);
                break;
            case 2:
                Mahasiswa16 dinilai = stack.pop();
                if (dinilai != null) {
                    System.out.print("Masukkan nilai tugas dari  " +dinilai.Nama);
                    System.out.println();
                    System.out.printf("Masukan nilai (0-100): " ); //dinilai.Nama);
                    int nilai = scan.nextInt();
                    dinilai.tugasDinilai(nilai);
                    System.out.printf("Nilai tugas %s adalah %d\n",dinilai.Nama, nilai);
                    String biner = stack.konversiDesimalKeBiner(nilai);
                    System.out.println("Nilai dalam biner: " + biner);
                }
                break;
            case 3:
                Mahasiswa16 lihat = stack.peek();
                if (lihat!= null){
                    System.out.println("Tugas terakhir di kumpulkan oleh "+ lihat.Nama);
                    //lihat.tampil();
                }
                break;
            case 4:
                System.out.println("Daftar semua tugas ");
                System.out.println("Nama\tNim\tKelas ");
                stack.print();
                break;
            case 5:
                Mahasiswa16 pertama = stack.lihatTugasPertama();
                if (pertama != null) {
                    System.out.println("Tugas pertama dikumpulkan oleh " + pertama.Nama);
                }
                break;
            case 6:
                System.out.println("Jumlah tugas yang sudah dikumpulkan: " + stack.jumlahTugas());
                break;

            default:
                System.out.println("pilihan tidak valid!");
            }
        } while (pilih >= 1 && pilih <= 4);
    }
}