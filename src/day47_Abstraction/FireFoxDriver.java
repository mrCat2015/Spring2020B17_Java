package day47_Abstraction;

public class FireFoxDriver extends RemoteWebDriver{
    @Override
    public void get(String URL) {
        System.out.println("Opening " + URL+ " in FireFox Browser");

    }

    @Override
    public void quit() {
        System.out.println("Closing in FireFox Browser");

    }
}
