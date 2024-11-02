package calc;

public class Main {
    public static void main(String[] args) {
        CalcBrain brain = new CalcBrain();
        CalcView view = new CalcView();
        CalcController controller = new CalcController(view, brain);
        view.setInputListener(controller);
        brain.setDisplayChanged(view);
        controller.start();
    }
}
