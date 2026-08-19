package arrlist;

import java.util.ArrayList;
import java.util.Collections;

public class GetSetRemove {
    public static void main(String[] args) {
        ArrayList<Integer> abc=new ArrayList<>();

        abc.add(1);
        abc.add(2);
        abc.add(3);
        abc.add(4);
        abc.add(null);//arraylist wala null values store karanna puluwan
        abc.add(5);

        System.out.println(abc.size());
        System.out.println(abc.get(1));
        abc.remove(0);

        System.out.println(abc.isEmpty());

        System.out.println(abc.contains(3));

        for(int i=0;i<=abc.size();i++){
            System.out.println(abc.get(i));
        }

        //sort
        Collections.sort(abc);
        //reverse
        Collections.reverse(abc);





    }
}
