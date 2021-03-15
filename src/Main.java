import java.util.Scanner; // Digunakan agar dapat membuat scanner baru

public class Main { // Class main sebagai tempat program dijalankan
    public static void main(String[] args) { // Membuat method main
        boolean running = true; // Menggunakan boolean untuk perulangan while
        PanelInfo panelInfo = new PanelInfo(); // Membuat objek baru
        BangunDatar bangundatar = new BangunDatar();
        Persegi persegi = new Persegi();
        Lingkaran lingkaran = new Lingkaran();
        PersegiPanjang persegipanjang = new PersegiPanjang();
        Segitiga segitiga = new Segitiga();

        while(running){ // Melakukan perulangan while
            panelInfo.Info(); // Memanggil dan menampilkan method Info
            panelInfo.Pilih(); // Memanggil dan menampilkan method Pilih

            if (panelInfo.pilihaja == 1){ // Jika pilihan user = 1, maka program yang dijalankan adalah menhitung luas dan keliling persegi
                bangundatar.inputan();
                bangundatar.luas();
                bangundatar.keliling();
                persegi.inputan();
                persegi.luas();
                persegi.keliling();
            } else if (panelInfo.pilihaja == 2){ // Jika pilihan user = 2, maka program yang dijalankan adalah menhitung luas dan keliling lingkaran
                lingkaran.inputan();
                lingkaran.luas();
                lingkaran.keliling();
            } else if (panelInfo.pilihaja == 3){ // Jika pilihan user = 3, maka program yang dijalankan adalah menhitung luas dan keliling persegi panjang
                persegipanjang.inputan();
                persegipanjang.luas();
                persegipanjang.keliling();
            } else if (panelInfo.pilihaja == 4){ // Jika pilihan user = 4, maka program yang dijalankan adalah menhitung luas dan keliling segitiga
                segitiga.inputan();
                segitiga.luas();
                segitiga.keliling();
            }
            System.out.println("");
            System.out.print("|Apakah Anda Ingin Mengulang? (Y/T) : ");
            Scanner ulang = new Scanner(System.in); // Membuat scanner ulang sebagai tempat user memasukkan pilihan
            String ulangi = ulang.nextLine(); // User memasukkan pilihan

            if (ulangi.equalsIgnoreCase("T")){ // Jika user memasukkan "Y", maka program akan mengulang dari awal. "T" untuk keluar
                running = false;
            }
        }
    }
}
