package HomeworkM8;//package HomeworkM8;
//
//import org.junit.jupiter.api.Test;
//import static org.junit.jupiter.api.Assertions.*;
//
// public class DayOfWeekTest {
//
//     private final DayOfWeek dayOfWeek = new DayOfWeek();
//
//     @Test
//
//     public void testGetDayPositive() {
//         DayOfWeek dayOfWeek = new DayOfWeek();
//
//         assertEquals("Sunday", dayOfWeek.getDay(1));
//         assertEquals("Monday", dayOfWeek.getDay(2));
//         assertEquals("Tuesday", dayOfWeek.getDay(3));
//         assertEquals("Wednesday", dayOfWeek.getDay(4));
//         assertEquals("Thursday", dayOfWeek.getDay(5));
//         assertEquals("Friday", dayOfWeek.getDay(6));
//         assertEquals("Saturday", dayOfWeek.getDay(7));
//
//     }
//
//     @Test
//     public void testGetDayNegative() {
//         assertEquals("The number should be equal or larger than 1", dayOfWeek.getDay(0));
//         assertEquals("The number should be equal or larger than 1", dayOfWeek.getDay(-1));
//         assertEquals("The number should be equal or smaller than 7", dayOfWeek.getDay(10));
//         assertEquals("The number should be equal or smaller than 7", dayOfWeek.getDay(33));
//     }
//
//     private void equals(String s, Object day) {
//     }
//
//     @Test
//     public void testGetDayNull() {
//         assertThrows(NullPointerException.class, () -> {
//             dayOfWeek.getDay(null);
//         });
//     }
// }


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

public class DayOfWeekTest {

    public String getDay(Integer dayNumber) {
        ArrayList<String> daysList = new ArrayList<>();
        daysList.add("Sunday");
        daysList.add("Monday");
        daysList.add("Tuesday");
        daysList.add("Wednesday");
        daysList.add("Thursday");
        daysList.add("Friday");
        daysList.add("Saturday");

        if (dayNumber == null) {
            throw new NullPointerException();
        } else if (dayNumber < 1) {
            return "The number should be equal or larger than 1";
        } else if (dayNumber > 7) {
            return "The number should be equal or smaller than 7";
        } else {
            return daysList.get(dayNumber - 1);
        }
    }

    @Test
    void DayOfWeekPositiveTests() {
        DayOfWeek dayOfWeek = new DayOfWeek();
        assertEquals("Sunday", dayOfWeek.getDay(1));
        assertEquals("Monday", dayOfWeek.getDay(2));
        assertEquals("Tuesday", dayOfWeek.getDay(3));
        assertEquals("Wednesday", dayOfWeek.getDay(4));
        assertEquals("Thursday", dayOfWeek.getDay(5));
        assertEquals("Friday", dayOfWeek.getDay(6));
        assertEquals("Saturday", dayOfWeek.getDay(7));
    }

    @Test
    void DayOfWeekNegativeTests() {


        assertEquals("The number should be equal or larger than 1", DayOfWeek.getDay(0));
        assertEquals("The number should be equal or smaller than 7", DayOfWeek.getDay(8));
    }

    @Test
    void nullValueTest() {


        assertThrows(NullPointerException.class, () -> DayOfWeek.getDay(null));
    }
}










