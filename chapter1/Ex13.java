package chapter1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Ex13 {

    public static int rnd(int min, int max)
    {
        max -= min;
       // System.out.println(((int)(Math.random() * ++max) + min));
        return (int)(Math.random() * ++max) + min;

    }

    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        final int min = 1; // Минимальное число для диапазона
        final int max = 49; // Максимальное число для диапазона
        //final int rnd = rnd(min, max);

        for(int i=1;i<=49;i++){
            list.add(rnd(min,max));
        }
        System.out.println(list.toString());

        System.out.println("Введите номера list которые хотите удалить(6)");
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<6;i++){
            int index1 = sc.nextInt();
            list.remove(index1);
        }

        Collections.sort(list);
        System.out.println(list.toString());
    }
}
