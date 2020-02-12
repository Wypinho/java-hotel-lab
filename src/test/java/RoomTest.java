import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RoomTest {
    private Room bedRoom;
    private Room conferenceRoom;
    private Guest guest;

    @Before
    public void before(){
        guest = new Guest("Jimmy");
        bedRoom = new Room(1, 2, "Double");
        conferenceRoom = new Room("Mike Ritchie", 3);
    }

    @Test
    public void roomStartsEmpty(){
        assertEquals(0, bedRoom.guestCount());
        assertEquals(0, conferenceRoom.guestCount());
    }

    @Test
    public void canAddGuestToRoom(){
        bedRoom.addGuest(guest);
        conferenceRoom.addGuest(guest);
        assertEquals(1, bedRoom.guestCount());
        assertEquals(1, conferenceRoom.guestCount());
    }

}
