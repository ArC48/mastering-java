package calc;

public class CalcBrain {
    private String display;
    private DisplayChangedInterface changeListener;
    private char lastOperator;
    private String lastNumber;
    private boolean shouldClearOnNextDigitInput;

    public CalcBrain() {
        display = "0";
        changeListener = new DisplayChangedInterface() {
            @Override
            public void displayChanged(String newDisplay) {

            }
        };
    }

    public void setDisplayChanged(DisplayChangedInterface dsch) {
        changeListener = dsch;
    }

    public void pushDigit(char c) {
        if (shouldClearOnNextDigitInput) {
            display = "";
        }

        display += c;
        if (display.charAt(0) == '0') {
            display = display.substring(1);
        }
        changeListener.displayChanged(display);
        shouldClearOnNextDigitInput = false;
    }

    public void pushOperation(char operator) {
        lastNumber = display;
        shouldClearOnNextDigitInput = true;
        if(operator == '='){
            processEquals();
        } else {
            lastOperator = operator;
        }
    }

    private void processEquals() {
        int first = Integer.parseInt(lastNumber);
        int second = Integer.parseInt(display);
        int res = 0;
        if (lastOperator == '+') {
            res = first + second;
        }
        display = "" + res;
        changeListener.displayChanged(display);
    }

    public String getDisplay() {
        return display;
    }
}
