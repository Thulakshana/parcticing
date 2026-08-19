package interview;

import java.util.Scanner;

public class evenodd {
    public static void main(String[] args) {
        Scanner bb=new Scanner(System.in);
        System.out.println("enter value ");
        int num=bb.nextInt();
        if(num%2==0){
            System.out.println("even number");
        }else{
            System.out.println("odd number");
        }
    }
}
