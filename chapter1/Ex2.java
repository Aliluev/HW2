package chapter1;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        System.out.println("Введите число");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int circle = 360;
        System.out.println("градусы методом (%)= " + (number % circle + circle) % circle);
        System.out.println("градусы методом (floorMod)= " + Math.floorMod(number, circle));
    }
}
