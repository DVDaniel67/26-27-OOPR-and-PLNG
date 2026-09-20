import java.util.Scanner;

public class Activity4_Scanner {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first word: ");
            String first = input.nextLine();
            System.out.print("Enter second word: ");
            String second = input.nextLine();
            System.out.print("Enter third word: ");
            String third = input.nextLine();
            System.out.print(first + " " + second + " " + third);
    }
}
