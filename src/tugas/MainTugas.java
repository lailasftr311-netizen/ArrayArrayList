
//NAMA  : LAILA SAFITRI
//MPM   : 2410010229
//KELAS : 4N REGULER BANJARMASIN
package tugas;

public class MainTugas {

    public static void main(String[] args) {

        KelasKuliah kelas = new KelasKuliah();

        kelas.tambahMahasiswa(
                new Mahasiswa("Andi", "241001", 85));

        kelas.tambahMahasiswa(
                new Mahasiswa("Budi", "241002", 70));

        kelas.tambahMahasiswa(
                new Mahasiswa("Rifky", "241003", 55));

        kelas.tambahMahasiswa(
                new Mahasiswa("Arrayan", "241004", 90));

        kelas.tambahMahasiswa(
                new Mahasiswa("Bunga", "241005", 60));

        // Nomor 4
        String[] mataKuliah = {
            "Pemrograman Berorientasi Objek",
            "Struktur Data",
            "Basis Data"
        };

        System.out.println("=== Daftar Mata Kuliah ===");
        for (String mk : mataKuliah) {
            System.out.println(mk);
        }

        System.out.println();

        kelas.tampilkanSemua();

        // Nomor 5
        System.out.println();
        System.out.println("Rata-rata nilai : "
                + kelas.hitungRataRata());

        System.out.println("Jumlah lulus : "
                + kelas.jumlahLulus());

        // Nomor 6
        kelas.tambahMahasiswa(
                new Mahasiswa("Fajar", "241006", 80));

        System.out.println();
        System.out.println("Jumlah mahasiswa terbaru : "
                + kelas.jumlahMahasiswa());
    }
}

