package thirdTask;

public class Patient {
    private static int[] ides = {1, 2, 3, 4, 5};
    private static String[] names1 = {"Vikonit", "Wasdwd", "Kdsfew", "Ddsfef", "Gefds"};
    private static String[] names2 = {"Alex", "Jack", "Pavel", "Sergei", "Viktor"};
    private static String[] names3 = {"Alexandrovic", "Nikolaevich", "Sergeevich", "Viktorovich", "Olegovich"};
    private static String[] addresses = {"Minsk", "Grodno", "Mozir", "Slonim", "Volkovisk"};
    private static String[] phones = {"4364364", "234123", "232412", "354234", "5746344"};
    private static int[] numbersMeds = {71, 33, 64, 75, 43};
    private static String[] diagnoses = {"ORZ", "ORVI", "Kashel", "ORZ", "Kashel"};

    private int id, numbersMed;
    private String name1, name2, name3, address, phone, diagnos;

    public Patient(int id, int numbersMed, String name1, String name2, String name3, String address,
                   String phone, String diagnos) {
        this.id = id;
        this.numbersMed = numbersMed;
        this.name1 = name1;
        this.name2 = name2;
        this.name3 = name3;
        this.address = address;
        this.phone = phone;
        this.diagnos = diagnos;
    }

    public static Patient[] getArr() {
        Patient[] patArr = new Patient[5];
        for (int i = 0; i < patArr.length; i++) {
            patArr[i] = new Patient(ides[i], numbersMeds[i], names1[i], names2[i], names3[i], addresses[i],
                    phones[i], diagnoses[i]);
        }
        return patArr;
    }



    @Override
    public String toString() {
        return "Patient{" +
                "id=" + id +
                ", numbersMed=" + numbersMed +
                ", name1='" + name1 + '\'' +
                ", name2='" + name2 + '\'' +
                ", name3='" + name3 + '\'' +
                ", address='" + address + '\'' +
                ", phone='" + phone + '\'' +
                ", diagnos='" + diagnos + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public int getNumbersMed() {
        return numbersMed;
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

    public String getDiagnos() {
        return diagnos;
    }
}
