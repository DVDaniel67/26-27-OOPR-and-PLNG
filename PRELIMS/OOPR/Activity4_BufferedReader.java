import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Activity4_BufferedReader {
    public static void main(String[] args){
        try(BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))){
            
            System.out.print("Enter first word: ");
            String first = reader.readLine();
            System.out.print("Enter second word: ");
            String second = reader.readLine();
            System.out.print("Enter third word: ");
            String third = reader.readLine();
            System.out.print(first + " " + second + " " + third);
        }catch(IOException e){
            System.err.println("Error while reading input: "+e.getMessage());
        }
    }

}
