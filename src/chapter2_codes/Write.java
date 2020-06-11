package chapter2_codes;
import java.util.Scanner;

/**
 * Ex: 2.14
 * Tests println
 * @author Atharva Patel
 * Displays number 1-4 on the same line
 */
public class Write {
    public static void main(String[] args) {
        System.out.println("Part (a): 1 2 3 4");
        System.out.print("Part (b): 1 2 3 4");
        System.out.printf("%n%s%s", "Part (c): ", "1 2 3 4");
    }

}