import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Ejemplo1002 {

    public static void main(String[] args) {

        // https://docs.oracle.com/javase/8/docs/api/

        LocalDate date = LocalDate.ofYearDay(2023, 145);

        System.out.println(date);

        // YYYY-MM-dd
        LocalDate date1 = LocalDate.parse("2023-04-19");

        System.out.println(date1);
        System.out.println(date1.format(DateTimeFormatter.ofPattern("YYYY, MM, dd")));
        System.out.println(date1.format(DateTimeFormatter.ISO_DATE));
        System.out.println(date1.format(DateTimeFormatter.ISO_WEEK_DATE));
        System.out.println(date1.format(
                DateTimeFormatter.ofPattern("YYYY (YY) MM (L LLL LLLL) dd (DD E EEE EEEE c ccc cccc e eee eeee)")
        ));

        System.out.println(LocalDate.now().format(
                DateTimeFormatter.ofPattern("d, M YYYY")
        ));

        System.out.println(LocalDate.now().format(
                DateTimeFormatter.ofPattern("d, LLLL YYYY")
        ));

        Scanner scanner = new Scanner(System.in);

        System.out.print("Dame la fecha (día, mes año): ");
        LocalDate date2 = LocalDate.parse(
                scanner.nextLine(),
                DateTimeFormatter.ofPattern("d, LLLL yyyy"));

        System.out.println(date2.format(
                DateTimeFormatter.ofPattern("yyyy LLL d (D) EEEE")
        ));

    }

}
