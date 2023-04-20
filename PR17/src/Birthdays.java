import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Birthdays {

    public static void main(String[] args) {
        int day = 20;
        int month = 8;
        int year = 1994;
        System.out.println(collectBirthdays(year, month, day));
    }
    public static String collectBirthdays(int year, int month, int day) {
        int str = 0;

        StringBuilder builder = new StringBuilder();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(" - dd.MM.yyyy - EE", Locale.ENGLISH);

        LocalDate birthday = LocalDate.of(year, month, day);
        LocalDate today = LocalDate.now();

        while (birthday.isBefore(today)) {
            builder.append(str++).append(formatter.format(birthday)).append("\n");
            birthday = birthday.plusYears(1);
        }
        if (birthday.isEqual(today)){
            builder.append(str++).append(formatter.format(today)).append("\n");
        }
        return builder.toString();
    }
}

//TODO реализуйте метод для построения строки в следующем виде
//0 - 31.12.1990 - Mon
//1 - 31.12.1991 - Tue