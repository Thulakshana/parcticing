package interview;

public class findsmall {
    public static void main(String[] args) {
        int[]arr={100,3,6,4,990};

        int small=arr[0];

        for(int i=0;i<arr.length;i++){
            if(arr[i]<small){
                small=arr[i];
            }
        }
        System.out.println(small);
    }
}
