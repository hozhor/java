
/*4. дһ�������࣬�����tools�����������Ŀ�����л�
 * ��������У��ʣ��೤ʱ��������������û�������֪��Ϣ����һ
 * �г��ٶȣ�ǧ��/Сʱ�����ڶ��г�
 * �ٶȣ�ǧ��/Сʱ�����������루ǧ�ף�������һ���������
 * ���࣬�����Ƿ���ȷ��*/
package lesson07.qus04.tools;

import java.util.Scanner;

public class car {
  void car(){  
	  Scanner scan = new Scanner(System.in);
	  System.out.println("��һ�г��ٶ��ǣ�ǧ��/Сʱ����");
	  int A =scan.nextInt();
	  System.out.println("�ڶ��г��ٶ��ǣ�ǧ��/Сʱ����");
	  int B =scan.nextInt();
	  System.out.println("����������ǧ�ף�");
	  int C =scan.nextInt();
	  double T=C/(A+B);
	  System.out.println("��Ҫ"+T+"Сʱ����");
	  }

}

