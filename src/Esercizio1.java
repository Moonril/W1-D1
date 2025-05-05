public class Esercizio1 {
    public static void main(String[] args){
        System.out.println("multiply: " + multiply(2, 2));
        System.out.println("concatena: " + concatena("ciao ", 2));
        String[] arrayOriginale= {"a", "b", "c", "d", "e"};
        String nuova = "X";

        String[] risultato = nomeMetodo(arrayOriginale, nuova);

        for (String s : risultato) {
            System.out.println(s);
        }

    }
    public static int multiply(int a, int b){
        return a+b;
    }

    public static String concatena(String a, int b){
        return a+b;
    }

    public static String[] nomeMetodo(String[] array, String nuovaStringa){
        String[] nuovoArray = new String[6];

        nuovoArray[0] = array[0];
        nuovoArray[1] = array[1];
        nuovoArray[2] = nuovaStringa;
        nuovoArray[3] = array[3];
        nuovoArray[4] = array[3];
        nuovoArray[5] = array[4];


        return nuovoArray;
    }
}

//accetta un array di stringhe di cinque elementi ed una stringa e restituisca un array di sei elementi in cui la stringa passata sia al terzo posto e le stringhe precedentemente in quarta e quinta posizione siano rispetivamente in quinta e sesta