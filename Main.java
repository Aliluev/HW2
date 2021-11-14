import chapter1.Ex1;

public class Main {

    public static int floorMod2(int x, int y) {
        int mod = x % y;
        // if the signs are different and modulo not zero, adjust result
        System.out.println(mod);
       // System.out.println(mod != 0);
        System.out.println(mod ^ y);
        System.out.println((mod ^ y) < 0);
        if ((mod ^ y) < 0 && mod != 0) {
            mod += y;
            System.out.println("Зашёл");
            System.out.println(mod);
        }
        System.out.println(mod);
        return mod;
    }

    public static void main(String[] args) {
        System.out.println("------------------Ex1--------------------");
        int x=300;
        Ex1 ex1=new Ex1(x);
        System.out.println(ex1.toString());

        int a=2;
        int b=3;
      floorMod2(a,b);
    }
}
