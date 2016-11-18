ass Circle {                      //定义父类--圆类
	private double radius;          //成员变量--圆半径
	Circle() {                      //构造方法
		radius=0.0;
	}
	Circle(double r) {              //构造方法 
		radius=r; 
	}
	double getPerimeter() {         //成员方法--求圆周长
		return 2*Math.PI*radius;
	}
	double getArea() {              //成员方法--求圆面积
		return Math.PI*radius*radius;
	}
	void disp() {                   //成员方法--显示圆半径、周长、面积
		System.out.println("圆半径="+radius);
		System.out.println("圆周长="+getPerimeter());
		System.out.println("圆面积="+getArea());	
	}
}
class Cylinder extends Circle {     //定义子类--圆柱类
	private double hight;           //成员变量--园柱高
	Cylinder(double r,double h) {   //构造方法 
		super(r);
		hight=h;
	}
	public double getVol() {        //成员方法--求园柱体积
		return getArea()*hight;
	}
	public void dispVol() {         //成员方法--显示园柱体积
		System.out.println("圆柱体积="+getVol());
	}
}
public class TestCylinder {         //定义主类
public static void main(String[] args) {    //主程入口
    Circle Ci=new Circle(10.0); // 生成园类实例
    Ci.disp(); // 调用园类的方法
        Cylinder Cyl=new Cylinder(5.0,10.0);    //生成圆柱类实例
        Cyl.disp();                             //调用父类方法
        Cyl.dispVol();                          //调用子类方法
    }
}

