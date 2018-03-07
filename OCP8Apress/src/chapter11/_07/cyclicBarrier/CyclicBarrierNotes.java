package chapter11._07.cyclicBarrier;

public class CyclicBarrierNotes {

}

// Barriers are similar to latches in that they block a group of threads until
// some event has occured.

// All the threads must come together at a barrier point at the same time in
// order to proceed.

// Latches are for waiting for events ; barriers are for waiting for other
// threads.

// Everyone meet at McDonald’s at 6:00; once you get there, stay there
// until everyone shows up, and then we’ll figure out what we’re doing next.

// If all threads meet at the barrier point, the barrier has
// been successfully passed, in which case all threads are released and the
// barrier is reset so it can be used again.