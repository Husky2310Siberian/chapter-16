package gr.aueb.cf.ch16;

public class SpeakingSchool {
    //SpeakingSchool περιέχει ένα
    //Cat private instance και
    //αρχικοποιεί το δικό του
    //instance με new()
    private final Cat cat = new Cat();

    public SpeakingSchool() {

    }

    public void learnToSpeak () {
        cat.speak();
    }
}
