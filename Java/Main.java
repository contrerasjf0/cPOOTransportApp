package Java;

class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!!");

        UberX uberX = new UberX("342DERA", new Account("Daniel Santos", "ERT532"), "Kia", "Rio");

        uberX.setPassenger(4);

        uberX.printDataCar();
        
        /*Car car2 = new Car("ER354", new Account("Jose Jose", "URYRW23"));

        car2.passenger = 3;

        car2.printDataCar();*/
    }
}