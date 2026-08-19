package interview;

import java.util.Scanner;

public class findlargenumber {
    public static void main(String[] args) {
        Scanner cs=new Scanner(System.in);
        int[]arr=new int[5];
        for(int i=0;i<arr.length;i++){
            System.out.println("enter number "+(i+1+" "));
            arr[i]=cs.nextInt();
        }
        int large=0;

        for(int i=0;i<arr.length;i++){
            if(arr[i]>large){
                large=arr[i];
            }
        }
        System.out.println(large);
    }
}
