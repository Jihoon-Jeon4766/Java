package generic_extends_implements;

public class StorageImpl<T> implements Storage<T> {
	private T[] array;
	
	public StorageImpl(int capacity) {
		// TODO Auto-generated constructor stub
		this.array=(T[])(new Object[capacity]);
	}
	@Override
	public void add(T item, int index) {
		// TODO Auto-generated method stub
		array[index]=item;
	}
	@Override
	public T get(int index) {
		// TODO Auto-generated method stub
		return array[index];
	}

}
