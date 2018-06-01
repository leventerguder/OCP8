package ch23;

public class QX45 {

}

//Which statements describe a java.io stream class and cannot be applied to a java.util.stream.Stream class? (Choose three.)
//A. Can be used with try-with-resources statement (+)
//B. Includes a class or set of classes used solely for working with character data (+)
//C. Requires all data objects to implement Serializable
//D. Some classes contain a flush() method. (+)
//E. Some classes contain a method to skip over data.
//F. Some classes contain a method to sort the data.

// java.io classes implement Closeable and can be used with try-with resources statements.
// Stream does not implement Closeable