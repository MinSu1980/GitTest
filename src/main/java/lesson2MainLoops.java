public class lesson2MainLoops {
    public static void main(String[] args) {
        lesson2MainLoops loops = new lesson2MainLoops();
        //loops.countNumber(1);
        //loops.countNumber();
        loops.numbersTemplate(9);
    }

    public void countNumber(int i) {


        while (i <= 10) {
            System.out.println(i);
            //i = i + 1;
            i = i + 1;
        }
    }

    public void countNumber() {
        for (int i = 1; i <= 100; i++) {
            System.out.println(i);

        }

    }


    public void numbersTemplate(int rows) {
        for (int i = 1; i <= rows; i++) {
            if (i % 2 == 0) {
                continue;
            }
            if (i == 7) {
                break;
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}







