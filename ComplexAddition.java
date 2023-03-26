import java.util.Scanner;

public class ComplexAddition {
    int real, img;

    ComplexAddition(int r, int i)
    {
        real = r;
        img = i;
    }

    static ComplexAddition add(ComplexAddition n1, ComplexAddition n2)
    {
        ComplexAddition sum = new ComplexAddition(0, 0);
        sum.real = n1.real + n2.real;
        sum.img = n1.img + n2.img;
        return sum;
    }

    void print()
    {
        System.out.println(this.real + " + " + this.img + "i");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter real and imaginary part of complex number 1");
        ComplexAddition no1 = new ComplexAddition(sc.nextInt(), sc.nextInt());
        System.out.println("Enter real and imaginary part of complex number 2");
        ComplexAddition no2 = new ComplexAddition(sc.nextInt(), sc.nextInt());
        ComplexAddition sum = add(no1, no2);

        
        System.out.print("Sum of the 2 complex numbers is:\t");
        sum.print();

       
    }
    
}
