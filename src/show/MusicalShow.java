package show;

import staff.Actor;

import java.util.ArrayList;

public class MusicalShow extends Show {
    private String musicAuthor;
    private String librettoText;

    public MusicalShow(String title, int duration, String director, ArrayList<Actor> listOfActors,
                       String musicAuthor, String librettoText) {
        super(title, duration, director, listOfActors);
        this.musicAuthor = musicAuthor;
        this.librettoText = librettoText;
    }

    public void printLibretto() {
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return
                "Либретто = '" + librettoText + '\'';
    }
}
