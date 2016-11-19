 import java.io.*;
  public class IODemo {
  public static void main( String args[] ) {
    int data[] = {100,101,102,103,104,105};
int t;
try
{ DataOutputStream out = new  DataOutputStream (new  FileOutputStream(“dest.txt”));
  for(int i=0;i<data.length;i++) 
    out.WriteInt(data[i]);
  out.close();
 DataInputStream in = new  DataInputStream (new  FileInputStream(“dest.txt”));
 for(int i= data.length-1;i>= 0;i--) {
    t=in.readInt(data[i]);
    System.out.print(“  ”+t);
    }
  System.out.println( );
  in.close();
}catch(IOException e)
{ System.out.println(e.getMessage());}
  }
}
