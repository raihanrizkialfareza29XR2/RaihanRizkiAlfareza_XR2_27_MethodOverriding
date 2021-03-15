import java.util.Scanner; // Digunakan agar dapat membuat scanner baru

public class Segitiga extends BangunDatar { // Menggunakan kata kunci extends pada class BangunDatar agar menjadi
                                            // class anak dari class induk (BangunDatar)
    float alas; // Membuat variabel instance untuk memasukkan nilai alas dari segitiga
    float tinggi; // Membuat variabel instance untuk memasukkan nilai tinggi dari segitiga
    void inputan() { // Menggunakan method void inputan yang telah dibuat tadi dengan menggunakan metode method overriding
                     // Sebagai tempat user memasukkan input data
        System.out.println("");
        System.out.println("|--Menghitung Luas dan Keliling Segitiga--|");
        Scanner input = new Scanner(System.in); // Membuat scanner input sebagai tempat user memasukkan data dari alas dan tinggi segitiga lingkaran
        System.out.print("|Silakan Masukkan Nilai Alasnya   : ");
        alas = input.nextFloat(); // Memasukkan input nilai alas segitiga
        System.out.print("|Silakan Masukkan Nilai Tingginya : ");
        tinggi = input.nextFloat(); // Memasukkan input nilai tinggi segitiga
    }
    float luas(){ // Menggunakan method non-void luas yang telah dibuat tadi dengan menggunakan metode method overriding
        System.out.println("");
        float luas = (alas*tinggi)/2; // Membuat rumus penghitungan luas
        System.out.println("|Luas Segitiga     : (alas x tinggi) : 2 = (" + alas + " x " + tinggi + ") : 2 = " + luas);
        return luas; // Mengembalikan nilai luas
    }
    float keliling(){ // Menggunakan method non-void keliling yang telah dibuat tadi dengan menggunakan metode method overriding
        System.out.println("");
        float keliling = alas*3; // Membuat rumus penghitungan keliling
        System.out.println("|Keliling Segitiga : (3 x sisi) = (3 x " + alas +") = " + keliling);
        return keliling; // Mengembalikan nilai keliling
    }
}
