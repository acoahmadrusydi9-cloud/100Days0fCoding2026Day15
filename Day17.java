import java.util.Scanner;

public class Day17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Mengambil input nilai awal dari pengguna
        System.out.print("Masukkan nilai awal (angka bulat): ");
        int angka = scanner.nextInt();

        System.out.println("\n--- MENGUJI OPERATOR PENUGASAN ---");
        System.out.println("Nilai awal = " + angka);

        // Operator +=
        System.out.print("Masukkan angka untuk ditambahkan (+=): ");
        int tambah = scanner.nextInt();
        angka += tambah; // angka = angka + tambah
        System.out.println("Hasil angka += " + tambah + " adalah: " + angka + "\n");

        // Operator -=
        System.out.print("Masukkan angka untuk dikurangi (-=): ");
        int kurang = scanner.nextInt();
        angka -= kurang; // angka = angka - kurang
        System.out.println("Hasil angka -= " + kurang + " adalah: " + angka + "\n");

        // Operator *=
        System.out.print("Masukkan angka untuk dikalikan (*=): ");
        int kali = scanner.nextInt();
        angka *= kali; // angka = angka * kali
        System.out.println("Hasil angka *= " + kali + " adalah: " + angka + "\n");

        // Operator /=
        System.out.print("Masukkan angka pembagi (/=): ");
        int bagi = scanner.nextInt();
        if (bagi != 0) {
            angka /= bagi; // angka = angka / bagi
            System.out.println("Hasil angka /= " + bagi + " adalah: " + angka + "\n");
        } else {
            System.out.println("Pembagian dengan 0 tidak diperbolehkan!\n");
        }

        // Operator %=
        System.out.print("Masukkan angka untuk sisa bagi (%=): ");
        int mod = scanner.nextInt();
        if (mod != 0) {
            angka %= mod; // angka = angka % mod
            System.out.println("Hasil angka %= " + mod + " adalah: " + angka + "\n");
        } else {
            System.out.println("Modulus dengan 0 tidak diperbolehkan!\n");
        }

        System.out.println("Nilai akhir angka = " + angka);

        // Menutup scanner
        scanner.close();
    }
}
