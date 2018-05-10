public class Main {
    public static void main(String[] args) {
        StringCreatorManager stringCreator = new StringCreatorManager(new PrefixAction());
        String test = null;
        stringCreator.printString(test);

        stringCreator.setNamingStrategy(new SufixAction());

        stringCreator.printString(test);
    }
}
