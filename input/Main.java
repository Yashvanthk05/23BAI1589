import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        scanner.nextLine();
        double num1 = scanner.nextDouble();
        scanner.nextLine();
        String name = scanner.nextLine();
        boolean cond = scanner.nextBoolean();
        System.out.println("Inputs\nInt: "+num+"\nDouble: "+num1+"\nString: "+name+"\nBoolean: "+cond);
    }
}