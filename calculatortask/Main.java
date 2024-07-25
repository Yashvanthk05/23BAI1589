import java.util.Scanner;


public class Main{
   public static void main(String[] args){
       double num1=0,num2=0;
       Scanner scanner = new Scanner(System.in);
       String choice = "R";
       int c=0;
       while(!choice.equalsIgnoreCase("q")){
           System.out.println("Menu\n1.Addition\n2.Subtraction\n3.Multiplication\n4.Division\n5.Exit");
           c = scanner.nextInt();
           scanner.nextLine();
           if(c>=1 && c<=4){
               System.out.print("Enter Number 1: ");
               num1=scanner.nextDouble();
               scanner.nextLine();
               System.out.print("Enter Number 2: ");
               num2=scanner.nextDouble();
               scanner.nextLine();
           }
           switch(c){
               case 1:
                   System.out.println("Result of Addition: "+(num1+num2));
                   break;
               case 2:
                   System.out.println("Result of Subtraction: "+(num1-num2));
                   break;
               case 3:
                   System.out.println("Result of Multiplication: "+(num1*num2));
                   break;
               case 4:
                   System.out.println("Result of Division: "+(num1/num2));
                   break;
               case 5:
                   System.out.println("Exiting....");
                   choice="q";
                   break;
               default:
                   System.out.println("Invalid Choice!!");
                   break;
           }
           if(!choice.equalsIgnoreCase("q")){
                System.out.println("Run(R) || Exit(Q)");
                choice = scanner.nextLine();
           }
           
       }


      
   }
}
