package practices;
import java.util.*;

public class SevenLimit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = (int)(Math.random() * 100) + 1;
        int attempts = 7;
        int i = 1;

        System.out.println("Guess the number between 1 and 100. You have 7 attempts!");

        while (i <= attempts) {
            System.out.print("Attempt " + i + ": ");
            int guess = sc.nextInt();

            if (guess == num) {
                System.out.println("🎉 You got it!");
                break;
            } else if (guess < num) {
                System.out.println("Too low!");
            } else {
                System.out.println("Too high!");
            }


            i++;
        }

        sc.close();
    }
}
