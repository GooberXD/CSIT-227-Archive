// Write a Comparator class with name NumberComparator to sort the list of 
// integer numbers closest to 50. If they have the same distance to 50, sort it by 
// whatever was inputted first.

// Sample Output:
// How many numbers? 16
// Enter 16 integers: 72 29 13 68 26 68 16 73 94 41 44 84 46 6 47 64

// Sorted: 47 46 44 41 64 68 68 29 72 73 26 16 84 13 94 6

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
        numbers.sort(new NumberComparator());
        System.out.print("\nSorted: ");
        for (int n : numbers) {
            System.out.print(n + " ");
        }
    }

}