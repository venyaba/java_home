import java.util.Scanner;

public class Test {
    static int num1 = 10, num2 = 10;
     static double pi = 3.14159;
     static byte num3 = 22;
     static short num4 = 1200;
     static char f = 'a';
     static long num5 = 5600000l;
     static float num6 = 34.56f;
     static boolean isTrue = false;

    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.print("Введите целое число int:");
        int numberInt = sc.nextInt();
        System.out.print("Введите  число double:");
        double numberDouble = sc.nextDouble();
        System.out.print("Введите  число byte:");
        byte numberByte = sc.nextByte();
        System.out.print("Введите число float:");
        float numberFloat = sc.nextFloat();
        System.out.print("Введите число Long:");
        long numberLong = sc.nextLong();
        System.out.print("Введите число short:");
        short numberShort = sc.nextShort();
        System.out.print("Введите число char:");
        char charValue = sc.next().charAt(0);
        System.out.println("|-----------|--------------------|----------|-------------|----------------|-------------|-----------|");
        System.out.println("|----int----|-------double-------|---byte---|----float----|------long------|----short----|----char---|");
        System.out.printf("|%10d | %18f |%10d| %11.2f | %13d | %10d | %9c|\n", numberInt, numberDouble, numberByte,numberFloat,numberLong,numberShort,charValue);
        System.out.println("|-----------|--------------------|----------|-------------|----------------|-------------|-----------|");
    }
    //System.out.printf("|%11s| %6.2f| %8d|\n", name, weight, age);
}
