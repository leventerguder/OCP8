package _01.lambda;

import java.awt.Button;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Example01 {

	public static void main(String[] args) {

		// A lambda expression is a method without a name that is used to pass
		// around behavior as if it were data.

		Button button = new Button();
		ActionListener actionListener = (ActionEvent event) -> System.out.println("Button clicked");
		button.addActionListener(actionListener);

	}
}
