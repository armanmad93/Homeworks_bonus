package class1;

public class Main {
    public static void main(String[] args) {
        MyCustomSupperArray myCustomSupperArray = new MyCustomSupperArray();
        MyCustomSupperArraySet myCustomSupperArraySet = new MyCustomSupperArraySet();

        myCustomSupperArray.add(1);
        myCustomSupperArray.add(2);
        myCustomSupperArray.add(10);

        System.out.println(myCustomSupperArray.toString());

        myCustomSupperArraySet.add(5);
        myCustomSupperArraySet.add(6);
        myCustomSupperArraySet.add(7);
        myCustomSupperArraySet.add(5);
        myCustomSupperArraySet.add(7);
        myCustomSupperArraySet.add(8);

        System.out.println(myCustomSupperArraySet.toString());

        myCustomSupperArray.remove(0);
        myCustomSupperArraySet.remove(0);

        System.out.println(myCustomSupperArray.toString());
        System.out.println(myCustomSupperArraySet.toString());

        System.out.println(myCustomSupperArray.size());
        System.out.println(myCustomSupperArraySet.size());

        myCustomSupperArray.swap(0, 1);
        myCustomSupperArraySet.swap(0, 1);

        System.out.println(myCustomSupperArray.toString());
        System.out.println(myCustomSupperArraySet.toString());

        int[] addArray = new int[2];
        addArray[0] = 2;
        addArray[1] = 4;

        myCustomSupperArray.addArray(addArray);
        myCustomSupperArraySet.addArray(addArray);

        System.out.println(myCustomSupperArray.toString());
        System.out.println(myCustomSupperArraySet.toString());


    }
}
