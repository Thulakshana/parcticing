package charat;

public class bacic2 {
    public static void main(String[] args) {
        String name="thulakshan";

        System.out.println(name.charAt(name.length()-1));

        String rev="";

        for(int i=name.length()-1;i>=0;i--){
            rev=rev+name.charAt(i);
        }
        System.out.println(rev);
    }
}
