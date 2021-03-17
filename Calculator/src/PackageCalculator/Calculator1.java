package PackageCalculator;

import java.awt.Component;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JRadioButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ButtonGroup;
import java.awt.Color;

public class Calculator1 {

	private JFrame frame;
	private JTextField txtNagesh_1;
	
	double first;
	double second;
	double result;
	String operation;
	String answer;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private final ButtonGroup buttonGroup_1 = new ButtonGroup();
	private final ButtonGroup buttonGroup_2 = new ButtonGroup();
	private JButton btnNewButton;
	private JTextField txtNageshPawde;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator1 window = new Calculator1();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Calculator1() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 541, 738);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("SCIENTIFIC CALCULATOR");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 38));
		lblNewLabel.setBounds(22, 34, 516, 39);
		frame.getContentPane().add(lblNewLabel);
		
		txtNagesh_1 = new JTextField();
		txtNagesh_1.setFont(new Font("Tahoma", Font.BOLD, 19));
		txtNagesh_1.setBounds(30, 76, 476, 76);
		frame.getContentPane().add(txtNagesh_1);
		txtNagesh_1.setColumns(10);
		
		btnNewButton = new JButton("\u221A");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a = Math.sqrt(Double.parseDouble(txtNagesh_1.getText()));
				txtNagesh_1.setText("");
				txtNagesh_1.setText(txtNagesh_1.getText()+ a);
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 19));
		btnNewButton.setBounds(31, 196, 68, 59);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1_1_1 = new JButton("X^Y");
		btnNewButton_1_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first =Double.parseDouble(txtNagesh_1.getText());//we take first variable from user and store in first variable
				txtNagesh_1.setText("");//display to textField
				operation = "X^Y";
			}
		});
		btnNewButton_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnNewButton_1_1_1.setBounds(31, 335, 68, 59);
		frame.getContentPane().add(btnNewButton_1_1_1);
		
		JButton btnNewButton_1_1_1_1 = new JButton("X^3");
		btnNewButton_1_1_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a = (Double.parseDouble(txtNagesh_1.getText()));
				a=a*a*a;
				txtNagesh_1.setText("");
				txtNagesh_1.setText(txtNagesh_1.getText()+ a);
			}
		});
		btnNewButton_1_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnNewButton_1_1_1_1.setBounds(30, 406, 68, 59);
		frame.getContentPane().add(btnNewButton_1_1_1_1);
		
		JButton btnNewButton_1_1_1_1_1 = new JButton("n!");
		btnNewButton_1_1_1_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a = Double.parseDouble(txtNagesh_1.getText());
				double fact = 1;
				while(a!=0) {
					fact = fact * a;
					a--;
				}
				txtNagesh_1.setText("");
				txtNagesh_1.setText(txtNagesh_1.getText()+fact);
			}
		});
		btnNewButton_1_1_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 19));
		btnNewButton_1_1_1_1_1.setBounds(31, 541, 68, 59);
		frame.getContentPane().add(btnNewButton_1_1_1_1_1);
		
		JButton buttonplusminus = new JButton("+/-");
		buttonplusminus.setFont(new Font("Tahoma", Font.PLAIN, 21));
		buttonplusminus.setBounds(31, 610, 68, 59);
		frame.getContentPane().add(buttonplusminus);
		
		JButton button0 = new JButton("0");
		button0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = txtNagesh_1.getText()+button0.getText();
				txtNagesh_1.setText(number);
			}
		});
		button0.setFont(new Font("Tahoma", Font.BOLD, 19));
		button0.setBounds(125, 610, 160, 59);
		frame.getContentPane().add(button0);
		
		JButton button1 = new JButton("1");
		button1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = txtNagesh_1.getText()+button1.getText();
				txtNagesh_1.setText(number);
			}
		});
		button1.setFont(new Font("Tahoma", Font.BOLD, 22));
		button1.setBounds(125, 541, 68, 59);
		frame.getContentPane().add(button1);
		
		JButton button4 = new JButton("4");
		button4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = txtNagesh_1.getText()+button4.getText();
				txtNagesh_1.setText(number);
						}
		});
		button4.setFont(new Font("Tahoma", Font.BOLD, 22));
		button4.setBounds(125, 472, 68, 59);
		frame.getContentPane().add(button4);
		
		JButton btnEx = new JButton("e^x");
		btnEx.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a =Math.exp(Double.parseDouble(txtNagesh_1.getText()));
				txtNagesh_1.setText("");
				txtNagesh_1.setText(txtNagesh_1.getText()+a);
			}
		});
		btnEx.setFont(new Font("Tahoma", Font.PLAIN, 19));
		btnEx.setBounds(125, 196, 68, 59);
		frame.getContentPane().add(btnEx);
		
		JButton button7 = new JButton("7");
		button7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = txtNagesh_1.getText()+button7.getText();
				txtNagesh_1.setText(number);
			}
		});
		button7.setFont(new Font("Tahoma", Font.BOLD, 22));
		button7.setBounds(125, 403, 68, 59);
		frame.getContentPane().add(button7);
		
		JButton btnNewButton_1_1_1_1_1_1_2 = new JButton("0");
		btnNewButton_1_1_1_1_1_1_2.setFont(new Font("Tahoma", Font.BOLD, 19));
		btnNewButton_1_1_1_1_1_1_2.setBounds(217, 610, 68, 59);
		frame.getContentPane().add(btnNewButton_1_1_1_1_1_1_2);
		
		JButton button2 = new JButton("2");
		button2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = txtNagesh_1.getText()+button2.getText();
				txtNagesh_1.setText(number);
			}
		});
		button2.setFont(new Font("Tahoma", Font.BOLD, 22));
		button2.setBounds(217, 541, 68, 59);
		frame.getContentPane().add(button2);
		
		JButton button5 = new JButton("5");
		button5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = txtNagesh_1.getText()+button5.getText();
				txtNagesh_1.setText(number);
			}
		});
		button5.setFont(new Font("Tahoma", Font.BOLD, 22));
		button5.setBounds(217, 472, 68, 59);
		frame.getContentPane().add(button5);
		
		JButton btnSin = new JButton("Sin");
		btnSin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a = Math.sin(Double.parseDouble(txtNagesh_1.getText()));
				txtNagesh_1.setText("");
				txtNagesh_1.setText(txtNagesh_1.getText()+ a);
			}
		});
		btnSin.setFont(new Font("Tahoma", Font.PLAIN, 19));
		btnSin.setBounds(217, 196, 68, 59);
		frame.getContentPane().add(btnSin);
		
		JButton button8 = new JButton("8");
		button8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = txtNagesh_1.getText()+button8.getText();
				txtNagesh_1.setText(number);
			}
		});
		button8.setFont(new Font("Tahoma", Font.BOLD, 22));
		button8.setBounds(217, 403, 68, 59);
		frame.getContentPane().add(button8);
		
		JButton buttonDot = new JButton(".");
		buttonDot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = txtNagesh_1.getText()+buttonDot.getText();
				txtNagesh_1.setText(number);
			}
		});
		buttonDot.setFont(new Font("Tahoma", Font.BOLD, 22));
		buttonDot.setBounds(309, 610, 68, 59);
		frame.getContentPane().add(buttonDot);
		
		JButton button3 = new JButton("3");
		button3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = txtNagesh_1.getText()+button3.getText();
				txtNagesh_1.setText(number);
			}
		});
		button3.setFont(new Font("Tahoma", Font.BOLD, 22));
		button3.setBounds(309, 541, 68, 59);
		frame.getContentPane().add(button3);
		
		JButton button6 = new JButton("6");
		button6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = txtNagesh_1.getText()+button6.getText();
				txtNagesh_1.setText(number);
			}
		});
		button6.setFont(new Font("Tahoma", Font.BOLD, 22));
		button6.setBounds(309, 472, 68, 59);
		frame.getContentPane().add(button6);
		
		JButton buttonBack = new JButton("\uF0E7");
		buttonBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String buttonBack=null;
				if(txtNagesh_1.getText().length()>0) {
				StringBuilder str = new StringBuilder(txtNagesh_1.getText());
				str.deleteCharAt(txtNagesh_1.getText().length()-1);
				buttonBack =str.toString() ;
				txtNagesh_1.setText(buttonBack);
				
			}
			}
		});
		buttonBack.setFont(new Font("Wingdings", Font.PLAIN, 21));
		buttonBack.setBounds(309, 334, 68, 59);
		frame.getContentPane().add(buttonBack);
		
		JButton button9 = new JButton("9");
		button9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = txtNagesh_1.getText()+button9.getText()	;
				txtNagesh_1.setText(number);
			}
		});
		button9.setFont(new Font("Tahoma", Font.BOLD, 22));
		button9.setBounds(309, 403, 68, 59);
		frame.getContentPane().add(button9);
		
		JButton buttonEqual = new JButton("=");
		buttonEqual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				second = Double.parseDouble(txtNagesh_1.getText());
				if(operation == "+") {
					result = first + second;
					answer = String.format("%.2f", result);
					txtNagesh_1.setText(answer);
				}
				else if(operation == "-") {
					result = first - second;
					answer = String.format("%.2f", result);
					txtNagesh_1.setText(answer);
				}
				else if(operation == "*") {
					result = first * second;
					answer = String.format("%.2f", result);
					txtNagesh_1.setText(answer);
				}
				else if(operation == "/") {
					result = first / second;
					answer = String.format("%.2f", result);
					txtNagesh_1.setText(answer);
				}
				else if(operation == "%") {
					result = first % second;
					answer = String.format("%.2f", result);
					txtNagesh_1.setText(answer);
				}
				else if(operation == "X^Y") {
					double resultt=1;
					for(int i=0;i<second;i++) {
						resultt = first*resultt;
					}
					answer = String.format("%.2f", resultt);
					txtNagesh_1.setText(answer);
				}
			}
		});
		buttonEqual.setFont(new Font("Tahoma", Font.PLAIN, 21));
		buttonEqual.setBounds(401, 610, 68, 59);
		frame.getContentPane().add(buttonEqual);
		
		JButton buttonEqual_1 = new JButton("/");
		buttonEqual_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first = Double.parseDouble(txtNagesh_1.getText());
				txtNagesh_1.setText("");
				operation= "/";
			}
		});
		buttonEqual_1.setFont(new Font("Tahoma", Font.PLAIN, 21));
		buttonEqual_1.setBounds(401, 541, 68, 59);
		frame.getContentPane().add(buttonEqual_1);
		
		JButton buttonEqual_1_1 = new JButton("*");
		buttonEqual_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first = Double.parseDouble(txtNagesh_1.getText());
				txtNagesh_1.setText("");
				operation ="*";
			}
		});
		buttonEqual_1_1.setFont(new Font("Tahoma", Font.PLAIN, 21));
		buttonEqual_1_1.setBounds(401, 472, 68, 59);
		frame.getContentPane().add(buttonEqual_1_1);
		
		JButton buttonEqual_1_1_1 = new JButton("-");
		buttonEqual_1_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first = Double.parseDouble(txtNagesh_1.getText());
				txtNagesh_1.setText("");
				operation = "-";
			}
		});
		buttonEqual_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 21));
		buttonEqual_1_1_1.setBounds(401, 403, 68, 59);
		frame.getContentPane().add(buttonEqual_1_1_1);
		
		JButton buttonEqual_1_1_1_1 = new JButton("+");
		buttonEqual_1_1_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first =Double.parseDouble(txtNagesh_1.getText());//we take first variable from user and store in first variable
				txtNagesh_1.setText("");//display to textField
				operation = "+";
			}
		});
		buttonEqual_1_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 21));
		buttonEqual_1_1_1_1.setBounds(401, 334, 68, 59);
		frame.getContentPane().add(buttonEqual_1_1_1_1);
		
		JButton btnC = new JButton("C");
		btnC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtNagesh_1.setText(null);
			}
		});
		btnC.setFont(new Font("Tahoma", Font.BOLD, 21));
		btnC.setBounds(217, 334, 68, 59);
		frame.getContentPane().add(btnC);
		
		JButton buttonzpercent = new JButton("%");
		buttonzpercent.setFont(new Font("Tahoma", Font.BOLD, 21));
		buttonzpercent.setBounds(125, 334, 68, 59);
		frame.getContentPane().add(buttonzpercent);
		
		JButton btnCos = new JButton("Cos");
		btnCos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a = Math.cos(Double.parseDouble(txtNagesh_1.getText()));
				txtNagesh_1.setText("");
				txtNagesh_1.setText(txtNagesh_1.getText()+ a);
			}
		});
		btnCos.setFont(new Font("Tahoma", Font.PLAIN, 19));
		btnCos.setBounds(309, 196, 68, 59);
		frame.getContentPane().add(btnCos);
		
		JButton btnSin_1_1 = new JButton("Tan");
		btnSin_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a = Math.tan(Double.parseDouble(txtNagesh_1.getText()));
				txtNagesh_1.setText("");
				txtNagesh_1.setText(txtNagesh_1.getText()+ a);
			}
		});
		btnSin_1_1.setFont(new Font("Tahoma", Font.PLAIN, 19));
		btnSin_1_1.setBounds(401, 196, 68, 59);
		frame.getContentPane().add(btnSin_1_1);
		
		JButton btnSinh = new JButton("Sinh");
		btnSinh.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a = Math.sinh(Double.parseDouble(txtNagesh_1.getText()));
				txtNagesh_1.setText("");
				txtNagesh_1.setText(txtNagesh_1.getText()+ a);
			}
		});
		btnSinh.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btnSinh.setBounds(217, 265, 68, 59);
		frame.getContentPane().add(btnSinh);
		
		JButton btnCosh = new JButton("Cosh");
		btnCosh.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a = Math.cosh(Double.parseDouble(txtNagesh_1.getText()));
				txtNagesh_1.setText("");
				txtNagesh_1.setText(txtNagesh_1.getText()+ a);
			}
		});
		btnCosh.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnCosh.setBounds(309, 265, 68, 59);
		frame.getContentPane().add(btnCosh);
		
		JButton btnSin_1_1_1 = new JButton("Tanh");
		btnSin_1_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a = Math.tanh(Double.parseDouble(txtNagesh_1.getText()));
				txtNagesh_1.setText("");
				txtNagesh_1.setText(txtNagesh_1.getText()+ a);
			}
		});
		btnSin_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnSin_1_1_1.setBounds(401, 265, 68, 59);
		frame.getContentPane().add(btnSin_1_1_1);
		
		JButton btnLog = new JButton("Log");
		btnLog.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a = Math.log(Double.parseDouble(txtNagesh_1.getText()));
				txtNagesh_1.setText("");
				txtNagesh_1.setText(txtNagesh_1.getText()+ a);
			}
		});
		btnLog.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnLog.setBounds(125, 265, 68, 59);
		frame.getContentPane().add(btnLog);
		
		JButton btnSinh_1_1 = new JButton("1/x");
		btnSinh_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a = 1/(Double.parseDouble(txtNagesh_1.getText()));
				txtNagesh_1.setText("");
				txtNagesh_1.setText(txtNagesh_1.getText()+ a);
			}
		});
		btnSinh_1_1.setFont(new Font("Tahoma", Font.PLAIN, 19));
		btnSinh_1_1.setBounds(31, 265, 68, 59);
		frame.getContentPane().add(btnSinh_1_1);
		
		JButton btnNewButton_1_1_1_1_1_1 = new JButton("X^2");
		btnNewButton_1_1_1_1_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_1_1_1_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnNewButton_1_1_1_1_1_1.setBounds(31, 472, 68, 59);
		frame.getContentPane().add(btnNewButton_1_1_1_1_1_1);
	
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("ON");
		rdbtnNewRadioButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				button1.setEnabled(true);
				button2.setEnabled(true);
				button3.setEnabled(true);
				button4.setEnabled(true);
				button5.setEnabled(true);
				button6.setEnabled(true);
				button7.setEnabled(true);
				button8.setEnabled(true);
				button9.setEnabled(true);
				button0.setEnabled(true);
				buttonDot.setEnabled(true);
				buttonEqual.setEnabled(true);
				buttonEqual_1.setEnabled(true);
				buttonEqual_1_1.setEnabled(true);
				buttonEqual_1_1_1.setEnabled(true);
				buttonEqual_1_1_1_1.setEnabled(true);
				btnSin_1_1_1.setEnabled(true);
				btnSin_1_1.setEnabled(true);
				btnCos.setEnabled(true);
				btnSin.setEnabled(true);
				btnSinh.setEnabled(true);
				btnLog.setEnabled(true);
				btnEx.setEnabled(true);
				btnNewButton.setEnabled(true);
				btnSinh_1_1.setEnabled(true);
				btnNewButton_1_1_1.setEnabled(true);
				btnNewButton_1_1_1_1.setEnabled(true);
				btnNewButton_1_1_1_1_1.setEnabled(true);
				buttonplusminus.setEnabled(true);
				buttonzpercent.setEnabled(true);
				btnC.setEnabled(true);
				buttonBack.setEnabled(true);
				btnCosh.setEnabled(true);
				btnNewButton_1_1_1_1_1_1.setEnabled(true);
			}
		});
		buttonGroup.add(rdbtnNewRadioButton);
		rdbtnNewRadioButton.setFont(new Font("Tahoma", Font.BOLD, 17));
		rdbtnNewRadioButton.setBounds(32, 158, 67, 32);
		frame.getContentPane().add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnOff = new JRadioButton("OFF");
		rdbtnOff.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				button1.setEnabled(false);
				button2.setEnabled(false);
				button3.setEnabled(false);
				button4.setEnabled(false);
				button5.setEnabled(false);
				button6.setEnabled(false);
				button7.setEnabled(false);
				button8.setEnabled(false);
				button9.setEnabled(false);
				button0.setEnabled(false);
				buttonDot.setEnabled(false);
				buttonEqual.setEnabled(false);
				buttonEqual_1.setEnabled(false);
				buttonEqual_1_1.setEnabled(false);
				buttonEqual_1_1_1.setEnabled(false);
				buttonEqual_1_1_1_1.setEnabled(false);
				btnSin_1_1_1.setEnabled(false);
				btnSin_1_1.setEnabled(false);
				btnCos.setEnabled(false);
				btnSin.setEnabled(false);
				btnSinh.setEnabled(false);
				btnLog.setEnabled(false);
				btnEx.setEnabled(false);
				btnNewButton.setEnabled(false);
				btnSinh_1_1.setEnabled(false);
				btnNewButton_1_1_1.setEnabled(false);
				btnNewButton_1_1_1_1.setEnabled(false);
				btnNewButton_1_1_1_1_1.setEnabled(false);
				buttonplusminus.setEnabled(false);
				buttonzpercent.setEnabled(false);
				btnC.setEnabled(false);
				buttonBack.setEnabled(false);
				btnCosh.setEnabled(false);
				btnNewButton_1_1_1_1_1_1.setEnabled(false);
			}
		});
		buttonGroup.add(rdbtnOff);
		rdbtnOff.setFont(new Font("Tahoma", Font.BOLD, 17));
		rdbtnOff.setBounds(104, 158, 67, 32);
		frame.getContentPane().add(rdbtnOff);
		
		JLabel lblNewLabel_1 = new JLabel("Nagesh Pawde");
		lblNewLabel_1.setBackground(new Color(0, 0, 0));
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 11));
		lblNewLabel_1.setBounds(415, -2, -42, 39);
		frame.getContentPane().add(lblNewLabel_1);
		
		txtNageshPawde = new JTextField();
		txtNageshPawde.setText("Nagesh Pawde");
		txtNageshPawde.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 13));
		txtNageshPawde.setBackground(new Color(255, 255, 255));
		txtNageshPawde.setBounds(395, -2, 111, 32);
		frame.getContentPane().add(txtNageshPawde);
		txtNageshPawde.setColumns(10);
	}
}
	
