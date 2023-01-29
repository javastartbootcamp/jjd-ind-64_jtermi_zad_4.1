package pl.javastart.task;

public class Telewizor {
    private boolean onOff;

    public Telewizor() {
        onOff = false;
    }

    public Telewizor(boolean onOff) {
        this.onOff = onOff;
    }

    void turnOn() {
        this.onOff = true;
    }

    void turnOff() {
        this.onOff = false;
    }

    void showStatus() {
        if (onOff) {
            System.out.println("Telewizor jest włączony");
        } else {
            System.out.println("Telewizor jest wyłączony");
        }
    }
}
