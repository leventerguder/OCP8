package _01.lambda;

import java.awt.Button;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Example01 {

	public static void main(String[] args) {
		
		Button button = new Button();
		ActionListener actionListener = (ActionEvent event) -> System.out.println("Button clicked");
		button.addActionListener(actionListener);

	}
}
