package pl.javastart.task;

public class Main {

    public static void main(String[] args) {

        Telewizor telewizor = new Telewizor();

        telewizor.showStatus();

        telewizor.turnOn();
        telewizor.showStatus();

        telewizor.turnOff();
        telewizor.showStatus();

    }
}
