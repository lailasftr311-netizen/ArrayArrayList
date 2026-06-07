
package arraylist;

import java.util.ArrayList;

public class LatihanMandiriArraylist {
    public static void main(String[] args) {
        System.out.println("=== SOAL 1: DAFTAR BELANJA ===");
        soalSatuDaftarBelanja();
        
        System.out.println("\n=== SOAL 2: MENCARI NILAI TERBESAR ===");
        soalDuaNilaiTerbesar();
        
        System.out.println("\n=== SOAL 3: FILTER NAMA HURUF 'A' ===");
        soalTigaFilterNama();
    }

    // 1. Method untuk Soal Daftar Belanja
    public static void soalSatuDaftarBelanja() {
        ArrayList<String> daftarBelanja = new ArrayList<>();

        // Menambah 4 item
        daftarBelanja.add("Minyak Goreng");
        daftarBelanja.add("Beras"); // Ini item ke-2 (Indeks 1)
        daftarBelanja.add("Telur");
        daftarBelanja.add("Gula");
        daftarBelanja.add("Kopi");

        // Hapus item ke-2 (Indeks 1)
        daftarBelanja.remove(1); 

        // Tampilkan isi list
        System.out.println("Isi daftar belanja saat ini:");
        for (String item : daftarBelanja) {
            System.out.println("- " + item);
        }

        // Tampilkan jumlah akhir
        System.out.println("Jumlah akhir item: " + daftarBelanja.size());
    }

    // 2. Method untuk Soal Mencari Nilai Terbesar
    public static void soalDuaNilaiTerbesar() {
        ArrayList<Integer> angka = new ArrayList<>();

        // Mengisi 5 angka
        angka.add(23);
        angka.add(87);
        angka.add(45);
        angka.add(92);
        angka.add(12);

        // Menelusuri seluruh elemen
        int terbesar = angka.get(0); 
        for (int i = 1; i < angka.size(); i++) {
            if (angka.get(i) > terbesar) {
                terbesar = angka.get(i); 
            }
        }

        // Tampilkan hasil
        System.out.println("Semua angka dalam list: " + angka);
        System.out.println("Nilai terbesar adalah: " + terbesar);
    }

    // 3. Method untuk Soal Filter Nama
    public static void soalTigaFilterNama() {
        ArrayList<String> daftarNama = new ArrayList<>();

        // Menambah 6 nama
        daftarNama.add("Ahmad");
        daftarNama.add("Budi");
        daftarNama.add("Anisa");
        daftarNama.add("Citra");
        daftarNama.add("Andi");
        daftarNama.add("Dewi");

        // Cetak hanya nama yang diawali huruf A
        System.out.println("Nama yang diawali dengan huruf 'A':");
        for (String nama : daftarNama) {
            if (nama.startsWith("A")) { 
                System.out.println("- " + nama);
            }
        }
    }
}

