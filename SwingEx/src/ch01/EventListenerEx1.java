package ch01;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;

class MyFrame1 extends JFrame implements ActionListener {

	JButton button1;
	JButton button2;
	JButton button3;
	JButton button4;
	JButton button5;


	public MyFrame1() {
		initData();
		setInitLayout();
		addEventListener();
	}

	private void initData() {
		setTitle("�̺�Ʈ ������ ����");
		setSize(500, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		button1 = new JButton("�̺�Ʈ ��ư1 ");
		button2 = new JButton("�̺�Ʈ ��ư2 ");
		button3 = new JButton("�̺�Ʈ ��ư3 ");
		button4 = new JButton("�̺�Ʈ ��ư4 ");
		button5 = new JButton("�̺�Ʈ ��ư5 ");

	}

	private void setInitLayout() {
		setVisible(true);
		setLayout(new FlowLayout());
		add(button1);
		add(button2);
		add(button3);
		add(button4);
		add(button5);
	}

	private void addEventListener() {
		button1.addActionListener(this);
		button2.addActionListener(this);
		button3.addActionListener(this);
		button4.addActionListener(this);
		button5.addActionListener(this);
	}

	// �ý��� �ݹ�
	@Override
	public void actionPerformed(ActionEvent e) {
//		System.out.println("�ý��� �ݹ� ����");
//		System.out.println("��ư�� Ŭ�� �Ǿ����ϴ�.");
//		System.out.println(e.toString());
		JButton clickedButton = (JButton) e.getSource();
		System.out.println(clickedButton.getText());

		// ���ڿ��� ���ؼ�
		// 1�� ��ư�� Ŭ�� �Ǿ����ϴ�.
		// 2�� ��ư�� Ŭ�� �Ǿ����ϴ�.

		if (clickedButton.getText().equals(button1.getText())) {
			System.out.println("1 ��ư�� Ŭ���Ǿ����ϴ�.");
		} else if (clickedButton.getText().equals(button2.getText())) {
			System.out.println("2 ��ư�� Ŭ���Ǿ����ϴ�.");
		} else if (clickedButton.getText().equals(button3.getText())) {
			System.out.println("3 ��ư�� Ŭ���Ǿ����ϴ�.");
		} else if (clickedButton.getText().equals(button4.getText())) {
			System.out.println("4 ��ư�� Ŭ���Ǿ����ϴ�.");
		} else {
			System.out.println("5 ��ư�� Ŭ���Ǿ����ϴ�.");
		}

//		if(button.equals(button)) {
//			System.out.println("1�� ��ư�� Ŭ�� �Ǿ����ϴ�.");
//		}else if (button.equals(button2)){
//			System.out.println("2�� ��ư�� Ŭ�� �Ǿ����ϴ�.");
//		}		
	}

}

public class EventListenerEx1 {

	public static void main(String[] args) {

		new MyFrame1();

	}
}
