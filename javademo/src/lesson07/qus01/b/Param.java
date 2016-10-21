//1. 写一个类Param，声明四个成员变量a、b、c、d，分别赋予四种访问权限。
//（1）试验在同一个包中的另一个类里能访问哪几个变量？
//（2）试验在不同包中的另一个类里能访问哪几个变量？
//（3）试验在不同包中、用Param派生一个子类，看子类能访问哪几个变量？
package lesson07.qus01.b;

public class Param {
	private static int a ;
	static int b;
	protected static int c;
	public static int d;


public static void main(String[] args) {
	
	System.out.println(a);//private
	System.out.println(b);//int
	System.out.println(c);//protected
    System.out.println(d);//public
}
}


