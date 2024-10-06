package gr.aueb.cf.ch16;

public class Main {

    public static void main(String[] args) {

        ISpeakable alice = new Cat("Alice");
        ISpeakable bob = new Dog("bob" , 12);

        alice.speak();
        bob.speak();
        System.out.println("");
        doSpeak(alice);
        doSpeak(bob);
    }

    /**
     * Η μέθοδος doSpeak() είναι
     * πολυμορφική γιατί η τυπική
     * παράμετρος speakable
     * τύπου ISpeakable μπορεί να
     * πάρει πολλές μορφές, περνάμε πραγματικές
     * παραμέτρους οποιουδήποτε
     * τύπου υλοποιεί το interface
     * ISpeakable
     * @param speakable
     */
    public static void  doSpeak (ISpeakable speakable) {
        speakable.speak();
    }
}
