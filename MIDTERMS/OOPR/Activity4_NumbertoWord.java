import java.util.Scanner;
import java.util.InputMismatchException;

public class Activity4_NumbertoWord {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        while(true){
            try{System.out.print("Enter a number from 1-10: ");
            int userin = input.nextInt();
            switch(userin){
                case 1:System.out.println("One");break;
                case 2:System.out.println("Two");break;
                case 3:System.out.println("Three");break;
                case 4:System.out.println("Four");break;
                case 5:System.out.println("Five");break;
                case 6:System.out.println("Six");break;
                case 7:System.out.println("Seven");break;
                case 8:System.out.println("Eight");break;
                case 9:System.out.println("Nine");break;
                case 10:System.out.println("Ten");break;
                default:System.out.println("Invalid Number.");break;
            }
            }catch(InputMismatchException e){System.out.println("Invalid Input.");input.nextLine();}
                System.out.print("Again? y/n: ");
                char decision = input.next().charAt(0);
                if(decision=='n'||decision=='N'){System.out.println("Exiting...");break;}
        }
    }
}