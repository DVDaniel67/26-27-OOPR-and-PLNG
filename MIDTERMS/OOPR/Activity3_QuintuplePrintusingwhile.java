import java.util.Scanner;

public class Activity3_QuintuplePrintusingwhile {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int i = 0;
        System.out.print("Enter your name: ");
        String userin = input.nextLine();
        while(i<5){
            System.out.println(userin);
            i++;
        }
    }
}
