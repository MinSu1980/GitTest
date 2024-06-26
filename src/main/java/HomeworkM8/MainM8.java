package HomeworkM8;

public class MainM8 {
    public static void main(String[] args) {
        HomeworkM8 dayOfWeek;
        System.out.println(HomeworkM8.getDay(1));
        System.out.println(HomeworkM8.getDay(2));
        System.out.println(HomeworkM8.getDay(3));
        System.out.println(HomeworkM8.getDay(4));
        System.out.println(HomeworkM8.getDay(5));
        System.out.println(HomeworkM8.getDay(6));
        System.out.println(HomeworkM8.getDay(7));
        try {
            System.out.println(HomeworkM8.getDay(null));
        } catch (NullPointerException e) {
            System.out.println("NullPointerException caught: dayNumber is null");
        }

    }



}
