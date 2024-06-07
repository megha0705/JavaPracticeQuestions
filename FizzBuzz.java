//write a program to print Fizz Buzz. Print numbers from 1 to n. If number is divisable by 3, print fizz. If number is divisible by 5, print buzz. If number is divisible by both, print Fizz Buzz. Else just print the number. Take value of n from the user.
import java.util.Scanner;
class  FizzBuzz{
    public static void main(String [] args){
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        if(n % 3 == 0 && n % 5 == 0){
            System.out.println("fizz buzz");
        }else if(n % 5 == 0){
            System.out.println("buzz");
        }else if (n % 3  == 0 ){
            System.out.println("fizz");
        }else{
            System.out.println(n);
        }
    }
}