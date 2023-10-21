package code;

public class ArmStrong {
	public static void main(String[] args) { 
		int i = 10;
		int a=10;  
		int b=10;  
		System.out.println(a++ + ++a);//10+12=22  
		System.out.println(b++ + b++);//10+11=21 
		System.out.println(b-- - ++a);// -1
		System.out.println(b-- + ++a);
		i--;  
		System.out.println(i);  //prints 9  
		--i;                  
		System.out.println(i);//prints 8   
		System.out.println(--i); //prints 7  
		System.out.println(i--); //prints 7  
		System.out.println(i); //prints 6
		i++;  
		System.out.println(i);//prints 7    
		++i;                 
		System.out.println(i);  //prints 8 
		System.out.println(++i);//prints 9   
		System.out.println(i++);  //prints 9 
		System.out.println(i); //prints 10  	
	}

}
