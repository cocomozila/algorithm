package hash;
//ü�ι��� ���� �ؽ�

public class ChainHash<K,V> {
	// �ؽø� �����ϴ� ���

	private int	size;						// �ؽ� ���̺��� ũ��
	private Node<K,V>[] table;				// �ؽ� ���̺�

	// ������
	public ChainHash(int capacity) {
		try {
			table = new Node[capacity];
			this.size = capacity;
		} catch (OutOfMemoryError e) {		// ���̺��� ������ �� ����
			this.size = 0;
		}
	}

	// �ؽð��� ����
	public int hashValue(Object key) {
		return key.hashCode() % size;
	}

	// Ű �� key�� ���� ����� �˻� (�����͸� ��ȯ)
	public V search(K key) {
		int hash = hashValue(key);			// �˻��� �������� �ؽð�
		Node<K,V> p = table[hash];			// ���� ���

		while (p != null) {
			if (p.getKey().equals(key))
				return p.getValue();		// �˻� ����
			p = p.getNext();						// ���� ��忡 �ָ�
		}
		return null;						// �˻� ����
	}

	// Ű �� key, ������ data�� ���� �����  �߰�
	public int add(K key, V data) {
		int hash = hashValue(key);			// �߰��� �������� �ؽð�
		Node<K,V> p = table[hash];			// ���� ���

		while (p != null) {
			if (p.getKey().equals(key))		// �� Ű ���� �̹� ��ϵ�
				return 1;
			p = p.getNext();						// ���� ��忡 �ָ�
		}
		Node<K,V> temp = new Node<K,V>(key, data, table[hash]);
		
//		Node<K,V> temp = new Node<K,V>(key, data, null);
		table[hash] = temp;					// ��带 ����
		return 0;
	}

	// Ű �� key�� ���� ����� ����
	public int remove(K key) {
		int hash = hashValue(key);			// ������ �������� �ؽ� ��
		Node<K,V> p = table[hash];			// ���� ���
		Node<K,V> pp = null;				// �ٷ� ���� ���� ���

		while (p != null) {
			if (p.getKey().equals(key)) {	//  ã����
				if (pp == null)
					table[hash] = p.getNext();
				else
					pp.setNext(p.getNext());
				return 0;
			}
			pp = p;
			p = p.getNext();						// ���� ��带 ����Ŵ
		}
		return 1;							// �� Ű ���� �����ϴ�. 
	}

	// �ؽ� ���̺��� ����
	public void dump() {
		for (int i = 0; i < size; i++) {
			Node<K,V> p = table[i];
			System.out.printf("%02d  ", i);
			while (p != null) {
				System.out.printf("�� %s (%s)  ", p.getKey(), p.getValue());
				p = p.getNext();
			}
			System.out.println();
		}
	}
}
