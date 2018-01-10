package chapter11._05.starvation;

import java.io.*;

/**
 * Worker.java This class is used to demonstrate starvation situation.
 * 
 * @author www.codejava.net
 */
public class Worker {

	public synchronized void work() {
		String name = Thread.currentThread().getName();
		String fileName = name + ".txt";

		try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName));) {
			writer.write("Thread " + name + " wrote this mesasge");
		} catch (IOException ex) {
			ex.printStackTrace();
		}

		// Why does this happen? It’s because the while loop runs forever so
		// that the first executed thread never release the lock, causing other
		// threads to wait forever.
		while (true) {
			System.out.println(name + " is working");
		}
	}
}
