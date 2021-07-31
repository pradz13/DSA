package problems.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Let us say your expense for every month are listed below,
 * January - 2200
 * February - 2350
 * March - 2600
 * April - 2130
 * May - 2190
 * Create a list to store these monthly expenses and using that find out,
 *
 * 1. In Feb, how many dollars you spent extra compare to January?
 * 2. Find out your total expense in first quarter (first three months) of the year.
 * 3. Find out if you spent exactly 2000 dollars in any month
 * 4. June month just finished and your expense is 1980 dollar. Add this item to our monthly expense list
 * 5. You returned an item that you bought in a month of April and
 * got a refund of 200$. Make a correction to your monthly expense list
 * based on this
 */
public class ArrayExample1 {
    public static void main(String[] args) {
        List<Long> expenseList = new ArrayList<>(Arrays.asList(2200L, 2350L, 2600L, 2130L, 2190L));

        long januaryExpense = expenseList.get(0);
        long februaryExpense = expenseList.get(1);
        long marchExpense = expenseList.get(2);
        long aprilExpense = expenseList.get(3);

        System.out.println("Dollars spent extra in February compared to January : " + (februaryExpense - januaryExpense));

        System.out.println("Total experience in the first quarter : " + (januaryExpense + februaryExpense + marchExpense));

        boolean isExpenseMatch = expenseList.stream().anyMatch(expense -> expense == 2000L);
        System.out.println("Has spent exactly 2000$ in any month? =>" + isExpenseMatch);

        long juneExpense = 1980L;
        expenseList.add(juneExpense);
        System.out.println("Monthly expense list after adding the June month's expense : " + expenseList);

        long refundInApril = 200L;
        expenseList.set(3, aprilExpense - refundInApril);
        System.out.println("Updated Monthly expense list after refund in April :" + expenseList);
    }
}
