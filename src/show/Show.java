package show;

import staff.Actor;
import staff.Person;

import java.util.ArrayList;

public class Show {
    private String title;
    private int duration;
    private String director;
    private ArrayList<Actor> listOfActors;

    public Show(String title, int duration, String director, ArrayList<Actor> listOfActors) {
        this.title = title;
        this.duration = duration;
        this.director = director;
        this.listOfActors = listOfActors;
    }

    private boolean isActorExist(Actor newActor) {
        for (Actor actor : listOfActors) {
            if (actor.getName().equals(newActor.getName())
                    && actor.getSurname().equals(newActor.getSurname())
                    && actor.getHeight() == newActor.getHeight()) {
                return true;
            }
        }
        return false;
    }

    public void addNewActor(Actor newActor) {
        if (isActorExist(newActor)) {
            System.out.println("Актер " + newActor.getName() + " " + newActor.getSurname() + " уже существует!");
            return;
        }
        listOfActors.add(newActor);
        System.out.println("Актер " + newActor.getName() + " " + newActor.getSurname() + " успешно добавлен.");
    }

    public void printListOfActors() {
        System.out.println("Список актеров:");
        for (Actor actor : listOfActors) {
            Person.printName(actor);
        }
    }

    public void replaceActor(Actor newActor, Actor replaceableActor) {
        if (!isActorExist(newActor)) {
            System.out.println("Актер с именем " + newActor.getName() + " " +
                    newActor.getSurname() + " в спектакле не участвует!");
            return;
        }
        int index = listOfActors.indexOf(replaceableActor);
        if (index != -1) {
            listOfActors.set(index, newActor);
            System.out.println("Актер " + replaceableActor.getName() + " " + replaceableActor.getSurname() +
                    " успешно заменен на " + newActor.getName() + " " + newActor.getSurname());
        }
    }
}
