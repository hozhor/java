/*5. 写一工具类，判断输入的字符（char）是否为数字（使用ASCII码判断）类
 * 型，在另一个类里
 * 引入该类，然后调用工具类判断。要求打包到tools里。*/
package lesson07.qus05.tools;

import java.util.Scanner;

public class number {
	void number(){
			Scanner scan  = new Scanner (System.in);
			String s=scan.nextLine();
			char i=s.charAt(0);
			if(i>47&&i<58){ 
				System.out.println("你输入的是数字"); 
				}
			else{
				System.out.println("输入的不是数字");
				}
}
}