//write a program to print the fibbonaci series (1, 1, 2, 3, 5, 8, 13, 21...)
import java.util.Scanner;
class Fibbonaci{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        int n = 1;
        int m = 0;
        for(int i = 0; i < input; i++){
            System.out.println(n); 
             int output = n + m; 
             m = n;
             n = output;
        }
    }
}