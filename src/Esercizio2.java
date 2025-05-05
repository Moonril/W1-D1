import java.util.Scanner;

public class Esercizio2 {
    public static void main(String[] args){
        Scanner myObj = new Scanner(System.in);

        System.out.println("Enter phrase");

        String str1 = myObj.nextLine();
        String str2 = myObj.nextLine();  // Read user input
        String str3 = myObj.nextLine();  // Read user input
        // Read user input
        System.out.println("Username is: " + str1 + str2 + str3);  // Output user input
    }
}

