/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package cz.itnetwork.kalkulacka_s_papouskem;

import java.util.Scanner;

public class Kalkulacka_s_mluvicim_papouskem {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in, "Windows-1250");
        String pokracovat = "ano";

        while (pokracovat.equals("ano")) {
            System.out.println("Ahoj, jsem uzvaneny kakadu Lora a rad pocitam a opakuji! ");
            System.out.println();
            System.out.print("Zadej prvni cislo: ");
            double a = Double.parseDouble(scanner.nextLine());
            System.out.println();
            System.out.print("Zadej druhe cislo: ");
            double b = Double.parseDouble(scanner.nextLine());
            System.out.println();
            System.out.println("Zvol operaci: ");
            System.out.println();

            System.out.println("Soucet - 1");
            System.out.println("Rozdil - 2");
            System.out.println("Podil - 3");
            System.out.println("Soucin - 4");
            System.out.println();
            System.out.print("Zvolena operace: ");
            int volba = Integer.parseInt(scanner.nextLine());
            System.out.println();
            double vysledek = 0;

            switch (volba) {
                case 1:
                    vysledek = a + b;
                    break;
                case 2:
                    vysledek = a - b;
                    break;
                case 3:
                    // Kontrola dělení nulou
                    if (b == 0) {
                        System.out.println("Nelze dělit nulou. Zadej platný druhý operand.");
                        continue; // Opakování smyčky, aby uživatel mohl zadat platný vstup
                    }
                    vysledek = a / b;
                    break;
                case 4:
                    vysledek = a * b;
                    break;
            }

            if ((volba > 0) && (volba < 5)) {
                System.out.println();
                System.out.println("Vysledek: " + String.format("%.2f", vysledek));
                System.out.println();
                String operace = "";
                switch (volba) {
                    case 1:
                        operace = "součet";
                        break;
                    case 2:
                        operace = "rozdíl";
                        break;
                    case 3:
                        operace = "podíl";
                        break;
                    case 4:
                        operace = "součin";
                        break;
                }
                System.out.println("Výsledek " + operace + " čísel " + prevodCislaNaSlovo(a) + " a " + prevodCislaNaSlovo(b) + " je " + (String.format("%.2f", vysledek)) + ".");
                System.out.println();
            } else {
                System.out.println("Neplatna volba, mantaku! Neumis pocitat do ctyr? ");
                System.out.println();
            }

            if (vysledek <1) {
                System.out.println("Zadny povidani nebude, protoze výsledek je zaporny nebo mensi nez 1.");
            } else if (vysledek > 50) {
                System.out.println("Zadny povidani nebude, protoze výsledek není kladné číslo menší nez 50.");
            } else {
                System.out.println("Tak, a ted napis vetu nebo aspon slovo!");
                System.out.println();
                System.out.print("Pis sem: ");

                String vstup = scanner.nextLine();
                System.out.println();

                // Zaokrouhlování nahoru
                int zaokrouhlenyVysledek = (int) Math.round(vysledek);
                for (int i = 0; i < zaokrouhlenyVysledek && i < 50; i++) {
                    System.out.println(vstup + ", ");
                }
            }

            System.out.println();
            System.out.println("Chces zadat další příklad? [ano/ne]");
            System.out.println();
            pokracovat = scanner.nextLine();
            System.out.println();
        }
        System.out.println("adios, amigo");
    }

    private static String prevodCislaNaSlovo(double cislo) {
        String[] slova = {"nula", "jedna", "dva", "tři", "čtyři", "pět", "šest", "sedm", "osm", "devět", "deset"};

        if (cislo % 1 == 0 && cislo >= 0 && cislo <= 10) {
            return slova[(int) cislo];
        }

        return String.valueOf(cislo);
    }
    private static String zaokrouhliVysledek(double vysledek) {
        // Zaokrouhlení nahoru
        double zaokrouhlenyVysledek = (double) Math.round(vysledek);
        return String.valueOf(zaokrouhlenyVysledek);

    }
}

   
