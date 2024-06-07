//write a program to print grade of a person. 90= is AA. 80+ is AB. 70+ is BB and so on. 40- is FF
import java.util.Scanner;
class Grade{
     public static void main(String [] args){
         Scanner sc = new Scanner(System.in);
         int n = sc.nextInt(); 
         if(n >= 90 && n < 100){
            System.out.println("AA");
         }else if(n < 90 && n >= 80){
            System.out.println("AB");

         }else if(n < 80 && n >= 70){
            System.out.println("BB");
         }else if(n < 70 && n >= 60){
            System.out.println("CC");

         }else if(n < 60 && n >=50){
            System.out.println("DD");

         }else if(n < 50 && n >= 40){
            System.out.println("EE");

         }else if(n < 40) {
            System.out.println("bro you have failed");

         }else{
            System.out.println("invalid");
         }
    }
}