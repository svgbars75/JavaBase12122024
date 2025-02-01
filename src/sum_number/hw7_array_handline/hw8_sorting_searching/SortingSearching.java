package sum_number.hw7_array_handline.hw8_sorting_searching;

import java.util.Arrays;
import java.util.Scanner;

public class SortingSearching {
    public static void main(String[] args) {
        int[] sort = new int[15];
        for (int i = 0; i < sort.length; i++) {
            sort[i] = (int) (Math.random() * (100) + 1);
        }
        System.out.println("Элементы несортированного массива:" + Arrays.toString(sort));

        for (int i = 1; i < sort.length; i++) {
            // Assign the key
            int key = sort[i];
            int j = i - 1;
            // Place the element before all greater elements
            while (j >= 0 && sort[j] > key) {
                sort[j + 1] = sort[j];
                j--;
            }
            sort[j + 1] = key;
        }
        System.out.println("Элементы отсортированного массива по возростанию:" + Arrays.toString(sort));


        Scanner s = new Scanner(System.in);
        System.out.print("Введите число для поиска: ");
        int target = s.nextInt();


       /*int index=-1;
        int left = 0;
        int right = sort.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (sort[mid] < target) {
                left = mid + 1;
            } else if (sort[mid] > target) {
                left = mid - 1;
            } else if (sort[mid] == target){
              index=  mid;
              break;
            }
        }
        System.out.println("Индекс числа " + target + " в отсортированом массиве:"+index );*/

            int mid;
            int left = 0;
            int  right = sort.length - 1;
            while (left <= right) {
                mid = left + (right - left) / 2;
                if (sort[mid] == target) {
                    return mid; // Повертаємо індекс, якщо знай

                } else if (sort[mid] < target) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }
            return -1; // Повертаємо -1, якщо не знайдено
            System.out.println("Индекс числа " + target + " в отсортированом массиве:" + mid);
            System.out.println("такого числа нет");
    }
}