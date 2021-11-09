package ch02;

import java.awt.Graphics;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MyFrame8 extends JFrame {

	BufferedImage backgroundImage;
	BufferedImage imageIcon1;
	
	MyImagePanel imagepanel;
	
	int xPoint = 200;
	int yPoint = 200;

	public MyFrame8() {
		initData();
		setInitLayout();
		addEventListener();

	}

	private void initData() {
		setTitle("�̹��� ��׶��� ����2");
		setSize(500, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		try {
			backgroundImage = ImageIO.read(new File("background1.jpg"));
			imageIcon1 = ImageIO.read(new File("among1.png"));
//			imageIcon1 = ImageIO.read(new File("among2.png"));

		} catch (Exception e) {
			System.err.println("������ �����ϴ�."); // ���� �۾��� ���
			System.exit(0); // �˾Ƽ� �����Ű�� ��ɾ�
		}

		imagepanel = new MyImagePanel();

	}

	private void setInitLayout() {
		this.setVisible(true);
		this.setResizable(false); // â�� ũ������ �����Ѱ� �Ұ����Ѱ�
		this.add(imagepanel);
	}

	private void addEventListener() {
		this.addKeyListener(new KeyAdapter() {

			@Override
			public void keyPressed(KeyEvent e) {

				// ���׿����ڷ� ����ؼ� �ڵ带 �ۼ����ּ���.
				// �׸��� switch������ �ٲ��ּ���(21��11��04�� ��������)
				int keyCode = e.getKeyCode();
				if (keyCode == KeyEvent.VK_UP) {
//					yPoint -= 10;

					// yPoint = (���ǽ�)? "���1" : "���2"
					yPoint = (yPoint < -10) ? 0 : yPoint - 10;

//					if( yPoint <-10) {
//						yPoint = -10;
//					}

				} else if (keyCode == KeyEvent.VK_DOWN) {
					yPoint += 10;
					if (yPoint > 390) {
						yPoint = 390;
					}
				} else if (keyCode == KeyEvent.VK_LEFT) {
					xPoint -= 10;
					if (xPoint < -18) {
						xPoint = -18;
					}
				} else if (keyCode == KeyEvent.VK_RIGHT) {
					xPoint += 10;
					if (xPoint > 425) {
						xPoint = 425;
					}
				}

				repaint();// �ٽ� �׸��� �׸��� �ϴ� �޼���

			} // end of keyPressed

		});
	}

	// ���� Ŭ���� ����
	private class MyImagePanel extends JPanel {

		// ��ĥ�ϴ� ���
		@Override
		protected void paintComponent(Graphics g) {
			// TODO Auto-generated method stub
			super.paintComponent(g);
			g.drawImage(backgroundImage, 0, 0, 500, 500, null);
			g.drawImage(imageIcon1, xPoint, yPoint, 80, 80, null);

		}
	}

	private void mouseClicked(MouseEvent e) {
		int x = e.getX();
		int y = e.getY();
		System.out.println("-----");
		System.out.println("x ��ǥ�� : " + x);
		System.out.println("y ��ǥ�� : " + y);
	}

	public static void main(String[] args) {
		
		new MyFrame8();
	}
	
} // end of class

