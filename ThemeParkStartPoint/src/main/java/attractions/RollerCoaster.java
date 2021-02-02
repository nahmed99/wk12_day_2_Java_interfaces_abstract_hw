package attractions;

import behaviours.ISecurity;
import behaviours.ITicketed;
import people.Visitor;

public class RollerCoaster  extends Attraction implements ISecurity, ITicketed {

    private double startingPrice;

    public RollerCoaster(String name, int rating) {
        super(name, rating);

        startingPrice = 8.40;
    }

    public boolean isAllowed(Visitor visitor) {
        if (visitor.getHeight() > 145 && visitor.getAge() > 12) {
            return true;
        }
        return false;
    }

    @Override
    public double defaultPrice() {
        return startingPrice;
    }

    @Override
    public double priceFor(Visitor visitor) {
        double price = startingPrice;
        if (visitor.getHeight() > 200)
            price *= 2;

        return price;
    }
}
