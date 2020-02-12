public class Booking {

    private BedRoom bedRoom;
    private int nightsBooked;

    public Booking(BedRoom bedRoom, int nightsBooked){
        this.bedRoom = bedRoom;
        this.nightsBooked = nightsBooked;
    }

    public int getBedRoomNumber(BedRoom bedroom) {
        return bedRoom.getBedRoomNumber();
    }

    public int getBedRoomNightlyRate() {
        return bedRoom.getNightlyRate();
    }

    public int getNightsBooked() {
        return this.nightsBooked;
    }

    public static Booking bookBedRoom(BedRoom bedRoom, int numberOfNights) {
        return new Booking(bedRoom, numberOfNights);
    }
}
