public class Main{
    public static void main(String[] args){
        StringBuilder txt = new StringBuilder("Java");
        System.out.println(txt);
        System.out.println(txt.insert(4," is Best"));
        System.out.println(txt.append(" Programming Language"));
        System.out.println(txt.replace(4,12," is a"));
        System.out.println(txt.delete(7, 9));
        System.out.println(txt.reverse());
    }
}
