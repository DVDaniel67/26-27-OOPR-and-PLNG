import java.util.Scanner;

public class Activity3_ArithmeticOperationsCalculator {

    public static void main(String[] args){
        Scanner myObj = new Scanner(System.in);
        while(true){
        System.out.println("Arithmetic Calculator\n1.Addition     2. Subtraction      3. Multiplication\n4.Division     5. Modulus          6. Increment\n7.Decrement\nSelect an Arithmetic Operation:");
        int choice = myObj.nextInt();
        switch(choice){
            case 1:
                System.out.println("Enter the x value: ");
                int x = myObj.nextInt();
                System.out.println("Enter the y value: ");
                int y = myObj.nextInt();
                System.out.println("Variable Values: x = "+x+", y = "+y);
                System.out.println("Addition: "+(x+y));
                break;
            case 2:
                System.out.println("Enter the x value: ");
                x = myObj.nextInt();
                System.out.println("Enter the y value: ");
                y = myObj.nextInt();
                System.out.println("Variable Values: x = "+x+", y = "+y);
                System.out.println("Subtraction: "+(x-y));
                break;
            case 3:
                System.out.println("Enter the x value: ");
                x = myObj.nextInt();
                System.out.println("Enter the y value: ");
                y = myObj.nextInt();
                System.out.println("Variable Values: x = "+x+", y = "+y);
                System.out.println("Multiplication: "+(x*y));
                break;
            case 4:
                System.out.println("Enter the x value: ");
                x = myObj.nextInt();
                System.out.println("Enter the y value: ");
                y = myObj.nextInt();
                if(y==0){System.out.println("Invalid y Input.");
                break;}
                else{System.out.println("Variable Values: x = "+x+", y = "+y);
                System.out.println("Division: "+(x/y));
                break;}
            case 5:
                System.out.println("Enter the x value: ");
                x = myObj.nextInt();
                System.out.println("Enter the y value: ");
                y = myObj.nextInt();
                System.out.println("Variable Values: x = "+x+", y = "+y);
                System.out.println("Modulus: "+(x%y));
                break;
            case 6:
                System.out.println("Enter the x value: ");
                x = myObj.nextInt();
                System.out.println("Variable Values: x = "+x);
                System.out.println("Increment: "+(x+=1));
                break;
            case 7:
                System.out.println("Enter the x value: ");
                x = myObj.nextInt();
                System.out.println("Variable Values: x = "+x);
                System.out.println("Decrement: "+(x-=1));
                break;
            default:
                System.out.println("Invalid Input.");
        }
        myObj.nextLine();
        System.out.println("Do you want to continue? (YES/NO)");
        String continuing = myObj.nextLine();
        if(continuing.equalsIgnoreCase("YES")){
            System.out.println("Enter Another Student's Grades");
            continue;
        }else System.out.println("Ending Program.");
            break;
        }
    }
}
