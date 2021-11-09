package ch04;

import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

class MyPanel extends JPanel{
	
	@Override
	public void paint(Graphics g) {
		super.paint(g);
		
//		g.drawString("�ȳ��ϼ���.", 10, 20);
//		g.drawLine(20, 30, 100, 100);	// ���� �ߴ�. ��� : (������ x��ǥ, ������ y��ǥ, ������ x��ǥ, ������ y��ǥ);
		
	//	g.drawRect(100, 100, 150, 150);	// ( ���� �� �𼭸� x��ǥ, ���� �� �𼭸� y��ǥ, ���α���, ���α���)
		
		g.drawLine(150, 150, 250, 50 );		// ����
		g.drawLine(250, 50, 350, 150 );
		g.drawRect(150, 150, 200, 200);	// �� ��ü
		////
		g.drawRect(180, 180, 40,	40);		// 2�� ���� â��
		
		g.drawLine(220, 200, 180, 200);
		g.drawLine(200, 220, 200, 180);
		////
		g.drawRect(150, 275, 100, 75);		// ������ �簢��
		g.drawLine(150, 285, 250, 285);
		g.drawLine(150, 295, 250, 295);
		g.drawLine(150, 305, 250, 305);
		g.drawLine(150, 315, 250, 315);
		g.drawLine(150, 325, 250, 325);
		g.drawLine(150, 335, 250, 335);
		////
		g.drawRect(280, 270, 50, 80);
		
//		g.drawString("(�ְ���� ����)",x��ǥ, y��ǥ);		���ھ���
		
		
	}
	
}


public class MyFrame1 extends JFrame {

	MyPanel myPanel;
	
	// ������
	public MyFrame1() {
		initData();
		setInitLayout();
	}
	// �޼��� 2�� ����� �ּ���
	private void initData() {
		setTitle("java 2D Test");
		setSize(600, 600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		myPanel = new MyPanel();
	}
	
	private void setInitLayout() {
		setVisible(true);
		add(myPanel);
		
	}
	
	
	// ���� Ŭ���� , static(���� ���� Ŭ����) static ������ �׳� �ν��Ͻ� �Ǵ� ���� Ŭ���������
	static class MyPanel extends JPanel{
		
		@Override
		public void paint(Graphics g) {
			super.paint(g);
			
//			g.drawString("�ȳ��ϼ���.", 10, 20);
//			g.drawLine(20, 30, 100, 100);	// ���� �ߴ�. ��� : (������ x��ǥ, ������ y��ǥ, ������ x��ǥ, ������ y��ǥ);
			
		//	g.drawRect(100, 100, 150, 150);	// ( ���� �� �𼭸� x��ǥ, ���� �� �𼭸� y��ǥ, ���α���, ���α���)
			
			g.drawLine(150, 150, 250, 50 );		// ����
			g.drawLine(250, 50, 350, 150 );
			g.drawRect(150, 150, 200, 200);	// �� ��ü
			////
			g.drawRect(180, 180, 40,	40);		// 2�� ���� â��
			
			g.drawLine(220, 200, 180, 200);
			g.drawLine(200, 220, 200, 180);
			////
			g.drawRect(150, 275, 100, 75);		// ������ �簢��
			g.drawLine(150, 285, 250, 285);
			g.drawLine(150, 295, 250, 295);
			g.drawLine(150, 305, 250, 305);
			g.drawLine(150, 315, 250, 315);
			g.drawLine(150, 325, 250, 325);
			g.drawLine(150, 335, 250, 335);
			////
			g.drawRect(280, 270, 50, 80);
			
//			g.drawString("(�ְ���� ����)",x��ǥ, y��ǥ);		���ھ���
			
	
		}
	// �����Լ� �ۼ�
	public static void main(String[] args) {
		
		new MyFrame1();
		
	}
	
	}
}