
package array;

public class LatihanMandiri1 {

    public static void main(String[] args) {
        
        // ==========================================
        // Soal 1: Array Suhu Harian (double)
        // ==========================================
        System.out.println("=== Jawaban Soal 1 ===");
        double[] suhuHarian = {32.5, 30.0, 34.2, 29.5, 31.8, 33.1};
        
        // Inisialisasi nilai tertinggi dan terendah dengan elemen pertama array
        double suhuTertinggi = suhuHarian[0];
        double suhuTerendah = suhuHarian[0];
        
        for (double suhu : suhuHarian) {
            if (suhu > suhuTertinggi) {
                suhuTertinggi = suhu;
            }
            if (suhu < suhuTerendah) {
                suhuTerendah = suhu;
            }
        }
        System.out.println("Suhu tertinggi: " + suhuTertinggi);
        System.out.println("Suhu terendah : " + suhuTerendah);
        System.out.println();


        // ==========================================
        // Soal 2: Array Nama Hari (String > 5 Huruf)
        // ==========================================
        System.out.println("=== Jawaban Soal 2 ===");
        String[] namaHari = {"Senin", "Selasa", "Rabu", "Kamis", "Jumat"};
        
        System.out.println("Hari dengan lebih dari 5 huruf:");
        for (String hari : namaHari) {
            // Menggunakan .length() untuk menghitung jumlah huruf String
            if (hari.length() > 5) {
                System.out.println("- " + hari);
            }
        }
        System.out.println();


        // ==========================================
        // Soal 3: Hitung Banyak Angka Genap
        // ==========================================
        System.out.println("=== Jawaban Soal 3 ===");
        int[] angka = {4, 8, 15, 16, 23, 42};
        int jumlahGenap = 0;
        
        for (int n : angka) {
            // Menggunakan operator modulus (%) untuk cek bilangan genap
            if (n % 2 == 0) {
                jumlahGenap++;
            }
        }
        System.out.println("Banyak angka genap di dalamnya: " + jumlahGenap);
    }
}

