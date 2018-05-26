package ch20;

public class QX31 {

}

// Using the Boat class from the previous question, what is the final state of
// the application?
// A. The application produces an exception at runtime.
// B. The application terminates successfully.
// C. The application hangs indefinitely because the ExecutorService is never
// shut down.
// D. The application produces a deadlock at runtime. (+)

// It hangs at runtime because the CyclicBarrier limit is
// five, while the number of tasks submitted and awaiting activation is 12.
// This means that 2 of the tasks will be left over, stuck in a deadlocked state
// waiting for the barrier limit to be
// reached but with no more tasks available to trigger it.