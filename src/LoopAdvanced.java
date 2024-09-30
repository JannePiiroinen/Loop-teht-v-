import java.util.Scanner;

public class LoopAdvanced {
    public static void main(String[] args) throws Exception {

        Scanner in = new Scanner(System.in);

        String input;
        String rightAnswer = "Jokke";
        boolean correctGuess = false;
        int arvausLaskuri = 0;

        do {
            System.out.println("Guess my name (type stop to exit)");
            input = in.nextLine();

            if (input.equalsIgnoreCase("stop")) {
                System.out.println("You guessed " + arvausLaskuri + " times.");
                break;
            }
                arvausLaskuri++;

            if (input.equalsIgnoreCase(rightAnswer)) {
                correctGuess = true;
            }    

                } while (!correctGuess); 

             if (correctGuess) {   
                System.out.println("Congratulations!");
                System.out.println("You guessed " + arvausLaskuri + " times.");
        }
    }
}

        
    


