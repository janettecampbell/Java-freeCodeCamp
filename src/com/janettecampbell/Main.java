package com.janettecampbell;

import java.util.*;
import java.util.function.DoubleToIntFunction;

public class Main {
    public static void main(String[] args) {
        // Primitive Data Types
        int hello = 9;
        float num2 = 5.0F;
        double num3 = 5.0;
        boolean b = true;
        char c = 'h';

        // Non-primitive Data Types
        String str = "tim";

        int tim = hello;

        System.out.println(hello);
        System.out.println(tim);
        System.out.println(num2);
        System.out.println(num3);
        System.out.println(b);
        System.out.println(c);
        System.out.println(str);

        // Basic Operations
        int x;
        x = 6;

        System.out.println(x);

        int x1 = 5;
        int y = 7;
        int z = 57;
        int sum = x1 + y + z;
        int sub = x1 - y - z;
        int mul = x1 * y * z;
        int mod = z % 7;
        double u = (double) z / y;

        System.out.println(sum);
        System.out.println(sub);
        System.out.println(mul);
        System.out.println(mod);
        System.out.println(u);

        // Exponent (expression, exponent)
        double d = Math.pow(x, y);

        System.out.println(d);

        // Getting input
        Scanner scanner = new Scanner(System.in);

        System.out.print("String: ");
        String scanned = scanner.next();
        System.out.println(scanned);
        System.out.print("Int: ");
        int scannedInt = scanner.nextInt();
        System.out.println(scannedInt);
        System.out.print("Boolean: ");
        boolean scannedBool = scanner.nextBoolean();
        System.out.println(scannedBool);
        System.out.print("Double: ");
        double scannedDouble = scanner.nextDouble();
        System.out.println(scannedDouble);
        System.out.print("String to Int: ");
        String scannedToInt = scanner.next();
        int x2 = Integer.parseInt(scannedToInt);
        System.out.println(x2);
        System.out.println();

        // Conditions and Booleans
        int x3 = 6;
        int y2 = 23;
        int z2 = 10;
        String xString = "Hello";
        String yString = "Hi";

        // Conditionals
        // > < == >= <= !=
        boolean compare = x3 != y2;
        boolean compare1 = y2 < z2;
        boolean compare4 = x3 > y2 && z2 < y2;
        boolean compare5 = x3 > y2 || z2 < y2;
        boolean compare6 = !(x3 > y2 || z2 < y2);
        boolean compare7 = (x3 < y2 && y2 > z2) || (z2 + 2 < 5 || x3 + 7 > y2);

        System.out.println(compare);
        System.out.println(compare1);
        System.out.println(compare4);
        System.out.println(compare5);
        System.out.println(compare6);
        System.out.println();

        // String Conditionals
        System.out.println("String Conditionals");
        // Equals
        boolean compare2 = xString.equals(yString);

        System.out.println(compare2);

        // Does Not Equal
        // in if statement the format should be (!"success".equals(xString))
        // in case of null value for xString you won't get an error
        boolean compare3 = !xString.equals(yString);
        System.out.println(compare3);
        System.out.println();

        // if / else / else if
        System.out.print("Please type a name: ");
        scanner.nextLine();
        String name = scanner.nextLine().toLowerCase().trim();

        if ("tim".equals(name)) {
            System.out.println("You typed Tim");
        } else if ("hello".equals(name)) {
            System.out.println("Hi!");
        } else if ("hi".equals(name)) {
            System.out.println("Hello!");
        } else {
            System.out.println("Print");
        }
        System.out.println();

        // Nested Statements
        System.out.print("Please type an age: ");
        int age = scanner.nextInt();

        if (age >= 18) {
            System.out.print("What is your favorite food? ");
            scanner.nextLine();
            String food = scanner.nextLine().toLowerCase().trim();

            if ("pizza".equals(food)) {
                System.out.println("Mine too!");
            } else {
                System.out.println("Not my favorite.");
            }
        } else if (age >= 13) {
            System.out.println("You are a teenager!");
        } else {
            System.out.println("You are not a teenage or adult!");
        }
        System.out.println();

        //Arrays
        String[] newArr = new String[5];
        newArr[0] = "hello";
        newArr[1] = "hi";
        newArr[2] = "tim";
        newArr[3] = "bill";
        newArr[4] = "joe";

        int[] nums = {2, 3, 54, 6, 6};
        double[] nums2 = {2.0, 3.0};

        String x4 = newArr[4];
        System.out.println(x4);
        int x5 = nums[4];
        System.out.println(x5);
        double x6 = nums2[1];
        System.out.println(x6);
        System.out.println();

        // Loops
        // for loops
        int[] arr = {1, 5, 7, 3, 4, 5};

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 5) {
                System.out.println("Found a 5 at index " + i + "!");
            }
        }
        System.out.println();

        // for each loop
        int[] arr1 = {1, 5, 7, 3, 4, 5};
        String[] names = new String[5];
        int count = 0;

        for (int element : arr1) {
            System.out.println(element + " " + count);
            count++;
        }
        System.out.println();

        // for loop populate an array
        scanner.nextLine();
        for (int i = 0; i < names.length; i++) {
            System.out.print("String input: ");
            String input = scanner.nextLine().toLowerCase().trim();
            names[i] = input;
        }
        System.out.println();

        for (String name1 : names) {
            System.out.println(name1);
        }
        System.out.println();

        for (String name2 : names) {
            System.out.println(name2);
            if ("tim".equals(name2)) {
                break;
            }
        }
        System.out.println();

        // while loops
        System.out.print("Type a number: ");
        int x7 = scanner.nextInt();
        int count1 = 0;

        while (x7 != 10) {
            System.out.println("Type 10 to exit.");
            System.out.print("Type a number: ");
            x7 = scanner.nextInt();
            count++;
        }
        System.out.println("You tried " + count1 + " times.");
        System.out.println();

        // do while loops
        int x8;
        do {
            System.out.println("Type 10 to exit.");
            System.out.print("Type a number: ");
            x8 = scanner.nextInt();
        } while (x8 != 10);
        System.out.println();

        // Sets and Lists
        Set<Integer> t = new HashSet<Integer>(); // Also have TreeSet, LinkedHashSet
        t.add(5);
        t.add(7);
        t.add(5);
        t.add(9);
        t.add(-8);
        t.remove(9);
//        t.clear();  // Empties the set
        t.isEmpty();
        t.size();

        boolean x9 = t.contains(5);
        int x10 = t.size();

        System.out.println(t);
        System.out.println(x9);
        System.out.println(x10);
        System.out.println();

        // Tree Set
        Set<Integer> t1 = new TreeSet<Integer>(); // Has order
        t1.add(5);
        t1.add(7);
        t1.add(5);
        t1.add(9);
        t1.add(-8);
        t1.remove(9);
//        t1.clear();  // Empties the set
        t1.isEmpty();
        t1.size();

        boolean x11 = t1.contains(5);
        int x12 = t1.size();

        System.out.println(t1);
        System.out.println(x11);
        System.out.println(x12);
        System.out.println();

//        // LinkedHashSet - Do more research
//        Set<Integer> t2 = new LinkedHashSet<Integer>();
//        t2.add(5);
//        t2.add(7);
//        t2.add(5);
//        t2.add(9);
//        t2.add(-8);
//        t2.remove(9);
////        t2.clear();  // Empties the set
//        t2.isEmpty();
//        t2.size();
//
//        boolean x13 = t2.contains(5);
//        int x14 = t2.size();
//
//        System.out.println(t2);
//        System.out.println(x13);
//        System.out.println(x14);
//        System.out.println();

        // Lists
        // ArrayList
        ArrayList<Integer> t3 = new ArrayList<Integer>();
        t3.add(1);
        t3.add(2);
        t3.add(1);
        t3.add(2);
        t3.add(1);
        t3.add(2);
        t3.get(0); // array.get(index)
        t3.set(1, 5); // array.set(index, element) ex. change at index 1 is 5.
        t3.size();
        t3.subList(1, 3); // Get elements within a certain range ex. array.subList(starting index, ending index not included)

        System.out.println(t3.subList(1, 3));
        System.out.println();

        // LinkedList - Do more research
//        LinkedList<Integer> t4 = new LinkedList<Integer>();
//        t4.add(1);
//        t4.add(2);
//        t4.add(1);
//        t4.add(2);
//        t4.add(1);
//        t4.add(2);
//        t4.get(0); // array.get(index)
//        t4.set(1, 5); // array.set(index, element) ex. change at index 1 is 5.
//        t4.size();
//        t4.subList(1, 3); // Get elements within a certain range ex. array.subList(starting index, ending index not included)
//
//        System.out.println(t4.subList(1, 3));
//        System.out.println();

        // Maps & HashMaps
        // HashMap
        Map m = new HashMap(); // HashMap does not retain order

        m.put("tim", 5); // name of map.put(key, value);
        m.put("joe", "x");
        m.put(11, 999);

        System.out.println(m);
        System.out.println(m.get("tim")); // name of map.(key)
        System.out.println();

        // HashMap
        Map m1 = new TreeMap(); // keeps in a sorted order, not the order entered

        m1.put("tim", 5); // keys must be of the same data type
        m1.put("joe", "x");
//        m1.put(11, 999);

        System.out.println(m1);
        System.out.println();

        // LinkedHashMap
        Map m2 = new LinkedHashMap(); // keeps order entered in

        m2.put("tim", 5);
        m2.put("joe", "x");
        m2.put("a", "b");
//        m2.put(11, 999);
        m2.containsValue("b"); // checks if value exists in map (second entry)
        m2.containsKey("tim"); // checks if key value exists (first entry)
        m2.values(); // shows all the values (second entry)
//        m2.clear(); // empties the map
        m2.isEmpty(); // tells if the map is empty or not

        System.out.println(m2);
        System.out.println();

        // Maps Examples
    }
}