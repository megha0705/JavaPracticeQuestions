//write a program to print each digit of a number independently (input: 12345. output: 1, 2, 3, 4, 5)
import java.util.Scanner;
class IndependentDigit{
     public static void main(String [] args){
         Scanner sc = new Scanner(System.in);
         int  n = sc.nextInt();
         for(int i = 0; i < n; i ++){
            System.out.println(n.getInteger(i));
    }
   } 
 }
