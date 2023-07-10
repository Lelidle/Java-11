package MVC;

public class View {
    public void printSuccessMessage() {
        System.out.println("Great job! You earned 10 points.");
    }

    public void printFailureMessage() {
        System.out.println("Sorry, try again.");
    }

    public void printScore(int score) {
        System.out.println("Your current score is: " + score);
    }
}
