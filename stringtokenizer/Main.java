import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args){
        String txt = "My name is Yashvanth Karunakaran";
        String txt1 = "My,name,is,Yashvanth,Karunakaran";
        StringTokenizer st1 = new StringTokenizer(txt1);
        System.out.println("-----------------------------");
        System.out.println("Output for nextToken(String del): "+ st1.nextToken(","));
        StringTokenizer st = new StringTokenizer(txt," ");
        System.out.println("-----------------------------");
        System.out.println("Number of Tokens in txt: "+st.countTokens());
        System.out.println("-----------------------------");
        while(st.hasMoreElements()){
            System.out.println(st.nextToken());
        }
        System.out.println("-----------------------------");
        String txt3="My name is Yashvanth Karunakaran .I\'m a Good Boy. I think I can get S grade in computer programming java. Rajiv Vincent is my java faculty";
        StringTokenizer st2 = new StringTokenizer(txt3," ");
        while(st2.hasMoreTokens()){
            System.out.println(st2.nextElement());
        }
        System.out.println("-----------------------------");
    }
}
