package source13.generic_ex;

public class Test02<K, V> {  // K = 키(Key), V = 값(Value)

	private K key;
	private V value;
	
	public Test02(K key, V value) {
		this.key = key;
		this.value = value;
	}

	public K getKey() {
		return key;
	}

	public V getValue() {
		return value;
	}
	
}


