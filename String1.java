package cycle2;

import java.util.Scanner;

public class String1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   Scanner sc=new Scanner(System.in);
	       System.out.println("Enter the String :");
	       String Str1=sc.nextLine();
	       System.out.println("IS EMPTY :------->"+Str1.isEmpty());
	       System.out.println("Length :-------->"+Str1.length());
	       System.out.println(" CharAt(2) function:------> "+Str1.charAt(2));
	       System.out.println("codePointAt():	Returns the Unicode of the character at the specified index:------>  "+Str1.codePointAt(0));
	       System.out.println("To upper case:-------->"+Str1.toUpperCase());
	       System.out.println("To lower case:-------->"+Str1.toLowerCase());
	       System.out.println("Enter the String 2:");
	       String Str2=sc.nextLine();
	       System.out.println("concat()	Appends a string to the end of another string: ----->"+Str1.concat(Str2));
	      
	}

}
