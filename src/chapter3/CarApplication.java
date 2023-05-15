package chapter3;

public class CarApplication {
    public static void main(String[] args) {

        Car car = new Car("lexus", "2019", 1_000_000 );
        Car benz = new Car("rangeRover", "2018", 5_000_000);

        System.out.println("This it the latest version of: " + car.getModel());
        System.out.println("The current version of :" + car.getYear() + " model");
        System.out.println("The price of lexus  is: " + car.getPrice());
        System.out.println("I am going to give you a discount of: "+ car.getPrice());

        System.out.println("This it the latest version of: " + benz.getModel());
        System.out.println("The current version of: " + benz.getYear() + " model");
        System.out.println("The price of lexus  is: " + benz.getPrice());
        benz.discount2();
        System.out.println("I am going to give you a discount of: "+ benz.getPrice());














    }
}
