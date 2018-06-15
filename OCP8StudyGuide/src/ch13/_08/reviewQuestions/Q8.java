package ch13._08.reviewQuestions;

import java.util.ArrayList;
import java.util.List;

public class Q8 {

	public static void main(String[] args) {

		//	Which of the following compile? (Choose all that apply.)
		 
		List<Integer> l1 = new ArrayList(); //
		List<Integer> l2 = new ArrayList<>();
		List<Integer> l3 = new ArrayList<Integer>();
		
		// List<> l4 = new ArrayList<Integer>();// compile error
		// List<Integer> l5 = new List<Integer>(); //compile error
		// ArrayList<int> l6 = new List<int>(); //compile error

	}
}
