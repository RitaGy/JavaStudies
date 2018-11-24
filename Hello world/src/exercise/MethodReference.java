package exercise;

import hw03.Car;

public class MethodReference {

    public static void increment(int i){
        i = i+1;
        System.out.println(i);
    }

    public static void paintBlue(Car car){
        car.color = "blue";
    }

    public static void main(String[] args){
        int hundred = new Integer(100);
        Integer pv = Integer.parseInt("23");
        increment(hundred);
        System.out.println(hundred);

        Car car = new Car();
        car.color = "red";
        System.out.println(car.color);
        paintBlue(car);
        System.out.println(car.color);
    }
}
