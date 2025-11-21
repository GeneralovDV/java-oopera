package show;

import staff.Director;
import staff.Person;

public class MusicalShow extends Show {
    protected Person musicAuthor;
    protected String librettoText;

    public MusicalShow(String title, int duration, Director director, Person musicAuthor, String librettoText) {
        super(title, duration, director);
        this.musicAuthor = musicAuthor;
        this.librettoText = librettoText;
    }

    public void printLibretto() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return
                "Либретто = '" + librettoText + '\'';
    }
}
