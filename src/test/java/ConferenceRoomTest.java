import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ConferenceRoomTest {
    private ConferenceRoom conferenceRoom;
    private Guest guest;

    @Before
    public void before(){
        conferenceRoom = new ConferenceRoom("Mike Ritchie", 3);
        guest = new Guest("Jimmy");
    }

    @Test
    public void roomStartsEmpty(){
        assertEquals(0, conferenceRoom.guestCount());
    }

    @Test
    public void canAddGuestToRoom(){
        conferenceRoom.addGuest(guest);
        assertEquals(1, conferenceRoom.guestCount());
    }

    @Test
    public void roomCantExceedCapacity(){
        conferenceRoom.addGuest(guest);
        conferenceRoom.addGuest(guest);
        conferenceRoom.addGuest(guest);
        conferenceRoom.addGuest(guest);
        assertEquals(3, conferenceRoom.guestCount());
    }


}
