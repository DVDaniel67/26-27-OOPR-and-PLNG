import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import java.util.InputMismatchException;
import java.time.format.DateTimeParseException;
  
public class OOPMidtermAct2{
    public static void main(String[] args) {
        DateTimeFormatter inputformat = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        Scanner input = new Scanner(System.in);
        int totalpages, pagesread, pagesleft;
        float pagespercent, pagesperday;
        String issuedate, duedate;
        LocalDate issued, due;
        LocalDate currentday = LocalDate.now();
        
        while(true){
            try{
                System.out.print("How many pages does the book have? ");
                totalpages = input.nextInt();
                if(totalpages<1){
                    System.out.println("Invalid Input, please enter a number larger than 0.");
                }else break;
            }catch(InputMismatchException e){
                System.out.println("Invalid Input, please enter a whole number.");
                input.next();
            }
        }
        
        while (true){
            try{
                System.out.print("How many pages have you read? ");
                pagesread = input.nextInt();
                if(pagesread>=0&&pagesread<=totalpages){break;}
                else System.out.println("Pages read cannot be negative or exceed total pages.");
            }catch(InputMismatchException e){
                System.out.println("Invalid Input, please enter a whole number.");
                input.next();
            }
        }
        
        pagesleft = totalpages-pagesread;
        pagespercent = (float) Math.round(((float)pagesread / totalpages) * 100 * 100) / 100;
        input.nextLine();
        
        while(true){
            try{
                System.out.print("Issue Date(mm/dd/yyyy): ");
                issuedate = input.nextLine();
                issued = LocalDate.parse(issuedate,inputformat);
                break;
            }catch(DateTimeParseException e){
                System.out.println("Invalid Date Format, please use the specified format.");
            }
        }
        
        while(true){
            try{
                System.out.print("Due Date (mm/dd/yyyy): ");
                duedate = input.nextLine();
                due = LocalDate.parse(duedate,inputformat);
                if(ChronoUnit.DAYS.between(issued,due)<0){
                    System.out.println("Due Date cannot be before Issuing Date.");
                }else break;
            }catch(DateTimeParseException e){
                System.out.println("Invalid Date Format, please use the specified format.");
            }
        }
        
        long daysleft = ChronoUnit.DAYS.between(currentday,due);
        
        if(daysleft==0){pagesperday = pagesleft;}
        else pagesperday = (float)Math.round(((float)pagesleft/daysleft)*10)/10;
        
        System.out.println("Issued on: "+issued.format(inputformat));
        System.out.println("You have read "+pagespercent+"% of the book.");
        if(daysleft>0){
            System.out.println("You have "+daysleft+" day(s) remaining to return the book");
            System.out.println("You still have "+pagesleft+" page(s) left and you should read "+pagesperday+" page(s) a day");
        }else if(daysleft==0){
            System.out.println("The book is due today, you have "+pagesleft+" pages left to read.");
        }else System.out.println("Your book is overdue by "+Math.abs(daysleft)+" days. Please return it now.");
        input.close();
    }
}
