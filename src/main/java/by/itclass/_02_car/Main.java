package by.itclass._02_car;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        var ctx = new ClassPathXmlApplicationContext("02_car.xml");
        var cars = List.of(
                (SimpleCar) ctx.getBean("car1"),
                (SimpleCar) ctx.getBean("car2"),
                (SimpleCar) ctx.getBean("car3"),
                (SimpleCar) ctx.getBean("car4"),
                (SimpleCar) ctx.getBean("car5"),
                (SimpleCar) ctx.getBean("car6"),
                (SimpleCar) ctx.getBean("car7")
        );
        cars.forEach(System.out::println);
    }
}
