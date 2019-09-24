package practice01;

public class IsSequencedArrray {
	
	public static void main(String[] args) {
		int [] a = {2,2, 3,5,5,5};
		System.out.println(isSequenceArray(a, a.length, 2,5));
	}

	public static int isSequenceArray(int []a, int len, int m, int n) {
		
		//if(a== null || len < 2 || a[0]!=m || a[len-1] != n) {
		//	return 0;
		//}
		
		for(int i = 0; i < len-1; i++) {
			if(a[i] + 1 < a[i + 1] || a[i] >a[i+1])
				return 0;
		}
		
		return 1;
	}
}
