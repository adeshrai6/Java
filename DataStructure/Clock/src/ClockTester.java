public class ClockTester {
    public static void main(String[] args) {

        Clock clock = new Clock();
        //First tick
        clock.tick();
        System.out.println("Today's");
        System.out.println("Current time is " + clock.getHours() + " hours, " + clock.getMinute() + " minutes, and " + clock.getSecond() + " seconds");

//        Second tick
        clock.tick();
        System.out.println("Current time is " + clock.getHours() + " hours, " + clock.getMinute() + " minutes, and " + clock.getSecond() + " seconds");

//        First tickAhead
        clock.tickAhead(1);
        System.out.println("Current time is " + clock.getHours() + " hours, " + clock.getMinute() + " minutes, and " + clock.getSecond() + " seconds 1");

//        Second tickAhead
        clock.tickAhead(5);
        System.out.println("Current time is " + clock.getHours() + " hours, " + clock.getMinute() + " minutes, and " + clock.getSecond() + " seconds with 5");

//        Third tickAhead
        clock.tickAhead(60);
        System.out.println("Current time is " + clock.getHours() + " hours, " + clock.getMinute() + " minutes, and " + clock.getSecond() + " seconds with 60");

//        Fourth tickHead
        clock.tickAhead(3600);
        System.out.println("Current time is " + clock.getHours() + " hours, " + clock.getMinute() + " minutes, and " + clock.getSecond() + " seconds with 3600");

//        Fifth tickAhead
        clock.tickAhead(86400);
        System.out.println("Current time is " + clock.getHours() + " hours, " + clock.getMinute() + " minutes, and " + clock.getSecond() + " seconds with 86400");


    }
}
