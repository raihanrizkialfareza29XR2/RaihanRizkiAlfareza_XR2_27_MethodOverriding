public class BangunDatar { // Class induk BangunDatar
    void inputan(){ // Membuat method void bernama inputan untuk menampilkan output tulisan di bawah
                    // Method void inputan juga berfungsi sebagai override method untuk inputan data user nantinya
        System.out.println("");
        System.out.println("|----Kali Ini Dengan Scanner----|");
    }
    float luas(){ // Membuat method non-void bernama luas yang akan di override ketika memasukkan fungsi nantinya
        System.out.println("");
        System.out.println("|Menghitung Luas Bangun Datar");
        return 0; // Return 0 karena tidak ada nilai yang harus dikembalikan (disini hanya digunakan untuk menampilkan teks)
    }
    float keliling(){ // Membuat method non-void bernama luas yang akan di override ketika memasukkan fungsi nantinya
        System.out.println("");
        System.out.println("|Menghitung Keliling Bangun Datar");
        return 0; // Return 0 karena tidak ada nilai yang harus dikembalikan (disini hanya digunakan untuk menampilkan teks)
    }
}
