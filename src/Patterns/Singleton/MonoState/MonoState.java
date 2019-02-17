package Patterns.Singleton.MonoState;

public class MonoState {

    private static int number;

    private static String text;

    public MonoState() {
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        MonoState.number = number;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        MonoState.text = text;
    }

}
