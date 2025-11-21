package show;

import staff.Actor;
import staff.Director;
import staff.Person;

import java.util.ArrayList;

public class Show {
    protected String title;
    protected int duration;
    protected Director director;
    protected ArrayList<Actor> listOfActors = new ArrayList<>();

    public Show(String title, int duration, Director director) {
        this.title = title;
        this.duration = duration;
        this.director = director;
    }

    public void addNewActor(Actor newActor) {
        if (listOfActors.contains(newActor)) {
            System.out.println("Актер " + newActor.getName() + " " + newActor.getSurname() + " уже существует!");
            return;
        }
        listOfActors.add(newActor);
        System.out.println("Актер " + newActor.getName() + " " + newActor.getSurname() + " успешно добавлен.");
    }

    public void printListOfActors() {
        System.out.println("Список актеров:");
        for (Actor actor : listOfActors) {
            System.out.println(actor);;
        }
    }

    public void replaceActor(Actor newActor, String surnameReplaceableActor) {
        int matchIndex = -1;
        int matches = 0;

        for (int i = 0; i < listOfActors.size(); i++) {
            if (surnameReplaceableActor.equals(listOfActors.get(i).getSurname())) {
                matches++;
                matchIndex = i;
            }
        }

        if (matches == 0) {
            System.out.println("Предупреждение: актёр с фамилией " + surnameReplaceableActor + " не найден.");
        } else if (matches > 1) {
            System.out.println("Ошибка: найдено несколько актёров с фамилией " + surnameReplaceableActor);
        } else {
            listOfActors.set(matchIndex, newActor);
            System.out.println("Актёр с фамилией " + surnameReplaceableActor + " заменён на " +
                    newActor.getName() + " " + newActor.getSurname() + ".");
        }
    }

    public static void printName(Director person) {
        System.out.println(person);
    }
}
