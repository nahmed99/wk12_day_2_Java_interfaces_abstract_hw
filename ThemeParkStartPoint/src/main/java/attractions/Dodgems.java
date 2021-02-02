package attractions;

import behaviours.ITicketed;
import people.Visitor;

public class Dodgems extends Attraction implements ITicketed {

    private double startingPrice;

    public Dodgems(String name, int rating) {
        super(name, rating);

        startingPrice = 4.50;
    }

    @Override
    public double defaultPrice() {
        return startingPrice;
    }

    @Override
    public double priceFor(Visitor visitor) {
        double price = startingPrice;
        if (visitor.getAge() < 12)
            price /= 2;

        return price;
    }
}
