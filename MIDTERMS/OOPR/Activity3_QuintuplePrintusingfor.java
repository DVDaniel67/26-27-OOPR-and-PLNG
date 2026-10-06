import java.util.Scanner;

public class Activity3_QuintuplePrintusingfor {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String userin = input.nextLine();
        for(int i:new int[5]){
            System.out.println(userin);
        }
    }
}