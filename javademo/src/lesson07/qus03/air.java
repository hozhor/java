/*3. 写一个工具类，提示用户，1为普通话，2 for English ，判断用户输入
 * 的数据，根据输入的数据做出对应的响应。用户输入1，则提示，您好，欢迎
 * 使用本系统；如果输入2，则提示，Hello, welcome to use this system。*/

package lesson07.qus03;
import java.util.Scanner;
public class air {

		public static void main(String args[]){ 
			System.out.println("1 为普通话");  
			System.out.println("2 for English");
			Scanner scan=new Scanner(System.in); 
			int i=scan.nextInt();
			tool t=new tool(); 
			t.tool(i);
	}
	}


