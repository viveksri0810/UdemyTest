package collection;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Theater  {

    String theaterName;
    int totalNoRow;
    int totalNoColumn;
    ArrayList<Seat> noOfSeat;

    public Theater(String theaterName, int totalNoRow, int totalNoColumn) throws IOException {
        this.theaterName = theaterName;
        if(totalNoColumn >=1 && totalNoColumn<=26 ){
            this.totalNoColumn = totalNoColumn;
        }
        else {
            throw new IOException("Please enter a column name between 1 to 26");
        }
        this.totalNoRow = totalNoRow;

        noOfSeat=new ArrayList<>();
        char a='A';
        for (int i=1;i<=totalNoColumn;i++){

            for (int j=1;j<=totalNoRow;j++){
                noOfSeat.add(new Seat(a + ""+ j));
            }
            a++;
        }
        System.out.println( "Theatre Name : " + theaterName + " Total Seat : " + totalNoColumn*totalNoRow);

    }

    public void  getSeatList(){
        Collections.sort(noOfSeat);
        for (Seat s : noOfSeat){
            System.out.println(s);
        }
    }


    public void bookSeat(int noOfSeat){
        int noOfSeatVacant=noOfSeatVacant();
        if (noOfSeatVacant<noOfSeat){
            System.out.println("Seat not available, no of seat available is : " + noOfSeatVacant);
        }
        else {
            int n=0;
            while (n<=noOfSeat) {
                for (Seat s : this.noOfSeat) {
                    if (s.getStatus().equalsIgnoreCase("Empty")) {
                        payForBooking();
                        s.setStatus(1);
                        System.out.println(s.getSeatNo() + " is booked");
                        break;
                    }
                }
                n++;
            }
        }

    }

    public int noOfSeatVacant(){
        int noOfSeatVacant=0;
        for(Seat s:noOfSeat){
            if(s.getStatus().equalsIgnoreCase("Empty")){
                noOfSeatVacant++;
            }
        }
        return noOfSeatVacant;
    }

    private void  payForBooking(){
        System.out.println("Paid for booking");
    }


}
