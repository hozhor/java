package lesson07.qus06;
import java.util.Scanner;
public class StudentManage {

	public static void main(String[] args) {
		        Student stu=null;
                   boolean key=true;
						while (key) {					
						System.out.println("欢迎使用艾尔学员管理系统");
						System.out.println("1.添加学员");
						System.out.println("2.查看学员");
						System.out.println("3.修改学员");
						System.out.println("4.删除学员");
						System.out.println("0.退出系统");
						System.out.println("请输入序号，选择功能");
						Scanner scan =new Scanner(System.in);
						int flag = scan.nextInt();

				switch (flag) {
				case 1:
					System.out.println("请输入学号，姓名，性别。用空格隔开");
					stu =new Student();
					stu.id=scan.nextInt();
					stu.name=scan.next();
					stu.sex=scan.next().charAt(0);
					System.out.println("学员添加成功");
					break;
				case 2:
					if (stu==null) {
						System.out.println("请先添加学员");
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
