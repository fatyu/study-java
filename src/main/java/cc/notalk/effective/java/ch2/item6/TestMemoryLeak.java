package cc.notalk.effective.java.ch2.item6;

import java.util.Arrays;
import java.util.EmptyStackException;

/**
 * <p>
 * Memory Leak :
 * <li>
 * An object reference is unintentionally may occour to Memory Leak
 * <li/>
 * <li>
 * Another common source of memory leaks is <code>caches</code><li/>
 * <li>
 * Third common source of memory leak is Listener and Callbacks
 * </li>
 * </p> 
 * 
 * @author fatyu
 * 
 */
public class TestMemoryLeak {

	private Object[] elements;
	private int size = 0;
	private static final int DEFAULT_INITIAL_CAPACITY = 10;// 设置初始化数组容量

	public TestMemoryLeak() {
		elements = new Object[DEFAULT_INITIAL_CAPACITY];
	}

	/**
	 * 添加对象
	 * 
	 * @@param obj
	 */
	public void push(Object obj) {// 添加对象到数组
		checkCapacity();
		elements[size] = obj;
		size++;
	}

	/**
	 * <p>
	 * 删除对象
	 * </p>
	 * <p>
	 * If an object reference is unintentionally retained, not only is that
	 * object excluded from garbage collection, but so too are any objects
	 * referenced by that object, and so on.
	 *</p>
	 * <li>当一个不再引用对象的"引用"不经意的保留下来，它就不会在垃圾回收器的管理内， 它引用的对象引用的其他对象也不会在垃圾回收器里</li>
	 * 
	 * @@return Object
	 */
	public Object pop() {// 删除数组中的对象
		if (size == 0) {
			throw new EmptyStackException();
		}

		Object obj = elements[--size];
		elements[size] = null;// 要将删除的对象赋值为null减少OutOfMemoryException出现的可能性
		return obj;

	}

	/**
	 * 动态的增加数组长度
	 */
	public void checkCapacity() {
		if (elements.length == size) {
			elements = Arrays.copyOf(elements, 2 * size);
		}
	}
}
