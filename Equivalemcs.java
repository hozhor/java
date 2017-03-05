package foundation;

public class Equivalemcs {
	public static void main(String[] args){
		int i = 1;
		int j = 1;
		System.out.println("基本类型i==j:?");
		System.out.println(i==j);
		Integer n1=new Integer(47);
		Integer n2=new Integer(47);
	    System.out.println("引用类型n1==n2:?");
	    System.out.println(n1==n2);
	    System.out.println("引用类型n1.equals(n2):?");   
	    System.out.println(n1.equals(n2));
		
	}
}
