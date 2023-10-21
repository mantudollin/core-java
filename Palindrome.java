package code;
//
//public class Palindrome {
//
//	public static void main(String[] args) {
//		int sum=0,rem;
//		int n=44;
//		int temp =n;
//		while(n>0)
//		{
//			rem=n%10;
//			sum=(sum*10)+rem;
//			n=n/10;
//		}
//		if(temp==sum)
//		{
//			System.out.println("the given number " +temp+" is palindrome");
//		}
//		else
//		{
//			System.out.println("the given number "+temp+" is not  palindrome");
//		}
//	}
//
//}


import java.util.*;   
class Palindrome
{  
   public static void main(String args[])  
   {  
      String original, reverse = ""; // Objects of String class  
      Scanner in = new Scanner(System.in);   
      System.out.println("Enter a string/number to check if it is a palindrome");  
      original = in.nextLine();   
      int length = original.length();   
      for ( int i = length - 1; i >= 0; i-- )  
         reverse = reverse + original.charAt(i);  
      if (original.equals(reverse))  
         System.out.println("Entered string/number is a palindrome.");  
      else  
         System.out.println("Entered string/number isn't a palindrome.");   
   } 
}