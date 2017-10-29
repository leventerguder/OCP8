package _01.lambda;

import java.util.function.Function;

import javax.swing.JButton;

public class Example07 {

	public static void main(String[] args) {
		Function<Long, Integer> f = (Long longX) -> {
			return 10;
		};
		
		System.out.println(f.apply(100L));
		
		JButton button = new JButton();
        button.addActionListener(event->System.out.println(event.getActionCommand()));
      
	}
}
