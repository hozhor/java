public class lianxi13 {
public static void main(String[] args) {
     for(int x =1; x<100000; x++) {
      if(Math.sqrt(x+100) % 1 == 0) {
       if(Math.sqrt(x+268) % 1 == 0) {
        System.out.println(x + "加100是一个完全平方数，再加168又是一个完全平方数");
       }
      }
     }
}
}
