import java.util.Scanner;

public class Program1b {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Size of an Array :");
        int size = sc.nextInt();
        
        int[] array1 = new int[size];
        int[] array2 = new int[size];
        int[] result = new int[size];

        System.out.println("Enter the values for Array1 :");
        for (int i = 0; i < size; i++) {
            System.out.println("Enter "+(i+1)+"Element Value :");
            array1[i] = sc.nextInt();
        }

        System.out.println("Enter the values for Array2 :");
        for (int i = 0; i < size; i++) {
            System.out.println("Enter "+(i+1)+"Element Value :");
            array2[i] = sc.nextInt();
        }

        for (int i = 0; i < size; i++) {
            result[i] = array1[i]*array2[i];
        }

        System.out.println("The Result Of the Array Multiplication :");
        for (int i = 0; i < result.length; i++) {
            System.out.println("Element "+(i+1)+": "+result[i]);
        }

        sc.close();
    }
    
}
