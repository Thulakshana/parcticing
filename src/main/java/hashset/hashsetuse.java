package hashset;

import java.util.ArrayList;
import java.util.HashSet;

public class hashsetuse {
    public static void main(String[] args) {
        ArrayList<Integer> abc=new ArrayList<>();

        abc.add(1);
        abc.add(10);
        abc.add(1);
        abc.add(20);
        abc.add(1);
        abc.add(50);

        HashSet<Integer> unique=new HashSet<>(abc);

        unique.size();


    }
}
