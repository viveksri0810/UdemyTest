package collection;

import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        Theater theater;
        try {
            theater = new Theater("PVR", 3, 3);
//          theater.getSeatList();
            theater.noOfSeatVacant();
            theater.bookSeat(3);
            theater.getSeatList();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
