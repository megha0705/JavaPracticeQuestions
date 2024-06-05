import java.util.Scanner;
class ReversedDigits{
    public static void main(String [] args){
    Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();  
        int result;
        int rev = 0;
        while(n > 0){
            result = n % 10;
            rev = rev*10 + result;
            n = n/10;
        }
    System.out.println(rev);
    }
}