import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Let's play Rock Paper Scissors.");
        System.out.println("When I say 'shoot', Choose: rock, paper, or scissors.\n");
        System.out.println("Are you ready? Write 'yes' if you are.");

        Boolean ready = (scan.nextLine().equals("yes"));
        if (ready) {
            System.out.println("Great!");
            System.out.println("rock paper scissors, shoot!");
            String cpuChoice = computerChoice();
            String playerChoice = scan.nextLine();

            printResult(playerChoice, cpuChoice, result(playerChoice, cpuChoice));
        } else {
            System.out.println("Darn, some other time...!");
        }
        scan.close();
    }

    public static String computerChoice() {
        switch ((int) Math.floor(Math.random() * (3 - 0 + 1) + 0)) {
            case 1:
                return "rock";
            case 2:
                return "paper";
            default:
                return "scissors";
        }
    }


    public static String result(String yourChoice, String computerChoice) {
        if ((yourChoice.toUpperCase()).equals(computerChoice.toUpperCase())) {
            return "It's a tie";
        } else if ((yourChoice.equals("ROCK") && computerChoice.equals("SCISSORS")) ||
                (yourChoice.equals("PAPER") && computerChoice.equals("ROCK")) ||
                (yourChoice.equals("SCISSORS") && computerChoice.equals("PAPER"))) {
            return "You lose";
        } else {
            return "You win";
        }
    }

    public static void printResult(String playerChoice, String cpuChoice, String result){
        
        System.out.println(playerChoice);
        System.out.println(cpuChoice);
        System.out.println(result);
    }

    /**
     * Name: printResult - It prints everything (your choice, computer choice,
     * result)
     * 
     * @param yourChoice     (String)
     * @param computerChoice (String)
     * @param result         (String)
     * 
     *                       Inside the function:
     * 
     *                       1. prints everything:
     *                       – prints: You chose: <your choice>
     *                       – prints: The computer chose: <computer choice>
     *                       – prints: <result>
     */

}
