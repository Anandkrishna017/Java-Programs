package cycle2;
import java.util.*;
public class Sort {

	public static void main(String[] args) 
	{
		
       int size;
       char temp;
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the String :");
       String Str1=sc.nextLine();
       char array[]=Str1.toCharArray();
       size=array.length;
       for(int i=0;i<size;i++)
        {
    	   for(int j=i+1;j<size;j++) 
    	   {
    		   if(array[i]>array[j]) 
    		   {
    			   temp=array[i];
    			   array[i]=array[j];
    			   array[j]=temp;
    		   }
    	   }
       }
       String Str2="";
       for(int i=0;i<size;i++)
       {
    	   Str2=Str2+array[i];
       }
       System.out.println("Sorted String is :" + Str2);
       sc.close();
	}

}
