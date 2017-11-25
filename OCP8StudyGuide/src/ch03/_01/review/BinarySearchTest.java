package ch03._01.review;

import java.util.Arrays;

public class BinarySearchTest {

	public static void main(String[] args) {
		//
		int[] numbers = { 6, 9, 1, 8 };
		Arrays.sort(numbers); //1 6 8 9
		//
		System.out.println(Arrays.binarySearch(numbers, 6)); // 1
		System.out.println(Arrays.binarySearch(numbers, 3));// -2
		System.out.println(Arrays.binarySearch(numbers, 4)); // -2
		System.out.println(Arrays.binarySearch(numbers, 5)); // -2
		// The number 3 would need to be inserted at index 1 (after the number 1
		// but before the number 6). Negating that gives us -1 and subtracting 1
		// gives us -2.

		// -(olmasi gereken index) -1
		
		System.out.println(Arrays.binarySearch(numbers, 7)); // -3
		System.out.println(Arrays.binarySearch(numbers, 10)); // -5
	
	}
}
