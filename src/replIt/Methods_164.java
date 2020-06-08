package replIt;
/*
To book  a room first it needs to be available for rent and make sure its available at the date selected:

the room is already booked between 7/1/2018 - 7/8/2018 and not available
accepting bookings only for year of 2018

example:

simpleRoomBook(false,2,1,2018)
return false

simpleRoomBook(true,2,1,2018)
return true

simpleRoomBook(true,7,2,2018)
return false
 */

public class Methods_164 {
    public static void main(String[] args) {
        boolean isAvailable = true;
        int month = 7;
        int day = 2;
        int year = 2018;
        boolean simpleRoomBook;

        if(month == 7 && year == 2018 && (day >= 1 && day <=8)){
            simpleRoomBook = false;
        }

        else if((isAvailable == true) && (year == 2018)){
            simpleRoomBook = true;
        }else{
            simpleRoomBook = false;
        }

        System.out.println(simpleRoomBook);





    }

}
