package MyTask.name;

public class NamedEntity {
    private String name;
    private static String names[] = {"First", "Second", "Third", "Fourth", "Fifth"};

    NamedEntity(String name) {
        this.name = name;
    }

    public static NamedEntity[] getMass() {
        NamedEntity[] persons = new NamedEntity[5];

        for (int i = 0; i < persons.length; i++) {
            persons[i] = new NamedEntity(names[i]);
        }
        return persons;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "NamedEntity{" +
                "name='" + name + '\'' +
                '}';
    }


}