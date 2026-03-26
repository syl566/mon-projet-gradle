
package mon.projet;

import java.time.LocalDateTime;
import java.time.DayOfWeek;

public class Welcome {

    public String getMessage() {
        return getMessage(LocalDateTime.now());
    }

    public String getMessage(LocalDateTime now) {

        int hour = now.getHour();
        DayOfWeek day = now.getDayOfWeek();

        if ((day == DayOfWeek.FRIDAY && hour >= 18) ||
                day == DayOfWeek.SATURDAY ||
                day == DayOfWeek.SUNDAY ||
                (day == DayOfWeek.MONDAY && hour < 9)) {

            return "Bon week-end";
        }

        if (hour >= 9 && hour < 13) {
            return "Bonjour";
        } else if (hour >= 13 && hour < 18) {
            return "Bon après-midi";
        } else {
            return "Bonsoir";
        }
    }
}



