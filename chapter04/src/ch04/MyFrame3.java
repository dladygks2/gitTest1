package ch04;

import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

class ImagePanel extends JPanel {

	private Image image;
	// ������� ���� �̹������� �޴� �༮

	// ������ �����ε�
	public ImagePanel(String imageName) {
		image =  new ImageIcon(imageName).getImage();
		
	}
	
	// �ϵ��ڵ� ���
	public ImagePanel() {
		image = new ImageIcon("image1.jpg").getImage();
	}

	@Override
	public void paint(Graphics g) {
		// TODO Auto-generated method stub
		super.paint(g);
		g.drawImage(image, 0, 0, getWidth(), getHeight(), null);
	}

}

///////////////////////////////////////////////////////////////

public class MyFrame3 extends JFrame {

	// JPanel ���� �̹��� ����� ��

	private ImagePanel imagePanel;
	private ImagePanel imagePanel2;
	private JButton button;

	public MyFrame3() {
		initData();
		setInitLayout();
	}

	private void initData() {
		setTitle("JPanel�� �̹��� �ֱ�");
		setSize(500, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		imagePanel = new ImagePanel();
		imagePanel2 = new ImagePanel("image1.jpg");
		button = new JButton("��ư�Դϴ�.");
	}

	private void setInitLayout() {
		setVisible(true);
		setLayout(new GridLayout(2,1));
		add(imagePanel);
		add(imagePanel2);
		
		imagePanel.add(button);
	}

	public static void main(String[] args) {
		new MyFrame3();

	}// end of main
}
