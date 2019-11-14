public class WeekdayName {

    public static String weekday_name (int day)
    {
        String result = "ERROR";

        if (day == 1)
            result = "Monday";
        if (day == 2)
            result = "Tuesday";
        if (day == 3)
            result = "Wednesday";
        if (day == 4)
            result = "Thursday";
        if (day == 5)
            result = "Friday";
        if (day == 6)
            result = "Saturday";
        if (day == 7)
            result = "Sunday";

        return result;
    }

    public static void main (String[] args)
    {
        System.out.println( "Day 1: " + weekday_name(1) );
        System.out.println( "Day 2: " + weekday_name(2) );
        System.out.println( "Day 3: " + weekday_name(3) );
        System.out.println( "Day 4: " + weekday_name(4) );
        System.out.println( "Day 5: " + weekday_name(5) );
        System.out.println( "Day 6: " + weekday_name(6) );
        System.out.println( "Day 7: " + weekday_name(7) );

    }

}
