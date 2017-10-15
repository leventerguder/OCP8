package chapter05._02_consumer;

import java.util.function.Consumer;
import java.util.stream.Stream;

public class ConsumerTest03 {

	public static void main(String[] args) {
		Stream<String> strings = Stream.of("hello", "world", "injavawetrust.com");
		Consumer<String> consumer = System.out::println;
		strings.forEach(consumer);
		
		//
		Consumer<String> consumer2 = ConsumerTest03::staticMethod;
		
		//Consumer<String> consumer3 = staticVar::staticMethod; //compiler error
		
		Consumer<String> consumer4 = staticVar::method; //OK
	}
	
	private static ConsumerTest03 staticVar;
	
	public static void staticMethod(String s){
		System.out.println(s.toUpperCase());
	}
	
	public void method(String s){
		System.out.println(s.toUpperCase());
	}
}

// The System class has a static variable named out that is of type PrintStream.
// The PrintStream class defines overloaded println methods; one of the
// overloaded methods has the signature void println(String). In the call
// forEach(System.out::println),
// we are passing the method reference for println, i.e., System.out::println.
// This method reference matches the signature of the abstract method in the
// Consumer interface, i.e., void accept(T). Hence, the method reference
// System.out::println serves to implement the functional interface Consumer and
// the code prints the strings “hello” and “world” to console.
