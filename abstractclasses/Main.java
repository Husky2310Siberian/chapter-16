package gr.aueb.cf.ch16.abstractclasses;

public class Main {

    public static void main(String[] args) {

        Animal cat1 = new Cat();
        Animal cat2 = new Cat(1,"black cat");

        cat1.speak();
        cat1.eat();
        cat2.toString();
        cat2.eat();
    }


}
