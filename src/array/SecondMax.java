package array;

public class SecondMax{

	public static void main(String[] args) {
		int[] arr= {1,2,3,4,0};
		int fst=arr[0];
		int sec=fst;
		for(int i:arr) {
			if(i>fst) {
				sec=fst;
				fst=i;
			}
			if(i>sec && i!=fst) {
				sec=i;
			}
		}
		System.out.println(sec);
		
	}

}
