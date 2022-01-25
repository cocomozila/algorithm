package sort;

public class SelectionSort {

	public static void main(String[] args) {

		int [] arr2 = {90,77,82,65,94,50,87,62};
		selection(arr2);
	}
	
	static int[] selection(int [] arr) {
		
		for(int i = 0; i < arr.length; i++) {
			int max = i;
			for(int j = i+1; j < arr.length; j++) {
				if(arr[max] <= arr[j]) {
					max = j;
				}
			}
			int temp = arr[max];
			arr[max] = arr[i];
			arr[i] = temp;
			
		}
		for(int a : arr) {
			System.out.println(a);
		}
		return arr;
		
	}

}
