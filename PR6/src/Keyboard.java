public class Keyboard {
    private final String keyboardType;
    private final boolean keyboardLed;
    private final int keyboardWeight;

    public Keyboard(String keyboardType, boolean keyboardLed, int keyboardWeight ){
        this.keyboardType = keyboardType;
        this.keyboardLed = keyboardLed;
        this.keyboardWeight = keyboardWeight;
    }
    public String getKeyboardType() {
        return keyboardType;
    }

    public boolean isKeyboardLed() {
        return keyboardLed;
    }

    public int getKeyboardWeight() {
        return keyboardWeight;
    }
}
