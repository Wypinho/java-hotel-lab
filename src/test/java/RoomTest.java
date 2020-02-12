import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RoomTest {
    private Room room;
    private Guest guest;

    @Before
    public void before(){
        guest = new Guest("Jimmy");
        room = new Room(1, 2, "Double");
    }

    @Test
    public void roomStartsEmpty(){
        assertEquals(0, room.guestCount());
    }

}
