import java.util.Scanner;


public class Program3{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  
        Complex c1 = new Complex();
        Complex c2 = new Complex();
        Complex c3 = new Complex();
        
        System.out.println("Enter the real value of first number:");
        c1.real = sc.nextInt();
        System.out.println("Enter the imaginary value of first number:");
        c1.imaginary = sc.nextInt();

        System.out.println("Enter the real value of second number:");
        c2.real = sc.nextInt();
        System.out.println("Enter the imaginary value of second number:");
        c2.imaginary = sc.nextInt();
        boolean flag = true;
        while(flag){
            System.out.println("Choose any one from below : ");
            System.out.println("1. Add Complex numbers .");
            System.out.println("2. Substraction of Complex Numbers .");
            System.out.println("3. Compare Complex Numbers .");
            System.out.println("4. Quit");
            System.out.println("Enter your choice : ");
            int ch = sc.nextInt();

            switch(ch){
                case 1 -> {
                    c3 = c1.addComplex(c2);
                    System.out.println(" Result sum : "+c3.real+" + "+c3.imaginary+"i;");
                }
                case 2 -> {
                    c3 = c1.subComplex(c2);
                    System.out.println(" Result Substraction : "+c3.real+" + "+c3.imaginary+"i;");
                }
                case 3 -> {
                    boolean flag1 = c1.isEqual(c2);
                    if(flag1){
                        System.out.println("The Complex numbers are equal!");
                    }else{
                        System.out.println("The Complex numbers are not equal!");
                    }
                }
                case 4 -> {
                    flag = false;
                }
                default -> System.out.println("Choose an apropriate option!");
            }
        }
        sc.close();
    }
}


class Complex{
    int real;
    int imaginary;

    public Complex(){
        this.real = 0;
        this.imaginary = 0;
    }

    public Complex(int r,int i){
        this.real = r;
        this.imaginary = i;
    }

    public void disply(){
        System.out.println(this.real+"+ "+this.imaginary+"i");
    }

    public Complex addComplex(Complex c2){
        Complex c3 = new Complex();
        c3.real = this.real + c2.real;
        c3.imaginary = this.imaginary + c2.imaginary;
        return c3;
    }
    
    public Complex subComplex(Complex c2){
        Complex c3 = new Complex();
        c3.real = this.real - c2.real;
        c3.imaginary = this.imaginary - c2.imaginary;
        return c3;
    }

    public boolean isEqual(Complex c2){
        return this.real == c2.real && this.imaginary == c2.imaginary;
    }
}