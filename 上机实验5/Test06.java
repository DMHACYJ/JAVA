package 上机实验5;
import java.awt.*;
import javax.swing.*;

class Color1{
	public static void show(){
		JFrame frame=new JFrame("Change Color");
		frame.setLayout(new BorderLayout());
		frame.setSize(300,250);
		frame.setLocation(250,250);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel=new JPanel();
		panel.setLayout(new FlowLayout());
		JButton b1=new JButton("Red");
		JButton b2=new JButton("Green");
		JButton b3=new JButton("Blue");
		JButton b4=new JButton("Gray");
		JPanel panel2=new JPanel();
		JPanel panel3=new JPanel();
		b1.addActionListener(e->{
			panel2.setBackground(Color.RED);
			panel3.setBackground(Color.RED);
		});
		
		b2.addActionListener(e->{
			panel2.setBackground(Color.GREEN);
			panel3.setBackground(Color.GREEN);
		});
		
		b3.addActionListener(e->{
			panel2.setBackground(Color.BLUE);
			panel3.setBackground(Color.BLUE);
		});
		
		b4.addActionListener(e->{
			panel2.setBackground(Color.GRAY);
			panel3.setBackground(Color.GRAY);
		});
		panel.add(b1);
		panel.add(b2);
		panel.add(b3);
		panel.add(b4);
		frame.add(panel2,BorderLayout.PAGE_START);
		frame.add(panel3,BorderLayout.CENTER);
		frame.add(panel,BorderLayout.PAGE_END);
		}
}
public class Test06 {

	public static void main(String[] args) {
		SwingUtilities.invokeLater(Color1::show);
	}

}
