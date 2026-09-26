package LocalDate;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Data_time {
    public static  void main(String[] args) {
        String data = "2023-06-15";
        LocalDate localDate = LocalDate.parse(data);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String formattedDate = localDate.format(formatter);
        System.out.println("Data formatada: " + formattedDate);

    }
}
