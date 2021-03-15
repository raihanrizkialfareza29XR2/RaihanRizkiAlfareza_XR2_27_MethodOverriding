import java.util.Scanner; // Digunakan agar dapat membuat scanner baru

public class PanelInfo { // Saya tidak menggunakan kata kunci extends karena semua method yang ada pada class ini berbeda
    int pilihaja; // Membuat variabel instance untuk memasukkan nilai pilihan pada program yang akan dipilih user
    public void Info(){ // Saya membuat method void bernama info untuk menampilkan panel info programnya
        System.out.println("");
        System.out.println("|=================================================|");
        System.out.println("|Berikut Pilihan Program Penghitungan Bangun Datar|");
        System.out.println("|-------------------------------------------------|");
        System.out.println("|     1. Mengitung Luas dan Keliling Persegi      |");
        System.out.println("|    2. Mengitung Luas dan Keliling Lingkaran     |");
        System.out.println("| 3. Menghitung Luas dan Keliling Persegi Panjang |");
        System.out.println("|    4. Menghitung Luas dan Keliling Segitiga     |");
        System.out.println("|_________________________________________________|");
    }
    int Pilih(){ // Saya membuat method non-void bernama pilih sebagai tempat user memasukkan pilihan jenis program yang akan dieksekusi
        System.out.println("");
        System.out.print("|Silakan Masukkan Pilihan Anda (Masukkan Nomor Programnya) : ");
        Scanner masuk = new Scanner(System.in); // // Membuat scanner input sebagai tempat user memasukkan input pilihan jenis program yang akan dieksekusi
        pilihaja = masuk.nextInt(); // Memasukkan input pilihan program yang akan dieksekusi
        return pilihaja; // Mengembalikan nilai pilihan
    }
}
