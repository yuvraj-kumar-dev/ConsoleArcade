import java.util.Random;
import java.util.Scanner;

class Stonepaper {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int stone = 1;
        int paper = 2;
        int scissors = 3;
        System.out.println("How many times do you want to play: ");
        int play = read.nextInt();

        for(int i=0; i<play; i++){

        System.out.println("Enter 1 for stone, 2 for paper, 3 for scissors:");
        int user = read.nextInt();

        Random random = new Random();
        int computer = random.nextInt(3) + 1;

        System.out.println("Computer input: " + computer);

        // Display choices
        if (user == 1) {
            System.out.println("User: Stone");
        } else if (user == 2) {
            System.out.println("User: Paper");
        } else if (user == 3) {
            System.out.println("User: Scissors");
        }

        if (computer == 1) {
            System.out.println("Computer: Stone");
        } else if (computer == 2) {
            System.out.println("Computer: Paper");
        } else if (computer == 3) {
            System.out.println("Computer: Scissors");
        }

        // Determine the winner
        if (user == computer) {
            System.out.println("Match tie");
        } else if ((user == 1 && computer == 3) || (user == 2 && computer == 1) || (user == 3 && computer == 2)) {
            System.out.println("User wins");
        } else {
            System.out.println("Computer wins");
        }
    }
    }
}
