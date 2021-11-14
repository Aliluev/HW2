package chapter1;

import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        System.out.println("Введите три числа");
        Scanner sc = new Scanner(System.in);
        int number1 = sc.nextInt();
        int number2 = sc.nextInt();
        int number3 = sc.nextInt();
        if(number1>number2){
            if(number1>number3){
                System.out.println("Наибольшое число "+number1);
            }
        }else {
            if (number2>number3){System.out.println("Наибольшое число "+number2);}else {System.out.println("Наибольшое число "+number3);}
        }

        //System.out.println(number1+" "+number2+" "+number3);
    }
}
