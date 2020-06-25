import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class local {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        LocalDate yesterday = date.minusDays(1);
        LocalDate tomorrow = yesterday.plusDays(2);
        System.out.println("Hoje: " + date);
        System.out.println("Ontem: " + yesterday);
        System.out.println("Amanha: " + tomorrow);

        // hora local
        LocalTime time = LocalTime.now();
        LocalTime time2 = time.minusHours(2); // menos 2 horas
        LocalTime time3 = time2.minusMinutes(30); // menos 30 minutos
        System.out.println(time3);

        LocalTime time4 = time3.plusHours(2); // mais 2 horas
        LocalTime time5 = time4.plusMinutes(30); // mais 30 minutos
        System.out.println(time5);

        // data e hora local
        LocalDateTime now = LocalDateTime.now();
        System.out.println("Antes de formatar: " + now);
        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String formatDateTime = now.format(format);
        System.out.println("Depois de formatar: " + formatDateTime);
    }
}
