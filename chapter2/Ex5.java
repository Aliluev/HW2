package chapter2;

// class Point
public class Ex5 {

    private final double x;
    private final double y;

    public Ex5(){
        this.x=0;
        this.y=0;
    }

    public Ex5(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public Ex5 translate(double dx,double dy){
        Ex5 point=new Ex5(this.getX()+dx,this.getY()+dy);
        return point;
    }

    public Ex5 scale(double ratio){
        Ex5 point=new Ex5(this.getX()*ratio,this.getY()*ratio);
        return point;
    }

    @Override
    public String toString() {
        return "Point=[x="+x+",y="+y+"]";
    }

    public static void main(String[] args) {
        Ex5 p = new Ex5(3, 4).translate(1, 3).scale(0.5);
        System.out.println(p.toString());
    }

}
