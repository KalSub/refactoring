package theater;

/**
 * Play class representing a play.
 */
public class Play {
    private final String name;
    private final String type;

    /**
     * Constructs a Play with the given name and type.
     *
     * @param name the name of the play
     * @param type the type of the play (e.g., comedy, tragedy, etc.)
     */
    public Play(String name, String type) {
        this.name = name;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }
}
