package interview;

import java.util.Arrays;

public class findsecondlarge {
    public static void main(String[] args) {
        int[]arr={2,7,1,6,44,555,6666,7777};

        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]<arr[j]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;

                }
            }


        }
        System.out.println(arr[1]);
        System.out.println(Arrays.toString(arr));
    }
}
