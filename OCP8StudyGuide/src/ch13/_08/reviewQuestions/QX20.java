package ch13._08.reviewQuestions;

public class QX20 {
//
//	Which of the following steps are required to use the WatchService correctly? (Choose all that apply.)
//			A. Iterate over the WatchService with an infinite loop.
//			B. Stop using the WatchService if an OVERFLOW event is reported.
//			C. Read the object returned by the WatchEvent context() method that is associated with the event.
//			D. Reset a WatchKey when you are finished with it. (+)
//			E. Register WatchService with at least one object and event. (+)
//			F. Close the WatchService when you are finished with it. (+)
}

// Infinite loops are optional but not required when using the WatchService API
// Ignoring OVERFLOW events is left to your discretion,