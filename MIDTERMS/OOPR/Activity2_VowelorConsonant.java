import java.util.Scanner;

public class Activity2_VowelorConsonant {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String userinput;
            System.out.print("Enter a letter: ");
            userinput = input.next();
            if(userinput.length()!=1){System.out.println("Invalid Input, not a character.");}
            else{
                char character = userinput.charAt(0);
                if(Character.isLetter(character)){
                    character = Character.toLowerCase(character);
                    if(character=='a'||character=='e'||character=='i'||character=='o'||character=='u'){
                        System.out.print("It's a vowel!");
                    }else System.out.print("It's a consonant!");
                }else System.out.print("Invalid input, not a character.");
            }
    }
}