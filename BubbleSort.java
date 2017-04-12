/*
 * 冒泡排序基本概念是：
 * 依次比较相邻的两个数，将小数放在前面，大数放在后面。
 * 即在第一趟：首先比较第1个和第2个数，将小数放前，大数放后。
 * 然后比较第2个数和第3个数，将小数放前，大数放后，如此继续，
 * 直至比较最后两个数，将小数放前，大数放后。至此第一趟结束，
 * 将最大的数放到了最后。在第二趟：仍从第一对数开始比较
 * （因为可能由于第2个数和第3个数的交换，使得第1个数不再小于第2个数），
 * 将小数放前，大数放后，一直比较到倒数第二个数（倒数第一的位置上已经是最大的），
 * 第二趟结束，在倒数第二的位置上得到一个新的最大数
 * （其实在整个数列中是第二大的数）。如此下去，重复以上过程，直至最终完成排序。 
 */

public class BubbleSort{
public static void main(String[] args){
	int[] a={8,9,6,44,2,6,1};
	int t;
System.out.println("排序前:");
		for(int i=0;i<a.length;i++){
		System.out.println(a[i]);	
}
	System.out.println("开始排序:");
	for(int i=0;i<a.length;i++){
	System.out.println("\n 第"+(i+1)+"次:");

		for(int j=0;j<a.length-1-i;j++){
			if(a[j]>a[j+1]){
				
				t=a[j];
				a[j]=a[j+1];
				a[j+1]=t;
			}
		}
			
		for(int k=0;k<a.length;k++)
		if(k==a.length-i-1){
			System.out.print("\033[0;32m[\033[0m"+a[k]+"\033[0;32m]\033[0m"+"   ");//"\033[0;32m[\033[0m"这是设颜色的
		}else if(k>a.length-i-1){
			System.out.print("\033[0;31m[\033[0m"+a[k]+"\033[0;31m]\033[0m"+"   ");//已排序好的元素
	}else{
			System.out.print("["+a[k]+"]   ");//还没排序的元素
			
	}
	}
	
		System.out.println("\n排序完毕!");

}

}
