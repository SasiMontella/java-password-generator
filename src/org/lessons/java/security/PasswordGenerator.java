package org.lessons.java.security;

import java.util.Scanner;

public class PasswordGenerator {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);


        System.out.println("Inserisci il tuo nome");
        String name = scan.nextLine();

        System.out.println("Inserisci il tuo cognome");
        String surname = scan.nextLine();

        System.out.println("Inserisci il tuo colore preferito");
        String favouriteColor = scan.nextLine();

        System.out.println("Inserisci il tuo giorno di nascita");
        int dayOfBirth  = scan.nextInt();

        System.out.println("Inserisci il tuo mese di nascita in formato numerico");
        int monthOfBirth  = scan.nextInt();

        System.out.println("Inserisci il tuo anno di nascita");
        int yearOfBirth  = scan.nextInt();

        int sumOfBirth = dayOfBirth + monthOfBirth + yearOfBirth;
        System.out.println("La tua password è: ");
        System.out.println(name + "-" + surname + "-" + favouriteColor + "-" + sumOfBirth);

        scan.close();
    }
}
