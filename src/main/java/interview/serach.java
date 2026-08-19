package interview;

import java.util.Scanner;

public class serach {
    public static void main(String[] args) {
        int[]arr={1,2,3,4,5};
        Scanner cv=new Scanner(System.in);
        System.out.println("enter values ");
        int search=cv.nextInt();
        boolean found=false;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==search){
                found=true;
                System.out.println(arr[i]);
                break;
            }


        }if(!found){
            System.out.println("not found");
        }

    }
}
