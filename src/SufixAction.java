public class SufixAction implements NamingAction {
    @Override
    public String rename(String str) {
        if (str == null || str.trim().length() == 0) {
            throw new IllegalArgumentException("Given String cannot be null or empty");
        }
        return str + VALUE_TO_ADD;


    }
}
