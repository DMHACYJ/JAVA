package ����������;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Stack;
import javax.swing.*;
import javax.swing.text.JTextComponent;
 
@SuppressWarnings("serial")
class MyException extends Exception{
	public MyException() {
		super();
	}
	public MyException(String message) {
		super(message);
	}
}

 class SwingConsole{
	public static void run(final JFrame f,final int width,final int height){
		SwingUtilities.invokeLater(new Runnable(){
			public void run(){
				f.setTitle(f.getClass().getSimpleName());
				f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				f.setSize(width,height);
				f.setVisible(true);
			}
		});
	}
}
 
@SuppressWarnings("serial")
public class Test extends JFrame{
 
	private JTextArea textArea;				//�����ı���
	private String input;						//���
	private String operator;					//������
		
	public  Test() {
		input = "";
		operator = "";
		
		Container container = this.getContentPane();
		JMenuBar menuBar = new JMenuBar();
		JMenu menu1 = new JMenu("�鿴(V)");
		JMenu menu2 = new JMenu("�༭(E)");
		JMenu menu3 = new JMenu("����(H)");
		menuBar.add(menu1);
		menuBar.add(menu2);
		menuBar.add(menu3);
		JMenuItem item1 = new JMenu("��ɫ");
		menu2.add(item1);
		item1.add(new JMenuItem("��ɫ"));
		item1.add(new JMenuItem("��ɫ"));
		item1.add(new JMenuItem("��ɫ"));
		container.add(menuBar, BorderLayout.NORTH);
		
		JPanel panel = new JPanel();
		textArea = new JTextArea("0", 2, 15);
		textArea.setSelectedTextColor(Color.BLUE);
		textArea.setLineWrap(true);
		textArea.setWrapStyleWord(true);
		textArea.setEditable(false);						//�ı����ֹ�༭
		textArea.setPreferredSize(new Dimension(190, 30));
		container.add(textArea, BorderLayout.CENTER);
		
		String[] name= {"7","8","9","4","5","6","1","2","3","+","0","-","��","��","��","C","��","="};
		
		panel.setLayout(new GridLayout(6,3,1,1));
		
		for(int i=0;i<name.length;i++) {
			JButton button = new JButton(name[i]);
			button.addActionListener(new MyActionListener());
			panel.add(button);
		}
		container.add(panel,BorderLayout.SOUTH);
	}
	
	class MyActionListener implements ActionListener{			//�ڲ���ʵ�ְ�ť��Ӧ
 
		@Override
		public void actionPerformed(ActionEvent e) {
			int cnt=0;
			String actionCommand = e.getActionCommand();			//��ȡ��ť�ϵ��ַ���
			if(actionCommand.equals("+") || actionCommand.equals("-") || actionCommand.equals("��")
					|| actionCommand.equals("��") || actionCommand.equals("��")) {
				input += " " + actionCommand + " ";
			}
			else if(actionCommand.equals("C")) {					//�������
				input = "";
			} 
			else if(actionCommand.equals("��")) {
				input = input.substring(0, input.length()-1);
			}
			else if(actionCommand.equals("=")) {					//���µȺ�
				try {
					input+= "="+calculate(input);
				} catch (MyException e1) {
					if(e1.getMessage().equals("Infinity"))
						input+= "=" + e1.getMessage();
					else
						input = e1.getMessage();
				}
				textArea.setText(input);
				input="";
				cnt = 1;
			}
			else if(actionCommand.equals("��ɫ")) {
				textArea.setBackground(Color.WHITE);
			}
			else if(actionCommand.equals("��ɫ")) {
				textArea.setBackground(Color.BLUE);
			}
			else if(actionCommand.equals("��ɫ")) {
				textArea.setBackground(Color.GREEN);
			}
			else
				input += actionCommand;							//��������
			
			if(cnt == 0)
				textArea.setText(input);
		}
	}
	
	private String calculate(String input) throws MyException{				//���㺯��
		String[] comput = input.split(" ");					
		Stack<Double> stack = new Stack<>();
		Double m = Double.parseDouble(comput[0]);
		stack.push(m);										//��һ����������ջ
		
		for(int i = 1; i < comput.length; i++) {
			if(i%2==1) {				
				if(comput[i].equals("+"))
					stack.push(Double.parseDouble(comput[i+1]));
				if(comput[i].equals("-"))
					stack.push(-Double.parseDouble(comput[i+1]));
				if(comput[i].equals("��")) {					//��ǰһ������ջ���˷�����ջ
					Double d = stack.peek();				//ȡջ��Ԫ��
					stack.pop();
					stack.push(d*Double.parseDouble(comput[i+1]));
				}
				if(comput[i].equals("��")) {	
					double help = Double.parseDouble(comput[i+1]);  
					 if(help < 0)
						 throw new MyException("Infinity");	
					stack.push(Math.sqrt(Double.parseDouble(comput[i+1])));
				}
				if(comput[i].equals("��")) {					//��ǰһ������ջ���˷�����ջ
					 double help = Double.parseDouble(comput[i+1]);  
					 if(help == 0)
						 throw new MyException("Infinity");			//�������ִ�иú���
					 double d = stack.peek(); 
					 stack.pop(); 
					 stack.push(d/help);  
				}
			}
		}
		
		double d = 0d;
		
		while(!stack.isEmpty()) {			//���
			d += stack.peek();
			stack.pop();
		}
		
		String result = String.valueOf(d);
		return result;
	}
 
	public static void main(String[] args) {
		SwingConsole.run(new Test(), 250, 300);
	}
}

