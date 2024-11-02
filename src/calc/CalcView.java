package calc;

import java.util.Scanner;

public class CalcView implements DisplayChangedInterface{
    private InputListener inputListener;
    private Scanner inp;

    public CalcView() {
        inp = new Scanner(System.in);
    }

    public void setInputListener(InputListener listener) {
        inputListener = listener;
    }

    public void start() {
        while(true) {
            String userInput = inp.nextLine();
            inputListener.input(userInput);
        }
    }

    @Override
    public void displayChanged(String newDisplay) {
        System.out.println(newDisplay);
    }
}
