import java.util.Objects;

public class Actor extends Person {
    protected int height;

    public Actor(String name, String surname, Gender gender, int height) {
        super(name, surname, gender);
        this.height = height;
    }

    public int getHeight() {
        return height;
    }

    @Override
    public String toString() {
        return name + " " + surname + " (" + height + " см)";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Actor actor = (Actor) obj;
        return Objects.equals(name, actor.name) &&
               Objects.equals(surname, actor.surname) &&
               Objects.equals(height, actor.height);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, height);
    }
}

