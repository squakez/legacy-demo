package acme;

public class App {

    static String policies[] = {"Basic", "Family", "Travel"};

    public static String suggest( String arg ) {
        int module = arg.hashCode() % 3;
        return policies[module];
    }
}
