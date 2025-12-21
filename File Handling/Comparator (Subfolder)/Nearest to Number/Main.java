// Write a Comparator class with name NumberComparator to sort the 
// list of integer numbers closest to a particular number. If they have 
// the same distance to said number, sort it by whatever was inputted first.

// Sample Output:
// How many numbers? 25
// Enter 25 integers: 92 39 98 66 25 38 74 31 99 25 47 99 78 19 92 47 83 54 72 14 57 75 85 82 56
// Sort closest to 68

// Sorted: 66 72 74 75 78 57 56 54 82 83 85 47 47 92 92 39 98 38 99 99 31 25 25 19 14

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("How many numbers? ");
        int size = sc.nextInt();
        System.out.print("Enter " + size + " integers: ");
        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            numbers.add(sc.nextInt());
        }
        System.out.print("Sort closest to ");
        int close = sc.nextInt();
        numbers.sort(new NumberComparator(close));
        System.out.print("\nSorted: ");
        for (int n : numbers) {
            System.out.print(n + " ");
        }
    }
}