import org.w3c.dom.ls.LSOutput;

public class HomeworkM4 {

//    public static void main(String[] args) {
//        HomeworkM4 homeworkM4 = new HomeworkM4();

//        String strA = "Cat";
//        String strB = "Cat";
//
//        System.out.println(strA.equals(strB));
//
//        System.out.println(" The Strings are the same name ");
//    }


//    public static void main(String[] args) {
//        HomeworkM4 HomeworkM4 = new HomeworkM4();
//        String strA = "Null";
//        String strB = "Cat";
//
//        System.out.println(strA.equals(strB));
//
//        System.out.println(" Cannot compare Strings ");
//    }


//    public static void main(String[] args) {
//
//
//        String s = "racecar";
//        String res = "";
//        for (int i = s.length() - 1; i >= 0; i--)
//            res = res + s.charAt(i);
//        if (s.equals(res)) {
//
//            System.out.println(" String is palindrome ");
//
//        } else if (!s.equals(res)) {
//
//            System.out.println(" String is not palindrome ");
//
//        } else {
//
//        }
//
//    }


    public static void main(String[] args) {
        HomeworkM4 homeworkM4 = new HomeworkM4();

       boolean res1= homeworkM4.isPalindrome("abc");

//        boolean res2 =  homeworkM4.isPalindrome("racecar");
//        boolean res3 =  homeworkM4.isPalindrome("abba");
    }
    public boolean isPalindrome(String text){
        boolean palindrome;

        String res = "";

        for (int i = text.length() - 1; i >= 0; i--) {
            res = res + text.charAt(i);
        }

        if (text.equals(res)) {
            palindrome = true;
            System.out.println(" String is palindrome ");
        } else {
            palindrome= false;


            System.out.println(" String is not palindrome ");
        }
        return palindrome;

    }

}




















































