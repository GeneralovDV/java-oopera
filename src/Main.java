import staff.Gender;
import show.Ballet;
import show.MusicalShow;
import show.Opera;
import show.Show;
import staff.Actor;
import staff.Director;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        System.out.println("Поехали!");

        Actor actor1 = new Actor("Александр", "Пушкин", Gender.MALE, 180);
        Actor actor2 = new Actor("Сергей", "Иванов", Gender.MALE, 170);
        Actor actor3 = new Actor("Анна", "Петрова", Gender.FEMALE, 160);

        Director director1 = new Director("Иван", "Сидоров", Gender.MALE, 10);
        Director director2 = new Director("Мария", "Кац", Gender.FEMALE, 3);
        Director choreographer = new Director("Ольга", "Федоровна", Gender.FEMALE, 5);
        Director musicAuthor = new Director("Василий", "Петров", Gender.MALE, 3);

        Show show = new Show("Мой первый спектакль", 120, director1);
        MusicalShow musicalShow = new MusicalShow("Мой второй спектакль", 123, director2, musicAuthor,
                "Текст либретто");
        Ballet ballet = new Ballet("Мой третий спектакль", 123, director2, musicAuthor,
                "Текст либретто", choreographer);
        Opera opera = new Opera("Мой четвертый спектакль", 123, director1,
                musicAuthor, "Текст либретто", 20);

        show.addNewActor(actor1);
        show.addNewActor(actor2);

        musicalShow.addNewActor(actor1);
        musicalShow.addNewActor(actor3);

        ballet.addNewActor(actor1);
        ballet.addNewActor(actor2);
        ballet.addNewActor(actor3);

        opera.addNewActor(actor1);
        opera.addNewActor(actor2);
        opera.addNewActor(actor3);
        opera.addNewActor(actor3);

        show.printListOfActors();
        musicalShow.printListOfActors();
        ballet.printListOfActors();
        opera.printListOfActors();

        Director.printName(director1);

        opera.printLibretto();

        musicalShow.replaceActor(actor3, actor1.getSurname());
    }
}
