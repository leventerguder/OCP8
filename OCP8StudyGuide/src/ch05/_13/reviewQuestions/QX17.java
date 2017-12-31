package ch05._13.reviewQuestions;

import java.util.Properties;

public class QX17 {


	private static void print(Properties props) {
		//Compiler error
		//System.out.println(props.get("veggies", "none") + " " + props.get("omni", "none"));
	}
}
