package ch19;

import java.io.IOException;
import java.nio.file.attribute.FileTime;

public class QX25 {

}

// When reading file information, what is an advantage of loading a
// BasicFileAttributeView over a BasicFileAttributes?
// A. Allows the hidden attribute to be set
// B. Allows the last modified date to be changed (+)
// C. All of the file information is read in a single round-trip.
// D. There is no advantage.

// To begin with, the BasicFileAttributeView class contains methods to read and write
// file data, while the BasicFileAttributes class only contains methods to read file data.

//    void setTimes(FileTime lastModifiedTime, FileTime lastAccessTime, FileTime createTime) throws IOException;