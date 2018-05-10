package ch14;

import java.util.function.ToDoubleBiFunction;

public class Q6 {

	public static void main(String[] args) {
		ToDoubleBiFunction<Integer, Double> toDoubleBiFunction1 = (Integer a, Double b) -> {
			int c;
			return b;
		};

		ToDoubleBiFunction<Integer, Integer> toDoubleBiFunction2 = (h, i) -> (long) h;
		
		ToDoubleBiFunction<Integer, Integer> toDoubleBiFunction3 = (x,y) -> {int z=2; return y/z;};
		
		
	}
}

// Assuming the proper generic types are used, which lambda expression cannot be
// assigned to a ToDoubleBiFunction functional interface reference?

// A. (Integer a, Double b) -> { int c; return b;}
// B. (h,i) -> (long)h
// C. (String u, Object v) -> u.length()+v.length() (+)
// D. (x,y) -> {int z=2; return y/z;}

// ToDoubleBiFunction# double applyAsDouble(T t, U u);