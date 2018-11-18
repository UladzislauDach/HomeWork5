package firstTask;

public class MyMain {
    public static void main(String[] args) {
        NamedEntity first = new NamedEntity("first");
        NamedEntity second = new NamedEntity("second");
        NamedEntity third = new NamedEntity("third");
        NamedEntity fourth = new NamedEntity("fourth");
        NamedEntity fifth = new NamedEntity("fifth");

        NamedEntity[] arr = new NamedEntity[5];
        arr[0] = first;
        arr[1] = second;
        arr[2] = third;
        arr[3] = fourth;
        arr[4] = fifth;

        for (NamedEntity i : arr){
            System.out.println(i);
        }

    }

}



