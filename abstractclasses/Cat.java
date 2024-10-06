package gr.aueb.cf.ch16.abstractclasses;

public class Cat extends Animal {

    public  Cat () {
        //super();
    }

    public Cat(int id, String name) {
        super(id, name);
    }

    @Override
    public void speak() {
        System.out.println("cat is speaking");
    }

    @Override
    public void eat() {
        //super.eat();
        System.out.println("cat is eating");
    }

    @Override
    public String toString() {
        return "id: " + getId() + " ,name: " + getName();
    }
}
