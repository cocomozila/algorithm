package sort;

import java.util.Scanner;

public class QuickSortTest {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("학생 수 입력 : ");
		int stu = scan.nextInt();
		System.out.println();
		
		int stus[] = new int[stu];
		
		for (int i = 0; i < stus.length; i++) {
			System.out.print("학생 "+(i+1)+" 점수 입력 : ");
			stus[i] = scan.nextInt();
		}
		
		quick(stus,0,stus.length-1);
		System.out.println();
		System.out.println("성적순으로 정렬");
		
		for (int i = 0; i < stus.length; i++) {
			System.out.println((i+1)+"등 : "+stus[i]);
		}

	}
	
	static void quick(int [] a, int left, int right) {
		
		int pl = left;
		int pr = right;
		
		int x = a[(pl + pr)/2];
		
		do {			
			while (a[pl] > x) {
				pl++;
			}			
			while (a[pr] < x) {
				pr--;
			}			
			if (pl <= pr) {
				int temp = a[pl];
				a[pl] = a[pr];
				a[pr] = temp;
				pl++;
				pr--;
			}			
		} while (pl <= pr);
		
		if (left < pr) {
			quick(a, left, pr);
		}
		if (right > pl) {
			quick(a, pl, right);
		}
	}

}
