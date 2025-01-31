package sum_number.hw7_array_handline.hw8_sorting_searching;

import java.util.Arrays;

public class SortingSearching {
    public static void main(String[] args) {
        int[] sort = new int[15];
        for (int i = 0; i < sort.length; i++) {
            sort[i] = (int) (Math.random() * (100)+1);
        }
        System.out.println("Элементы несортированного массива:" + Arrays.toString(sort));

        for ( int i = 1; i < sort.length; i++){
            // Assign the key
            int key =sort[i];
            int j = i - 1;
            // Place the element before all greater elements
            while (j >= 0 && sort[j] > key){
                sort[j+1] = sort[j];
                j--;
            }
            sort[j+1] = key;
        }
        System.out.println("Элементы отсортированного массива по возростанию:" + Arrays.toString(sort));

    }
}