package ch06;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class LottoFrame extends JFrame implements ActionListener {
	
	JButton button;
	LottoPanel lottoPanel;
	LottoNumber lottoNumber;
	int[] lotto = new int[LottoNumber.LOTTO_NUM_SIZE];
	
	public LottoFrame() {
		initData();
		setInitLayout();
		addEventListener();
	}
	
	private void initData() {
		setTitle("�ζ� ��ȣ ������");
		setSize(600,400);
		button = new JButton("++ �ζ� ��ȣ �����ϱ� ++ ");
		lottoPanel = new LottoPanel();
		lottoNumber = new LottoNumber();
		
	}
	private void setInitLayout() {
		setVisible(true);
		setBackground(Color.gray);
		add(button, BorderLayout.NORTH);
		add(lottoPanel, BorderLayout.CENTER);
		
	}
	
	private void addEventListener() {
		button.addActionListener(this);
	}
	
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// 6�ڸ� ���� ���ڰ� �迭�� �Ѿ�´�.
		lotto = lottoNumber.getLottoNumber();
		repaint();
		
	}

	
	
	class LottoPanel extends JPanel{
		
		@Override
		public void paint(Graphics g) {
			Font font = new Font("�ü�ü", Font.BOLD, 20);
			g.setFont(font);
			
			if(lotto[0] == 0) {
				g.drawString("�ζ� ��ư�� Ŭ���ϼ���", 180, 180);
				return;
			}
		
			int xPoint = 150;
			for(int i = 0; i< lotto.length; i++) {
				g.drawString(lotto[i] + "", xPoint, 150);
				xPoint += 50;
			}
			
		}
	}
	
	public static void main(String[] args) {
		
		new LottoFrame();
		
	}
	
}