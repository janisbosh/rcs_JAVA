package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Tools {
    public static List<Pet> izveidotPetListu() {
        List<Pet> petList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Cik dzīvniekus pievienot : ");
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.print("Ievadiet vārdu: ");
            String vards = scanner.next();
            System.out.print("Ievadiet tipu: ");
            String tips = scanner.next();
            System.out.print("Ievadiet vecumu: ");
            int vecums = scanner.next();
            System.out.print("Ievadiet e-pastu: ");
            String saimniekaEpasts = scanner.next();

            Pet pet = new Pet(vards, tips, vecums, saimniekaEpasts);
            petList.add(pet);
        }

        return petList;
    }

    public static void pievienotPet(List<Pet> petList) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ievadiet  vārdu: ");
        String vards = scanner.next();
        System.out.print("Ievadiet  tipu: ");
        String tips = scanner.next();
        System.out.print("Ievadiet  vecumu: ");
        String vecums = scanner.next();
        System.out.print("Ievadiet  e-pastu: ");
        String saimniekaEpasts = scanner.next();

        Pet pet = new Pet(vards, tips, vecums, saimniekaEpasts);
        petList.add(pet);
    }
}