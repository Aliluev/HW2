package chapter2;

// Class Car
public class Ex9 {
    private int x;
    private int move=0;//счётчик передвижения
    private int fuel;
    private int fuelConsumption; //км/л

    public Ex9(int fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
        this.x=0;
        this.fuel=0;
    }

    public void refueling(int fuel){
        this.fuel=fuel;
    }

    // расстояние(км)=скорость(км/л)*топливо(л);
    public void drive(int x){
        if(x<=fuelConsumption*fuel){
            this.x=x;
            this.fuel=this.fuel-x/fuelConsumption;
            move+=x;
        }else System.out.println("Недостаточно топлива для поездки, выполните метод refueling");
    }

    public int getFuel() {
        return fuel;
    }

    public int getMove() {
        return move;
    }

    @Override
    public String toString() {
        return "Car={x="+x+",moveTrip="+move+",fuel="+fuel+",fuelConsumption="+fuelConsumption+"}";
    }

    public static void main(String[] args) {
        Ex9 car=new Ex9(10);
        car.refueling(40);
        car.drive(30);
        System.out.println(car.toString());
    }
}
