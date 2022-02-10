package hash;

public class Main {

	public static void main(String[] args) {

		ChainHash<Integer, String> ch = new ChainHash<>(13);
		
		int result = ch.add(1, "�Ｚ��ǻ��");
		System.out.println(result);
		result = ch.add(1, "LG��Ʈ��");
		System.out.println(result);
		result = ch.add(14, "���øƺ�");
		System.out.println(result);
		
		result = ch.add(1, "�Ｚ�ƺ�");
		System.out.println(result);
		
		result = ch.add(27, "ĳ��������");
		System.out.println(result);
		
		ch.remove(14);
		ch.dump();
	}

}
