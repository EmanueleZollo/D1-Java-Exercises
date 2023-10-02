/*Esercizio #1
        Implementare i seguenti metodi:

        Moltiplica: accetta due interi e ritorna il loro prodotto
        Concatena: accetta una stringa e un intero e restituisce una stringa che concatena gli elementi
        inserisciInArray: accetta un array di stringhe di cinque elementi ed una stringa e restituisca
         un array di sei elementi in cui la stringa passata sia al terzo posto e le stringhe precedentemente
         in quarta e quinta posizione siano rispettivamente in quinta e sesta.

        Scrivere una main che invochi in sequenza i tre metodi realizzati*/

import java.util.Arrays;

public class Exercise1 {
    public static void main(String[] args) {


        /*
        i metodi si scrivono esternamente al main, i valori internamente?
        */

        System.out.println(product(5, 9));
        System.out.println(concatElements("Java", 1));


        String [] carbrand = {"Mercedes", "Wolkswagen", "Opel", "Renault", "Ford"};
        System.out.println(Arrays.toString(modifyArr(carbrand, "Fiat")));

    }

    public static int product(int n1, int n2) {
        return n1*n2;
    }

    public static String concatElements (String str, int n1) {
        return str + n1;
    }



    public static String[] modifyArr(String[] arr, String str ) {
        String[] newCarBrandArr;
        newCarBrandArr = new String[6];
        newCarBrandArr[0] = arr[0];
        newCarBrandArr[1] = arr[1];
        newCarBrandArr[2] = str;
        newCarBrandArr[3] = arr[2];
        newCarBrandArr[4] = arr[3];
        newCarBrandArr[5] = arr[4];
        return newCarBrandArr;
    }

}
