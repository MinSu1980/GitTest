package lesson2;

public class Lesson2Main {
    public static void main(String[] args) {
        Lesson2Main lesson2 = new Lesson2Main();
       // lesson2.printUserInfo("John Doe", 1);
        Boolean isBonusAvailable = true;
        lesson2.checkScore("John Doe", 1, 40, isBonusAvailable);
        lesson2.checkScore(" Mark Smith", 2, 50, isBonusAvailable);
        lesson2.checkScore(" Anna Smith", 3, 60, isBonusAvailable);

    }


    public void printUserInfo(String userName, int userId) {

        System.out.println(" The user name is " + userName);
        System.out.println(" The user Id is " + userId);

    }

    public void checkScore(String userName, int userId, int userScore, boolean isBonusAvailable ) {
        System.out.println(" The user name is " + userName);
        System.out.println(" The user Id is " + userId);

        if(userName.equals("John Doe")){
            userScore = userScore + 20;
        }

        if(isBonusAvailable){
            userScore = userScore + 10;
        }

        if(userScore>100 || userScore <0 ){
            System.out.println("Error");

        }

        else if(userScore>=60){
            System.out.println("Pass!");
        }
        else {
            System.out.println("fail!");
        }

    }
}







