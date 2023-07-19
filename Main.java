import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String helloString = "Hello!";
        System.out.println(helloString);
        // Ссылки на ДЗ
        // HW2   https://github.com/Rimskiy8888/HW2_JAWA_Weather_11_07_2023
        // HW2 Class Weaser https://github.com/Rimskiy8888/HW2_JAWA_Weather_11_07_2023_class_weather
        // HW3 Counting Systems  https://github.com/Rimskiy8888/HW3_JAWA_countingSystems_16_07_2023

        // Задание 1

        byte byteBox = 29;
        int intBox = 888;
        double doubleBox = 12.88;
        float floatBox = 18.6F;

        int sum1 = (byteBox + intBox);
        int sum2 = sum1;
        byte sum3 = (byte)sum1;

        double sub1 = (intBox - doubleBox);
        double sub2 = sub1;
        int sub3 = (int)sub1;

        float mul1 = (float) (floatBox * doubleBox);
        double mul4 = (floatBox * doubleBox);
        float mul2 = mul1;
        double mul3 = mul1;

        System.out.println(sum2);
        System.out.println(sum3);
        System.out.println(sub2);
        System.out.println(sub3);
        System.out.println(mul2);
        System.out.println(mul3);

        System.out.println(mul4);
        System.out.println(mul1);

        // Задание 2


        Scanner scanner = new Scanner(System.in);

        System.out.println("Say your name: ");
        String yourName =  scanner.nextLine();

        String hello =  ("Hello: " + yourName);
        System.out.println(hello);

    }
}
