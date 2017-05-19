c class ForTest { 
public static void main( String args[] ) {
  int  i,j,mul,sum=0;
for(i=1;i<=10;i++) {
mul=1;
for(j=1,j<=i;j++) {
mul=mul*j;
}
      sum=sum+mul;
public class Factorial { //下面的这个方法利用递归的方法求阶乘 public int getFac(int m) { if(m==1) { return 1; } else { return m*getFac(m-1); } } public static void main(String args[]) { Factorial fac=new Factorial(); //System.out.println(fac.getFac(4)); int sum=0; for(int i=1;i<=10;i++) { sum+=fac.getFac(i); } System.out.println("1到10的阶乘的和是:"+sum); } }}
System.out.println(“1！+2！+3！+……+10！= ”+sum);
}
}
