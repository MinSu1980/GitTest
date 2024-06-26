package stringsLesson;

public class stringsMain {
    public static void main(String[] args) {
        stringsMain stringsMain  = new stringsMain();
        int res = stringsMain.sumOfTwoNumbers(2, 4);
        System.out.println("the result is " + res);

        System.out.println(stringsMain.getText());

    }

    public int sumOfTwoNumbers(int num1, int num2){
        int result = num1 + num2;
        return result;
    }


    public String getText(){
        return "Sasha";
    }
}
