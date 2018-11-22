package House;

public class House {
    private static int[] ides = {1, 2, 3, 4, 5};
    private static int[] numbers = {22, 27, 12, 34, 25};
    private static int[] sqares = {60, 54, 75, 54, 76};
    private static int[] floors = {4, 7, 12, 21, 2};
    private static int[] rooms = {2, 3, 1, 3, 2};
    private static String[] streeds = {"October", "Lenina", "Koshevogo", "Nezavisimosti", "Mogilevskaya"};
    private static String[] typeOfs = {"house", "apartament", "apartament", "house", "house"};
    private static int[] terms = {45, 50, 30, 45, 40};

    private int id, number, sqare, floor, room, term;
    private String streed, typeOf;

    public House(int id, int number, int sqare, int floor, int room, int term, String streed, String typeOf) {
        this.id = id;
        this.number = number;
        this.sqare = sqare;
        this.floor = floor;
        this.room = room;
        this.term = term;
        this.streed = streed;
        this.typeOf = typeOf;
    }

    public static House[] getArrHouse() {
        House[] arrHouse = new House[5];
        for (int i = 0; i < arrHouse.length; i++) {
            arrHouse[i] = new House(ides[i], numbers[i], sqares[i], floors[i], rooms[i], terms[i], streeds[i], typeOfs[i]);
        }
        return arrHouse;
    }

    @Override
    public String toString() {
        return "House{" +
                "id=" + id +
                ", number=" + number +
                ", sqare=" + sqare +
                ", floor=" + floor +
                ", room=" + room +
                ", term=" + term +
                ", streed='" + streed + '\'' +
                ", typeOf='" + typeOf + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public int getNumber() {
        return number;
    }

    public int getSqare() {
        return sqare;
    }

    public int getFloor() {
        return floor;
    }

    public int getRoom() {
        return room;
    }

    public int getTerm() {
        return term;
    }

    public String getStreed() {
        return streed;
    }

    public String getTypeOf() {
        return typeOf;
    }
}
