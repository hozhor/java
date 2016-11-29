import java.util.*;
public class lianxi39 {
public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.print("请输入一个正整数 n= ");
    int n = s.nextInt();
    System.out.println("相应数列的和为：" + sum(n));
   }
public static double sum(int n) {
    double res = 0;
    if(n % 2 == 0) {
     for(int i=2; i<=n; i+=2) {
      res += (double)1 / i;
     } 
    } else {
     for(int i=1; i<=n; i+=2) {
      res += (double)1 / i ;
     }
    }
    return res;
}
} 
