package chapter1;

import java.math.BigInteger;

public class Ex6 {

    static String factorial(int n){
       // int summa=1;
        BigInteger summa=new BigInteger("1");
        for(Integer i=1;i<=n;i++){
           //summa*=i;
            BigInteger iter=new BigInteger(i.toString());
           summa=summa.multiply(iter);
        }
        return summa.toString();
    }

    public static void main(String[] args) {
        System.out.println(factorial(1000));

    }
}
