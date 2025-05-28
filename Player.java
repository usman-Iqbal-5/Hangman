import java.util.Scanner;

class InputException extends Exception{
    private String exceptionMessage;

    public InputException(String exceptionMessage){
        this.exceptionMessage = exceptionMessage;
    }

    public String toString(){
        return exceptionMessage;
    }
}

public class Player {
    private final String name;

    public String getName() {
        return name;
    }

    public Player(String name){
        this.name =name;
    }

    public char makeGuess()  {
        Scanner input = new Scanner(System.in);
        System.out.println(name + ", please enter your guess - a letter in the range of a -z: ");


        while (true) {
            String guess = (input.next()).toLowerCase();
            try {
                if (guess.charAt(0) >= 'a' && guess.charAt(0) <= 'z') {
                    return guess.charAt(0);
                } else {
                   throw new InputException("Incorrect input: " + name + ", please enter a letter in the range of a - z: ");
                }
            } catch (InputException ie){
                System.out.println(ie.toString());

            }
        }

    }
}
