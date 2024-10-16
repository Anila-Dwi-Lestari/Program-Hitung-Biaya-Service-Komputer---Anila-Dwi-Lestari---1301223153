/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tugasindividu_1301223153_anila;
import java.util.Scanner;

/**
 *
 * @author Anila Dwi Lestari
 */

public class TugasIndividu_1301223153_Anila {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input data pengguna
        System.out.println("========================================================================");
        System.out.println("================== Program Hitung Biaya Service Komputer ===============");
        System.out.println("========================================================================");
        System.out.print("Masukkan Jumlah Unit Komputer Yang Akan Diservis              : ");
        int jumlahKomputer = input.nextInt();

        System.out.print("Masukkan Jumlah Perangkat Tambahan (Peripheral)               : ");
        int jumlahPerangkatTambahan = input.nextInt();

        System.out.print("Apakah Servis Dilakukan Diluar Jam Operasional? (Ya/Tidak)    : ");
        boolean luarJamOperasional = input.next().equalsIgnoreCase("ya");

        System.out.print("Apakah Pelanggan Bersedia Antar Jemput Sendiri? (Ya/Tidak)    : ");
        boolean antarJemputSendiri = input.next().equalsIgnoreCase("ya");
        System.out.println("========================================================================");

        // Variabel untuk biaya dasar dan biaya tambahan
        int biayaDasar = 0;
        int biayaTambahan = 0;

        // Penghitungan biaya berdasarkan jumlah komputer
        if (jumlahKomputer == 1 || jumlahKomputer == 2) {
            biayaDasar = 50;
        } else if (jumlahKomputer >= 3 && jumlahKomputer <= 10) {
            biayaDasar = 100;
            biayaTambahan = 10 * jumlahPerangkatTambahan;
        } else if (jumlahKomputer > 10) {
            biayaDasar = 500;
            biayaTambahan = 10 * jumlahPerangkatTambahan;
        }

        // Jika servis dilakukan di luar jam operasional, biaya dasar dikalikan dua
        if (luarJamOperasional) {
            biayaDasar *= 2;
        }

        // Menghitung total biaya dasar
        int totalBiaya = biayaDasar + biayaTambahan;

        // Jika pelanggan antar jemput sendiri, total biaya dasar dibagi dua
        if (antarJemputSendiri) {
            totalBiaya /= 2;
        }

        // Menampilkan hasil dengan format yang lebih rapi
        System.out.println("========================================================================");
        System.out.println("===================== Rincian Biaya Servis Komputer ====================");
        System.out.println("========================================================================");
        System.out.printf("Jumlah Komputer                  : %d%n", jumlahKomputer);
        System.out.printf("Jumlah Perangkat Tambahan        : %d%n", jumlahPerangkatTambahan);
        System.out.printf("Servis Diluar Jam Operasional    : %s%n", luarJamOperasional ? "Ya" : "Tidak");
        System.out.printf("Antar Jemput Sendiri             : %s%n", antarJemputSendiri ? "Ya" : "Tidak");
        System.out.printf("Biaya Dasar                      : $%d%n", biayaDasar);
        System.out.printf("Biaya Tambahan                   : $%d%n", biayaTambahan);
        System.out.printf("Total Biaya Servis               : $%d%n", totalBiaya);

        input.close();
    }
}