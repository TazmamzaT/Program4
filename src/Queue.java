
public class Queue<T> implements QueueInterface<T> {
	
	private int sizeLimit = 0;
	
	@Override
	public void enqueue(T element) throws QueueFullException {
		// TODO Auto-generated method stub
	}

	@Override
	public T dequeue() throws QueueEmptyException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public T peek() throws QueueEmptyException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isFull() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	public Queue ( int sizeLimit ) {
		if (sizeLimit != 0) {
			this.sizeLimit = sizeLimit;
		}
	}

}
