package HomeworkM7;


import java.io.FileWriter;
import java.io.IOException;

public class Game {

    enum GameType {
        SOCCER,
        HOCKEY,
        RUGBY;

    }

    public static void writeNumOfPlayersPerTeam(GameType game) {
        String fileName = game.name();
        int numOfPlayers = 0;

        switch (game) {
            case SOCCER:
                numOfPlayers = 11;
                break;
            case HOCKEY:
                numOfPlayers = 6;
                break;
            case RUGBY:
                numOfPlayers = 15;
                break;
            default:
                throw new RuntimeException("Unknown type of game");

        }

        try {
            FileWriter fileWriter = new FileWriter(fileName);
            fileWriter.write(String.valueOf(numOfPlayers));
            fileWriter.close();
        } catch (IOException e) {
            System.out.println("Unknown value:");
            throw new RuntimeException(e);
        }

    }
}









