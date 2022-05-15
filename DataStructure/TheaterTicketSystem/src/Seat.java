public class Seat {
    private final String seatNumber;
    private boolean reserve = false;

    public Seat(String seatNumber) {
        this.seatNumber = seatNumber;
    }

    public boolean reserve(){
        if(!this.reserve){
            this.reserve = true;
            System.out.println("Seat " + seatNumber + " reserved");
            return true;
        }else {
            return false;
        }
    }

    public boolean cancel() {
        if(this.reserve) {
            this.reserve = false;
            System.out.println("Reservation of seat " + seatNumber + " cancelled");
            return true;
        }else {
            return false;
        }
    }

    public String getSeatNumber() {
        return seatNumber;
    }
    public boolean isReserve() {
        return reserve;
    }

    public void setReserve(boolean reserve) {
        this.reserve = reserve;
    }
}
