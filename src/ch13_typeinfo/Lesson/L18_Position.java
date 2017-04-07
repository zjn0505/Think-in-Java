package ch13_typeinfo.Lesson;

/**
 * Created by Jienan on 2017/4/7.
 */
public class L18_Position {
    private String title;
    private L18_Person person;
    public L18_Position(String jobTitle, L18_Person employee) {
        title = jobTitle;
        person = employee;
        if (person == null)
            person = L18_Person.NULL;
    }
    public L18_Position(String jobTitle) {
        title = jobTitle;
        person = L18_Person.NULL;
    }
    public String getTitle() { return title; }
    public void setTitle(String newTitle) { title = newTitle; }
    public L18_Person getPerson() { return person; }
    public void setPerson(L18_Person newPerson) {
        person = newPerson;
        if (person == null)
            person = L18_Person.NULL;
    }

    @Override
    public String toString() {
        return "Position: " + title + " " + person;
    }
}
