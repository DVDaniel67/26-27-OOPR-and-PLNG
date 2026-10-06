import java.util.Scanner;

public class Activity3_QuintuplePrintusingdowhile {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int i = 0;
        System.out.print("Enter your name: ");
        String userin = input.nextLine();
        do{
            System.out.println(userin);
            i++;
        }while(i<5);
    }
}
