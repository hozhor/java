import java.util.Scanner;
public class ScanDemo02{
public static void main(String[] args){
	System.out.println("请输入a:");
	Scanner sca=new Scanner(System.in);
	int a=sca.nextInt();
	System.out.println("请输入b:");
	Scanner scb=new Scanner(System.in);
	int b=scb.nextInt();
	int z=(a>b)? a:b;
	System.out.println("最大值: "+z);

}	



}
