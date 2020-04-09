package Java;

class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!!");

        Car car = new Car("342DERA", new Account("Daniel Santos", "ERT532"));

        car.passegenger = 2;

        car.printDataCar();
        
        Car car2 = new Car("ER354", new Account("Jose Jose", "URYRW23"));
        
        car2.passegenger = 3;

        car2.printDataCar();
    }
}