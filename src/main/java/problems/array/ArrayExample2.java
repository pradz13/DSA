package problems.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * You have a list of your favourite marvel super heroes.
 * heroes=['spider man','thor','hulk','iron man','captain america']
 *
 * 1. Length of the list
 * 2. Add 'black panther' at the end of this list
 * 3. You realize that you need to add 'black panther' after 'hulk',
 *    so remove it from the list first and then add it after 'hulk'
 * 4. Now you don't like thor and hulk because they get angry easily :)
 *    So you want to remove thor and hulk from list and replace them with doctor strange (because he is cool).
 * 5. Sort the heros list in alphabetical order (Hint. Use dir() functions to list down all functions available in list)
 */
public class ArrayExample2 {
    public static void main(String[] args) {
        List<String> superHeroes = new ArrayList<>(Arrays.asList("Spider Man", "Thor", "Hulk", "Iron Man", "Captain America"));

        System.out.println("No. of  super heroes : " + superHeroes.size());

        superHeroes.add("Black Panther");
        System.out.println("Super heroes after addition of Black Panther : " + superHeroes);

        superHeroes.remove("Black Panther");
        System.out.println("Super heroes after removal of Black Panther : " + superHeroes);

        superHeroes.add(3, "Black Panther");
        System.out.println("Super heroes after addition of Black Panther after Hulk: " + superHeroes);

        superHeroes.remove("Thor");
        superHeroes.remove("Hulk");
        superHeroes.add(1, "Doctor Strange");
        System.out.println("Super Heroes after removal of Thor, Hulk and addition of Doctor Strange : " + superHeroes);

        List<String> sortedSuperHeroes = superHeroes.stream().sorted().collect(Collectors.toList());
        System.out.println("Sorted List of Super Heroes : " + sortedSuperHeroes);
    }
}
