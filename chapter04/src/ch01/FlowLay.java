package ch01;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

class MyFrame4 extends JFrame {

	
	private JButton[] buttons = new JButton[6];
	
//	private JButton button1;
//	private JButton button2;
//	private JButton button3;
//	private JButton button4;
//	private JButton button5;
//	private JButton button6;

	//
//	ArrayList<JButton> buttons = new ArrayList<JButton>();
	
	
	// ������
	public MyFrame4() {
		initData();
		setInitLayout();
	}

	private void initData() {
		setTitle("FLow Layout ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(500, 500);
		setLayout(new FlowLayout(FlowLayout.LEFT, 1, 10));

//		buttons[0] = new JButton("1 ���� ��ư");
//		buttons[1] = new JButton("2 ���� ��ư");
//		buttons[2] = new JButton("3 ���� ��ư");
//		buttons[3] = new JButton("4 ���� ��ư");
//		buttons[4] = new JButton("5 ���� ��ư");
//		buttons[5] = new JButton("6 ���� ��ư");

		for( int i =0 ;  i < buttons.length ; i++) {
			buttons[i] = new JButton( i + " ��° ��ư");
		}
		
	}// end of initData

	private void setInitLayout() {
		setVisible(true);
//		add(buttons[0]);
//		add(buttons[1]);
//		add(buttons[2]);
//		add(buttons[3]);
//		add(buttons[4]);
//		add(buttons[5]);

		for( int j =0 ; j < buttons.length; j++) {
			add(buttons[j]);
		}
	}// end of setInitLayout

}

public class FlowLay {

	public static void main(String[] args) {

		new MyFrame4();

	}
}
