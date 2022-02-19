package collection;

import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        Theater theater;
        try {
             theater=new Theater("PVR",7,24);
//             theater.getSeatList();
             theater.noOfSeatVacant();
             theater.bookSeat(3);
            theater.getSeatList();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
