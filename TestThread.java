 // 声明一个子线程类Threaddemo;
 class ThreadDemo extends Thread {
  public ThreadDemo(String str) {
super(str);
}
  public void run() {
    for(int i=0;i<20;i++){
System.out.print(“  ”+this.getName());
Try {
 Sleep(300);
}catch(InterruptedException e){
 System.out.println(e.getMessage());
 Return;
}
}
System.out.println(“  /end”);
}
}
public class TestThread {
 public static void main( String args[] ) {
   ThreadDemo thread1=new ThreadDemo(“T1”);
   ThreadDemo thread2=new ThreadDemo(“T2”);
   ThreadDemo thread3=new ThreadDemo(“T3”);
   thread1.start();
   thread2.start();
   thread3.start();
 }
}
