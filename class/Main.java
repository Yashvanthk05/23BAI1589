import java.util.Scanner;

class Student{
    String name;
    int age;
    String reg_no;
    Student(String reg_no,String name,int age){
        this.name=name;
        this.reg_no = reg_no;
        this.age=age;
    }
    void getData(){
        System.out.println("-----------------------------------");
        System.out.printf("Hi %s,\nYour %d years old\n Your Registration Number is %s\n",name,age,reg_no);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Student arr[];
        arr = new Student[5];
        String name="";
        int age=0;
        String reg_no="";
        for(int i=0;i<5;i++){
            System.out.printf("Enter %d Student Name: ",i+1);
            name=scanner.nextLine();
            System.out.printf("Enter %d Student Age: ",i+1);
            age = scanner.nextInt();
            scanner.nextLine();
            System.out.printf("Enter %d Student Registration Number: ",i+1);
            reg_no=scanner.nextLine();
            arr[i]=new Student(reg_no,name,age);
        }
        for(int i=0;i<5;i++){
            arr[i].getData();
        }
    }
}
