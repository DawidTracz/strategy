public class PrefixAction implements NamingAction {
    @Override
    public String rename(String str) {

        if (str == null || str.trim().length() == 0) {
            throw new IllegalArgumentException("Given String cannot be null or empty");
        }
        return VALUE_TO_ADD + str;

    }
}
