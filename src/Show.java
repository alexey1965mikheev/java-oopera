import java.util.ArrayList;
import java.util.List;

public class Show {
    protected String title;
    protected int duration;
    protected Director director;
    protected List<Actor> listOfActors;

    public Show(String title, int duration, Director director) {
        this.title = title;
        this.duration = duration;
        this.director = director;
        this.listOfActors = new ArrayList<>();
    }

    public void addActor(Actor actor) {
        if (listOfActors.contains(actor)) {
            System.out.println("\nАктёр " + actor + " уже участвует в спектакле.");
        } else {
            listOfActors.add(actor);
        }
    }

    public void replaceActor(String surname, Actor newActor) {
        for (int i = 0; i < listOfActors.size(); i++) {
            Actor actor = listOfActors.get(i);
            if (actor.getSurname().equals(surname)) {
                listOfActors.set(i, newActor);
                System.out.println("\nАктёр " + surname + " в спектакле \"" + title + "\" заменен на актера " + newActor + ".");
                return;
            }
        }
        System.out.println("\nАктер с фамилией " + surname + " не найден в спектакле " + "\"" + title + "\".");
    }

    public void printActorsList() {
        System.out.println("\nСписок актёров спектакля \"" + title + "\":");
        if (listOfActors.isEmpty()) {
            System.out.println(" роли не распределены.");
        } else {
            for (Actor actor : listOfActors) {
                System.out.println(" " + actor);
            }
        }
    }
}
