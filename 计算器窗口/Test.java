package 计算器窗口;

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
 
	private JTextArea textArea;				//输入文本框
	private String input;						//结果
	private String operator;					//操作符
		
	public  Test() {
		input = "";
		operator = "";
		
		Container container = this.getContentPane();
		JMenuBar menuBar = new JMenuBar();
		JMenu menu1 = new JMenu("查看(V)");
		JMenu menu2 = new JMenu("编辑(E)");
		JMenu menu3 = new JMenu("帮助(H)");
		menuBar.add(menu1);
		menuBar.add(menu2);
		menuBar.add(menu3);
		JMenuItem item1 = new JMenu("颜色");
		menu2.add(item1);
		item1.add(new JMenuItem("白色"));
		item1.add(new JMenuItem("蓝色"));
		item1.add(new JMenuItem("绿色"));
		container.add(menuBar, BorderLayout.NORTH);
		
		JPanel panel = new JPanel();
		textArea = new JTextArea("0", 2, 15);
		textArea.setSelectedTextColor(Color.BLUE);
		textArea.setLineWrap(true);
		textArea.setWrapStyleWord(true);
		textArea.setEditable(false);						//文本框禁止编辑
		textArea.setPreferredSize(new Dimension(190, 30));
		container.add(textArea, BorderLayout.CENTER);
		
		String[] name= {"7","8","9","4","5","6","1","2","3","+","0","-","×","√","÷","C","←","="};
		
		panel.setLayout(new GridLayout(6,3,1,1));
		
		for(int i=0;i<name.length;i++) {
			JButton button = new JButton(name[i]);
			button.addActionListener(new MyActionListener());
			panel.add(button);
		}
		container.add(panel,BorderLayout.SOUTH);
	}
	
	class MyActionListener implements ActionListener{			//内部类实现按钮响应
 
		@Override
		public void actionPerformed(ActionEvent e) {
			int cnt=0;
			String actionCommand = e.getActionCommand();			//获取按钮上的字符串
			if(actionCommand.equals("+") || actionCommand.equals("-") || actionCommand.equals("×")
					|| actionCommand.equals("÷") || actionCommand.equals("√")) {
				input += " " + actionCommand + " ";
			}
			else if(actionCommand.equals("C")) {					//清除输入
				input = "";
			} 
			else if(actionCommand.equals("←")) {
				input = input.substring(0, input.length()-1);
			}
			else if(actionCommand.equals("=")) {					//按下等号
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
			else if(actionCommand.equals("白色")) {
				textArea.setBackground(Color.WHITE);
			}
			else if(actionCommand.equals("蓝色")) {
				textArea.setBackground(Color.BLUE);
			}
			else if(actionCommand.equals("绿色")) {
				textArea.setBackground(Color.GREEN);
			}
			else
				input += actionCommand;							//按下数字
			
			if(cnt == 0)
				textArea.setText(input);
		}
	}
	
	private String calculate(String input) throws MyException{				//计算函数
		String[] comput = input.split(" ");					
		Stack<Double> stack = new Stack<>();
		Double m = Double.parseDouble(comput[0]);
		stack.push(m);										//第一个操作数入栈
		
		for(int i = 1; i < comput.length; i++) {
			if(i%2==1) {				
				if(comput[i].equals("+"))
					stack.push(Double.parseDouble(comput[i+1]));
				if(comput[i].equals("-"))
					stack.push(-Double.parseDouble(comput[i+1]));
				if(comput[i].equals("×")) {					//将前一个数出栈做乘法再入栈
					Double d = stack.peek();				//取栈顶元素
					stack.pop();
					stack.push(d*Double.parseDouble(comput[i+1]));
				}
				if(comput[i].equals("√")) {	
					double help = Double.parseDouble(comput[i+1]);  
					 if(help < 0)
						 throw new MyException("Infinity");	
					stack.push(Math.sqrt(Double.parseDouble(comput[i+1])));
				}
				if(comput[i].equals("÷")) {					//将前一个数出栈做乘法再入栈
					 double help = Double.parseDouble(comput[i+1]);  
					 if(help == 0)
						 throw new MyException("Infinity");			//不会继续执行该函数
					 double d = stack.peek(); 
					 stack.pop(); 
					 stack.push(d/help);  
				}
			}
		}
		
		double d = 0d;
		
		while(!stack.isEmpty()) {			//求和
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

