// Write a Java program for printing all of the unique characters present in a String. For instance, for the string "pppdaf", print characters 'd', 'a', and 'f' since they are unique. The character 'p' is coming thrice in the program. Hence, it is not printed. It is given only small letters are present in the input string.
import java.util.*;

public class checkNonRepeatedChar{
	public static String checkNonRepeated(String str) {
		char ch[]= str.toCharArray();
		for(int i=0; i<ch.length; i++) {
			int count=0;
			for(int j=0; j<ch.length;j++) {
				if(ch[i]==ch[j]) {
					count++;
				}
				
			}
			if(count==1) {
				System.out.println(ch[i]);
			}
				

		}
		
		return null;
	}
	  
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
		String s1= sc.nextLine();
		checkNonRepeated(s1);
	}

}

 
