/*1. ������������x, y, z���������������С��������� */
package lesson08.qus01;
import java.util.Scanner;
public class Sort {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);//��������
		System.out.println("plase input number x");
		int x = scan.nextInt();//����x��ֵ
		System.out.println("plase input number y");
		int y = scan.nextInt();//����y��ֵ
		System.out.println("plase input number z");
		int z = scan.nextInt();//����z��ֵ
		SortNumber(x,y,z);//����

	}

	public static void SortNumber(int x, int y, int z) {
		int temp;
		if(x>y){
			temp = x;
			x = y;/*����*/
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
		System.out.println("�����"+x+" "+y+" "+z);
	}

}
