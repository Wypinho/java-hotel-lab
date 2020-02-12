import org.junit.Before;

import java.util.ArrayList;

public class HotelTest {
    private BedRoom bedRoom;
    private ConferenceRoom conferenceRoom;
    private Guest guest;
    private Hotel hotel;
    private ArrayList<BedRoom> rooms;

    @Before
    public void before(){
        bedRoom = new BedRoom(1, 2, "Double");
        conferenceRoom = new ConferenceRoom("Mike Ritchie", 3);
        rooms = new ArrayList<BedRoom>();
        rooms.add(bedRoom);


        guest = new Guest("Jimmy");
        hotel = new Hotel("Fawlty Coders", rooms);
    }

}
