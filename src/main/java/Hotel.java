import java.util.ArrayList;
import java.util.BitSet;

public class Hotel {
    private String name;
    private ArrayList<BedRoom> bedRooms;
    private ArrayList<ConferenceRoom> conferenceRooms;

    public Hotel(String name, ArrayList<BedRoom> bedRooms, ArrayList<ConferenceRoom> conferenceRooms) {
        this.name = name;
        this.bedRooms = bedRooms;
        this.conferenceRooms = conferenceRooms;

    }

    public int bedroomCount() {
        return this.bedRooms.size();
    }

    public int conferenceRoomCount() {
        return this.conferenceRooms.size();
    }

    public void addGuestToBedRoom(BedRoom bedRoom, Guest guest) {
        bedRoom.addGuest(guest);
    }

    public void removeGuestFromBedRoom(BedRoom bedRoom) {
        bedRoom.removeGuest();
    }

    public void addGuestToConferenceRoom(ConferenceRoom conferenceRoom, Guest guest) {
        conferenceRoom.addGuest(guest);
    }

    public void removeGuestFromConferenceRoom(ConferenceRoom conferenceRoom) {
        conferenceRoom.removeGuest();
    }

    public Booking bookBedRoom(BedRoom bedRoom, int numberOfNights) {
        return Booking.bookBedRoom(bedRoom, numberOfNights);
    }

    public int calculateBookingBill(Booking localBooking) {
        int total = localBooking.getNightsBooked() * localBooking.getBedRoomNightlyRate();
        return total;
    }

    public ArrayList findVacantRooms() {
        ArrayList<BedRoom> vacantBedrooms = new ArrayList<BedRoom>();
        for (BedRoom bedRoom : this.bedRooms){
            if (bedRoom.guestCount() == 0){
                vacantBedrooms.add(bedRoom);
            }
        }
        return vacantBedrooms;
    }
}
