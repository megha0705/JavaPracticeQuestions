//write a program to input a string from the user and count the number of words in the string.
import java.util.Scanner;
class WordCount{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int wordCount = 1;
        String input = sc.nextLine();
        for(int i = 0; i < input.length(); i++){
           if(input.charAt(i) == ' '){
             wordCount = wordCount + 1;
           }    
        }
 System.out.println(wordCount);
    }
}