package sum_number.hw7_array_handline;

import java.util.Arrays;

public class ArrayHandline {
    public static void main(String[] args) {

        int[] numbers = new int[20]; /*Объявляем целочисленный массив int
                                      и одновременно присваиваем число элементов 20
                                      ( в каждом элементе значение "0" )
                                      */
        System.out.println("Значения элементов массива с length 20 :");

        for (int i = 0; i < numbers.length; i++) {  /*Заполняем случайными целочисленными
                                                     значениями элементы массива
                                                     в диапазоне от ( -100:100 )
                                                     c помощью цикла for
                                                     используя метод Math.random
                                                     */
            numbers[i] = (int) (Math.random() * (100 - (-100) + 1) + (-100));
        }
        System.out.println("Элементы масива: " + Arrays.toString(numbers)); /*Выводим в консоль рандомно
                                                                              сгенерированные значения элементов массива,
                                                                              преобразуя массив в строковое представление
                                                                              с помощью метода Arrays.toString(array)
                                                                             */

        // Через цикл for и if-else if находим сумму всех отрицательных чисел в массиве
        int sumnegativ = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < 0) {
                sumnegativ += numbers[i];
            } else if (numbers[i] >= 0) {
                numbers[i] = 0;
            }
        }
        System.out.println("Сумма отрицательных чисел: " + sumnegativ);

        // Количество чётных и нечётных чисел
        int even = 0;
        int not_even = 0;
        for (int i = 0; i < numbers.length; i++) {
            if ((numbers[i] % 2) != 0) {
                not_even++;
            } else {
                even++;
            }
        }
        System.out.println("Количество чётных чисел:" + even);
        System.out.println("Количество нечётных чисел:" + not_even);

       /* int sumOfEven =0;
        int sumOfOdd =0;
        for (int number : numbers){
            if (number%2 == 0) {
                sumOfEven += number;
            }
            else {
                sumOfOdd += number;
            }
        }
        System.out.println("Сумма чётных чисел:" + sumOfEven);
        System.out.println("Сумма нечётных чисел:" + sumOfOdd);*/
    }
}

