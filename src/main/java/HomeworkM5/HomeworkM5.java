package HomeworkM5;


import java.util.ArrayList;
import java.util.HashMap;

public class HomeworkM5 {
//    CORRECT

//    private String[] daysOfWeek = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
//
//    public String getDayOfWeek(int dayIndex) {
//        if (dayIndex < 0 || dayIndex >= daysOfWeek.length) {
//            return "Invalid day index";
//
//        }
//        return daysOfWeek[dayIndex];
//    }
//    public void printDayOfWeek() {
//        System.out.println(getDayOfWeek(1));
//
//    }
//}


//  CORRECT
//    public static String getDayOfWeek(int day) {
//        ArrayList<String> daysOfWeek = new ArrayList<>();
//
//        daysOfWeek.add("Sunday");
//        daysOfWeek.add("Monday");
//        daysOfWeek.add("Tuesday");
//        daysOfWeek.add("Wednesday");
//        daysOfWeek.add("Thursday");
//        daysOfWeek.add("Friday");
//        daysOfWeek.add("Saturday");
//
//
//        if(day>= 0 && day <=7){
//            return daysOfWeek.get(day);
//
//        }else {
//            return "Invalid day";
//        }
//
//    }
//
//    public static void main(String[] args) {
//        System.out.println(getDayOfWeek(1));
//    }
//}


//CORRECT
//    public void arrayListExample() {
//
//        ArrayList<String> buttons = new ArrayList<String>();
//        buttons.add("Steve");
//        buttons.add("Tim");
//        buttons.add("Lucy");
//        buttons.add("Steve");
//        buttons.add("Pat");
//        buttons.add("Angela");
//        buttons.add("Tom");
//        buttons.add("Tim");
//        buttons.add("Anna");
//        buttons.add("Lucy");
//
//        buttons.removeLast();
//        buttons.remove(3);
//        buttons.remove(6);
//
//        System.out.println(buttons);
//    }


//    public static void main(String[] args) {
//        HomeworkM5 toyStore = new HomeworkM5();
//        int toyId = 20;
//        System.out.println(toyStore.getToyById(toyId));
//
//    }

    public String getToyById(int id) {

        HashMap<Integer, String> toyStore = new HashMap<>();


        toyStore.put(12, "Batmobile");
        toyStore.put(45, "Light Saber");
        toyStore.put(6, "Wonder Woman");
        toyStore.put(201, "Hello Kitty Bag");
        toyStore.put(56, "Junior QA Analyst Doll");

        String toyName = toyStore.get(id);


        if (toyName == null) {

            return "No such Toy";

        } else {
            return toyName;

        }
    }


}































//    public String hashMapHomework(int id) {
//
//        HashMap<Integer, String> toyStore = new HashMap<>();
//
//
//        toyStore.put(12, "Batmobile");
//        toyStore.put(45, "Light Saber");
//        toyStore.put(6, "Wonder Woman");
//        toyStore.put(201, "Hello Kitty Bag");
//        toyStore.put(56, "Junior QA Analyst Doll");
//
//        System.out.println(toyStore.get(id));
//
//
//        if (toyStore.get(id) == null) {
//
//            System.out.println(" No such Toy ");
//        } else {
//            System.out.println();
//
//        }
//        return "toyStore";
//
//
//    }





//    public static void main(String[] args) {
//        HashMap toyStore = new HashMap();
//        Scanner scanner = new Scanner(System.in);
//
//
//
//        System.out.println("Enter the Toy ID: 6");
//        int id = Integer.parseInt(scanner.next());
//
//    }
//}
































