package interview;

import java.util.Arrays;

public class sortng {
    public static void main(String[] args) {
        int[]arr={22,33,44,2222,3333,4,5,6,77777,8888,9999};
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
