package ch06._03.tryWithResources;

public class Test05TryWithResourcesSuppressed {

	public static void main(String[] args) {

		System.out.println("_________test1_________");

		// The close() method is automatically called by try-with-resources.
		try (Dog dog = new Dog()) {
			System.out.println("Dog# try block_1");
		} catch (IllegalStateException e) {
			System.out.println("catch block : ");
			System.out.println(e.getMessage());
		}

		System.out.println("_________test2_________");

		try (Dog dog = new Dog()) {
			System.out.println("Dog# try block_2");
			throw new IllegalArgumentException("Exception in try block!");
			//
		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());

			// Java remembers the suppressed exceptions that go with a primary
			// exception even if we don’t handle them in the code.
			System.out.println("Suppressed : ");
			for (Throwable t : e.getSuppressed())
				System.out.println(t.getMessage());
		}

		// System.out.println("_________test3_________");
		//
		// try (Dog dog = new Dog()) {
		// System.out.println("Dog# try block_3");
		// throw new RuntimeException("Exception in try block!");
		// // Keep in mind that the catch block looks for matches on the
		// // primary exception.
		// } catch (IllegalStateException e) {
		// System.out.println(e.getMessage());
		//
		// System.out.println("Suppressed : ");
		// for (Throwable t : e.getSuppressed())
		// System.out.println(t.getMessage());
		// }

		System.out.println("_________test4_________");

		// Java closes resources in the reverse order from which it created them
		try (Dog dog = new Dog(); Dog dog2 = new Dog()) {
			System.out.println("Dog# try block_4");
			throw new IllegalArgumentException("Exception in try block!");
			// Keep in mind that the catch block looks for matches on the
			// primary exception.
		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());

			System.out.println("Suppressed : ");
			for (Throwable t : e.getSuppressed())
				System.out.println(t.getMessage());
		}

		System.out.println("_________test5_________");

		// Java closes resources in the reverse order from which it created them
		try (Dog dog = new Dog(); Dog dog2 = new Dog()) {
			System.out.println("Dog# try block_5");
			throw new IllegalStateException("Exception in try block!");
		}
		/*
		Exception in thread "main" java.lang.IllegalStateException: Exception in try block!
	at ch06._03.tryWithResources.Test05TryWithResourcesSuppressed.main(Test05TryWithResourcesSuppressed.java:69)
	Suppressed: java.lang.IllegalStateException: Dog#close IllegalStateException
		at ch06._03.tryWithResources.Dog.close(Test05TryWithResourcesSuppressed.java:83)
		at ch06._03.tryWithResources.Test05TryWithResourcesSuppressed.main(Test05TryWithResourcesSuppressed.java:70)
	Suppressed: java.lang.IllegalStateException: Dog#close IllegalStateException
		at ch06._03.tryWithResources.Dog.close(Test05TryWithResourcesSuppressed.java:83)
		at ch06._03.tryWithResources.Test05TryWithResourcesSuppressed.main(Test05TryWithResourcesSuppressed.java:70) 
		  
		 */
		
//		} finally {
//			throw new RuntimeException("and we couldn't find them");
//		}

	}
}

class Dog implements AutoCloseable {

	@Override
	public void close() throws IllegalStateException {
		System.out.println("Dog is closing...");
		throw new IllegalStateException("Dog#close IllegalStateException");
	}

}