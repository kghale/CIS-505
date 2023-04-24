package Module_6.ComposerApp;

import java.util.ArrayList;
import java.util.List;

public class MemComposerDao implements ComposerDao {
    private List<Composer> composers;

    // Default constructor
    public MemComposerDao() {
        this.composers = new ArrayList<>();
        this.composers.add(new Composer(1007, "Ludwig van Beethoven", "Classical"));
        this.composers.add(new Composer(1008, "Johann Sebastian Bach", "Classical"));
        this.composers.add(new Composer(1009, "Wolfgang Amadeus Mozart", "Classical"));
        this.composers.add(new Composer(1010, "Johannes Brahms", "Classical"));
        this.composers.add(new Composer(1011, "Joseph Haydn", "Classical"));
    }

    @Override
    public List<Composer> findAll() {
        return composers;
    }

    @Override
    public Composer findBy(Integer id) {
        for (Composer composer : composers) {
            if (composer.getId() == id) {
                return composer;
            }
        }
        return null;
    }

    @Override
    public void insert(Composer composer) {
        composers.add(composer);
    }
}
