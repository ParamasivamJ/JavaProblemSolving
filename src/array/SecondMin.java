package array;

public class SecondMin{

	public static void main(String[] args) {
		int[] arr= {4,1,2,0,-1};
		int fst=Integer.MAX_VALUE;
		int sec=fst;
		for(int i:arr) {
			if(i<fst) {
				sec=fst;
				fst=i;
			}
			if(i<sec && i!=fst) {
				sec=i;
			}
		}
		System.out.println(sec);
		
	}

}
