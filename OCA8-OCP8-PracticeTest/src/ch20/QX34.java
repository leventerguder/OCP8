package ch20;

public class QX34 {

}

// Three of the four following options make up the requirements for performing a
// parallel reduction with the collect() method, which takes a Collector
// argument. Choose the one that is not a requirement.

// A. The Collector argument is marked concurrent.
// B. The elements of the stream implement the Comparable interface. (+)
// C. The stream is parallel.
// D. The stream or Collector is marked unordered.

// Collector.Characteristics enum values CONCURRENT and UNORDERED