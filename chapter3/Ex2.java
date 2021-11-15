package chapter3;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;

public class Ex2 {
    static public Measurable largest (Measurable [ ] objects){
        HashMap<Double,Measurable> library = new HashMap<>();
        double[] array=new double[objects.length];
        for(int i=0;i<objects.length;i++){
            library.put(objects[i].getMeasure(),objects[i]);
            array[i]=objects[i].getMeasure();
        }
        Arrays.sort(array);
        return library.get(array[objects.length-1]);
    }

    public static void main(String[] args) {
        Employee[] employee = {new Employee("Nikita", 20000), new Employee("Dima", 30000), new Employee("Ivan", 10000)};

        Employee largestEmployee= (Employee) largest(employee);
        System.out.println(largestEmployee.toString());

    }

}
