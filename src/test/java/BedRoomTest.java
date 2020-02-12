import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BedRoomTest {
    private BedRoom bedRoom;
    private Guest guest;

    @Before
    public void before(){
        guest = new Guest("Jimmy");
        bedRoom = new BedRoom(1, 2, "Double");
    }

    @Test
    public void roomStartsEmpty(){
        assertEquals(0, bedRoom.guestCount());
    }

    @Test
    public void canAddGuestToRoom(){
        bedRoom.addGuest(guest);
        assertEquals(1, bedRoom.guestCount());
    }

    @Test
    public void roomCantExceedCapacity(){
        bedRoom.addGuest(guest);
        bedRoom.addGuest(guest);
        bedRoom.addGuest(guest);
        assertEquals(2, bedRoom.guestCount());
    }

}
