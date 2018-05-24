package ch19;

public class Q7 {

}

// Assuming the path referenced below exists and contains a symbolic link that
// references /again, what is the expected result of executing the following
// code snippet?

// System.out.print(Files.walk(Paths.get("/again/and/again")).count());

// A cycle is caused when a path contains a symbolic link that references the
// path itself, or
// a parent of the parent, triggering an infinitely deep traversal.

// Files.walk() does
// not follow symbolic links by default. For this reason, the cycle is never
// activated, and the code would print a number at runtime,