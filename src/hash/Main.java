package hash;

public class Main {

	public static void main(String[] args) {

		ChainHash<Integer, String> ch = new ChainHash<>(13);
		
		int result = ch.add(1, "»ï¼ºÄÄÇ»ÅÍ");
		System.out.println(result);
		result = ch.add(1, "LG³ëÆ®ºÏ");
		System.out.println(result);
		result = ch.add(14, "¾ÖÇÃ¸ÆºÏ");
		System.out.println(result);
		
		result = ch.add(1, "»ï¼º¸ÆºÏ");
		System.out.println(result);
		
		result = ch.add(27, "Ä³³íÇÁ¸°ÅÍ");
		System.out.println(result);
		
		ch.remove(14);
		ch.dump();
	}

}
