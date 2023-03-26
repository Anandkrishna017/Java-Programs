package cycle1;

public class Product {
       int price;
       String pname,pcode;
       Product(String code,String name,int price){
    	   this.price=price;
    	   this.pname=name;
    	   this.pcode=code;
       }
       public String toString() {
    	   
    	   return "Product code: "+pcode+" Name: "+pname+" price: "+price;
       }
	public static void main(String[] args) 
	{
	
	Product p1=new Product("1001","AAAA",100);
	Product p2=new Product("1002","BBBB",150);
	Product p3=new Product("1003","CCCC",50);
	//System.out.println(p1);
	
	if(p1.price<p3.price && p1.price<p2.price) {
		System.out.println(p1+" is lowest");
		
	}
	if(p3.price<p1.price && p3.price<p2.price) {
		System.out.println(p3+" is lowest");
		
	}
	if(p2.price<p1.price && p2.price<p1.price) {
		System.out.println(p2+"  is lowest");
		
	}
	}
}


