package stalls;

import behaviours.ISecurity;
import people.Visitor;

public class TobaccoStall extends Stall implements ISecurity {

    public TobaccoStall(String name, String ownerName, ParkingSpot parkingSpot, int rating) {
        super(name, ownerName, parkingSpot, rating);
    }

    public boolean isAllowed(Visitor visitor) {
        boolean isAllowed = false;
        if (visitor.getAge() >= 18) {
            isAllowed = true;
        }
        return isAllowed;
    }

}
