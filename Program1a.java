import java.util.Scanner;

public class Program1a {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the height of the Rectangle : ");
        Double height = scanner.nextDouble();
        
        System.out.println("Enter the width of the Rectangle : ");
        Double width = scanner.nextDouble();

        Double areaOfRectangle = height * width;

        System.out.println("The Area of Rectangle is : "+areaOfRectangle);
    }
}