import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc1127 = new Scanner(System.in);
        int pilih;
        DataMahasiswa daftarMhs = new DataMahasiswa();

        // Tambah data awal
        Mahasiswa mhs1 = new Mahasiswa("22001", "Ali Rahman", "Teknik Informatika");
        Mahasiswa mhs2 = new Mahasiswa("22002", "Budi Santoso", "Teknik Informatika");
        Mahasiswa mhs3 = new Mahasiswa("22003", "Citra Dewi", "Teknik Informatika");
        daftarMhs.tambah(mhs1);
        daftarMhs.tambah(mhs2);
        daftarMhs.tambah(mhs3);

        do {
            System.out.println("\n== MENU SISTEM AKADEMIK ==");
            System.out.println("1. Tampilkan Daftar Mahasiswa");
            System.out.println("2. Tampilkan Daftar Mata Kuliah");
            System.out.println("3. Tampilkan Data Penilaian");
            System.out.println("4. Urutkan Mahasiswa Berdasarkan Nilai Akhir");
            System.out.println("5. Cari Mahasiswa Berdasarkan NIM");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            pilih = sc1127.nextInt();
            sc1127.nextLine(); // Buang newline

            System.out.println();

            switch (pilih) {
                case 1:
<<<<<<< HEAD
                    daftarMhs.tampilMhs();
=======
                    
>>>>>>> 41897e114be1fa220a683daa1f42ad2080ed8960
                    break;
                case 2:
                    System.out.println("Fitur belum tersedia.");
                    break;
                case 3:
                    System.out.println("Fitur belum tersedia.");
                    break;
                case 4:
                    System.out.println("Fitur belum tersedia.");
                    break;
                case 5:
                    System.out.print("Masukkan NIM yang dicari: ");
                    String cariNim = sc1127.nextLine();
                    Mahasiswa hasil = daftarMhs.cariByNim(cariNim);
                    if (hasil != null) {
                        hasil.tampilMahasiswa();
                    } else {
                        System.out.println("Mahasiswa dengan NIM tersebut tidak ditemukan.");
                    }
                    break;
                case 0:
                    System.out.println("Terima kasih telah menggunakan sistem akademik kami.");
                    break;
                default:
                    System.out.println("Input salah, masukkan ulang!");
                    break;
            }

        } while (pilih != 0);

        sc1127.close();
    }
}
