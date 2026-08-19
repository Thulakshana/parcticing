package charat;

public class basic {
    public static void main(String[] args) {

        String name="sihara";
        System.out.println(name.length()); //6

        System.out.println(name.charAt(name.length()-1)); //last character

        for(int i=0;i<name.length();i++){
            System.out.println(name.charAt(i));
        }

        String reverrs="";

        for(int g=name.length()-1;g>=0;g--){
            reverrs=reverrs+name.charAt(g);
        }
        System.out.println(reverrs);



    }
}
