package test;

public class Test1 {
//张三
	public  static  void  main（String [] arge）{
		Integer i = -128;
		Integer j = -128;
		System.out.println(i == j);
		System.out.println("------------");
		String x = "ss";
		String y = "ss";
		String z = new String("ss");
		System.out.println(x == z);
		System.out.println(x.equals(z));
		System.out.println(x == y);

		System.out.println("------------------------");
		int a = 10;
		int b = 20;
//		int c = a;
//		a = b;
//		b = c;
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("a="+a);
		System.out.println("b="+b);

	}

}
