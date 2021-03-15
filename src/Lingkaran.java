import java.util.Scanner; // Digunakan agar dapat membuat scanner baru

public class Lingkaran extends BangunDatar { // Menggunakan kata kunci extends pada class BangunDatar agar menjadi
                                             // class anak dari class induk (BangunDatar)
    float r; // Membuat variabel instance untuk memasukkan nilai jari jari dari lingkaran

    void inputan(){ // Menggunakan method void inputan yang telah dibuat tadi dengan menggunakan metode method overriding
                    // Sebagai tempat user memasukkan input data
        System.out.println("");
        System.out.println("|--Menghitung Luas dan Keliling Lingkaran--|");
        Scanner input = new Scanner(System.in); // Membuat scanner input sebagai tempat user memasukkan data dari sisi lingkaran
        System.out.print("|Silakan Masukkan Nilai Jari Jarinya : ");
        r = input.nextFloat(); // Memasukkan input nilai jari jari lingkaran
    }
    float luas(){ // Menggunakan method non-void luas yang telah dibuat tadi dengan menggunakan metode method overriding
        System.out.println("");
        float luas = (float) (Math.PI*Math.pow(r,2)); // Membuat rumus penghitungan luas
        System.out.println("|Luas Lingkaran     : (3,14 x r x r) = (3,14 x " + r + " x " + r + ") = " + luas);
        return luas; // Mengembalikan nilai luas
    }
    float keliling(){ // Menggunakan method non-void keliling yang telah dibuat tadi dengan menggunakan metode method overriding
        System.out.println("");
        float keliling = (float) (2*Math.PI*r); // Membuat rumus penghitungan keliling
        System.out.println("|Keliling Lingkaran : (2 x 3,14 x r) = (2 x 3,14 x " + r + ") = " + keliling);
        return keliling; // Mengembalikan nilai keliling
    }
}
