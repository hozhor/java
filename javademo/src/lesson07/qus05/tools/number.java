/*5. дһ�����࣬�ж�������ַ���char���Ƿ�Ϊ���֣�ʹ��ASCII���жϣ���
 * �ͣ�����һ������
 * ������࣬Ȼ����ù������жϡ�Ҫ������tools�*/
package lesson07.qus05.tools;

import java.util.Scanner;

public class number {
	void number(){
			Scanner scan  = new Scanner (System.in);
			String s=scan.nextLine();
			char i=s.charAt(0);
			if(i>47&&i<58){ 
				System.out.println("�������������"); 
				}
			else{
				System.out.println("����Ĳ�������");
				}
}
}