package stalls;

import org.junit.Before;
import org.junit.Test;
import people.Visitor;

import static org.junit.Assert.assertEquals;

public class TobaccoStallTest {

    TobaccoStall tobaccoStall;

    @Before
    public void setUp() throws Exception {
        tobaccoStall = new TobaccoStall("Jacks Drum", "Jack Jarvis", ParkingSpot.B1, 2);
    }

    @Test
    public void hasName() {
        assertEquals("Jacks Drum", tobaccoStall.getName());
    }

    @Test
    public void hasOwner() {
        assertEquals("Jack Jarvis", tobaccoStall.getOwnerName());
    }

    @Test
    public void hasParkingSpot() {
        assertEquals(ParkingSpot.B1, tobaccoStall.getParkingSpot());
    }

    @Test
    public void canAllowAccessDueToAge_true() {
        Visitor visitor = new Visitor(19, 190, 20);
        assertEquals(true, tobaccoStall.isAllowed(visitor));
    }

    @Test
    public void canAllowAccessDueToAge_false() {
        Visitor visitor = new Visitor(16, 190, 20);
        assertEquals(false, tobaccoStall.isAllowed(visitor));
    }
}
