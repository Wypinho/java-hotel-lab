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
    private Booking booking;

    @Before
    public void before(){
        bedRoom = new BedRoom(1, 2, "Double", 40);
        bedRoom1 = new BedRoom(2, 2, "Double", 30);
        bedRooms = new ArrayList<BedRoom>();
        bedRooms.add(bedRoom);
        bedRooms.add(bedRoom1);

        conferenceRoom = new ConferenceRoom("Mike Ritchie", 3);
        conferenceRooms = new ArrayList<ConferenceRoom>();
        conferenceRooms.add(conferenceRoom);


        guest = new Guest("Jimmy");
        hotel = new Hotel("Fawlty Coders", bedRooms, conferenceRooms);

        booking = new Booking(bedRoom, 5);

    }

    @Test
    public void hotel_has_bedrooms_and_conference_rooms() {
        assertEquals(2, hotel.bedroomCount());
        assertEquals(1, hotel.conferenceRoomCount());
    }

    @Test
    public void add_guest_to_hotel_bedroom() {
        hotel.addGuestToBedRoom(bedRoom, guest);
        assertEquals(1, bedRoom.guestCount());
    }

    @Test
    public void remove_guest_from_hotel_bedroom() {
        hotel.addGuestToBedRoom(bedRoom, guest);
        hotel.removeGuestFromBedRoom(bedRoom);
        assertEquals(0, bedRoom.guestCount());
    }

    @Test
    public void add_guest_to_hotel_conference_room() {
        hotel.addGuestToConferenceRoom(conferenceRoom, guest);
        assertEquals(1, conferenceRoom.guestCount());
    }

    @Test
    public void remove_guest_from_hotel_conference_room() {
        hotel.addGuestToConferenceRoom(conferenceRoom, guest);
        hotel.removeGuestFromConferenceRoom(conferenceRoom);
        assertEquals(0, conferenceRoom.guestCount());
    }

    @Test
    public void can_make_booking_on_bedroom() {
        hotel.bookBedRoom(bedRoom, 5);
        assertEquals(1, booking.getBedRoomNumber(bedRoom));
        assertEquals(5, booking.getNightsBooked());
    }

    @Test
    public void can_calculate_total_booking_bill(){
        Booking localBooking = hotel.bookBedRoom(bedRoom, 5);
        assertEquals(200, hotel.calculateBookingBill(localBooking));
        Booking localBooking2 = hotel.bookBedRoom(bedRoom1, 3);
        assertEquals(90, hotel.calculateBookingBill(localBooking2));
    }

    @Test
    public void can_find_vacant_rooms() {
        hotel.addGuestToBedRoom(bedRoom, guest);
        assertEquals(1, hotel.findVacantRooms().size());
    }

}
