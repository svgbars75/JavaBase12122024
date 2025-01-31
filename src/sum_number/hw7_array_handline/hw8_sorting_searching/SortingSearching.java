package sum_number.hw7_array_handline.hw8_sorting_searching;

import java.util.Arrays;

public class SortingSearching {
    public static void main(String[] args) {
        int[] sort = new int[15];
        for (int i = 0; i < sort.length; i++) {
            sort[i] = (int) (Math.random() * (100)+1);
        }
        System.out.println("Элементы несортированного массива:" + Arrays.toString(sort));


    }
}