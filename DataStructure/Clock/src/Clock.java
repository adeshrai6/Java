import java.util.Calendar;

public class Clock implements IClock{
    //  Invariant of the Clock class:
    //    1. The instance variable second is the current SECOND of current Time
    //    2. The instance variable minute is the current MINUTE of current Time
    //    3. The instance variable hour is the current HOUR_OF_DAY
    private int second;
    private int minute;
    private int hour;

    /*********************************************************************
     *
     *  Initialize an empty Clock with current second, minute, and hour.
     *  Note that we are using Calendar class to populate the instance variable.
     *
     **********************************************************************/
    public Clock(){

        Calendar calendar = Calendar.getInstance();  // Creating calendar object to get current time
        second = calendar.get(Calendar.SECOND);
        minute = calendar.get(Calendar.MINUTE);
        hour =   calendar.get(Calendar.HOUR_OF_DAY);
    }

    /***********************************************************
     *  Accessor method to get current hour of the clock.
     * @return
     *  the current hour of the Time
     ***********************************************************/
    @Override
    public int getHours(){
        return hour;
    }


    /***********************************************************
     *  Accessor method to get current minute of the clock.
     * @return
     *  the current hour of the minute
     ***********************************************************/
    @Override
    public int getMinute() {
        return minute;
    }


    /***********************************************************
     *  Accessor method to get current second of the clock.
     * @return
     *  the current second of the Time
     ***********************************************************/
    @Override
    public int getSecond() {
        return second;
    }

    /***********************************************************
     *  The method increments second by one every time it's called
     ***********************************************************/
    @Override
    public void tick() {
        if(second > 59){
            minute++;
            second = second % 60; //Get second in less than 60 format
            if(minute > 59) {
                hour++;
                minute = minute % 60; //Get minute in less than 60 format
            }
        }else if (minute > 59){
            hour++;
        }
        second++;   //Increment second by 1
//      hour = hour % 12;

    }


    /***********************************************************
     *  The method increments second by passed parameter every time it's called
     * @param numSecs
     *      the seconds for the clock
     *      The incremented second with the passed parameter
     ***********************************************************/
    @Override
    public void tickAhead(int numSecs) {
        int tempSecond;
        int tempMinute;
        second += numSecs;  //Sum of numSecs and second
        if(second > 59){
            tempSecond = second / 60; //Get quotient from second
            minute += tempSecond;
            second = second % 60;
        }

        tempMinute = minute/60;
        hour += tempMinute;
        minute = minute % 60;
//        hour = hour % 12;     //Get Hour in 12 hours format
    }
}
