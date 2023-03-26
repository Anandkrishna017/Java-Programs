import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int x = sc.nextInt();
        boolean flag = true;
        for(int i = 2; i < x/2; i++)
            if(x%i == 0)
            {
                flag = false;
                break;
            }
        if(flag)
            System.out.println(x+" is a prime number");
        else
            System.out.println(x+" is not a prime number");
                   
    }
}
