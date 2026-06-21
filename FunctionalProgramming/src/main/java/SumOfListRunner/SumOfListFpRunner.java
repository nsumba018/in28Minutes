package SumOfListRunner;

import java.util.List;

public class SumOfListFpRunner {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1,6,9,35,8);
        //numbers.stream().forEach(element -> System.out.println(element));
        int sum = normalSum(numbers);
        System.out.println(sum);

        int sumOfEvenNumbers = getSumOfEvenNumbers(numbers);
        System.out.println(sumOfEvenNumbers);
    }

    private static int getSumOfEvenNumbers(List<Integer> numbers) {
        int sumOfEvenNumbers = numbers.stream().
                filter(number -> number % 2 == 0).
                reduce(0, (number1, number2) -> number1 + number2);
        return sumOfEvenNumbers;
    }

    private static int normalSum(List<Integer> numbers) {
        int sum = numbers.stream().
                reduce(0, (number1, number2) -> number1 + number2);
        return sum;
    }
}
