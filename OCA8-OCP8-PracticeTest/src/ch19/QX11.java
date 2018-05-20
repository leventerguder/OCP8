package ch19;

public class QX11 {

}

// A. AtomicMoveNotSupportedException

// The following code snippet, which attempts to move a file system record from
// oldHardDrivePath to newHardDrivePath, results in an exception at runtime.
// Which of the following is the most likely type of exception to be thrown?
// Files.move(oldHardDrivePath,newHardDrivePath,REPLACE_EXISTING);

// A. AtomicMoveNotSupportedException
// B. DirectoryNotEmptyException
// C. FileAlreadyExistsException
// D. None of the above since the line of code does not compile