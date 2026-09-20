import java.util.Scanner;

public class Activity2_StudentGradeCalculator {

    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        while(true){
        System.out.println("Enter Java Score: ");
        float javaScore = myObj.nextFloat();
        System.out.println("Enter C Score: ");
        float cScore = myObj.nextFloat();
        System.out.println("Enter Database Handling Score: ");
        float dbScore = myObj.nextFloat();
        myObj.nextLine();
        char rate;
        float average = (javaScore+cScore+dbScore)/3;
        if(average>=90&&average<=100){rate = 'A';}
        else if(average>=80){rate = 'B';}
        else if(average >=75){rate = 'C';}
        else rate = 'F';
        System.out.println("Output:\n"+rate+"\nExplanation:\nThe average of the student is "+String.format("%.3f",average)+", so the student's grade is "+rate+".");
        System.out.println("Do you want to continue? (YES/NO)");
        String choice = myObj.nextLine();
        if(choice.equalsIgnoreCase("YES")){
            System.out.println("Enter Another Student's Grades");
            continue;
        }else System.out.println("Ending Program.");
            break;
        }
}
}