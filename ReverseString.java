//write a program to reverse a string
import java.util.Scanner;
class ReverseString{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        for(int i = 1; i <= input.length(); i++){
           String reversedString = Character.toString(input.charAt(input.length() - i));
           System.out.print(reversedString);       
        }
    }
}
