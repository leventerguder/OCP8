package ch20;

public class Q6 {

}

// livelock is a special case of resource starvation in which two or more active
// threads try to acquire the same set of locks and are repeatedly unsuccessful

// C. Livelock, resource starvation

// Resource starvation is when a single active thread is perpetually unable to
// gain access to a shared resource. Livelock is a special case of resource
// starvation, in which two or more
// active threads are unable to gain access to shared resources,