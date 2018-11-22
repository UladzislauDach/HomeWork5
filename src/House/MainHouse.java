package House;

public class MainHouse {
    public static void main(String[] args) {
        System.out.println("Список квартир имеющих 3 комнаты:");
        House[] arrHouse = House.getArrHouse();
        for (int i = 0; i < arrHouse.length; i++) {
            if (arrHouse[i].getRoom() == 3) {
                System.out.println(arrHouse[i]);
            }
        }
        System.out.println("Список квартир имеющих 3 комнаты находящиееся на 5 - 20 этаже:");
        for (int i = 0; i < arrHouse.length; i++) {
            if (arrHouse[i].getRoom() == 3 && arrHouse[i].getFloor() > 4 && arrHouse[i].getFloor() < 21) {
                System.out.println(arrHouse[i]);
            }


        }
    }
}