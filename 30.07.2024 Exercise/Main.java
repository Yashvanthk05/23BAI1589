import java.util.Scanner;

public class Main {
    public static int[] bubbleSort(int arr[]){
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    int temp = arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        return arr;
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the Number of Elements in the Array: ");
        int n = scanner.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            System.out.printf("Enter the %d Element: ",i+1);
            arr[i]=scanner.nextInt();
        }
        arr = bubbleSort(arr);
        System.out.printf("The Third Largest Element in the Array is %d",arr[n-3]);
    }    
}
