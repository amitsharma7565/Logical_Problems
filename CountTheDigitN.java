
 //Calculate how many times a digit D occurs in the number N. One has to ask the user to give the values of N and D.

import java.util.*;
class CountTheDigitN {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
       System.out.println("Enter the num");
      int num= sc.nextInt();
      System.out.println("Enter number want to search");
      int search = sc.nextInt();
      int count=0;
      
     while(num!=0){
         int dig = num%10;
         if(dig==search){
             count++;
         }
         num= num/10;
     }
              System.out.println("count is "+ count);

    }
}