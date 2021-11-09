package ch02;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JTextArea;

public class MyFrame7 extends JFrame implements KeyListener {

	// �տ� �빮���̴� ����Ÿ��, Ŭ����Ÿ���̴�. .������ ����
	JTextArea area;

	public MyFrame7() {
		initData();
		setInitLayout();
		addEventListener();
	}

	private void initData() {
		setTitle("Ű �̺�Ʈ ����");
		setSize(500, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		area = new JTextArea();
	}

	private void setInitLayout() {
		setVisible(true);
		this.add(area);
	}

	private void addEventListener() {
//		area.addKeyListener(this);
		area.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
			}
		});

	}

	// ���ڸ� ������ �� ȣ��, ����Ű���� �����Ѵ�. ȭ��ǥ �̷��� ���� ���Ѵ�.
	@Override
	public void keyTyped(KeyEvent e) {

//		System.out.println("keyTyped : " + e.getID());

	}

	// Ű���带 ������ �� ȣ��, ��� Ű���忡 �����Ѵ�.
	@Override
	public void keyPressed(KeyEvent e) {
//		System.out.println("keyPressed : " + e.getID());
//		e.getKeyCode();
//		System.out.println(e.getKeyCode());
//		area.setText(e.getKeyCode() + "");
//		area.append(e.getKeyCode() + "\n");
		// ���� ����Ű ������(38)
		// �Ʒ��� ����Ű ������(40)
		// ���� ����Ű ������(37)
		// ������ ����Ű ������(39)

		// ���α׷����� ������ ����� �ִ�. 16������ ǥ���Ǳ�������

		if (e.getKeyCode() == KeyEvent.VK_LEFT) {
			area.append("���� ������\n");
		} else if (e.getKeyCode() == KeyEvent.VK_UP) {
			area.append("���� ������\n");
		} else if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
			area.append("������ �Էµ�\n");
		} else if (e.getKeyCode() == KeyEvent.VK_DOWN) {
			area.append("�Ʒ��� �Էµ�\n");
		}

	}

	// Ű���带 ���� �� ȣ��, ��� Ű���忡 �����Ѵ�.
	@Override
	public void keyReleased(KeyEvent e) {
//		System.out.println("keyReleased : " + e.getID());

	}

}
