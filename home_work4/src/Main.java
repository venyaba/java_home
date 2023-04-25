public class Main {


    public static void main(String[] args) {
        MyArray array = new MyArray();

       array.insertIntoArray(0,22);
        array.insertIntoArray(1,3);
        array.insertIntoArray(2,100);
        array.insertIntoArray(3,7);
        array.insertIntoArray(3,45);
        array.insertIntoArray(3,11);
        array.insertIntoArray(3,32);
        array.insertIntoArray(3,1);
        array.insertIntoArray(4,24);
        array.insertIntoArray(4,24);
        System.out.println("find" + " " + array.find(100));
        System.out.println("вывод в строку" + array.toString());
        array.sort();
        System.out.println("Отсортированый массив" + array.toString());

    }
}


