//write a program to take an array from the user and find the position of a number in that array. Take that number from the user as well
import java.util.Scanner;
class FindNum{
     public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int [] arr = new int [5];
        for(int i = 0; i < arr.length; i++){
          arr[i] = sc.nextInt();
        }
        System.out.println("enter a number");
        int n = sc.nextInt();
        for(int i = 0; i < arr.length; i++){
            if(n == arr[i]){
               System.out.println(i);
         }
       }   
      }
 }
