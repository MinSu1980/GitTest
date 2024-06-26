import org.example.Main;

public class HomeworkM3 {
//    public static void main(String[] args) {
//        HomeworkM3 loops = new HomeworkM3();
//               loops.numbersTemplate(6);
//    }
//
//    public void numbersTemplate(int rows){
//        for(int i = rows; i>=1; i -- ){
//            for(int j=1; j<=i; j ++){
//                System.out.print("*");
//            }
//            System.out.println();
//
//        }
//    }
//}


//    public static void main(String[] args) {
//        HomeworkM3 loops = new HomeworkM3();
//
//
//
//        int a = 1;
//        int b = 3;
//        int result = 0;
//
//        for (int i = a; i <= b; i++) {
//            result = result + i;
//        }
//        System.out.println(" result is " +   "1 + 2 + 3 = 6");
//    }
//}


    public static void main(String[] args) {
        HomeworkM3 loops = new HomeworkM3();

        for (int i = 1; i <= 100; i++) {

            if ( i== 1) {
                System.out.println(" the number is " + i + " Even ");
            }


             else if (i % 2 == 0 && i % 3 == 0){
                System.out.println(" the number is " + i + " Divisible By Two and  Three " );
            }


           else if (i % 3 == 0) {

                System.out.println(" the number is " + i + " Divisible By Three ");
            }

              else if (i % 2 == 0) {

                  System.out.println(" the number is " + i + " Even ");
              }

              else{
                  System.out.println(" the number is " + i + " Odd ");
              }

        }
    }
}















































































