package ch19;

public class QX23 {

}

// Using the file system diagram from the previous question, including the
// symbolic link from forward to java, how many calls to Files.delete() would
// need to be made before the following line could be executed without throwing
// an exception?

// Files.delete(Paths.get("/objC"));

// B. Four

// We need to empty the /objC directory before we can delete it.