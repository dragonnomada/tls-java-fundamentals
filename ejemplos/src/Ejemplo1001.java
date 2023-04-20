import java.util.Calendar;

public class Ejemplo1001 {

    public static void main(String[] args) {

        Calendar calendar = Calendar.getInstance();

        calendar.set(2023, 04, 19);

        calendar.add(Calendar.YEAR, 5);
        calendar.add(Calendar.MONTH, 2);
        calendar.add(Calendar.DAY_OF_MONTH, 23);
        calendar.add(Calendar.HOUR, 8);

        calendar.add(Calendar.YEAR, -1);

        System.out.println(calendar.get(Calendar.YEAR));
        System.out.println(calendar.get(Calendar.MONTH));
        System.out.println(calendar.get(Calendar.DAY_OF_MONTH));
        System.out.println(calendar.get(Calendar.DAY_OF_WEEK));
        System.out.println(calendar.get(Calendar.DAY_OF_WEEK_IN_MONTH));
        System.out.println(calendar.get(Calendar.HOUR));
        System.out.println(calendar.get(Calendar.HOUR_OF_DAY));
        System.out.println(calendar.get(Calendar.MINUTE));
        System.out.println(calendar.get(Calendar.SECOND));

    }

}
