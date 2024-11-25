package com.mycompany.uts;

import java.util.Scanner;

public class UTS {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("NO.Pasien: ");
        String noPasien = input.nextLine();

        System.out.print("Nama: ");
        String nama = input.nextLine();

        System.out.print("Usia: ");
        int usia = input.nextInt();

        System.out.print("Jenis Kelamin: ");
        String jenisKelamin = input.next();

        System.out.print("Tinggi badan: ");
        while (!input.hasNextDouble()) {
            System.out.println("");
            input.next(); // Buang input yang tidak valid
        }
        double tinggiBadan = input.nextDouble();

        System.out.print("Berat badan: ");
        while (!input.hasNextDouble()) {
            System.out.println("Masukkan angka untuk berat badan.");
            input.next(); // Buang input yang tidak valid
        }
        double beratBadan = input.nextDouble();

        System.out.println("\n--- Data Pasien ---");
        System.out.println("NO.Pasien: " + noPasien);
        System.out.println("Nama: " + nama);
        System.out.println("Usia: " + usia);
        System.out.println("Jenis Kelamin: " + jenisKelamin);
        System.out.println("Tinggi badan: " + tinggiBadan);
        System.out.println("Berat badan: " + beratBadan);

        input.close();
    }
}
