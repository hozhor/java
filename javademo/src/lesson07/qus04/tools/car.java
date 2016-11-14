
/*4. 写一个工具类，打包到tools里，计算如下题目，两列火
 * 车相向而行，问：多长时间后两车相遇。用户输入已知信息：第一
 * 列车速度（千米/小时），第二列车
 * 速度（千米/小时），两车距离（千米）。在另一个类里调用
 * 该类，测试是否正确。*/
package lesson07.qus04.tools;

import java.util.Scanner;

public class car {
  void car(){  
	  Scanner scan = new Scanner(System.in);
	  System.out.println("第一列车速度是（千米/小时）：");
	  int A =scan.nextInt();
	  System.out.println("第二列车速度是（千米/小时）：");
	  int B =scan.nextInt();
	  System.out.println("两车相距多少千米：");
	  int C =scan.nextInt();
	  double T=C/(A+B);
	  System.out.println("需要"+T+"小时相遇");
	  }

}

