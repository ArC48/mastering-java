package calc;

public class CalcController implements InputListener {
    private CalcView view;
    private CalcBrain brain;

    public CalcController(CalcView view, CalcBrain brain) {
        this.view = view;
        this.brain = brain;
    }

    public void start() {
        view.start();
    }

    @Override
    public void input(String input) {
        char inp = input.charAt(0);
        if (Character.isDigit(inp)) {
            brain.pushDigit(inp);
        } else {
            brain.pushOperation(inp);
        }
    }
}
