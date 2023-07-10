import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Runner {

    public static void main(String[] args) {

//        SCOTTISH ISLANDS
        List<String> scottishIslands = new ArrayList<>();
        scottishIslands.add("Jura");
        scottishIslands.add("Mull");
        scottishIslands.add("Skye");
        scottishIslands.add("Arran");
        scottishIslands.add("Tresco");

//        1. Add "Coll" to the end of the list

        scottishIslands.add("Coll");

//        2. Add "Tiree" to the start of the list

        scottishIslands.add(0, "Tiree");

//        3. Add "Islay" after "Jura" and before "Mull"

        scottishIslands.add(scottishIslands.indexOf("Mull"), "Islay");

//        4. Print out the index position of "Skye"

        System.out.println("Index position of Skye: " + scottishIslands.indexOf("Skye"));

//        5. Remove "Tresco" from the list by name

        scottishIslands.remove("Tresco");

//        6. Remove "Arran" from the list by index

        scottishIslands.remove(scottishIslands.indexOf("Arran"));

//        7. Print the number of islands in your arraylist

        System.out.println("Number of Islands: " + scottishIslands.size());

//        8. Sort the list alphabetically

        Collections.sort(scottishIslands);

//        9. Print out all the islands using a for loop

        for (String scottishIsland : scottishIslands) {
            System.out.println(scottishIsland);
        }

        System.out.println(scottishIslands);


//        NUMBERS
        List<Integer> numbers = new ArrayList<>();
        Collections.addAll(numbers, 1, 1, 4, 2, 7, 1, 6, 15, 13, 99, 7);

        System.out.println("Numbers: " + numbers);

//        1. Print out a list of the even integers

        ArrayList<Integer> evenNumbers = new ArrayList<>();
        for (int number : numbers) {
            if (number % 2 == 0) {
                evenNumbers.add(number);
            }
        }
        System.out.println(evenNumbers);

//        2. Print the difference between the largest and smallest value

        int highestNumber = numbers.get(0);
        int lowestNumber = numbers.get(0);

        for (int number : numbers) {
            if (number < lowestNumber) {
                lowestNumber = number;
            }

            if (number > highestNumber) {
                highestNumber = number;
            }
        }

        System.out.println(highestNumber - lowestNumber);

//        3. Print True if the list contains a 1 next to a 1 somewhere.

        boolean isPrevNumOne = false;

        for (int number : numbers) {

            if (isPrevNumOne && number == 1) {
                System.out.println("True");
            }

            if (number == 1) {
                isPrevNumOne = true;
            } else {
                isPrevNumOne = false;
            }
        }

        // or this method is simpler maybe
        int prevNum = -1;

        for (int number : numbers) {
            if (number == 1 && prevNum == 1) {
                System.out.println("True");
            }
            prevNum = number;
        }

//        4. Print the sum of the numbers

        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        System.out.println("Sum of numbers in list: " + sum);

//        5. Print the sum of the numbers...
//           ...except the number 13 is unlucky, so it does not count...
//           ...and numbers that come immediately after a 13 also do not count.
//
//          So [2, 7, 13, 2] would have sum of 9.

        int newSum = 0;
        int previousNumber = -1;

        for (int number : numbers){
            if (number !=13 && previousNumber !=13) {
                newSum += number;
            }
            previousNumber = number;
        }

        System.out.println("Sum = " + newSum);
    }

}
