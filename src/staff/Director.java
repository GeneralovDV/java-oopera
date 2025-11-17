package staff;

import constants.Gender;

public class Director extends Person {
    private int numberOfShows;

    public Director(String name, String surname, Gender gender, int numberOfShows) {
        super(name, surname, gender);
        this.numberOfShows = numberOfShows;
    }

    @Override
    public String toString() {
        return "Режиссер {" +
                "Имя = '" + super.getName() + '\'' +
                ", Фамилия = '" + super.getSurname() + '\'' +
                ", Пол = " + super.getGender().getDisplayName() +
                ", (Количество спектаклей = " + numberOfShows + ")" +
                '}';
    }
}
