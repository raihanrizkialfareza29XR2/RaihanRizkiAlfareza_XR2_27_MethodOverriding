import java.util.Scanner; // Digunakan agar dapat membuat scanner baru

public class Persegi extends BangunDatar { // Menggunakan kata kunci extends pada class BangunDatar agar menjadi
                                           // class anak dari class induk (BangunDatar)
    float sisi; // Membuat variabel instance untuk memasukkan nilai sisi dari persegi

    void inputan(){ // Menggunakan method void inputan yang telah dibuat tadi dengan menggunakan metode method overriding
                    // Sebagai tempat user memasukkan input data
        System.out.println("");
        System.out.println("|--Menghitung Luas dan Keliling Persegi--|");
        Scanner input = new Scanner(System.in); // Membuat scanner input sebagai tempat user memasukkan data dari sisi persegi
        System.out.print("|Silakan Masukkan Nilai Sisinya : ");
        sisi = input.nextFloat(); // Memasukkan input nilai sisi persegi
    }
    float luas(){ // Menggunakan method non-void luas yang telah dibuat tadi dengan menggunakan metode method overriding
        System.out.println("");
        float luas = sisi*sisi; // Membuat rumus penghitungan luas
        System.out.println("|Luas Persegi     : (sisi x sisi) = (" + sisi + " x " + sisi + ") = " + luas);
        return luas; // Mengembalikan nilai luas
    }
    float keliling(){ // Menggunakan method non-void keliling yang telah dibuat tadi dengan menggunakan metode method overriding
        System.out.println("");
        float keliling = 4*sisi; // Membuat rumus penghitungan keliling
        System.out.println("|Keliling Persegi : (4 x sisi) = (4 x " + sisi + ") = " + keliling);
        return keliling; // Mengembalikan nilai keliling
    }
}
