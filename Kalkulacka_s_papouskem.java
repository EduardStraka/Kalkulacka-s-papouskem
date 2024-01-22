/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package cz.itnetwork.kalkulacka_s_papouskem;
import java.util.Scanner;
/**
 *
 * @author estra
 */
public class Kalkulacka_s_papouskem {

    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in,"Windows-1250");
         String pokracovat = "ano";

        while (pokracovat.equals("ano")) {
            System.out.println("Ahoj, jsem uzvaneny kakadu Lora a rad pocitam a opakuji ! ");
            System.out.println();
            System.out.print("zadej prvni cislo: ");
            double a = Double.parseDouble(scanner.nextLine());
            System.out.println();
            System.out.print("zadej druhe cislo: ");
            double b = Double.parseDouble(scanner.nextLine());
            System.out.println();
            System.out.println("zvol operaci: ");
            System.out.println();
            
            System.out.println("soucet - 1");
            System.out.println("rozdil - 2");
            System.out.println("podil - 3");
            System.out.println("soucin - 4");
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
                    vysledek = a / b;
                    break;
                case 4:
                    vysledek = a * b;
                    break;
            }
            
        if ((volba>0) && (volba <5)){
            System.out.println();
            
            System.out.println("Vysledek: " + vysledek); 
            System.out.println();
        }
        else 
            System.out.println("Neplatna volba, mantaku ! Neumis pocitat do ctyr ? ");
           System.out.println();

            if (vysledek < 50) {
              
             
                System.out.println("Tak, a ted napis vetu nebo aspon slovo !");
                System.out.println();
                System.out.print("Pis sem: ");

                String vstup = scanner.nextLine();
                System.out.println();
 
                for (int i = 0; (i < vysledek) && (i < 50); i++) {
                    System.out.println(vstup + ", ");
                }
                } else {
              System.out.println("Zadny povidani nebude, protoze byla spatna volba nebo výsledek není kladné číslo mensi nez 50.");
           }
            System.out.println();
            System.out.println("Chces zadat další příklad? [ano/ne]");
            System.out.println();
            pokracovat = scanner.nextLine();
            System.out.println();
        }
        System.out.println("adios, amigo");
    }
}

