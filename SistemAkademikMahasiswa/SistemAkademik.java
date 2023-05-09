import java.util.ArrayList;
import java.util.Scanner;
public class SistemAkademik{

    public static void main(String[] args) {
        DriverSistemAkademik dsa = new DriverSistemAkademik();
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.println("=== Sistem Akademik ===");
            System.out.println("1. Tambah Mahasiswa");
            System.out.println("2. Cari Mahasiswa");
            System.out.println("3. Keluar");
            System.out.print("Pilih opsi: ");
            int opsi = input.nextInt();

            if (opsi == 1) {
                dsa.tambahMahasiswa();
            } else if (opsi == 2) {
                dsa.cariMahasiswa();
            } else if (opsi == 3) {
                break;
            } else {
                System.out.println("Opsi tidak valid.");
            }
            System.out.println();
        }
    }
}


   

