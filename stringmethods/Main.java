public class Main{
    public static void main(String[] args){
        String fname = "Yashvanth";
        String lname = "Karunakaran";
        String name = String.format("My Name is %s %s",fname,lname);
        byte fnamebytes[] = fname.getBytes();
        System.out.println("FirstName: "+fname);
        System.out.printf("LastName: %s\n",lname);
        System.out.println(name);
        System.out.println(fname.compareTo(lname)); //if positive fname>lname
        System.out.println(lname.compareToIgnoreCase(fname));
        System.out.println(fname.concat(" ").concat(lname));
        System.out.println(fname.indexOf("van"));
        System.out.println(lname.contains("karuna"));
        System.out.println(lname.charAt(3));
        System.out.println(lname.endsWith("ran"));
        System.out.println(lname.startsWith("Karuna"));
        for(int i:fnamebytes){
            System.out.print(i+" ");
        }
        System.out.println();
        System.out.println(fname.substring(0,4));
        System.out.println(fname.lastIndexOf("a"));
    }
}