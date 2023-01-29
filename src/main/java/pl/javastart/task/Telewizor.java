package pl.javastart.task;

public class Telewizor {
    private boolean isOn;

    public Telewizor() {
        isOn = false;
    }

    public Telewizor(boolean onOff) {
        this.isOn = onOff;
    }

    void turnOn() {
        this.isOn = true;
    }

    void turnOff() {
        this.isOn = false;
    }

    void showStatus() {
        if (isOn) {
            System.out.println("Telewizor jest włączony");
        } else {
            System.out.println("Telewizor jest wyłączony");
        }
    }
}
