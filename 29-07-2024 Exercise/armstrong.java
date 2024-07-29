import java.util.Scanner;

class armstrong{
    public static boolean check_armstrong(int num){
        int no_digits = 0;
        int temp=num;
        while(temp>0){
            no_digits++;
            temp/=10;
        }
        int check = 0;
        temp = num;
        while(temp>0){
            check += Math.pow((temp%10),no_digits);
            temp/=10;
        }
        if(check==num){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the Number 1: ");
        int num1=scanner.nextInt();
        System.out.print("Enter the Number 2: ");
        int num2=scanner.nextInt();
        int flag=0;
        for(int i=num1;i<=num2;i++){
            if(check_armstrong(i)){
                System.out.printf("%d is Armstrong Number!!\n",i);
                flag++;
            }
        }
        if(flag==0){
            System.out.printf("No Armstrong number is found");
        }
    }
}