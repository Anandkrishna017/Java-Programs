import java.util.*;

public class Overload
{
	void Area(int a)			
	{
		int area = a * a;
		System.out.println("The Area of a Square    = " + area + " Sq Units");
		System.out.println("---------------------------------------------------");
	}
	
	void Area(int a, int b)	
	{
		int area = a * b;
		System.out.println("The Area of a Rectangle = " + area + " Sq Units");
		System.out.println("---------------------------------------------------");
	}	
	
	void Area(double r)			
	{
		double area = 3.14 * r * r;
		System.out.println("The Area of a Circle    = " + area + " Sq Units");
		System.out.println("---------------------------------------------------");
	}	
	
	void Area(Double a, Double b)
	{
		double area = (a * b) / 2;
		System.out.println("The Area of a Triangle  = " + area);
		System.out.println("---------------------------------------------------");
	}
	
	public static void main(String[] args) 
	{
		Overload obj = new Overload();
		Scanner sc=new Scanner(System.in);
		while(true){
			System.out.println("1.Square\n2.Rectangle\n3.Circle\n4.Triangle\n5.Exit\nEnter your choice:");
			int ch =sc.nextInt();
			switch(ch){
             
			case 1:System.out.println("Enter Side:");
			        int x=sc.nextInt();
					obj.Area(x);
					break;
			case 2:System.out.println("Enter Length:");
			       int y=sc.nextInt();
				   System.out.println("Enter Breadth:");
			       int z=sc.nextInt();
				   obj.Area(y, z);
				   break;
			case 3:System.out.println("Enter radius:");
			        Double r=sc.nextDouble();
			        obj.Area(r);
			        break;
			case 4:System.out.println("Enter Height:");
					Double a=sc.nextDouble();
					System.out.println("Enter Breadth:");
					Double b=sc.nextDouble();
					obj.Area(a, b);
					break;
			case 5:break;

			}
			if(ch==5){
				break;
			}
		}
	 
	}
}
