package collection;

public class Seat implements Comparable<Seat> {

    final private String seatNo;
    private int status = 0;

    public Seat(String seatNo) {
        this.seatNo = seatNo;
    }

    public String getSeatNo() {
        return seatNo;
    }


    public String getStatus() {

        if (status == 0) {
            return "Empty";
        } else {
            return "Reserved";
        }
    }

    public void setStatus(int status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Seat{" +
                "seatNo='" + seatNo + '\'' +
                ", status=" + getStatus() +
                '}';
    }

    @Override
    public int compareTo(Seat s) {
        return this.seatNo.compareTo(s.getSeatNo());
    }
}
