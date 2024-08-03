public class Main{
    public static void main(String[] args){
        StringBuffer name = new StringBuffer();
        System.out.println(name.capacity());
        name.append("Yashvanth");
        System.out.println(name.capacity());
        name.append(" Karunakaran");
        System.out.println(name.capacity());
        name.ensureCapacity(30);
        System.out.println(name.capacity());
        name.ensureCapacity(50);
        System.out.println(name.capacity());
        name.ensureCapacity(71);
        System.out.println(name.capacity());
    }
}
