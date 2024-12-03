//Write a program in Java to prove that the strings are immutable in Java.

import java.util.*;
public class ProveStringImmutable{
    	public static void main(String args[]) {
String str1= "Amit";
String str2= str1+"Sharma";

if(str1==str2){
    System.out.println("Strinf is mutuable");
}
else{
    System.out.println("String is immutable");
}
}

}

 
