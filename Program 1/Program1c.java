public class Program1c {

    public static void main(String[] args) {
        int[] array = {25,34,12,21,1,3,7,5,33,26,79,75,79};
        System.out.println("The Array in Ascending Order :");
        AscendingBubbleSort(array);
        displayArray(array);

        System.out.println("The Array in Discending Order :");
        DiscendingBubbleSort(array);
        displayArray(array);
    }

    public static void AscendingBubbleSort(int[] array){
        int n = array.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n-1; j++) {
                if(array[j]>array[j+1]){
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
    }
    
    public static void DiscendingBubbleSort(int[] array){
        int n = array.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n-1; j++) {
                if(array[j]<array[j+1]){
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
    }
    
    public static void displayArray(int[] array){
        for (int i : array) {
            System.out.print(i+" ");
        }
        System.out.println();
    }
}

