package chapter1;

import java.math.BigInteger;

public class Ex6 {

    static String factorial(int n){
        BigInteger result=new BigInteger("1");
        for(Integer i=1;i<=n;i++){
            BigInteger iter=new BigInteger(i.toString());
           result=result.multiply(iter);
        }
        return result.toString();
    }

    public static void main(String[] args) {
        System.out.println(factorial(1000));

    }
}
