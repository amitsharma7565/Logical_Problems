
// A string is given. Our task is to write a Java program to toggle the characters of the given string. For example, for the string "jaVaTpoiNt", the string after the toggle will be "JAvAtPOInT".
import java.util.*;
class Toggle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String ");
        String s1= sc.nextLine();
        StringBuilder result= new StringBuilder("");
       for(int i=0;i<s1.length();i++){
        char ch = s1.charAt(i);
        if(ch>='A' && ch<='Z'){
            String s2= Character.toString(ch).toLowerCase();
            result.append(s2);
        }
        else if(ch>='a'&& ch<='z'){
            String s3 = Character.toString(ch).toUpperCase();
            result.append(s3);
        }
        else{               
            result.append(ch);
        }
        
       }
       String answer= result.toString();
       
       System.out.println(answer);
        }
}

