import java.util.Stack;

public class Queue<T> implements QueueInterface<T> {
	
	public class Node {
		T value = null;
		public T getValue( ) {
			return value;
		}
		
		public void setValue( T newvalue ) {
			value = newvalue;
		}
		
		Node next = null;
		public Node getNext( ) {
			return next;
		}
		public void setNext( Node n ) {
			next = n;
		}
		public Node( T newvalue ) {
			setValue( newvalue );
		}
	}
	
	Node first = null;
	Node last = null;
	int size = 0;
	private int sizeLimit = 0;
	
	@Override
	public void enqueue(T element) throws QueueFullException {
		if (isFull()) {
			throw new QueueFullException();
		}
		Node node = new Node( element );
		node.setNext( last );
		last = node;
		if ( isEmpty( ) ) {
			first = node;
		}
		size++;
	}

	@Override
	public T dequeue() throws QueueEmptyException {
		if (isEmpty()) {
			throw new QueueEmptyException();
		}
		T result = first.getValue();
		if (size == 1) {
			last = null;
			first = null;
		} else {
			Node cur = last;
			while (cur.getNext() != first) {
				cur = cur.getNext();
			}
			first = cur;
			cur.setNext(null);
		}
		size--;
		return result;
	}

	@Override
	public T peek() throws QueueEmptyException {
		return first.getValue();
	}

	@Override
	public boolean isEmpty() {
		if (size == 0) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public boolean isFull() {
		if (size == sizeLimit) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public int size() {
		return size;
	}
	
	public Queue ( int sizeLimit ) {
		if (sizeLimit != 0) {
			this.sizeLimit = sizeLimit;
		}
	}
	
	public String toString() {
		
		if (!isEmpty()) {
			String string = "[";
			Stack<T> temp = new Stack<T>();
			for (int i = 0; i < size; i++) {
				T current;
				try {
					current = dequeue();
					//string += current.toString() + ", ";
					enqueue(current);
					temp.push(current);
				} catch (QueueEmptyException e) {
					e.printStackTrace();
				} catch (QueueFullException e) {
					e.printStackTrace();
				}
			}
			for (int i = 0; i < size; i++) {
				string += temp.pop().toString() + ", ";
			}
			string = string.substring(0, string.length() - 2) + "]";
			return string;
		} else {
			return "[]";
		}
	}

}
