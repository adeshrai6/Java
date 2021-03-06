public class Seat implements Comparable<Seat> {
    private final String seatNumber;
    private boolean reserve = false;
    private double price;

    public Seat(String seatNumber, double price) {
        this.seatNumber = seatNumber;
        this.price = price;
    }

    @Override
    public int compareTo(Seat seat) {
        return this.seatNumber.compareToIgnoreCase(seat.getSeatNumber());
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

    public double getPrice() {
        return price;
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
