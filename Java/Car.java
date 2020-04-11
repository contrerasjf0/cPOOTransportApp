package Java;

class Car {
    Integer id;
    String license;
    Account driver;
    private Integer passenger;

    public Car(String license, Account driver){
        this.license = license;
        this.driver = driver;
    }

    void printDataCar(){
        System.out.println("License: " + this.license + "Driver name: "+ this.driver.name + "Passangers: " + this.passenger);
    }

    public Integer getPassenger(){
        return this.passenger;
    }

    public void setPassenger(Integer passenger){
        if(passenger == 4){
            this.passenger = passenger;
        }else{
            System.out.println("You need to set 4 passangers");
        }
    }
}
