package ch20;

public class Q4 {

}

// Let’s say you needed a thread executor to create tasks for a CyclicBarrier
// that has a barrier limit of five threads. Which static method in
// ExecutorService should you use to obtain it?

// A. newSingleThreadExecutor()
// B. newSingleThreadScheduledExecutor()
// C. newCachedThreadPool()
// D. None of these would work. (+)

/// ExecutorService does not contain any of these methods. In order to obtain an
/// instance of a thread executor, you need to use the Executors factory class.