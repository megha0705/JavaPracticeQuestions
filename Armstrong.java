//write a program to check if the given number is an armstrong number.
import java.util.Scanner;
class Armstrong{
    public static void main(String [] args){
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        int input = n;
        int r;
        int cubes = 0;
        while(n > 0){
          r  = n % 10;
         cubes +=  r * r* r;
          n = n /10;
        }
       if(cubes == input){
        System.out.println("armstrong number");
       }else{
        System.out.println("not a armstrong number");
       }    
    }
}