package mock;

public class QX52 {

}
// 52. Assume that a thread acquires a lock on an object obj; the same thread
// again attempts to acquire the lock on the same object obj. What will happen?
// a) If a thread attempts to acquire a lock again, it will result in throwing
// anIllegalMonitorStateException

// b) If a thread attempts to acquire a lock again, it will result in throwing
// an AlreadyLockAcquiredException

// c) It is okay for a thread to acquire lock on obj again, and such an attempt
// will succeed (+)

// d) If a thread attempts to acquire a lock again, it will result in a deadlock

// Java locks are reentrant: a Java thread, if it has already acquired a lock,
// can acquire it again, and such an attempt will succeed. No exception is
// thrown and no deadlock occurs for this case.