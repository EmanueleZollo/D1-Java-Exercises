/*
Esercizio #3
        Implementare i seguenti metodi


        perimetroRettangolo che accetta la lunghezza decimale dei due lati di un rettangolo e ne calcola il perimetro
        pariDispari che accetta un numero intero e restituisce 0 se il numero è pari e 1 se è dispari
        perimetroTriangolo che accetta le lunghezze decimali dei lati di un triangolo e ne restituisca l'area (è possibile usare la formula di Erone)

        Scrivere una main che utilizzi in sequenza i tre metodi chiedendo l'input dei dati all'utente
*/

public class Exercise3 {
    public static void main(String[] args) {

        System.out.println(perimetroRettangolo(6.4,7.9));
        System.out.println(pariDispari(12));
    }

    public static double perimetroRettangolo (double side1, double side2) {
        return (side1*2)+(side2*2);
    }

    public static int pariDispari (int num1) {
        if (num1 % 2 == 0) {
            return 0;
        } else {
            return 1;
        }


    }
}
