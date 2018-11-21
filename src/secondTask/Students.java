package secondTask;

public class Students {
    private static int[] ides = {1, 2, 3, 4, 5};
    private static String[] names1 = {"Dima", "Oleg", "Pasha", "Maksim", "Kosya"};
    private static String[] names2 = {"Jyk", "Levotsli", "Lyschik", "Buto", "Malarevich"};
    private static String[] names3 = {"Dmitrevich", "Olegovich", "Pavlovich", "Maksimovich", "Konstantinovich"};
    private static int[] births = {1994, 1995, 1995, 1996, 1997};
    private static String[] addressed = {"Narocch", "Cherevki", "Myadel", "Svaksti", "Stepenovo"};
    private static String[] phones = {"234234", "324234", "23423423", "32454654", "54645654"};
    private static String[] facultys = {"atf", "atf", "fes", "fes", "wtf"};
    private static int[] courses = {2, 1, 3, 2, 1};
    private static int[] groups = {34, 23, 34, 54, 23};

    private int id, birth, course, group;
    private String name1, name2, name3, address, phone,
            faculty;

    public Students(int id, int birth, int course, int group, String name1, String name2, String name3,
                    String address, String phone, String faculty) {
        this.id = id;
        this.birth = birth;
        this.course = course;
        this.group = group;
        this.name1 = name1;
        this.name2 = name2;
        this.name3 = name3;
        this.address = address;
        this.phone = phone;
        this.faculty = faculty;
    }

    public static Students[] getMass() {
        Students[] arr = new Students[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = new Students(ides[i], births[i], courses[i], groups[i], names1[i],
                    names2[i], names3[i], addressed[i], phones[i], facultys[i]);
        }
        return arr;
    }

    @Override
    public String toString() {
        return "Students{" +
                "id=" + id +
                ", birth=" + birth +
                ", course=" + course +
                ", group=" + group +
                ", name1='" + name1 + '\'' +
                ", name2='" + name2 + '\'' +
                ", name3='" + name3 + '\'' +
                ", address='" + address + '\'' +
                ", phone='" + phone + '\'' +
                ", faculty='" + faculty + '\'' +
                '}';
    }

    public int getId() {

        return id;
    }

    public int getBirth() {
        return birth;
    }

    public int getCourse() {
        return course;
    }

    public int getGroup() {
        return group;
    }

    public String getName1() {
        return name1;
    }

    public String getName2() {
        return name2;
    }

    public String getName3() {
        return name3;
    }

    public String getAddress() {
        return address;
    }

    public String getPhone() {
        return phone;
    }

    public String getFaculty() {
        return faculty;
    }
}
