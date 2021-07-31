package problems.array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
 *
 * You may assume that each input would have exactly one solution, and you may not use the same element twice.
 *
 * You can return the answer in any order.
 */
public class ArrayExample4 {
    public static void main(String[] args) {
        int[] numbers = new int[5];
        numbers[0] = 1;
        numbers[1] = 2;
        numbers[2] = 3;
        numbers[3] = 4;
        numbers[4] = 5;
        System.out.println("Indices array : " + Arrays.toString(ArrayExample4.twoSum(numbers, 9)));
    }

    private static int[] twoSum(int[] numbers, int target) {
        int[] indices = new int[2];
        Map<Integer, Integer> indexMap = new HashMap<>();
        for(int i = 0; i < numbers.length; i++) {
            int difference = target - numbers[i];
            if(indexMap.containsKey(difference)) {
                indices[0] = i;
                indices[1] = indexMap.get(difference);
                return indices;
            }
            indexMap.put(numbers[i], i);
        }
        return new int[] {-1, -1};
    }
}
