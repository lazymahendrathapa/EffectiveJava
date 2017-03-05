package chapter03.item11;

import java.util.Arrays;
import java.util.EmptyStackException;

public class Stack implements Cloneable {
	private Object[] elements;
	private int size = 0;
	private static final int DEFAULT_INITIAL_CAPACITY = 16;

	public Stack() {
		this.elements = new Object[DEFAULT_INITIAL_CAPACITY];
	}

	public void push(Object e) {
		ensureCapacity();
		elements[size++] = e;
	}

	private void ensureCapacity() {
		if (elements.length == size)
			elements = Arrays.copyOf(elements, 2 * size + 1);
	}

	public Object pop() {
		if (size == 0)
			throw new EmptyStackException();

		Object result = elements[--size];
		elements[size] = null;
		return result;
	}

	public boolean isEmpty() {
		return size == 0;
	}

	@Override
	public Stack clone() {
		try {
			Stack result = (Stack) super.clone();
			result.elements = elements.clone();
			return result;

		} catch (CloneNotSupportedException e) {
			throw new AssertionError();
		}
	}

	public static void main(String[] args) {

		Stack stack = new Stack();

		stack.push("Hello");
		stack.push("World");

		Stack copy = stack.clone();

		while (!stack.isEmpty())
			System.out.println(stack.pop() + " ");

		System.out.println();

		while (!copy.isEmpty())
			System.out.println(copy.pop() + " ");
	}
}
