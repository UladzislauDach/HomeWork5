package MyTask.LiftSlon;

public class Student {
    private static int[] ids = {1, 2};
    private static int[] olds = {22, 21};
    private static String[] names = {"oleg", "ryslan"};
    private static String[] phones = {"23423", "25432"};

    private int id, old;
    private String name, phone;

    public Student(int id, int old, String name, String phone) {
        this.id = id;
        this.old = old;
        this.name = name;
        this.phone = phone;
    }

    public static Student[] getMass() {
        Student[] person = new Student[2];
        for (int i = 0; i < person.length; i++) {
            person[i] = new Student(ids[i], olds[i], names[i], phones[i]);
        }
        return person;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", old=" + old +
                ", name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public int getOld() {
        return old;
    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }
}
