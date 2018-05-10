package ch13;

public class Q6 {

}
// Suppose we want to store JellyBean objects. Which of the following pairs
// require JellyBean to implement the Comparable interface or create a
// Comparator in order to add them to the Collection?
// A. ArrayList and ArrayDeque
// B. HashMap and HashSet
// C. HashMap and TreeMap
// D. TreeMap and TreeSet (+)


//TreeMap and TreeSet keep track of sort order when you insert elements. TreeMap
//sorts the keys and TreeSet sorts the objects in the set. This makes Option D correct. Note
//that you have the option of having JellyBean implement Comparable, or you can pass a
//Comparator to the constructor of TreeMap or TreeSet.