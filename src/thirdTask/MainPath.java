package thirdTask;

public class MainPath {

    public static void main(String[] args) {

        Patient[] arrPathient = Patient.getArr();
        for (int i = 0; i < arrPathient.length; i++) {
            if (arrPathient[i].getDiagnos() == "Kashel") {
                System.out.println(arrPathient[i].getId() + " " + arrPathient[i].getName1() + " " + arrPathient[i].getName2());
            }
        }

    }
}
