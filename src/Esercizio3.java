public class Esercizio3 {
    public static void main(String[] args){

        System.out.println("Perimetro rettangolo: " +perimetroRettangolo(3, 4));

        pariDispari(2);

        System.out.println("Area triangolo: " + perimetroTriangolo(2, 2, 2));
    }
    public static int perimetroRettangolo(int a, int b){
        return a * b;
    }

    public static void pariDispari(int a){
        if(a % 2 == 0){

         System.out.println(a + " is even.");
        } else {
             System.out.println(a + " is odd.");
        }
    }

    public static int perimetroTriangolo(int a, int b, int c){
        return (a+b+c)/2;
    }
}
