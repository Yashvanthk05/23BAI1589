import java.util.Arrays;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the Size of the Array: ");
        int n=scanner.nextInt();
        String txt[] = new String[n];
        int arr1[]=new int[n];
        System.out.println("Initial Value Stored in Integer Array: "+Arrays.toString(arr1));
        System.out.println("Initial Values Stored in String Array: "+Arrays.toString(txt));
        for(int i=0;i<n;i++){
            System.out.printf("Enter Element %d of Integer Array: ",i+1);
            arr1[i]=scanner.nextInt();
        }
        scanner.nextLine();
        for(int i=0;i<n;i++){
            System.out.printf("Enter Element %d of String Array: ",i+1);
            txt[i]=scanner.nextLine();
        }
        System.out.println("Final Value Stored in Integer Array: "+Arrays.toString(arr1));
        System.out.println("Final Values Stored in String Array: "+Arrays.toString(txt));
    }
}
