package com.Stack;
import java.util.*;

public class ArrayStack<T> implements Stack<T> {
	private T[] array;
	private int size;
	
	@SuppressWarnings("unchecked")
		public ArrayStack ()
		{
		array = (T[]) new Object[10];
		size = 0;
		}
	public void push(T item) {
		if (size == array.length)
		{
			array = Arrays.copyOf(array, size * 2);
		}
		array[size++] = item;
	}

	@Override
	public T pop() {
		if (isEmpty())
		{
			throw new EmptyStackException();
		}
		T item = array[--size];
		array[size] = null;
		return item;
	}

	@Override
	public T peek() {
		 if (isEmpty()) {
	            throw new EmptyStackException();
	        }
	        return array[size - 1];
	}

	@Override
	public boolean isEmpty() {
		return size == 0;
	}

}
