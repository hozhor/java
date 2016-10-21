package lesson08.qus05;

public class PrintNN{
	public static void main (String[] args){
		for(int i=0;i<4;i++){
			for(int j=6;j>2*i;j--){
			System.out.print(" ");	
			}
			for(int k=1;k<=2;k++){
			System.out.print("*");
			}
			for(int j=0;j<2*(2*i-1);j++){
			System.out.print(" ");
			}
			for(int k=1;k<=2;k++){
				if(i==0)
					break;
			System.out.print("*");
			}

		System.out.println();
		}
/*
上半部分
结束
*/
		for(int i=3;i>0;i--){
			for(int j=6;j>2*i-2;j--){
			System.out.print(" ");	
			}
			for(int k=1;k<=2;k++){
			System.out.print("*");
			}
			for(int j=0;j<2*(2*i-1)-4;j++){
			System.out.print(" ");
			}
			for(int k=1;k<=2;k++){
				if(i==1)
					break;
			System.out.print("*");
			}

		System.out.println();
		}

}





}