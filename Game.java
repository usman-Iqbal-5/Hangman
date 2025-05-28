import java.util.Arrays;
import java.util.Random;

public class Game {

    private final char[] board;
    private boolean gameOver;
    private final String[] wordPool = { "aston", "space", "Turkey","cable","company", "blade", "star","cat","truck", "spider"};
    private final String word;

    private final String[] hangManArray;

    private final int maxGuesses;

    private int numberOfGuesses;

    private Player player;

    public Game(Player player) {

        this.player = player;

        Random random = new Random();
        int randomIndex = random.nextInt(wordPool.length);
        this.word = wordPool[randomIndex];
        board = new char[word.length()];

        arrayInitialisation();

        gameOver = false;
        maxGuesses = 7;
        numberOfGuesses = 0;

        hangManArray = new String[7];

        hangManArray[0] = ("  |-----   ");
        hangManArray[1] = ("  |    |   ");
        hangManArray[2] = ("  |    O   ");
        hangManArray[3] = ("  |   /|\\  ");
        hangManArray[4] = ("  |    |   ");
        hangManArray[5] = ("  |   /.\\  ");
        hangManArray[6] = ("  |        ");

    }
    public boolean isGameOver() {
        return gameOver;
    }

    private void arrayInitialisation() {
        Arrays.fill(board, ' ');
    }


    public void printBoard() {
        System.out.print("| ");
        for (int i = 0; i < word.length(); i++) {
            System.out.print(board[i] + " | ");
        }
        System.out.println("\n");
    }

    public void playGame() {
        char guess = player.makeGuess();
        boolean correctMoveMade = false;

        for (int i = 0; i < word.length(); i++) {
            if (guess == word.charAt(i)) {
                    board[i] = guess;
                    System.out.println("Well done, you have made a correct guess!");

                correctMoveMade = true;
            }
        }
        printBoard();

        if (!correctMoveMade) {
            printHangman();
            System.out.println(String.format("You guessed the wrong letter %s.", player.getName()));
            numberOfGuesses++;
            if(numberOfGuesses == maxGuesses - 1){
                gameOver = true;
                System.out.println("Sorry, the condemned man has been hung - you lost! Better luck next time");
                System.out.println("The word was: " + word);
            }
        }

        if (checkWin()) {
            System.out.println("Well done! You have guessed the correct word");
            gameOver = true;
        }

    }

    private boolean checkWin() {
        String guessedWord = "";
        for (int i = 0; i < word.length(); i++) {
            guessedWord = guessedWord + board[i];
        }
        return guessedWord.equals(word);
    }

    private void printHangman() {
        for (int j = 0; j <= numberOfGuesses && j < maxGuesses; j++) {
            System.out.println(hangManArray[j]);
        }

        System.out.println();

    }
}