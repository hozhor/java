 //2.题目：有一分数序列：2/1，3/2，5/3，8/5，13/8 ... 求出这个数列的前20项之和。
package lesson07.qus02;

public class air {
public static double a=2.0;
public static double b=1.0;
public static double sum=0;
public static double temp;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
for (double i = 1; i < 21; i++) {
	temp = a / b;
	sum = sum + temp;

	a = a + b;
	b = a - b;	

}
System.out.println(" sum " + sum);
	}

}
