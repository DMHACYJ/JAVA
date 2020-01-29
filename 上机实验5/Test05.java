package 上机实验5;
import java.awt.FlowLayout;
import javax.swing.*;

class Butt{
	public static void show(){
		JFrame frame=new JFrame("窗口");
		frame.setLayout(new FlowLayout(FlowLayout.CENTER,20,30));
		frame.setSize(350,300);
		frame.setLocation(200,200);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JButton but1=new JButton("Button1");
		JButton but2=new JButton("Button2");
		JButton but3=new JButton("Button3");
		JButton but4=new JButton("Button4");
		JButton but5=new JButton("Button5");
		JButton but6=new JButton("Button6");
		frame.add(but1);
		frame.add(but2);
		frame.add(but3);
		frame.add(but4);
		frame.add(but5);
		frame.add(but6);
		}
}
public class Test05 {
	public static void main(String[] args) {
		SwingUtilities.invokeLater(Butt::show);
	}
}