package sort;

public class BubbleSort {

	public static void main(String[] args) {

		int [] arr2 = {90,77,82,65,94,50,87,62};
		bubble(arr2);		
	}
	
	static int[] bubble(int [] arr) {
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr.length-1; j++) {
				System.out.println(arr[0]+" "+arr[1]+" "+arr[2]+" "+arr[3]+" "+arr[4]);
				if(arr[j] < arr[j+1]) {
					int temp = arr[j+1];
					arr[j+1] = arr[j];
					arr[j] = temp;
				}
			}
		}
		for(int a : arr) {
			System.out.println(a);
		}
		return arr;
		
	}

}
