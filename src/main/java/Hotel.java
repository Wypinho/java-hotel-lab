import java.util.ArrayList;

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

    public void addGuest(BedRoom bedRoom, Guest guest) {
        bedRoom.addGuest(guest);
    }

    public void removeGuest(BedRoom bedRoom) {
        bedRoom.removeGuest();
    }
}
