package �ϻ�ʵ��5;

import java.awt.*;
import javax.swing.*;
//C*1.8+32=F
class TemCon{
	public static void show(){
		JFrame frame=new JFrame("�¶�ת��");
		frame.setLayout(new BorderLayout());
		frame.setSize(400,250);
		frame.setLocation(250,250);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JTextArea area1=new JTextArea(5,12);
		JLabel lab1=new JLabel("�����¶�");
		JScrollPane p1=new JScrollPane(area1);
		p1.add(lab1);
		area1.setEditable(true);
		
		JTextArea area2=new JTextArea(5,12);
		JLabel lab2=new JLabel("�����¶�");
		JScrollPane p2=new JScrollPane(area2);
		p2.add(lab2);
		area2.setEditable(true);
		
		JPanel panel=new JPanel();
		JButton b1=new JButton("����");
		JButton b2=new JButton("����");
		
		b1.addActionListener(e->{
			String content=area2.getText();
			double f=Double.parseDouble(content);
			double c=(f-32)/1.8;
			area1.append(String.valueOf(c)+"C\n");
			area2.setText("");
		});
		
		b2.addActionListener(e->{
			String content1=area1.getText();
			double c=Double.parseDouble(content1);
			double f=c*1.8+32;
			area2.append(String.valueOf(f)+"F\n");
			area1.setText("");
		});
		
		frame.add(p1,BorderLayout.PAGE_START);
		frame.add(p2,BorderLayout.CENTER);
		frame.add(panel,BorderLayout.PAGE_END);
		panel.add(b1);	
		panel.add(b2);
		}
}
public class Test01 {

	public static void main(String[] args) {
		SwingUtilities.invokeLater(TemCon::show);
	}

}
