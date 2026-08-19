package hashset;

import java.util.HashSet;

public class basics {
    public static void main(String[] args) {
        //create hashset
        HashSet<Integer> an=new HashSet<>();

        //add values
        an.add(10);
        an.add(20);

        boolean result=an.add(50);

        //contains
        an.contains(10);

        //remove
        an.remove(10);

        //size
        an.size();







    }
}
