import java.util.Scanner;
public class ScanDemo03{
public static void main(String[] args){
	System.out.println("请输入a:");
	Scanner sca=new Scanner(System.in);
	int a=sca.nextInt();
	System.out.println("请输入b:");
	Scanner scb=new Scanner(System.in);
	int b=scb.nextInt();
	System.out.println("请输入c:");
	Scanner scc=new Scanner(System.in);
	int c=scc.nextInt();
	/*三目运算*/
	//int z=(a>b)? a:b;
	//int q=(z>c)? z:c;
	//int q=(((a>b)? a:b)>c)? ((a>b)? a:b):c;
	int temp;
	/*典型的条件语句*/
	if(a<b){
	temp=a;
	a=b;
	b=temp;}
	
	if(a<c)
	{
	temp=a;
	a=c;
	c=temp;
	}
	if(b<c)
	{
	temp=b;
	b=c;
	c=temp;
	}
	
	System.out.println("最大值: "+a);

}	



}
