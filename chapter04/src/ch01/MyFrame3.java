package ch01;

import javax.swing.JFrame;

public class MyFrame3 extends JFrame {

	public MyFrame3() {
		setTitle("ù��° GUI ���α׷��� �ۼ�");
		setSize(400, 400);
		//ȭ�� ����� �ܼ�â�� ����
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new MyFrame3();
	}
}
