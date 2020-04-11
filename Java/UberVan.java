package Java;

import java.util.ArrayList;
import java.util.Map;

public class UberVan extends Car {
    Map<String, Map<String, Integer>> typeCarAccepted;
    ArrayList<String> seatsMaterial;
    String brand;
    String model;
    Integer passenger;

    public UberVan(String license, Account driver, String brand, String model/*, 
                    Map<String, Map<String, Integer>> typeCarAccepted, ArrayList<String> seatsMaterial*/){
        super(license, driver);

        this.brand = brand;
        this.model = model;
        /*this.typeCarAccepted = typeCarAccepted;
        this.seatsMaterial = seatsMaterial;*/

    }
    @Override
    public void setPassenger(Integer passenger) {
        
        if(passenger == 6){
            this.passenger = passenger;
        }else{
            System.out.println("You need to set 6 passangers");
        }
    }
}