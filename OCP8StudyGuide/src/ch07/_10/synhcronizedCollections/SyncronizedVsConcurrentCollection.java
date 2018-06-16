package ch07._10.synhcronizedCollections;

public class SyncronizedVsConcurrentCollection {

}

// SynchronizedMap is a static inner class of utility class
// java.util.Collections. It is quite similar to Hashtable and it acquires lock
// on entire Map instance.

// But it internally wraps all the methods of Map interface with synchronized
// keyword. For example, here is the internal put() and get() method
// implementation of SynchronizedMap :

// public V get(Object key) {
// synchronized (mutex) {
// return m.get(key);
// }
// }
//
// public V put(K key, V value) {
// synchronized(mutex) {return m.put(key, value);}
// }

// SynchronizedMap acquires lock on entire Map object which provides
// thread-safety, but not good performance as at a time only one thread can
// access that Map instance.

// To overcome slow performance issue, ConcurrentHashMap was introduced in Java
// 5 along with other concurrent classes
// More than one threads can read and write concurrently in ConcurrentHashMap
// and still it provides thread-safety.

// ConcurrentHashMap divides the Map instance into different segments. And each
// thread acquires lock on each segment. By default it allows 16 threads to
// access it simultaneously without any external synchronization i.e. by default
// concurrency level is 16. We can also increase or decrease the default
// concurrency level while creating ConcurrentHashMap by using below constructor
// :

// ConcurrentHashMap(int initialCapacity, float loadFactor, int
// concurrencyLevel)

// ConcurrentHashMap doesn't allow null keys and null values, whereas
// SynchronizedMap may allow null keys and null values based on the original
// collection class being passed inside it.
