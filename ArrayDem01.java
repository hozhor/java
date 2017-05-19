/*一维数组*/
public class ArrayDem01 {
public static void main(String[]args){
	int [] arr=new int[]{78,54,61,48,98};
	printArray(arr);
	System.out.println("最大值为:"+max(arr));
	System.out.println("最小值为:"+min(arr));	
	inverseOrder(arr);
	printArray(arr);
	
}


public static void printArray(int[] arry) {
	/*	数组遍历(依次输出数组中的每一个元素)*/
	for(int i=0;i<arry.length;i++){
	System.out.print("	"+arry[i]);	
	
	}
	System.out.println();
	
}
public static int max(int[] arry) {
	/*数组获取最值(获取数组中的最大值)*/
	int max=arry[0];
	for(int i=1;i<arry.length;i++){
		if(arry[i]>max){
			max=arry[i];
		}
	}
	return max;
}

public static int min(int[] arry) {
	/*数组获取最值(获取数组中的最小值)*/
	int min=arry[0];
	for(int i=1;i<arry.length;i++){
		if(arry[i]<min){
			min=arry[i];
		}
	}
	return min;
}



public static int inverseOrder(int[] arry) {
	/*数组元素逆序 (就是把元素对调)*/
	for(int star=0 , end=arry.length-1 ; star<end ;star++,end--){
		int temp=arry[star];
		arry[star]=arry[end];
		arry[end]=temp;
	}
	
	return 0;
}



}
