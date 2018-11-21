package secondTask;

public class StudMain {
    public static void main(String[] args) {
        spisFaculty();
        spisFacultyCourse();
        spisOld();
        spisGroup();

    }

    public static void spisFaculty() {
        System.out.println("Список студентов ФЭС:");
        Students[] arrStudents = Students.getMass();
        for (int i = 0; i < arrStudents.length; i++) {
            if (arrStudents[i].getFaculty() == "fes") {
                System.out.println(arrStudents[i].getName1() + " " + arrStudents[i].getName2() + " "
                        + arrStudents[i].getName3());
            }
        }
        System.out.println();
    }

    public static void spisFacultyCourse() {
        System.out.println("Список студентов 1го курса, факультета АТФ");
        Students[] arrStudents = Students.getMass();
        for (int i = 0; i < arrStudents.length; i++) {
            if (arrStudents[i].getCourse() == 1 && arrStudents[i].getFaculty() == "atf") {
                System.out.println(arrStudents[i].getName1() + " " + arrStudents[i].getName2() + " "
                        + arrStudents[i].getName3());
            }
        }
        System.out.println();
    }

    public static void spisOld() {
        System.out.println("Список студентов родившихся после 1995 года");
        Students[] arrStudents = Students.getMass();
        for (int i = 0; i < arrStudents.length; i++) {
            if (arrStudents[i].getBirth() > 1995) {
                System.out.println(arrStudents[i].getName1() + " " + arrStudents[i].getName2() + " "
                        + arrStudents[i].getName3());
            }
        }
        System.out.println();
    }

    public static void spisGroup() {
        System.out.println("Список студентов группы 23");
        Students[] arrStudents = Students.getMass();
        for (int i = 0; i < arrStudents.length; i++) {
            if (arrStudents[i].getGroup() == 23)
                System.out.println(arrStudents[i].getName1() + " " + arrStudents[i].getName2() + " "
                        + arrStudents[i].getName3());
        }
        System.out.println();
    }
}
