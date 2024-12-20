package com.ferragnez.party;

import java.util.Scanner;

public class CheckGuest {
    
    public static void main(String[]args){
        // Lista degli invitati
        String[] guestList = {
            "Dua Lipa", "Paris Hilton", "Manuel Agnelli", "J-Ax",
            "Francesco Totti", "Ilary Blasi", "Bebe Vio", "Luis",
            "Pardis Zarei", "Martina Maccherone", "Rachel Zeilic"
        };

        // Creazione dello scanner per l'input dell'utente
        Scanner scanner = new Scanner(System.in);

        // Chiedi all'utente il proprio nome
        System.out.print("Benvenuto alla festa Ferragnez! Come ti chiami? ");
        String userName = scanner.nextLine();

        // Variabile per tracciare se il nome è stato trovato
        boolean isInvited = false;

        // Metodo con ciclo while
        int i = 0;
        while (i < guestList.length) {
            if (guestList[i].equalsIgnoreCase(userName)) {
                isInvited = true;
                break;
            }
            i++;
        }

        // Verifica se il nome è nella lista
        if (isInvited) {
            System.out.println("Benvenuto/a " + userName + "! Puoi entrare alla festa");
        } else {
            System.out.println("Mi dispiace, " + userName + ". Non sei nella lista.");
        }

        // Chiusura dello scanner
        scanner.close();
    }
}