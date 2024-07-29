import java.util.Scanner;

class lcm{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number 1: ");
        int num1=scanner.nextInt();
        System.out.print("Enter number 2: ");
        int num2=scanner.nextInt();
        int max = Math.max(num1,num2);
        while(max%num1!=0 || max%num2!=0){
            max++;
        }
        System.out.printf("LCM of %d and %d is: %d",num1,num2,max);
    }
}