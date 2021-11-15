package chapter1;

public class Ex1 {

    public static void main(String[] args) {
        int x = 300;
        Ex1 ex1 = new Ex1(x);
        System.out.println(ex1.toString());
    }

    private int number;

    public Ex1(int number) {
        this.number=number;
    }

    public String getBinary(){
        String bin = Integer.toBinaryString(number);
        return bin;
    }

    public String getOctal(){
        String octal=Integer.toOctalString(number);
        return octal;
    }

   public String getHexadecimal(){
       String hexadecimal=Integer.toHexString(number);
       return hexadecimal;


    }


    @Override
    public String toString() {
        return "number="+number+"\n"+"binary="+this.getBinary()+"\n"+"octal="+this.getOctal()+"\n"+"hexadecimal="+this.getHexadecimal();
    }
}

