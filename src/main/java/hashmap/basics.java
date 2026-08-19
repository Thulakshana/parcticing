package hashmap;

import java.util.HashMap;

public class basics {
    public static void main(String[] args) {
        //create hashmap
        HashMap<String,String> abc=new HashMap<>();

        HashMap<Integer,String> ab=new HashMap<>();

        //add data
        ab.put(1,"thula");
        ab.put(2,"kalana");
        ab.put(3,"mawitha");
        ab.put(4,"kvidu");

        //get data
        System.out.println(ab.get(1)); //key
        System.out.println(ab.get(3));

//key search
        System.out.println(ab.containsKey(1));
        System.out.println(ab.containsKey(100));

        //contain value
        System.out.println(ab.containsValue("mawitha"));
        System.out.println(ab.containsValue("malan"));

//size
        System.out.println(ab.size());

        //remove
        ab.remove(1); //key

        //show keys
        System.out.println(ab.keySet());

        //values show
        System.out.println(ab.values());

        //values and key
        System.out.println(ab.entrySet());




    }
}
