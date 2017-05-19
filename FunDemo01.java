import java.util.Scanner;

public class FunDemo01{
public static void main(String[] args){
System.out.println("a:");
Scanner sca=new Scanner(System.in);
int a=sca.nextInt();
System.out.println("b:");
Scanner scb=new Scanner(System.in);
int b=scb.nextInt();
int q=sum(a,b);
System.out.println("a+b="+q);
}
public static int sum(int a,int b){
return a+b;

}
}
