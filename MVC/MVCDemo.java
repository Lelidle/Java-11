package MVC;

public class MVCDemo {
    public static void main(String[] args) {
        Model model = new Model();
        View view = new View();
        Controller controller = new Controller(model, view);

        // Perform a few actions to increase the score
        controller.performAction();
        controller.performAction();
        controller.performAction();
    }
}
