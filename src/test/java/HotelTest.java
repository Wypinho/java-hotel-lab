import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class HotelTest {
    private BedRoom bedRoom;
    private BedRoom bedRoom1;
    private ConferenceRoom conferenceRoom;
    private ArrayList<ConferenceRoom> conferenceRooms;
    private Guest guest;
    private Hotel hotel;
    private ArrayList<BedRoom> bedRooms;

    @Before
    public void before(){
        bedRoom = new BedRoom(1, 2, "Double");
        bedRoom1 = new BedRoom(2, 2, "Double");
        bedRooms = new ArrayList<BedRoom>();
        bedRooms.add(bedRoom);
        bedRooms.add(bedRoom1);

        conferenceRoom = new ConferenceRoom("Mike Ritchie", 3);
        conferenceRooms = new ArrayList<ConferenceRoom>();
        conferenceRooms.add(conferenceRoom);


        guest = new Guest("Jimmy");
        hotel = new Hotel("Fawlty Coders", bedRooms, conferenceRooms);
    }

    @Test
    public void hotel_has_bedrooms_and_conference_rooms() {
        assertEquals(2, hotel.bedroomCount());
        assertEquals(1, hotel.conferenceRoomCount());
    }

    @Test
    public void add_guest_to_hotel() {
        hotel.addGuest(bedRoom, guest);
        assertEquals(1, bedRoom.guestCount());
    }

    @Test
    public void remove_guest_from_hotel() {
        hotel.addGuest(bedRoom, guest);
        hotel.removeGuest(bedRoom);
        assertEquals(0, bedRoom.guestCount());
    }

}
