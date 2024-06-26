package HomeworkM8;

//CORRECT
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;


public class DayOfWeek {



        public static String getDay(Integer dayNumber) {
            ArrayList<String> daysList = new ArrayList<>();
            daysList.add("Sunday");
            daysList.add("Monday");
            daysList.add("Tuesday");
            daysList.add("Wednesday");
            daysList.add("Thursday");
            daysList.add("Friday");
            daysList.add("Saturday");

        if (dayNumber == null) {
            throw new NullPointerException("Day number cannot be null");
        } else if (dayNumber < 1 || dayNumber > 7) {
            throw new IllegalArgumentException("Day number must be between 1 and 7");
        }
        return daysList.get(dayNumber - 1);
    }

    @Test

    public void getDayPositiveTest() {
        assertEquals("Sunday", getDay(1));
        assertEquals("Monday", getDay(2));
        assertEquals("Tuesday", getDay(3));
        assertEquals("Wednesday", getDay(4));
        assertEquals("Thursday", getDay(5));
        assertEquals("Friday", getDay(6));
        assertEquals("Saturday", getDay(7));
    }

    @Test

    public void getDayNegativeTest() {
        assertThrows(IllegalArgumentException.class, () -> getDay(0));
        assertThrows(IllegalArgumentException.class, () -> getDay(8));
        assertThrows(IllegalArgumentException.class, () -> getDay(-5));
        assertThrows(IllegalArgumentException.class, () -> getDay(7777));
    }

    @Test

    public void getDayNullTest() {
        assertThrows(NullPointerException.class, () -> getDay(null));
    }
}





