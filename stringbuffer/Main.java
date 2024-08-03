public class Main{
    public static void main(String[] args){
        StringBuffer name = new StringBuffer("Yashvanth ");
        name.append("Karunakaran");
        System.out.println(name.substring(0,4));
        System.out.println(name);
        name.insert(0,"Hello ");
        System.out.println(name);
        name.replace(0,5,"Hi");
        System.out.println(name);
        System.out.println(name.delete(0,3));
        System.out.println(name.reverse());
    }
}
