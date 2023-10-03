/* Esercizio #2
   Implementare un metodo main che chiede all'utente di inserire tre stringhe da tastiera
     e scrive in console la concatenazione delle stringhe in ordine di inserimento
     e in ordine di inserimento inverso.*/

import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Inserisci 3 stringhe:");
        String str1 = input.nextLine();
        String str2 = input.nextLine();
        String str3 = input.nextLine();
        System.out.println( str1 + str2 + str3);
        System.out.println( str3 + str2 + str1);
        input.close();
    }


}

