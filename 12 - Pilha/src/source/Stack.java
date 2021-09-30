package source;

public interface Stack {
	public int size();

	public boolean isEmpty();

	public E top() throws EmptyStackException;

	public void push(E element);

	public E pop() throws EmptyStackException;
}
