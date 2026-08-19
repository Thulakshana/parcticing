package arrlist;

import java.util.ArrayList;
import java.util.Scanner;

public class CreateArrayList {
    public static void main(String[] args) {
        //create array list

        ArrayList<Integer> abc=new ArrayList<>();



        Scanner bb=new Scanner(System.in);
        for(int i=0;i<=5;i++){
            System.out.println("enter values ");
            abc.add(bb.nextInt());
        }
        System.out.println(abc.size());





    }
}
