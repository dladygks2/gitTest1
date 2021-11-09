package ch02;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class MyFrame5 extends JFrame {

	JLabel label;
	
	public MyFrame5() {
		initData();
		setInitLayout();
		addEventListener();
		
	}
	private void initData() {
		setTitle("���콺 �̺�Ʈ");
		setSize(500,500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		label = new JLabel("hello java ~ ");
		label.setSize(150, 50);
	}
	private void setInitLayout() {
		setVisible(true);
		setLayout(null);
		add(label);
		// label ��� ��� �����̰� �ϴ� ���??
		label.setLocation(12, 40);		// label �ʱ���ġ�� ����ִ°�
		
	}
	private void addEventListener() {
				
		// ���콺 �̺�Ʈ�� �޾Ƴ���
		// �͸�����ü : ��ȣ�ȿ� �ٷ� new MoseListener()�� �ִ°��� ����
		this.addMouseListener(new MouseListener() {
		
			// ���콺�� �������� �� ����Ǵ� �޼���
			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				System.out.println("Ŭ����ư �� ��?");
			}
			
			// ���콺�� �������� �� ����Ǵ� �޼���
			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				System.out.println("��ư ���� ��?");
				label.setLocation(e.getX(), e.getY());
			}
			
			// ���콺 Ŀ���� ������ �� ����Ǵ� �޼���
			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				System.out.println("ȭ�鿡�� Ŀ���� ������");
			}
			
			// ���콺 Ŀ���� ������ �� ����Ǵ� �޼���
			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				System.out.println("ȭ������ Ŀ���� ���� ��");
			}
			
			// ���콺�� Ŭ���Ǿ��� �� ����Ǵ� �޼���
			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				System.out.println("��ư ������ ���� �ൿ�� �Ϸ�� ��????");
				System.out.println( "x ��ǥ�� : " + e.getX());
				System.out.println( "y ��ǥ�� : " + e.getY());
				label.setLocation(e.getX(), e.getY());
			}
		});
		
		
	}	// end of addEventListener
	
	
	// main function
	public static void main(String[] args) {
		new MyFrame5();
		
	}
	
	
	
}
