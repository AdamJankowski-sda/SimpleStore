import applications.ConsoleApp;
import applications.SwingApp;
import interfaces.IApplication;

public class Main {
    public static void main(String[] args) {

        IApplication application = new SwingApp();
        application.run();
    }
}
