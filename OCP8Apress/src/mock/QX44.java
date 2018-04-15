package mock;

import java.io.FileReader;
import java.io.File;
import java.io.IOException;;

public class QX44 {

	// Which one of the following code snippets shows the correct usage of try-with-resources statement?
	public static void main(String[] args) {

		try (FileReader inputFile = new FileReader(new File(args[0]))) {
			// ...
		} catch (IOException ioe) {
		}
		
//		try (FileReader inputFile
//                  = new FileReader(new File(args[0]))) {
//                      //...
//         }
//         finally { }
//         catch(IOException ioe) {} //compiler error
		
//        try (FileReader inputFile
//                = new FileReader(new File(args[0]))) {
//                    //...
//        }
//        catch(IOException ioe) {}
//        finally { inputFile.close(); } //compiler error
		
		// Unhandled exception type IOException thrown by automatic close() invocation on inputFile
//        try (FileReader inputFile
//                = new FileReader(new File(args[0]))) {
//                    //...
//        }
		
	}
}
