package lesson07.qus06;
import java.util.Scanner;
public class StudentManage {

	public static void main(String[] args) {
		        Student stu=null;
                   boolean key=true;
						while (key) {					
						System.out.println("��ӭʹ�ð���ѧԱ����ϵͳ");
						System.out.println("1.���ѧԱ");
						System.out.println("2.�鿴ѧԱ");
						System.out.println("3.�޸�ѧԱ");
						System.out.println("4.ɾ��ѧԱ");
						System.out.println("0.�˳�ϵͳ");
						System.out.println("��������ţ�ѡ����");
						Scanner scan =new Scanner(System.in);
						int flag = scan.nextInt();

				switch (flag) {
				case 1:
					System.out.println("������ѧ�ţ��������Ա��ÿո����");
					stu =new Student();
					stu.id=scan.nextInt();
					stu.name=scan.next();
					stu.sex=scan.next().charAt(0);
					System.out.println("ѧԱ��ӳɹ�");
					break;
				case 2:
					if (stu==null) {
						System.out.println("�������ѧԱ");
						break;
					}
					
					System.out.println(stu.id);					
					System.out.println(stu.name);
					System.out.println(stu.sex);					
					break;
				case 3:
						key =false;
					break;
				case 4:
					
					break;
				case 0:
					
					break;
				
				default:
					break;
				}

		}
	}



}
