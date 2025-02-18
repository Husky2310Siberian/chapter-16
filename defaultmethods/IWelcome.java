package gr.aueb.cf.ch16.defaultmethods;

public interface IWelcome {

    void saySomething(String message);

    default void sayHelloCoding (){
        System.out.println("hello");
        sayCoding();
    }

    private void sayCoding () {
        System.out.println("Coding");
    }

    static void sayHelloCF () {
        System.out.println("hello");
        IWelcome.sayCF();
    }

    private static void sayCF () {
        System.out.println("CF");
    }
}
