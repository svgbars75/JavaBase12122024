package sum_number;

public class SumNumber {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6};
        int sum = 0;
        for (int i = 0; i < numbers.length; i++)
        {System.out.println((i + 1) + ") Num is " + (i + 1) + ", sum is " + (sum = sum + numbers[i]));}
        System.out.println("------------------------");
        System.out.println("Sum of numbers is " + sum);
    }
}
