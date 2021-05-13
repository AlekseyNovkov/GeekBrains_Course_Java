package ru.geekbrains.lesson1;

public class HelloWorld {

    public static void main(String[] args) {

        if (10 < 3 ^ 2 < 5) {
            System.out.println("Something");
        }

        boolean b = false;
        if (!b) {
            System.out.println("First");
        } else if (2 > 5){
            System.out.println("2 > 5");
        } else if (5 < 10) {
            System.out.println(" 5 < 10");
        } else {
            System.out.println("Else");
        }
    }

    private static void methodsExample() {
        int a = 10;
        int b = 2;
        int c = 10;

        float r = calculateExpression(a, b, c);
        System.out.println(r);
        System.out.println(calculateExpression(b, r));

        String s1 = "Hello ";
        String s2 = "world";
        String s3 = "!!!";
//        String s4 = s1 + s2 + s3;
        System.out.println(50 + 10 - 14 + "hello" + 100 + "world" + 100 + 500);
    }

    static float calculateExpression(int a, int b, int c) {
        float result = c + a * b;
        return result;
    }

    static float calculateExpression(int a, float f) {
        return a * f;
    }

    private static void arithmeticExample() {
        int a = 10;
        int b = 6;
        float c = 1.0f * a / b + 10;
        System.out.println(c);
        System.out.println(b / a);

        float a1 = 10;
        float b1 = 6;
        float c1 = a1 / b1;

        System.out.println(a1);

        System.out.println(20 % 13);

        a++;
        System.out.println(a);
        a++;
        System.out.println(a);

        a--;
        System.out.println(a);

        System.out.println(++a);

        a %= 10;
        System.out.println(a);
    }

    private static void variablesExample() {
        byte byteVariable = 100; //1 byte -> 8 bit -128...127
        byte b2;
        b2 = 50;
//        byte c = byteVariable - b2;
//        var a = 10;
        short shortValue = 500; //2 byte -> 16 bit -32768..32767
        int intVal = 2_000_000_000; //4 b -> 32 bit
        long longVal = 3_000_000_000_000_000L; //8byte -> 64 bit
        int i = intVal - 1_000_000 - shortValue;
//        System.out.println(i);

        char charVal = 73;    //16 bit 0..65535
        char c2 = 'H';
        char c3 = '\u1243';

        System.out.println(c3);

        boolean b1 = true; //1byte 8 bit
        boolean b3 = false;

        float f = 10.012223f; //32 bit
        double d = 50.0012233523432; //64 bit

        shortValue = 400;

        String s = "Hello world!";
        System.out.println(s);

        int someIntVariableForExample = 0;

        final int INTEGER_VARIABLE = 100;
    }

    static void printer() {
        System.out.print("Hello World!!!\n");
        System.out.print("Hi" + System.lineSeparator());
        System.out.println("Good Bye");
        System.out.println("Good Bye");
        System.out.print("Hello World!!!");
    }
}


