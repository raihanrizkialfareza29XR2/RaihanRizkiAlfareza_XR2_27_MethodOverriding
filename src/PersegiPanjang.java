import java.util.Scanner; // Digunakan agar dapat membuat scanner baru

public class PersegiPanjang extends BangunDatar{ // Menggunakan kata kunci extends pada class BangunDatar agar menjadi
                                                 // class anak dari class induk (BangunDatar)
    float panjang; // Membuat variabel instance untuk memasukkan nilai panjang dari persegi panjang
    float lebar; // Membuat variabel instance untuk memasukkan nilai lebar dari persegi panjang
    void inputan(){ // Menggunakan method void inputan yang telah dibuat tadi dengan menggunakan metode method overriding
                    // Sebagai tempat user memasukkan input data
        System.out.println("");
        System.out.println("|--Menghitung Luas dan Keliling Persegi Panjang--|");
        Scanner input = new Scanner(System.in); // Membuat scanner input sebagai tempat user memasukkan data dari panjang dan lebar persegi panjang
        System.out.print("|Silakan Masukkan Nilai Panjangnya : ");
        panjang = input.nextFloat(); // Memasukkan input nilai panjang persegi panjang
        System.out.print("|Silakan Masukkan Nilai Lebarnya   : ");
        lebar = input.nextFloat(); // Memasukkan input nilai lebar persegi panjang
    }
    float luas(){ // Menggunakan method non-void luas yang telah dibuat tadi dengan menggunakan metode method overriding
        System.out.println("");
        float luas = panjang*lebar; // Membuat rumus penghitungan luas
        System.out.println("|Luas Persegi Panjang : (panjang x lebar) = (" + panjang + " x " + lebar + ") = " + luas);
        return luas; // Mengembalikan nilai luas
    }
    float keliling(){ // Menggunakan method non-void keliling yang telah dibuat tadi dengan menggunakan metode method overriding
        System.out.println("");
        float keliling = (2*panjang)+(2*lebar); // Membuat rumus penghitungan keliling
        System.out.println("|Keliling Persegi Panjang : (2 x panjang) + (2 x lebar) = (2 x " + panjang + ") + (2 x " + lebar + ") = " + keliling);
        return keliling; // Mengembalikan nilai keliling
    }
}
