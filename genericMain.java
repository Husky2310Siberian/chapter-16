package gr.aueb.cf.ch16;

public class genericMain {

    public static void main(String[] args) {

        ISpeakable cat = new Cat("white cat");
        ISpeakable dog = new Dog("black dog" , 14);

        //wiring

        GenericSpeakingSchool genericSpeakingSchool1 = new GenericSpeakingSchool(cat);
        GenericSpeakingSchool genericSpeakingSchool2 = new GenericSpeakingSchool(dog );

        System.out.println(cat);
        System.out.println(dog);
    }
}
