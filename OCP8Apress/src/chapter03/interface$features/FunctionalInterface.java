package chapter03.interface$features;

public class FunctionalInterface {

}

// A functional interface specifies only one abstract method.
// A declaration of a functional interface results in a functional interface
// type that can be used with lambda expressions.

// @FunctionalInterface
// Java compiler infers any interface with a single abstract method to be a
// functional interface.

// A derived interface can be a functional interface if it has only one abstract
// method or inherits only one abstract method.

// For a functional interface, declaring methods from Object class in an
// interface does not count as an abstract method.