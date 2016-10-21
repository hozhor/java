/*1. 输入三个整数x, y, z，请把这三个数由小到大输出。 */
package lesson08.qus01;
import java.util.Scanner;
public class Sort {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);//创建对象
		System.out.println("plase input number x");
		int x = scan.nextInt();//输入x的值
		System.out.println("plase input number y");
		int y = scan.nextInt();//输入y的值
		System.out.println("plase input number z");
		int z = scan.nextInt();//输入z的值
		SortNumber(x,y,z);//调用

	}

	public static void SortNumber(int x, int y, int z) {
		int temp;
		if(x>y){
			temp = x;
			x = y;/*交换*/
			y=temp;
		}
		if(x>z){
			temp = x;
			x = z;
		}
		if(y>z){
			temp = y;
			y = z;
			z = temp;
		}
		System.out.println("处理后："+x+" "+y+" "+z);
	}

}
