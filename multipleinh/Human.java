package gr.aueb.cf.ch16.multipleinh;

public class Human implements ISpeakable , IReadable {

    @Override
    public void read() {
        System.out.println("t read.");
    }

    @Override
    public void speak() {
        System.out.println("i speak.");
    }
}
