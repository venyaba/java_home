public class Main {
    public static void main(String[] args) {
        Car myCar = new Car("BMW",2022,34000,"Germany");

       System.out.print(myCar.getCountry() +"\n");
      // System.out.print(isFirstMoreThenOthers(8,9,4));
      // System.out.print(isFirstMoreThenAny(28,99,24));
     // System.out.print(isFirstMoreThenOneOfAny(28,97,254));

    }

    /** Создать статические(static) методы для решения основных арифметических
     операций: +, -, *, /
     **/
    public static int sum(int a, int b){
        return a + b;
    }

    public static int subtract(int a, int b){
        return a - b;
    }

    public static int mult(int a, int b){
        return a * b;
    }
    public static double division(double a, double b){
        return a / b;
    }

    /**
     Создать логические методы, которые будут проверять условия для переданных в них 3 переменных:
     a) первая переменная больше двух остальных;
     b) первая переменная больше хотя бы одной переменной;
     c) первая переменная больше только одной переменной.
     **/
    static public boolean isFirstMoreThenOthers( int a,int b,int c){
        return a > b && a > c;
    }

    static public boolean isFirstMoreThenAny( int a,int b,int c){
        return a > b ||  a > c;
    }

    static public boolean isFirstMoreThenOneOfAny( int a,int b,int c){
        return a > b && a < c;
    }


}
