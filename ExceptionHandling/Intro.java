public class Intro{
    public static void main(String[] args){
        try{
            int x=100/0;
            System.out.println("No Exception..");//will not be executed if an error is occurred in the abovestatement
        }catch(ArithmeticException e){
            System.out.println("Arithmetic Exception "+e); //default error message
            System.out.println("Arithmetic Exception Divison by Zero Error"); //custom message
        }
        System.out.println("Rest of the Code....");
    }
}
