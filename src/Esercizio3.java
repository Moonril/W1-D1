public class Esercizio3 {
    public static void main(String[] args){

        System.out.println("Perimetro rettangolo: " +perimetroRettangolo(3, 4));

        pariDispari(2);

        System.out.println("Area triangolo: " + perimetroTriangolo(2, 2, 2));
    }
    public static double perimetroRettangolo(double a, double b){
        return (a + b) *2;
    }

    public static void pariDispari(int a){
        if(a % 2 == 0){

         System.out.println(a + " is even.");
        } else {
             System.out.println(a + " is odd.");
        }
        // oppure return x%2;
    }

    public static double perimetroTriangolo(double a, double b, double c){
        return (a+b+c)/2;
    }
}
