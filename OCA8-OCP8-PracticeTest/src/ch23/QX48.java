package ch23;

import java.nio.file.FileVisitOption;
import java.nio.file.Path;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.function.BiPredicate;
import java.util.stream.Stream;

public class QX48 {

}
// Which of the following are not required parameters for the NIO.2 Files.find()
// method? (Choose two.)

// A. BiPredicate
// B. FileVisitOption... (+)
// C. int
// D. long (+)
// E. Path

//public static Stream<Path> find(Path start,
//        int maxDepth,
//        BiPredicate<Path, BasicFileAttributes> matcher,
//        FileVisitOption... options)