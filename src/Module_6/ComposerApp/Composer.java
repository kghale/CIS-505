package Module_6.ComposerApp;

public class Composer {
    private int id;
    private String name;
    private String genre;

    // Default constructor
    public Composer() {
        this.id = 0;
        this.name = "";
        this.genre = "";
    }

    // Argument constructor
    public Composer(int id, String name, String genre) {
        this.id = id;
        this.name = name;
        this.genre = genre;
    }

    // Accessor methods
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getGenre() {
        return genre;
    }

    // Override toString method
    @Override
    public String toString() {
        return "\tId: " + id + "\n\tName: " + name + "\n\tGenre: " + genre + "\n";
    }
}
