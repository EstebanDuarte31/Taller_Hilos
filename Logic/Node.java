package Logic;

public class Node<T> {
	
	public T getInfo() {
		return info;
	}

	public void setInfo(T info) {
		this.info = info;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	private T info;
	private String id;

	public Node(T info, String id) {
		this.info = info;
		this.id = id;
	}

	@Override
	public String toString() {
		return id;

	}
}
