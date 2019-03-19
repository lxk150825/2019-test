package test;

public class Test2 {
	public static void test() throws Exception {
		Class a1 = Integer.class;
		Class a2 = Class.forName("java.lang.Integer");
		System.out.println(a1 ==a2);
		Integer m=new Integer(10);
		Class<? extends Integer> a3 = m.getClass();
		System.out.println(a1 ==a3);
		
	}
	public static void main(String[] args) throws Exception {
		test();
	}
}
