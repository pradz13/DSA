package problems.array;

import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * Create a list of all odd numbers between 1 and a max number.
 * Max number is something you need to take from a user
 */
public class ArrayExample3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter the max number : ");
        int maxNumber = scanner.nextInt();
        System.out.println("Maximum number given by the user : " + maxNumber);
        List<Integer> oddNumberList = IntStream.rangeClosed(1, maxNumber).filter(number -> number % 2 != 0).boxed().collect(Collectors.toList());
        System.out.println("List of odd numbers : " + oddNumberList);
    }
}
