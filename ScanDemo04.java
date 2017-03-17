import java.util.Scanner;
public class ScanDemo04{

public static void main(String [] args){
//山的高度8848m
//纸的厚度h=0.01m
double h=0.01;
//折叠次数n
int n=0;
while(h<8488.00){
	h*=2;
	n++;
}
	System.out.println(n+"-次");
}
}
