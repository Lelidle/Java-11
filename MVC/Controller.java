package MVC;

import java.util.Random;

public class Controller {
    private Model model;
    private View view;
    private Random random;

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
        random = new Random();
    }

    public void performAction() {
        int randomValue = random.nextInt(10) + 1;
        if (randomValue % 2 == 0) {
            model.increaseScore();
            view.printSuccessMessage();
        } else {
            view.printFailureMessage();
        }
        view.printScore(model.getScore());
    }
}
