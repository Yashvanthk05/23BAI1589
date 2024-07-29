import java.util.Scanner;

class pattern{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the Number of Rows: ");
        int rows = scanner.nextInt();
        for(int i=0;i<rows;i++){
            System.out.print("*");
            for(int j=0;j<(rows-2);j++){
                if(i==0 || i==(rows-1)){
                    System.out.print("***");
                }else{
                    System.out.print("   ");
                }
            }
            System.out.print("*");
            System.out.print("\n");
        }
    }
}