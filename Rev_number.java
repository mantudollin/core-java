package code;

import java.util.Scanner;

public class Rev_number 
{
	
	static int Rev(int num,int rev,int rem)
	{
		while (num!=0)
		{
			rem=num%10;
			rev=(rev*10)+rem;
			num=num/10;
		}
		return rev;
	}
	public static void main(String[] args) {
		//int num=1234;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number to reverse ");
		int num=sc.nextInt();
		int rev=0; int rem=0;
		System.out.println(Rev(num,rev,rem));
	
		
	}

}
