package ch07._16.reviewQuestions;

public class Q5 {

}
// 5. Fill in the blanks: occur(s) when two or more threads are blocked forever
// but both appear active. occur(s) when two or more threads try to complete a
// related task at the same time.
// A. Livelock, Deadlock
// B. Deadlock, Starvation
// C. Race conditions, Deadlock
// D. Livelock, Race conditions
// E. Starvation, Race conditions
// F. Deadlock, Livelock

// Livelock occurs when two or more threads are conceptually blocked forever,
// although they are each still active and trying to complete their task. A race
// condition is an undesir- able result that occurs when two tasks are completed
// at the same time, which should have been completed sequentially.