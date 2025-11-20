package show;

import staff.Actor;
import staff.Person;

import java.util.ArrayList;

public class Show {
    protected String title;
    protected int duration;
    protected Person director;
    protected ArrayList<Actor> listOfActors = new ArrayList<>();

    public Show(String title, int duration, Person director) {
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
        boolean replaced = false;

        for (int i = 0; i < listOfActors.size(); i++) {
            if (surnameReplaceableActor.equals(listOfActors.get(i).getSurname())) {
                listOfActors.set(i, newActor);
                replaced = true;
                System.out.println("Актёр с фамилией " + surnameReplaceableActor + " заменён на " +
                        newActor.getName() + " " + newActor.getSurname() + ".");
            }
        }
        if (!replaced) {
            System.out.println("Предупреждение: актёр с фамилией " + surnameReplaceableActor + " не найден.");
        }
    }
}
