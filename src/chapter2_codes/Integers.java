import java.util.Scanner;
/**
 * Ex: 2.16
 * Tests user input
 * @author Atharva
 * Displays which of 2 numbers is greater
 */
public class Integers
{
    public static void main(String[] args){
        Scanner num1 = new Scanner(System.in);
        System.out.println("Enter a value for the first number");
        int final1 = num1.nextInt();
        Scanner num2 = new Scanner(System.in);
        System.out.println("Enter a value for the second number");
        int final2 = num2.nextInt();
        if(final1 > final2){
            System.out.println(final1 + " is larger");
        }
        else{
            System.out.println(final2 + " is larger");
        }
}
}