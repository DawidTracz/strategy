public class StringCreatorManager {
    private NamingAction namingStrategy;

    public StringCreatorManager(NamingAction namingStrategy) {
        this.namingStrategy = namingStrategy;
    }

    public void printString(String str) {
        System.out.println(namingStrategy.rename(str));
    }

    /** Alternative to pass strategy as method parameter */
    public static void printString(String str, NamingAction strategy) {
        System.out.println(strategy.rename(str));
    }

    public void setNamingStrategy(NamingAction namingStrategy) {
        this.namingStrategy = namingStrategy;
    }

}
