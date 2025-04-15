import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc1127 = new Scanner(System.in);
        int pilih;
        DataMahasiswa daftarMhs = new DataMahasiswa();

        // Tambah data awal mahasiswa
        Mahasiswa mhs1 = new Mahasiswa("22001", "Ali Rahman", "Teknik Informatika");
        Mahasiswa mhs2 = new Mahasiswa("22002", "Budi Santoso", "Teknik Informatika");
        Mahasiswa mhs3 = new Mahasiswa("22003", "Citra Dewi", "Teknik Informatika");
        
        daftarMhs.tambah(mhs1);
        daftarMhs.tambah(mhs2);
        daftarMhs.tambah(mhs3);

        //tambah data aawal matakuliah
        DataMataKuliah daftarMK = new DataMataKuliah();
        daftarMK.tambah(new MataKuliah("MK001", "Struktur Data", 3));
        daftarMK.tambah(new MataKuliah("MK002", "Basis Data", 3));
        daftarMK.tambah(new MataKuliah("MK003", "Desain Web", 3));

        //tambah data awal nilai
        DataPenilaian daftarNilai = new DataPenilaian();
        daftarNilai.tambah(new Penilaian(mhs3, daftarMK.daftarMK[1], 90, 91, 92)); 
        daftarNilai.tambah(new Penilaian(mhs1, daftarMK.daftarMK[0], 80, 85, 90)); 
        daftarNilai.tambah(new Penilaian(mhs3, daftarMK.daftarMK[2], 70, 75, 80)); 
        daftarNilai.tambah(new Penilaian(mhs2, daftarMK.daftarMK[0], 70, 75, 80)); 
        daftarNilai.tambah(new Penilaian(mhs1, daftarMK.daftarMK[1], 60, 65, 70)); 


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
            sc1127.nextLine();

            System.out.println();

            switch (pilih) {
                case 1:
                    daftarMhs.tampilMhs();
                    break;
                case 2:
                    daftarMK.tampilMK();
                    break;
                case 3:
                    daftarNilai.tampilSemua();
                    break;
                case 4:
                    daftarNilai.urutkanBerdasarkanNilaiAkhir();
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
