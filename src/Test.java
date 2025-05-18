
public class Test {
	int x = 10;

	static void test() {
	    int x = 20;  // local x hides (shadows) instance x
	    System.out.println(x);
	}
	
	

	public static void main(String[] args) {
		//test();	
		//System.out.println(new Test().x);
		
		System.out.println(100000 * 100000);
	}

}
