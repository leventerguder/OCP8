package ch07._14.forkJoin;

public class Notes {

}
// java.util.concurrent.ForkJoinPool extends AbstractExecutorService

// when a task gets too complicated , we can split the task into multiple other
// tasks using the fork/join framework.
// The fork/join framework relies on the concept of recursion to solve complex
// tasks.

// recursion is the process by which a task calls itself to solve a problem.

// Applying the fork/join framework requires us to perform three steps :
// 1 - Create a ForkJoinTask
// 2 - Create the ForkJoinPool
// 3 - Start the ForkJoinTask

// the class should extends RecursiveActio or RecursiveTask

// if the class extends RecursiveAction , then it should override a protected compute method
// that takes no arguments and returns void
// if the class extends RecursiveTask , then it should override a protected compute method that takes no arguments
// and returns a generic type listed in the class definition

// the invokeAll method takes two instances of the fork/join class does not return a result.

// The fork() method causes a new task to be submitted to the pool and is similar to the thread executor submit() method.
// The join() method is called after the fork() method and causes the current thread to wait for results a subtask.
// Unlike fork() , calling compute() within a compute() method causes the tasks to wait for the  results of the subtask.
// The fork () method should be called before the current thread performs a compute() operation, with join called to read results afterward.
// fork - compute - join