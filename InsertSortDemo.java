/*
 * 插入排序基本思想
 * 将n个元素的数列分为已有序和无序两个部分，如插入排序过程示例下所示： 　　
 * {{a1}，{a2，a3，a4，…，an}} 　　
 * {{a1⑴，a2⑴}，{a3⑴，a4⑴ …，an⑴}} 　
 * {{a1(n-1），a2(n-1) ，…},{an(n-1)}} 　　
 * 每次处理就是将无序数列的第一个元素与有序数列的元素从后往前逐个进行比较，
 * 找出插入位置，将该元素插入到有序数列的合适位置中。
 */
 
 public class InsertSortDemo{
 public static void main(String[] args){
 	int[] a={9,5,12,4,8,65,14,25};
	int t;
	int blag=-1;
System.out.println("排序前:");
		for(int i=0;i<a.length;i++){
		System.out.println(a[i]);	
}
	System.out.println("开始排序:");	

	for(int i=1;i<a.length;i++){
		System.out.println("\n 第"+i+"次:");
		for(int j=i;j>0;j--){
			if(a[j-1]>a[j]){
				blag=j-1;//记住当前固定的元素
				t=a[j-1];
				a[j-1]=a[j];
				a[j]=t;
				}
		
		}
		
		for(int k=0;k<a.length;k++)
		if(k==blag){
			System.out.print("\033[0;32m[\033[0m"+a[k]+"\033[0;32m]\033[0m"+"   ");//"\033[0;32m[\033[0m"这是设颜色的
		}else if(k<i+1){
			System.out.print("\033[0;31m[\033[0m"+a[k]+"\033[0;31m]\033[0m"+"   ");
	}else{
			System.out.print("["+a[k]+"]   ");
	}
	}
	System.out.println();

 }
 }
