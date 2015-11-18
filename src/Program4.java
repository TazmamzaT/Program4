import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
import java.io.FileReader;

public class Program4 {

	public static void main(String[] args) throws IOException, QueueFullException, QueueEmptyException {
		File file = new File(args[0]);
		FileReader reader = new FileReader(file);
		char[] numbers = new char[2];
		reader.read(numbers, 0, 2);
		int number = Integer.parseInt(new String(numbers));
		Queue<Character> queue = new Queue<Character>(number);
		int c;
		while ((c = reader.read()) != -1) {
		  char character = (char) c;
		  queue.enqueue(character);
		  if (queue.size() == number) {
			  while (!queue.isEmpty()) {
				char current = queue.dequeue();
				System.out.print(current);
			  }
			  System.out.println();
		  }
		}
		if (!queue.isEmpty()) {
			while (!queue.isEmpty()) {
				char current = queue.dequeue();
				System.out.print(current);
			} 
			System.out.println();
		}
		reader.close();
	}

}
