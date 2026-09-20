import java.util.Scanner;

public class Activity5_NumberComparison {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        int output;
        System.out.print("Enter first number: ");
        int x = input.nextInt();
        System.out.print("Enter first number: ");
        int y = input.nextInt();
        if(x>y){output = x;}
        else output=y;
        System.out.print("Enter first number: ");
        int z = input.nextInt();
        if(output<z){output = z;}
        System.out.print("The highest number is: "+output);
    }
}