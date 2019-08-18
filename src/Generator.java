/**
 * Generator class generate unique id for Person object
 */
public class Generator {

    private static int latestId = 0;

    public static int generateId() {
        return ++latestId;
    }

}