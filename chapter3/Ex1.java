package chapter3;

public class Ex1 {

    public static double average(Measurable[] objects) {
        int summa = 0;
        for (int i = 0; i < objects.length; i++) {
            summa += objects[i].getMeasure();
        }
        return (summa / objects.length);
    }

    public static void main(String[] args) {
        Employee[] employee = {new Employee("Nikita", 20000), new Employee("Dima", 30000), new Employee("Ivan", 10000)};

        System.out.println(average(employee));

    }

}
