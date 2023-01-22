import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ParseException {
        String userdate = null;
        Date date2 = null;
        SimpleDateFormat dateFormatter = new SimpleDateFormat("dd-MM-yyyy");
        boolean nameIsCorrect = false;

        while (!nameIsCorrect) {
            System.out.println("Podaj imię");
            Scanner scanner1 = new Scanner(System.in);
            String name = scanner1.nextLine();

            if (name.contains("1") || name.contains("2") || name.contains("3") || name.contains("4") || name.contains("5") || name.contains("6") || name.contains("7") || name.contains("8") || name.contains("9") || name.contains("0")) {
                System.out.println("Imię nie jest poprawne, wprowadź jeszcze raz");
                continue;
            } else {
                System.out.println("Twoje imie to: " + name);
                nameIsCorrect = true;

            }
        }
        boolean dateIsCorrected = false;

        System.out.println("Podaj datę urodzenia: (dd-MM-yyyy)");

        ZoneId defaultZoneId = ZoneId.systemDefault();
        LocalDate today = LocalDate.now();
        Date currentlyDay = Date.from(today.atStartOfDay(defaultZoneId).toInstant());

        while (!dateIsCorrected) {
            while (true) {
                Scanner scannerDate = new Scanner(System.in);
                userdate = scannerDate.nextLine();
                if (userdate.isBlank()) {
                    System.out.println("Data nieprawidłowa, spróbuj jeszcze raz: ");
                    continue;
                } else
                    break; }


        try {

            date2 = dateFormatter.parse(userdate);

            System.out.println("Twoja data urodzenia to: " + dateFormatter.format(date2));


            System.out.println("Dzisiejsza data to: " + dateFormatter.format(currentlyDay));

            diffrenceCalculator.find(currentlyDay, date2);


            dateIsCorrected = true;
        } catch (ParseException e) {
            System.out.println("Podaj prawidłową datę");
            dateIsCorrected = false;
        }

    }


}
}
