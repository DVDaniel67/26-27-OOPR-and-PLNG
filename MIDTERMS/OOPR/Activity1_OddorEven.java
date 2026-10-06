import java.util.Scanner;
import java.util.InputMismatchException;

public class Activity1_OddorEven {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int number;
        try{
            System.out.print("Enter a number: ");
            number = input.nextInt();
            if(number%2==0){System.out.println("It's an even number!");}
            else if(number%2!=0){System.out.println("It's an odd number!");}
        }catch(InputMismatchException e){
            System.out.println("Invalid input, Not a Number.");
            input.next();
        }
    }
}