package gr.aueb.cf.ch16;

public class GenericSpeakingSchool  {
    /**
     * interfaces ως instances κλάσεων
     */
    private final ISpeakable speakable;

    /**
     * Ο Constructor αντί να κάνει new με συγκεκριμένο τύπο (π.χ.
     * cat) του δίνουμε (inject) ένα ISpeakable instance @runtime
     * @param speakable
     */
    public GenericSpeakingSchool (ISpeakable speakable) {
        this.speakable = speakable;
    }

    public void learnToSpeak () {
        speakable.speak();
    }
}
