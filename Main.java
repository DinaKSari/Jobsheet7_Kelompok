import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner sc1127 = new Scanner(System.in);
        int pilih;

        Mahasiswa[] dataMhs = {
            new Mahasiswa("Rizky", "wdwd", "dwdw"),
            new Mahasiswa("Rizky", "wdwd", "dwdw"),
            new Mahasiswa("Rizky", "wdwd", "dwdw")
        };
//
        //Mahasiswa mhs1 = new Mahasiswa("22001", "Ali Rahman", "Teknik Informatika");
        //Mahasiswa mhs2 = new Mahasiswa("22002", "Budi Santoso", "Teknik Informatika");
        //Mahasiswa mhs3 = new Mahasiswa("22003", "Citra dewi", "Teknik Informatika");

        do {
            System.out.println("== MENU SISTEM AKADEMIK ==");
            System.out.println("1. Tampilkan Daftar Mahasiswa");
            System.out.println("2. Tampilkan Daftar Mata Kuliah");
            System.out.println("3. Tampilkan Data Penilaian");
            System.out.println("4. Urutkan Mahasiswa Berdasarkan Nilai Akhir");
            System.out.println("5. Cari Mahasiswa Berdasarkan NIM");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            pilih = sc1127.nextInt();

            System.out.println();

            switch (pilih) {
                case 1:
                    System
                    break;
                case 2:
                    tampilMataKuliah();
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 0:
                    System.out.println("Terima kasih telah menggunakan sistem akademik kami.");
                    break;
                default:
                    System.out.println("Input salah, masukkan ulang!");
                    break;
            }

        } while (pilih != 0);
    }
}