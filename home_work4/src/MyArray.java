public class MyArray {
    int arr [] = new int[10];

    /**
     * Метод для вставки элемента по индексу в массив
     * @param insertIndex индекс элемента в массиве
     * @param newValue значение вставляемого элемента
     */
    public void insertIntoArray(int insertIndex, int newValue){
        //Перемещаем элементы ниже точки вставки
        for(int i=arr.length-1; i > insertIndex; i--){
            arr[i] = arr[i-1];
        }
        // Вставляем новый элемент
        arr[insertIndex] = newValue;
    }

    /**
     * Метод удаления элемента масива по индексу, путем перезаписи значения на следующее в массиве.
     * @param removeIndex индекс удаляемого элемента
     */
    public void removeFromArray(int removeIndex){
        for(int i = removeIndex; i < arr.length -1; i++){
            arr[i] = arr[i + 1];
        }
    }

    /**
     * Линейный метод поиска элемента в массиве.
     * @param value значение элепента, который нужнро найти
     * @return возвращает индекс элемента, если условие прохода по циклу находит совпадение при
     * сравнении элементов или возвращает -1 если такого элемента в массиве нет
     */
    public int find(int value){
        for (int i = 0; i < arr.length; i++) {
            if(value == arr[i]){
                return i;
            }
        }
        return -1;
    }


    /**
     * Метод сортировки пузырьком от наименьшего к большему значению масива.
     */
    public void sort(){
        int temp = 0;
        for (int i = arr.length-1; i >= 0; i--) {
            for (int j = arr.length-1; j >= 0; j--) {
                if( arr[i] > arr[j]){
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    @Override
    public String toString() {
        String str = " ";
        for (int i = 0; i < arr.length ; i++) {
            str += arr[i] + " ";
        }
        return str;
    }
}




/**
 *  1 уровень сложности: 1) Сделать класс для управления массивом из 10 элементов.
 *  Реализовать операции: вставка, удаление, сортировка, поиск, вывод в строку.
 */
