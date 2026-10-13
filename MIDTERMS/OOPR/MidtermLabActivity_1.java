import java.util.Scanner;
import java.util.Arrays;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.io.File;
import java.io.FileNotFoundException;
import java.text.ParseException;

public class MidtermLabActivity_1 {
    public static Scanner input = new Scanner(System.in);
    public static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    public static class Student{
        private String StudentNo, StudentName;
        private Date DateofBirth;
        private int TariffPoints;
        private static int NumofStudents = 0;
        
        //default Constructor
        public Student(){
            this.StudentNo = this.StudentName = "not known";
            this.TariffPoints = 20;
            try{
                SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
                this.DateofBirth = sdf.parse("01/01/1995");
            }catch(ParseException e){this.DateofBirth = new Date();}
            NumofStudents++;
        }
        
        //Parameterized Constructor
        public Student(String StudentNo, String StudentName, Date DateofBirth, int TariffPoints){
            this.StudentNo = StudentNo;
            this.StudentName = StudentName;
            this.DateofBirth = DateofBirth;
            this.TariffPoints = TariffPoints;
            NumofStudents++;
        }
        
        public String getStudentNo(){
            return StudentNo;
        }
        
        public void setStudentNo(String StudentNo){
            this.StudentNo = StudentNo;
        }
        public String getStudentName(){
            return StudentName;
        }
        
        public void setStudentName(String StudentName){
            this.StudentName = StudentName;
        }
        
        public Date getDateofBirth(){
            return DateofBirth;
        }
        
        public void setDateofBirth(Date DateofBirth){
            this.DateofBirth = DateofBirth;
        }
        
        public int getTariffPoints(){
            return TariffPoints;
        }
        
        public void setTariffPoints(int TariffPoints){
            this.TariffPoints = TariffPoints;
        }
        
        public int getNumofStudents(){
            return NumofStudents;
        }

        public void setNumofStudents(int NumofStudents){
            Student.NumofStudents= NumofStudents;
        }
    }
    
    public static void Program1(){
        int[] array = new int[10];
        System.out.println("Enter 10 real numbers: ");
        for(int i=0;i<10;i++){
            array[i] = input.nextInt();
        }
        input.nextLine();
        float sum=0, lowest=Integer.MAX_VALUE, negativeCount=0, positiveCount=0;
        for(int i=0;i<10;i++){if(array[i]>=0){sum+=array[i];positiveCount++;}}
        for(int i=0;i<10;i++){if(array[i]<0){negativeCount++;}}
        for(int i=0;i<10;i++){if(array[i]<lowest){lowest=array[i];}}
        float average  = sum / positiveCount;
        System.out.print ("Sum of positive numbers: "+sum+"\nAverage of positive numbers: "
        +average+"\nNumber of negative numbers:"+negativeCount+"\nLowest Number: "+lowest);
    }
    
    public static void Program2(){
        int[] array = new int[8];
        for(int i=0;i<8;i++){
            System.out.print("Enter Element: ");
            array[i]=input.nextInt();
            }
        input.nextLine();
        int[] uniquearray = Arrays.stream(array).distinct().toArray();
        int largest = Integer.MIN_VALUE, secondlargest = Integer.MIN_VALUE, smallest = Integer.MAX_VALUE, secondsmallest = Integer.MAX_VALUE;
        for (int i = 0; i < uniquearray.length; i++) {
            if (uniquearray[i] > largest) {largest = uniquearray[i];}
            if (uniquearray[i] < smallest) {smallest = uniquearray[i];}
        }
        for (int i = 0; i < uniquearray.length; i++) {
            if (uniquearray[i] > secondlargest && uniquearray[i] < largest) {secondlargest = uniquearray[i];}
            if (uniquearray[i] < secondsmallest && uniquearray[i] > smallest) {secondsmallest = uniquearray[i];}
        }
        System.out.print("Unique Array Elements: ");
        for (int i = 0; i < uniquearray.length; i++) {System.out.print(uniquearray[i] + " ");}
        System.out.println("\nSecond Largest Number: " + secondlargest + "\nSecond Smallest Number: " + secondsmallest);
    }
    
    public static void Program3(){
        int[] array = new int[5];
        for(int i=0;i<5;i++){
            System.out.print("Enter Element: ");
            array[i]=input.nextInt();
            }
        System.out.print("Stored Data in Array: ");
        for(int i=0;i<5;i++){
            System.out.print(array[i] + " ");
        }
        System.out.print("\nEnter position of Data to Delete: ");
        int userin = input.nextInt();
        input.nextLine();
        if (userin < 0 || userin >= 5) {
            System.out.println("Invalid index choice.");
            return;
        }
        userin--;
        int[] newarray = new int[4];
        for (int i = 0, j = 0; i < 5; i++) {
            if (i != userin) {
                newarray[j] = array[i];
                j++;
            }
        }
        System.out.print("New Data in Array: ");
        for(int i=0;i<4;i++){System.out.print(newarray[i]+" ");}
    }
    
    public static void Program4(){
        System.out.print("Enter Size of Array: ");
        int size = input.nextInt();
        System.out.print("Enter any "+size+" elements in Array: ");
        int[] array = new int[size];
        for(int i=0;i<size;i++){array[i]=input.nextInt();}
        input.nextLine();
        System.out.print("Even Elements: ");
        for(int i=0;i<array.length;i++){if(array[i]%2==0){System.out.print(array[i]+" ");}}
        System.out.print("\nOdd Elements: ");
        for(int i=0;i<array.length;i++){if(array[i]%2!=0){System.out.print(array[i]+" ");}}
    }
    
    public static void Program5(){
        char firstchar = '*', secondchar = 'A';
        for(int i=0;i<=7;i+=2){
            for(int j=0;j<=i;j++){
                if(j%2==0){System.out.print(firstchar);}
                else{System.out.print(secondchar);}
            }System.out.print("\n");
        }
    }
    
    public static void Program6(){
        System.out.println("---Register New Student---");
        System.out.print("Enter Student Number: ");
        String StudentNo = input.nextLine();
        System.out.print("Enter Student Name: ");
        String StudentName = input.nextLine();
        Date DateofBirth = null;
        System.out.print("Enter Date of Birth(dd/MM/yyyy): ");
        String dob = input.nextLine();
        try{
            DateofBirth = sdf.parse(dob);
        }catch(ParseException e){
            System.out.println("Invalid Format, Setting date to current system time.");
            DateofBirth = new Date();
        }
        System.out.print("Enter Tariff Points(20-280): ");
        String userin = input.nextLine();
        int TariffPoints;
        try{
            TariffPoints = Integer.parseInt(userin);
            if(TariffPoints>280||TariffPoints<20){
                System.out.println("Invalid Input, setting Tariff Points to minimum.");
                TariffPoints=20;
            }
        }catch(Exception e){
            System.out.println("Invalid Input, setting Tariff Points to minimum.");
            TariffPoints = 20;
        }
        Student student = new Student(StudentNo, StudentName, DateofBirth, TariffPoints);
        System.out.println("Number of Students: "+student.getNumofStudents());
        System.out.println("Student Number: " + student.getStudentNo());
        System.out.println("Student Name: " + student.getStudentName());
        System.out.println("Date of Birth: "+ sdf.format(student.getDateofBirth()));
        System.out.println("Tariff Points: " + student.getTariffPoints());
    }

    public static void Program7(){
        File file = new File("data.txt");
        try(Scanner scan = new Scanner(file)){
            while(scan.hasNextLine()){
                String line = scan.nextLine();
                System.out.println(line);
            }
        }catch(FileNotFoundException e){System.out.println("File cannot be found.");}
    }
    public static void main(String[] args) {
        String choice;
        while(true){
        System.out.print("""
                         Program 1
                         Program 2
                         Program 3
                         Program 4
                         Program 5
                         Program 6
                         Program 7
                         Select Program: """);
        choice = input.nextLine();
        switch(choice){
            case "1" -> {
                Program1();
            }
            case "2" -> {
                Program2();
            }
            case "3" ->{
                Program3();
            }
            case "4"->{
                Program4();
            }
            case "5"->{
                Program5();
            }
            case "6"->{
                Program6();
            }
            case "7"->{
                Program7();
            }
            default -> {System.out.println("Invalid Choice, continuing.");}
        }
        System.out.print("\n\nContinue? y/n: ");
        char continuing = input.nextLine().charAt(0);
        if(continuing=='y'||continuing=='Y'){System.out.println("Continuing");}
        else if(continuing=='n'||continuing=='N'){System.out.print("Exiting...");break;}
        else {System.out.println("Invalid input, exiting...");break;}
        }
    }
}