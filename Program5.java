import java.util.Scanner;

public class Program5 {

    public static int usrstrcmp(String str1,String str2){
        int len1 = str1.length();
        int len2 = str2.length();
        int minLength = Math.min(len1, len2);

        for (int i = 0; i < minLength; i++) {
            if (str1.charAt(i)<str2.charAt(i)) {
                return -1;
            }else if (str1.charAt(i)>str2.charAt(i)) {
                return 1;
            }
        }

        if(len1<len2){
            return -1;
        }else if (len1>len2){
            return 1;
        }

        return 0;
    }

    public static int usrstrcmp(String s1,String s2,int n){
        if(n>s1.length()){
            n = s1.length();
        }

        String subStr1 = customSubString(s1, 0, n);
        String subStr2 = customSubString(s2, 0, n);
        
        return usrstrcmp(subStr1, subStr2);
    }

    public static String customSubString(String s1,int start,int end){

        if(start>end || start<0 || end > s1.length()){
            throw new IllegalArgumentException("Invalid substring range");
        }

        return s1.substring(start, end);
    }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first String : ");
        String s1 = sc.nextLine();
        System.out.println("Enter the Second String : ");
        String s2 = sc.nextLine();
        
        int result1 = usrstrcmp(s1, s2);
        if(result1==0){
            System.out.println("Strings are equal.");
        }else if (result1<0) {
            System.out.println("First string is lexicographicallly samller");
        }else{
            System.out.println("First string is lexicographically larger.");
        }

        int result2 = usrstrcmp(s1, s2, 3);
        if(result2==0){
            System.out.println("The first 3 characters of the strings are equal.");
        }else if (result2<0) {
            System.out.println("First 3 characters of the first string are smaller.");
        }else{
            System.out.println("First 3 characters of the first string are larger.");
        }
        sc.close();
    }
}
