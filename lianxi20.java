public class lianxi20 {
public static void main(String[] args) {
    int x = 2, y = 1, t;
    double sum = 0;
    for(int i=1; i<=20; i++) {
     sum = sum + (double)x / y;
     t = y;
     y = x;
     x = y + t;
     }
System.out.println("前20项相加之和是： " + sum);
}
}
