import java.util.Scanner;
/**
 * Ex 2.30
 * Test spaces
 * @author Atharva
 * Displays a 5 digit number and each digit is seperated by 3 spaces
 */
public class Space
{
    public static void main(String[] args){
        Scanner number = new Scanner(System.in);
        System.out.println("Enter a 5 digit number: ");
        int digits = number.nextInt();
        System.out.print(digits/10000);
        int rem1 = digits % 10000;
        System.out.print("   "+rem1/1000);
        int rem2 = digits % 1000;
        System.out.print("   "+rem2/100);
        int rem3 = digits % 100;
        System.out.print("   "+rem3/10);
        int rem4 = digits % 10;
        System.out.print("   "+rem4/1);

    }
}
