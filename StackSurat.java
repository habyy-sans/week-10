public class StackSurat {
    int size;
    int top;
    Surat[] data;
    public StackSurat(int size) {
        this.size = size;
        data = new Surat[size];
        top = -1;
    }
    boolean isFull() {
        return top == size - 1;
    }
    boolean isEmpty() {
        return top == -1;
    }
    void push(Surat s) {
        if (!isFull()) {
            data[++top] = s;
            System.out.println("Surat berhasil diterima.");
        } else {
            System.out.println("Stack penuh! Tidak bisa menerima surat baru.");
        }
    }
    void pop() {
        if (!isEmpty()) {
            Surat s = data[top--];
            System.out.println("Surat berikut diproses:");
            s.tampilSurat();
        } else {
            System.out.println("Tidak ada surat yang perlu diproses.");
        }
    }
    void peek() {
        if (!isEmpty()) {
            System.out.println("Surat izin terakhir:");
            data[top].tampilSurat();
        } else {
            System.out.println("Stack kosong.");
        }
    }
    void cariSurat(String nama) {
        boolean ditemukan = false;
        for (int i = top; i >= 0; i--) {
            if (data[i].namaMahasiswa.equalsIgnoreCase(nama)) {
                System.out.println("Surat ditemukan:");
                data[i].tampilSurat();
                ditemukan = true;
            }
        }
        if (!ditemukan) {
            System.out.println("Surat atas nama " + nama + " tidak ditemukan.");
        }
    }
}
