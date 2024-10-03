public class Main{
    public static void main(String[] args){
        try{
            int a[]=new int[5];
            a[5]=30/0;
        }catch(ArithmeticException e){
            System.out.println("Arithmetic Exception Occurs");
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Array Index Out of Bounds Exception");
        }catch(Exception e){
            System.out.println("Parent Exception Occurs");
        }
        System.out.println("Rest of the Code..");
    }
}
