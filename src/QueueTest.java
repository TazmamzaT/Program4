import static org.junit.Assert.*;

import org.junit.Test;

public class QueueTest {
//
//	@Test
//	public void testEnqueue() {
//		fail("Not yet implemented");
//	}
//
//	@Test
//	public void testDequeue() {
//		fail("Not yet implemented");
//	}
//
//	@Test
//	public void testPeek() {
//		fail("Not yet implemented");
//	}
//
//	@Test
//	public void testIsEmpty() {
//		fail("Not yet implemented");
//	}
//
//	@Test
//	public void testIsFull() {
//		fail("Not yet implemented");
//	}
//
//	@Test
//	public void testSize() {
//		fail("Not yet implemented");
//	}
//
//	@Test(expected=QueueFullException.class)
//	public void testQueue() throws QueueFullException {
//		Queue<Integer> test5 = new Queue<Integer>(5);
//		for (int i = 6; i < 7; i++) {
//			test5.enqueue(0);
//		}
//	}
	
	@Test
	public void testToString() throws QueueFullException, QueueEmptyException {
		Queue<Integer> test = new Queue<Integer>(4);
		test.enqueue(1);
		test.enqueue(2);
		test.enqueue(3);
		test.enqueue(4);
		System.out.print(test.toString());
		//for (int i = 0; i <= test.size(); i++) {
			//System.out.println(test.dequeue());
		//}
	}

}
