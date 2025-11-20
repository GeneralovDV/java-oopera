package show;

import staff.Actor;
import staff.Person;

import java.util.ArrayList;

public class Ballet extends MusicalShow {
    private Person choreographer;

    public Ballet(String title, int duration, Person director, Person musicAuthor,
                  String librettoText, Person choreographer) {
        super(title, duration, director, musicAuthor, librettoText);
        this.choreographer = choreographer;
    }
}
