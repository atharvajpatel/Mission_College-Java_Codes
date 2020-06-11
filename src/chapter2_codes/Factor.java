package chapter2_codes;
import java.util.Scanner;
/**
 * Ex 2.26
 * Tests multiples
 * @author Atharva
 * Displays whether number1 is a multiple of number2
 */
public class Factor
{
    public static void main(String[] args){
        Scanner num1 = new Scanner(System.in);
        System.out.println("Enter a value for the first number");
        int final1 = num1.nextInt();
        Scanner num2 = new Scanner(System.in);
        System.out.println("Enter a value for the second number");
        int final2 = num2.nextInt();
        if(final1 % final2 == 0){
            System.out.println(final1+" is a multiple of"+ final2);
        }
        else{
           System.out.println(final1+" is not a multiple of"+ final2);
        }
    }
}
 

