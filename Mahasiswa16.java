public class Mahasiswa16 {
    String Nim;
    String Nama;
    String Kelas;
    int nilai;



    public Mahasiswa16 (String Nim, String Nama, String Kelas ){
        this.Nim = Nim;
        this.Nama = Nama;
        this.Kelas = Kelas;
        nilai = -1;
    }

    void tugasDinilai(int nilai){
        this.nilai = nilai;
    }
   
    public void tampil() {
        System.out.println(Nim + " | " + Nama + " | " + Kelas + " | Nilai: " + (nilai == -1 ? "Belum Dinilai" : nilai));
}

}