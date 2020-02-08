package 上机实验5;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
public class Test17 extends JFrame{
	static JButton b1=new JButton("xz1");
	static JButton b2=new JButton("xz2");
	static JButton b3=new JButton("xz3");
	static JButton b5=new JButton("xz5");
	static JButton b6=new JButton("xz6");
	static JButton b7=new JButton("xz7");
	JFrame frame=new JFrame("GUITest");
	JPanel panel1=new JPanel();
	JPanel panel2=new JPanel();
	public Test17() {
		super("动作");
		frame.setSize(400, 400);
		frame.setLocation(200, 300);
		frame.setLayout(new BorderLayout());
		panel1.setLayout(new BorderLayout());
		panel1.add(b1,BorderLayout.PAGE_START);
		panel1.add(b2,BorderLayout.CENTER);
		panel1.add(b3,BorderLayout.PAGE_END);   
		panel2.setLayout(new BorderLayout());
		panel2.add(b5,BorderLayout.PAGE_START);
		panel2.add(b6,BorderLayout.CENTER);
		panel2.add(b7,BorderLayout.PAGE_END);
		frame.add(panel1,BorderLayout.LINE_START);
		frame.add(panel2,BorderLayout.LINE_END);
		b1.addActionListener(new B17());
        b2.addActionListener(new B17());
        b3.addActionListener(new B17());
        b5.addActionListener(new B17());
        b6.addActionListener(new B17());
        b7.addActionListener(new B17());
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
        Test17 a = new Test17();
    }
}

class B17 implements ActionListener{
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == Test17.b1){
        	System.out.println("按下的是xz1的按钮");
        }else if(e.getSource() == Test17.b2){
        	System.out.println("按下的是xz2的按钮");
        }else if(e.getSource() == Test17.b3){
        	System.out.println("按下的是xz3的按钮");
        }else if(e.getSource() == Test17.b2){
        	System.out.println("按下的是xz5的按钮");
        }else if(e.getSource() == Test17.b3){
        	System.out.println("按下的是xz6的按钮");
        }else if(e.getSource() == Test17.b2){
        	System.out.println("按下的是xz7的按钮");
        }
    }
}