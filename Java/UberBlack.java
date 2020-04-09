package Java;

import java.util.ArrayList;
import java.util.Map;

public class UberBlack extends Car {
    Map<String, ArrayList<String, Integer>> typeCarAccepted;
    ArrayList<String> seatsMaterial;
    String brand;
    String model;

    public UberBlack(String license, Account driver, String brand, String model, Map<String, 
                    ArrayList<String, Integer>> typeCarAccepted, ArrayList<String> seatsMaterial){
        super(license, driver);

        this.brand = brand;
        this.model = model;
        this.typeCarAccepted = typeCarAccepted;
        this.seatsMaterial = seatsMaterial;

    }
}