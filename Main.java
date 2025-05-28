import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello welcome to Hangman, the game. Can you save the condemned man before he hangs? ");
        System.out.println("Please enter your name: ");
        Scanner input = new Scanner(System.in);
        Player player = new Player(input.next());




        while (true) {
            Game game = new Game(player);
            game.printBoard();

            while (!game.isGameOver()) {
                game.playGame();

            }

            System.out.println("Would you like to play again (Y/N) ");
            if (input.next().equalsIgnoreCase("y")){
                System.out.println("Great! let's play!");
            } else {
                System.out.println("Thanks for playing " + player.getName() + " have a great day!");
                break;
            }
        }
    }
}