//write a program to check if a number is odd or even
import java.util.Scanner;
class OddEven{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n % 2 == 0){
            System.out.println("EVEN");
        }else{
             System.out.println("ODD");

        }
    }
}