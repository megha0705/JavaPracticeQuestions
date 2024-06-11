//write a program to check if the given number is an armstrong number.
import java.util.Scanner;
class Armstrong{
    public static void main(String [] args){
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        int input = n;
        int m; 
        int length = String.valueOf(n).length();
        int power;
        int result = 0;
       while(n > 0){
        m = n % 10;
        power = (int)Math.pow(m,length);
        result += power;
        n = n/ 10;
       }
       if(input == result){
        System.out.println("armstrong number");
       }else{
        System.out.println("normal number");
       }
    }
}