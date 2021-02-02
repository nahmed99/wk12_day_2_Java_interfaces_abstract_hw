package attractions;

import org.junit.Before;
import org.junit.Test;
import people.Visitor;

import static org.junit.Assert.assertEquals;

public class RollercoasterTest {

    RollerCoaster rollerCoaster;

    @Before
    public void setUp() {
        rollerCoaster = new RollerCoaster("Blue Ridge", 10);
    }

    @Test
    public void hasName() {
        assertEquals("Blue Ridge", rollerCoaster.getName());
    }

    @Test
    public void hasRating() {
        assertEquals(10, rollerCoaster.getRating());
    }

    @Test
    public void hasVisitCount() {
        assertEquals(0, rollerCoaster.getVisitCount());
    }

    @Test
    public void canAllowAccesDueToAgeAndHeight_true() {
        Visitor visitor = new Visitor(13, 190, 20);
        assertEquals(true, rollerCoaster.isAllowed(visitor));
    }

    @Test
    public void canAllowAccesDueToAge_false() {
        Visitor visitor = new Visitor(12, 190, 20);
        assertEquals(false, rollerCoaster.isAllowed(visitor));
    }

    @Test
    public void canAllowAccesDueToHeight_false() {
        Visitor visitor = new Visitor(25, 144, 20);
        assertEquals(false, rollerCoaster.isAllowed(visitor));
    }

    @Test
    public void canGetDefaultPrice() {
        assertEquals(8.40, rollerCoaster.defaultPrice(), 0.0);
    }

    @Test
    public void canGetPriceFor_default() {
        Visitor visitor = new Visitor(25, 144, 20);
        assertEquals(8.40, rollerCoaster.priceFor(visitor), 0.0);
    }

    @Test
    public void canGetPriceFor_tallPerson() {
        Visitor visitor = new Visitor(25, 201, 19);
        assertEquals(16.80, rollerCoaster.priceFor(visitor), 0.0);
    }


}
