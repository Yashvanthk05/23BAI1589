public class Main{
    public static void main(String[] args){
        String txt = "Yashvanth is a good boy";
        String fname = "Yashvanth";
        String lname = "Karunakaran";
        System.out.println(txt.indexOf(fname)); //indexOf method
        System.out.println(txt.indexOf("boy")); //indexOf method
        System.out.println(fname+" "+lname); //String concatenation
        System.out.println(fname.concat(" ").concat(lname)); //String concatenation using concat function
        System.out.println(fname+7);
        System.out.println("100"+20);
    }
}