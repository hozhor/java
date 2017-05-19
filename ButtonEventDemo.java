import javax.swing.*;
import java.awt.event.*;
public class ButtonEventDemo extends JPanel implements ActionListener{
protected JButton b1;	//声明一个按钮对象
public ButtonEventDemo() {	//构造方法
ImageIcon ButtonIcon = new ImageIcon("images/green.png");  //创建按钮的图标对象
        b1 = new JButton("退出按钮", ButtonIcon);	  //生成按钮对象
b1.setMnemonic(KeyEvent.VK_E);   //设置b1的助记符是Alt+E
        b1.setToolTipText("这是退出按钮。");	// 设置按钮提示条
        this.add(b1);   //往面板对象中加载按钮
        b1.addActionListener(this);  //本类对象注册为按钮的事件监听器
     }
public void actionPerformed(ActionEvent e){	//按钮事件响应方法
System.exit(0);   //按b1则退出主程序        
}
    private static void createGUI() { //创建窗体
        JFrame.setDefaultLookAndFeelDecorated(true); //设置java隐含观感
        JFrame frame = new JFrame("按钮测试"); //生成应用程序主窗体
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //设置关闭时隐含操作
        ButtonEventDemo CPane = new ButtonEventDemo();  //生成主类对象--面板
        CPane.setOpaque(true);    //面板要求不透明
        frame.setContentPane(CPane); //设置主类对象为主窗体的内容面板
        frame.pack(); //主窗体紧缩显示
        frame.setVisible(true);  //设置主窗体可见
    }
    public static void main(String[] args) {  //将createGUI（）列入线程
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createGUI(); 
            }
        });
    }
}
