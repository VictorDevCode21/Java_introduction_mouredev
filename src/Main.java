import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
//        System.out.println("Hello, Java! I hate this language");

        String myString = "My first string in Java";
//        System.out.println(myString);

        System.out.println("Data Types in Java: \n");

        myString = "This is my second string in Java";
        System.out.println(myString);

        final String myConstant = "This is my constant string in Java";
        System.out.println(myConstant);

        Integer myInt = 10;
        System.out.println("This is an Integer: " + myInt);

        double myDouble = 10.5;
        System.out.println("This is my Double: " + myDouble);

        Float myFloat = 10.5f;
        System.out.println("This is my float: " + myFloat);

        Boolean myBoolean = true;
        System.out.println("This is my Boolean: " + myBoolean);

        myBoolean = null;
        System.out.println("This is my Boolean v2: " + myBoolean + "\n");


        System.out.println("Conditionals in Java: \n");

        myFloat = null;
        if (myFloat != null) {
            System.out.println("This is my non-null Float: " + myFloat);
        } else {
            System.out.println("This is my null Float: " + myFloat);
        }

        if (myInt >= 10) {
            System.out.println("My integer is greater or equal than 10 \n");
        } else if (myInt < 10) {
            System.out.println("My integer is lesser than 10 ");
        }

        System.out.println("Data structures in Java: \n");

        List<String> myList = new ArrayList<>();
        myList.add(myString);
        myList.add(myInt.toString());
        System.out.println("My list: " + myList);

        Map<String, String> myMap = new HashMap<>();
        myMap.put("myString", myString);
        myMap.put("myInt", myInt.toString());
        System.out.println("My map: " + myMap + "\n");

        System.out.println("Loops in Java: \n");

        for (int i = 0; i <myList.size(); i++) {
            System.out.println("Element at index " + i + " is: " + myList.get(i));
        }
        Main myMain = new Main();

        System.out.println("\n");
        System.out.println("Function in Java: \n");

        System.out.println(myMain.myFunction(10, 5));
        System.out.println(myMain.myFunction(855, 5));
    }

    public int myFunction(int myFirstNumber, int mySecondNumber) {
        return myFirstNumber + mySecondNumber;
    }
}

