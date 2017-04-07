package ch13_typeinfo.Lesson;

import java.util.ArrayList;

/**
 * Created by Jienan on 2017/4/7.
 */
public class L18_Staff extends ArrayList<L18_Position> {
    public void add(String title, L18_Person person) {
        add(new L18_Position(title, person));
    }
    public void add(String... titles) {
        for (String title : titles)
            add(new L18_Position(title));
    }
    public L18_Staff(String... titles) {
        add(titles);
    }
    public boolean positionAvailable(String title) {
        for (L18_Position position : this) {
            if (position.getTitle().equals(title) &&
                    position.getPerson() == L18_Person.NULL)
                return true;
        }
        return false;
    }
    public void fillPosition(String title, L18_Person hire) {
        for (L18_Position position : this) {
            if (position.getTitle().equals(title) &&
                    position.getPerson() == L18_Person.NULL) {
                position.setPerson(hire);
                return;
            }
        }
        throw new RuntimeException(
            "Position " + title + " not available");
    }

    public static void main(String[] args) {
        L18_Staff staff = new L18_Staff("President", "CTO",
                "Marketing Manager", "Product Manager", "Project Lead",
                "Software Engineer", "Soft Engineer", "Soft Engineer",
                "Software Engineer", "Test Engineer", "Technical Writer");
        staff.fillPosition("President",
                new L18_Person("Me", "Last", "The Top, Lonely At"));
        staff.fillPosition("Project Lead",
                new L18_Person("Janet", "Planner", "The Burbs"));
        if (staff.positionAvailable("Software Engineer"))
            staff.fillPosition("Software Engineer",
                    new L18_Person("Bob", "Coder", "Bright Light City"));
        System.out.println(staff);
    }
}
