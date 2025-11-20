package show;

import staff.Actor;
import staff.Person;

import java.util.ArrayList;

public class MusicalShow extends Show {
    protected Person musicAuthor;
    protected String librettoText;

    public MusicalShow(String title, int duration, Person director, Person musicAuthor, String librettoText) {
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
