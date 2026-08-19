package interview;

public class prime {
    public static void main(String[] args) {
        int number=7;
        Boolean isprime=true;

        if(number<=0){
            isprime=false;
        }else{
            for(int i=2;i<number;i++){
                if(number%i==0){
                    isprime=false;
                    break;
                }
            }
        }

        if(!isprime){
            System.out.println("not prime");
        }else{
            System.out.println("prime");
        }

    }
}
