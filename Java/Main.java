package Java;

class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!!");
        Car car = new Car();

        car.license = "342DERA";
        car.driver = "Daniel Santos";
        car.passegenger = 2;

        car.printDataCar();
        
        Car car2 = new Car();

        car2.license = "ER354";
        car2.driver = "Jose Jose";
        car2.passegenger = 3;

        car2.printDataCar();
    }
}