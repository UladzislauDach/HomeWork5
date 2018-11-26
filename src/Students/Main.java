package Students;
public class Main {
     static Students [] st = Students.getMass();

    public static void main(String[] args) {
        spisFaculty();
        spisFacultyCourse();
        spisOld();
        spisGroup();

    }

    public static void spisFaculty() {
        System.out.println("Список студентов ФЭС:");
        for (int i = 0; i < st.length; i++) {
            if (st[i].getFaculty() == "fes") {
                System.out.println(st[i].getName1() + " " + st[i].getName2() + " "
                        + st[i].getName3());
            }
        }
        System.out.println();
    }

    public static void spisFacultyCourse() {
        System.out.println("Список студентов 1го курса, факультета АТФ");
        for (int i = 0; i < st.length; i++) {
            if (st[i].getCourse() == 1 && st[i].getFaculty() == "atf") {
                System.out.println(st[i].getName1() + " " + st[i].getName2() + " "
                        + st[i].getName3());
            }
        }
        System.out.println();
    }

    public static void spisOld() {
        System.out.println("Список студентов родившихся после 1995 года");
        for (int i = 0; i < st.length; i++) {
            if (st[i].getBirth() > 1995) {
                System.out.println(st[i].getName1() + " " + st[i].getName2() + " "
                        + st[i].getName3());
            }
        }
        System.out.println();
    }

    public static void spisGroup() {
        System.out.println("Список студентов группы 23");
        for (int i = 0; i < st.length; i++) {
            if (st[i].getGroup() == 23)
                System.out.println(st[i].getName1() + " " + st[i].getName2() + " "
                        + st[i].getName3());
        }
        System.out.println();
    }
}