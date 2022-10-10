package com.janettecampbell;

import java.util.Scanner;
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
        double u =  (double)z / y;

        System.out.println(sum);
        System.out.println(sub);
        System.out.println(mul);
        System.out.println(mod);
        System.out.println(u);

        // Exponent (expression, exponent)
        double d = Math.pow(x,y);

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
        boolean compare7 =  (x3 < y2 && y2 > z2) || (z2 + 2 < 5 || x3 + 7 > y2);

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

        int[] nums = {2,3,54,6,6};
        double[] nums2 = {2.0, 3.0};

        String x4 = newArr[4];
        System.out.println(x4);
        int x5 = nums[4];
        System.out.println(x5);
        double x6 = nums2[1];
        System.out.println(x6);
        System.out.println();

        // Loops
    }
}